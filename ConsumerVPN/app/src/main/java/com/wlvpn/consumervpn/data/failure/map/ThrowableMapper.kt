package com.wlvpn.consumervpn.data.failure.map

/**
 * A simple Interface to map Throwables
 */
interface ThrowableMapper {

    /**
     * Maps a Throwable to another Throwable
     */
    fun mapThrowable(throwable: Throwable): Throwable
}




