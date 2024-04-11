package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Periodo
import javax.persistence.*

@Entity
@Table(name="aluguel")
class AluguelEntity(
    @ManyToOne
    val gamer:GamerEntity = GamerEntity(),
    @ManyToOne
    val jogo: JogoEntity = JogoEntity(),
    @Embedded // Anotação para chamar dados de uma classe(não entidade) Embeddable
    val periodo:Periodo = Periodo()) {
    var valorDoAluguel : Double = 0.0
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Int = 0
}