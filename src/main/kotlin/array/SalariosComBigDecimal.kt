package array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    /*
       val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
       salarios[0] = "1500.55".toBigDecimal()
       salarios[1] = "2000.00".toBigDecimal()

       println(salarios.contentToString())
     */

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5432.34")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    // map retorna uma list, `toTypedArray()` converte para um array novamente
    val salariosComAumento: Array<BigDecimal> = salarios.map { salario -> calculaAumentoRelativo(salario, aumento) }.toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->  acumulador + (salario * meses).setScale(2, RoundingMode.UP) }
    println(gastoTotal)

    // `.sorted()` ordena valores do menor para o maior
    val media = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println(media)

}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}
