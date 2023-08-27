package list

fun main() {
    livros.imprimeComMarcador()

    val ordenadoAnoDePublicacao: List<Livro> = livros.sorted()
    ordenadoAnoDePublicacao.imprimeComMarcador()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcador()

    val ordenadoPorAutor = livros.sortedBy { it.autor }
    ordenadoPorAutor.imprimeComMarcador()

    // filtrando lista por uma propriedade
    val titulos: List<String> = livros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}

// extension function
fun List<Livro?>.imprimeComMarcador() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString("\n") {
            "- ${it.titulo} de ${it.autor}"
        }
    println(" ###### Lista de Livros ###### \n$textoFormatado")
}