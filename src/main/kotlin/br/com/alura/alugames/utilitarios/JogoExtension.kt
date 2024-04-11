package br.com.alura.alugames.utilitarios

import br.com.alura.alugames.dados.JogoEntity
import org.example.br.com.alura.alugames.modelo.Jogo

fun Jogo.toEntity(): JogoEntity {
    return JogoEntity(this.titulo, this.capa, this.preco, this.descricao, this.id)
}

fun JogoEntity.toModel(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao?: "Descrição não informada", this.id)
}