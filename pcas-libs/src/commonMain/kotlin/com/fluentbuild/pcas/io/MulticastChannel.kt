package com.fluentbuild.pcas.io

internal interface MulticastChannel {

    @Throws(Exception::class)
    fun init(receiver: MessageReceiver)

    @Throws(Exception::class)
    fun broadcast(message: ByteArray, messageSize: Int)

    fun close()
}