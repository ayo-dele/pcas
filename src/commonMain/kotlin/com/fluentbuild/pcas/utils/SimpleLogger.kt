package com.fluentbuild.pcas.utils

import kotlin.reflect.KFunction

class SimpleLogger(private val className: String) {

    fun debug(message: () -> String) {
        println("D/$className: ${message()}")
    }

    fun info(message: () -> String) {
        println("I/$className: ${message()}")
    }

    fun warn(message: () -> String) {
        println("W/$className: ${message()}")
    }

    fun error(message: () -> String) {
        println("E/$className: ${message()}")
    }

    fun error(throwable: Throwable, message: () -> String) {
        println("E/$className: $throwable")
        println("E/$className: ${message()}")
    }

    fun debug(function: KFunction<*>, vararg args: Any) {
        val arguments = args.joinToString { it.toString() }
        debug { "${function.name}($arguments)" }
    }
}