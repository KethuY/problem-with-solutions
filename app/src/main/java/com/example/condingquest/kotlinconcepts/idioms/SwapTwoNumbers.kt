package com.example.condingquest.kotlinconcepts.idioms

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale
import java.util.regex.Pattern


fun main() {
    var a = 1
    var b = 2
    a = b.also { b = a }
   // println(" $a & $b")

   /* println("Formatted Amount: ${amountFormatterWithoutRound(1234567.891234)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.06)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.788)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.01)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.0)}")
 */   println("Formatted Amount: ${amountFormatterWithoutRound(359.306012)}")
    println("Formatted Amount original: ${formateAmount(359.306012)}")
}

fun amountFormatterWithoutRound(amount: Double): String {
    val truncated: Double = ((amount * 100).toLong()) / 100.0
    val formatter: DecimalFormat = DecimalFormat(
        "###,###,###.##", DecimalFormatSymbols.getInstance(
            Locale.ENGLISH
        )
    )
    return formatDecimalPoint(formatter.format(truncated))
}


fun formateAmount(amount: Double):String{
    val formatter = DecimalFormat("###,###,###.##", DecimalFormatSymbols.getInstance(Locale.ENGLISH))

   return formatDecimalPoint(formatter.format(amount))
}
private fun formatDecimalPoint(amount: String): String {
    if (amount.contains(".")) {
        val parts = amount.split(Pattern.quote(".").toRegex()).dropLastWhile { it.isEmpty() }
            .toTypedArray()

        if (parts[1].length == 2) return amount
        else if (parts[1].length == 1) return amount + "0"
    }

    return "$amount.00"
}