package com.rustyrazorblade.commmitlog_gui.representations

import java.util.*

interface CassandraInterface {
    companion object {
        fun load() : CassandraInterface =
            ServiceLoader.load(CassandraInterface::class.java).iterator().next()

    }
}