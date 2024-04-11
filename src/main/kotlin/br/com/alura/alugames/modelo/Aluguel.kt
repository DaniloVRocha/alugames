package br.com.alura.alugames.modelo

import org.example.br.com.alura.alugames.modelo.Jogo
import java.time.LocalDate
import java.time.Period

data class Aluguel (val gamer: Gamer, val jogo: Jogo, val periodo:Periodo) {

    var id = 0
    val valorAluguel = gamer.plano.obterValorAluguel(this)

    override fun toString(): String {
        return "Aluguel do jogo=${jogo.titulo} por gamer=${gamer.nome}, pelo valor de $valorAluguel"
    }
}