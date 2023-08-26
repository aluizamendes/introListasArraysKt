fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 68)

    // `.maxOrNull()` retorna MAIOR valor do array
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    // `.minOrNull()` retorna MENOR valor do array
    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    // `.average()` retorna média dos valores
    val media: Double= idades.average()
    println("Média das idades: $media")

    // retorna boolean
    val todosMaiores = idades.all { it > 18 }
    println("Todos são de maior? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    // `.filter` retorna lista apenas com os que passarem na condição
    val maiores = idades.filter { it >= 18 }
    println("Os maiores de idade são: $maiores")

    // `.find` encontra o primeiro valor que passa na condição
    val busca = idades.find { it > 18 }
    println("Busca: $busca")
}