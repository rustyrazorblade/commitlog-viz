package com.rustyrazorblade.commmitlog_gui.representations

interface CassandraInterface {
    fun test() {

    }

    fun getCommitLogs() : PaginatedList<CommitLog>
}
