fun categoria(peso: Int) {
    when {
        peso < 57 -> {
            println("Pena")
        }

        peso in 57..60 -> {
            println("Leve")
        }

        peso in 61..72 -> {
            println("Médio")
        }

        peso >= 73 -> {
            println("Pesado")
        }
    }
}

fun main() {
    categoria(65)
}