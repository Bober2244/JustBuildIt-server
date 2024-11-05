package dev.bober.data.models.tables

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.date
import java.time.LocalDate

object Bid: Table() {
    val bidId: Column<Int> = integer("bidId").autoIncrement()
    val customerId: Column<Int> = integer("customerId")
    val bidDate: Column<LocalDate> = date("bidDate")
    val constructionPeriod: Column<Int> = integer("constructionPeriod")

    override val primaryKey: PrimaryKey = PrimaryKey(bidId)
}