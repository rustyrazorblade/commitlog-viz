package com.rustyrazorblade.commmitlog_gui.implementations

import org.apache.cassandra.db.commitlog.CommitLog
import org.apache.cassandra.db.commitlog.CompressedSegment
import java.io.File
import java.io.OutputStream

class GenerateTestData {

}

fun main(args: Array<String>) {

    val outputStream = when(args.size) {
        0 -> System.out
        1 -> {
            File(args[0]).outputStream()
        }
        else -> throw RuntimeException("too many args")
    }



}