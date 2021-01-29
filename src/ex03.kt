fun abacaxi(quant: Int) {
    when {
        quant < 10 -> {
            println("Foram comprados $quant abacaxis e o valor total é de ${quant * 3}")
        }
        else -> {
            println("Foram comprados $quant abacaxis e o valor total é de ${quant * 2}")
        }
    }
}

fun main() {
    abacaxi(10)
}