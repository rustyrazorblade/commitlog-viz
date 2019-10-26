package com.rustyrazorblade.commmitlog_gui.representations

import java.io.File
import java.util.*

interface CassandraFactory {

    companion object {
        fun load() : CassandraFactory =
            ServiceLoader.load(CassandraFactory::class.java).iterator().next()

    }

    fun create(path: File) : CassandraInterface
}