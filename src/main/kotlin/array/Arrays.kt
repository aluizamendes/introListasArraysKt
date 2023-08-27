package array

fun main() {

    val idades: IntArray = intArrayOf(25, 19, 33, 10, 55) // array de inteiros

    var maiorIdade: Int = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    var menorIdade = Int.MAX_VALUE // constante que possui maior valor de um inteiro
    idades.forEach { idade -> if (idade < menorIdade) menorIdade = idade }

    println("A maior idade na lista é $maiorIdade")
    println("A menor idade na lista é $menorIdade")
}