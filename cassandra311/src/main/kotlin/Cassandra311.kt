package com.rustyrazorblade.commmitlog_gui.implementations

import com.rustyrazorblade.commmitlog_gui.representations.*
import org.apache.cassandra.db.commitlog.CommitLogReader
import java.io.File

typealias PaginatedCommitLogs = PaginatedList<CommitLog>

class Cassandra311 : CassandraFactory {

    fun readMutations()  : MutationList {
        val reader = CommitLogReader()
        return MutationList()
    }

    override fun create(path: File): CassandraInterface =
        object : CassandraInterface {
            override fun getCommitLogs(): PaginatedCommitLogs {
                return empty()
            }

            override fun test() {

                super.test()
            }

        }
}

