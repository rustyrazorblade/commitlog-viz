import com.rustyrazorblade.commmitlog_gui.representations.*
import org.apache.cassandra.db.commitlog.CommitLogReader
import java.io.File


class Cassandra40 : CassandraFactory {
    override fun create(path: File) = object : CassandraInterface {
        override fun getCommitLogs(): PaginatedList<CommitLog> {
            return PaginatedList(listOf(), 0, 0)
        }

    }


    fun readMutations()  : MutationList {
        val reader = CommitLogReader()
        return MutationList()
    }
}

