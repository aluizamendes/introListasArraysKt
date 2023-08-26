import java.math.BigDecimal

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i -> valores[i].toBigDecimal() }
}

// EXTENSION FUNCTIONS
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->  acumulador + valor }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        // se estiver vazio, retorna zero
        BigDecimal.ZERO

    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}