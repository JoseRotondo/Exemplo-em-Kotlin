fun main() {
    var continuar = true
    while (continuar) {
        println("Escolha a operação:")
        println("1 - Soma")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Sair")
        print("Opção: ")
        when (readLine()?.toIntOrNull()) {
            1 -> soma()
            2 -> subtracao()
            3 -> multiplicacao()
            4 -> divisao()
            5 -> continuar = false
            else -> println("Opção inválida, tente novamente.")
        }
        println()
    }
}

fun soma() {
    val (a, b) = lerNumeros()
    println("Resultado: ${a + b}")
}

fun subtracao() {
    val (a, b) = lerNumeros()
    println("Resultado: ${a - b}")
}

fun multiplicacao() {
    val (a, b) = lerNumeros()
    println("Resultado: ${a * b}")
}

fun divisao() {
    val (a, b) = lerNumeros()
    if (b != 0) {
        println("Resultado: ${a.toDouble() / b}")
    } else {
        println("Não é possível dividir por zero.")
    }
}

fun lerNumeros(): Pair<Int, Int> {
    print("Digite o primeiro número: ")
    val a = readLine()?.toIntOrNull() ?: 0
    print("Digite o segundo número: ")
    val b = readLine()?.toIntOrNull() ?: 0
    return Pair(a, b)
}
