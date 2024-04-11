package br.com.alura.alugames.modelo

import java.time.LocalDate
import java.time.Period
import javax.persistence.Embeddable
import javax.persistence.Entity


@Embeddable //anotação para informar que a classe(não entidade) pode ser incluida em uma entity
data class Periodo(
    val dataInicial: LocalDate = LocalDate.now(),
    val dataFinal: LocalDate = LocalDate.now().plusDays(7)){

    val emDias = Period.between(dataInicial, dataFinal).days
    val monthValue = dataInicial.monthValue
}
