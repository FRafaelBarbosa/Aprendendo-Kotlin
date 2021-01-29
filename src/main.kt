fun calculaBonus(a: Int, b: Int, c: Int) {
    println("O bonus é: ${a + b * c}")
}

fun calculaBonus2(cargo: String, salario: Float): Float {
    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2
    }
}

fun hello(nome: String): String {
    return "Olá $nome"
}

fun hello2(nome: String): String = "Olá $nome"

fun soma(a: Int, b: Int) = a + b

fun exercicio01(caracter: String) = "A String -$caracter- possui ${caracter.length}" +
        " caracteres"

// if - else
fun maiorDeIdade(idade: Int): Boolean {
    return idade >= 18
}

fun main() {

    // Operador Elvis ?:
    val test: Int? = null
    val op: Int = test ?: 100 //se for nula use 100 senão for nula use test

    println(op)
    calculaBonus(10, 20, 30)
    println(hello("Felipe"))
    println(hello2("Rafael"))
    println(soma(2, 2))
    println(exercicio01("FelipeRafael"))
    maiorDeIdade(17)
    maiorDeIdade(20)

    for(i in 0..100 step 5) {
        print("$i ")
    }

    println()

    for(j in 100 downTo 1 step 5) {
        print("$j ")
    }
}