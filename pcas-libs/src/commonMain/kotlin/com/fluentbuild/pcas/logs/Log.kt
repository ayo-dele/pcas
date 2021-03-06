package com.fluentbuild.pcas.logs

import kotlin.reflect.KFunction

internal expect class Log(className: String) {

    fun debug(function: KFunction<*>, vararg args: Any)

    fun debug(message: () -> String)

    fun info(message: () -> String)

    fun warn(message: () -> String)

    fun error(message: () -> String)

    fun error(throwable: Throwable, message: () -> String)
}