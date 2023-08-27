package array

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println("")


    val numerosPares = 0 until 100 step 2 // exclui o numero 100
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println("")

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }

    println("")

    val intervalo = 1500.0..5000.0
    val salario = 4000.0

    if (salario in intervalo) {
        println("Salário de $salario está dentro do intervalo $intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    // range de minusculas
    val alfabeto = "a".."z"
    val letra = "K"
    println(letra in alfabeto) // false
}