fun maiorMenor(a: Int, b: Int) {
    when {
        a > b -> println("O maior valor é o $a")
        b > a -> print("O maior valor é o $b")
        a == b -> print("Valores iguais")
    }
}

fun main() {
    maiorMenor(3, 3)
}