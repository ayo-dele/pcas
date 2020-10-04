package com.fluentbuild.pcas.io

internal fun interface MessageReceiver {

    fun onReceived(marshalledMessage: ByteArray, size: Int)
}