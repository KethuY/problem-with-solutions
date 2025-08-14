package com.example.condingquest.kotlinconcepts.idioms

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale
import java.util.regex.Pattern


fun main() {
    var a = 1
    var b = 2
    a = b.also { b = a }
   println(" $a & $b")

    println(" ************************ truncating with 100")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.891234)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.062)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.783)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.014)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(1234567.05)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(359.306012)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(359.307012)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(359.308012)}")
    println("Formatted Amount: ${amountFormatterWithoutRound(359.309012)}")


    println("&&&&&&&&&&&&&&&&&&")

    println("Formatted Amount: ${amountFormatterDown(1234567.891234)}")
    println("Formatted Amount: ${amountFormatterDown(1234567.062)}")
    println("Formatted Amount: ${amountFormatterDown(1234567.783)}")
    println("Formatted Amount: ${amountFormatterDown(1234567.014)}")
    println("Formatted Amount: ${amountFormatterDown(1234567.055)}")
    println("Formatted Amount: ${amountFormatterDown(359.30601287)}")
    println("Formatted Amount: ${amountFormatterDown(359.307012)}")
    println("Formatted Amount: ${amountFormatterDown(359.308012)}")
    println("Formatted Amount: ${amountFormatterDown(359.309012)}")
}


fun amountFormatterDown(amount: Double): String {
    val formatter = DecimalFormat("###,###,###.##", DecimalFormatSymbols.getInstance(Locale.ENGLISH))
    formatter.roundingMode = RoundingMode.DOWN
    return formatDecimalPoint(formatter.format(amount))
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