package com.rustyrazorblade.commmitlog_gui.resources


import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

import com.rustyrazorblade.commmitlog_gui.representations.CommitLog
import java.io.File

@Path("/commitlogs")
@Produces(MediaType.APPLICATION_JSON)
class CommitLogResource(val path: File) {

    @GET
    fun getCommitLogs() : List<CommitLog> {
        val files = path.listFiles().map { CommitLog(it.name) }
        return files
    }
}
