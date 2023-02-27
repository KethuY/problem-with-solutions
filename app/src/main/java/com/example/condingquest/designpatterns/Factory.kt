package com.example.condingquest.designpatterns

interface Currency {
    fun symbol(): String
    fun code(): String
}

enum class Country {
    UnitedState, Spain,INDIA
}

class USDollar : Currency {
    override fun symbol(): String {
        return "$"
    }

    override fun code(): String {
        return "USD"
    }
}

class Euro : Currency {
    override fun symbol(): String {
        return "€"
    }

    override fun code(): String {
        return "EUR"
    }
}

 class IndiaDollar : Currency {
    override fun symbol(): String {
        return "R"
    }

    override fun code(): String {
        return "INR"
    }
}

object CurrencyFactory {

    fun currency(country: Country): Currency {
        return when (country) {
            Country.UnitedState -> {
                USDollar()
            }
            Country.Spain -> {
                Euro()
            }
            Country.INDIA -> {
                IndiaDollar()
            }
        }
    }
}

fun main(){
    println(CurrencyFactory.currency(Country.INDIA).code())
    println(CurrencyFactory.currency(Country.INDIA).symbol())
}
