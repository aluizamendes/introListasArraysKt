package list

// a lista quase sempre trabalha com objetos
val livros: MutableList<Livro> = mutableListOf(
    Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956),
    Livro("Minha vida de menina", "Helena Morley", 1942, "Editora A"),
    Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881),
    Livro("Iracema", "José de Alencar", 1865, "Editora B"),
    Livro("Sagrana", "João Guimarães Rosa", 1946),
    Livro("Vidas Secas", "Graciliano Ramos", 1938, "Editora A"),
    Livro("Mayombe", "Pepetela", 1979, "Editora B"),
    Livro("O Cortiço", "Aluísio Azevedo", 1890, "Editora B"),
)

val livrosComNulos: MutableList<Livro?> = mutableListOf(
    Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956),
    null,
    Livro("Minha vida de menina", "Helena Morley", 1942, "Editora A"),
    Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881),
    Livro("Iracema", "José de Alencar", 1865, "Editora B"),
    null,
    Livro("Sagrana", "João Guimarães Rosa", 1946),
    Livro("Vidas Secas", "Graciliano Ramos", 1938, "Editora A"),
    Livro("Mayombe", "Pepetela", 1979, "Editora B"),
    Livro("O Cortiço", "Aluísio Azevedo", 1890, "Editora B"),
)