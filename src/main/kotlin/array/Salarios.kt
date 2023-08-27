package array

fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento: Double = 1.1
    var indice: Int = 0

    for (salario in salarios) {
        salarios[indice] *= aumento
        indice++
    }

    println(salarios.contentToString())

    // obtem o indice do elemento atual e o elemento
    salarios.forEachIndexed { i, salario -> salarios[i] = salario * aumento }

    println(salarios.contentToString())
}