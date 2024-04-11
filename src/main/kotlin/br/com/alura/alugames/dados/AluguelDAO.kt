package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Aluguel
import br.com.alura.alugames.utilitarios.toEntity
import br.com.alura.alugames.utilitarios.toModel
import toEntity
import toModel
import javax.persistence.EntityManager

class AluguelDAO(manager: EntityManager) : DAO<Aluguel, AluguelEntity>(manager, AluguelEntity::class.java) {
    override fun toEntity(aluguel: Aluguel): AluguelEntity {
        return AluguelEntity(aluguel.gamer.toEntity(), aluguel.jogo.toEntity(), aluguel.periodo)
            .apply { valorDoAluguel = aluguel.valorAluguel
                    id= aluguel.id }
    }

    override fun toModel(entity: AluguelEntity): Aluguel {
        return Aluguel(entity.gamer.toModel(), entity.jogo.toModel(), entity.periodo)
            .apply {id = entity.id}
    }
}