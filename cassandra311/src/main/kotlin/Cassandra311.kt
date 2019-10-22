package com.rustyrazorblade.commmitlog_gui.implementations

import com.rustyrazorblade.commmitlog_gui.representations.CassandraInterface
import com.rustyrazorblade.commmitlog_gui.representations.MutationList
import org.apache.cassandra.db.commitlog.CommitLogReader


class Cassandra311 : CassandraInterface {

    fun readMutations()  : MutationList {
        val reader = CommitLogReader()
        return MutationList()
    }
}

