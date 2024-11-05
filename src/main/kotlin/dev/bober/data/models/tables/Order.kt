package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.date
import java.time.LocalDate

object Order: Table() {
    val orderId: Column<Int> = integer("orderId").autoIncrement()
    val bidId: Column<Int> = integer("bidId").references(Bid.bidId)
    val startDate: Column<LocalDate> = date("startDate")
    val endDate: Column<LocalDate> = date("endDate")

    override val primaryKey: PrimaryKey = PrimaryKey(orderId)
}