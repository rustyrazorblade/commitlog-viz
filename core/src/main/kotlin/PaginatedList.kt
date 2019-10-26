package com.rustyrazorblade.commmitlog_gui.representations

data class PaginatedList<T>(val data: List<T>, val total: Long, val offset: Long) {
}

fun <T>empty() = PaginatedList<T>(listOf(), 0, 0)