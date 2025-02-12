package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Gamer
import br.com.alura.alugames.utilitarios.toModel
import toEntity
import toModel
import javax.persistence.EntityManager

class GamerDAO(manager: EntityManager) : DAO<Gamer, GamerEntity>(manager, GamerEntity::class.java) {

    override fun toEntity(objeto: Gamer): GamerEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: GamerEntity): Gamer {
        return entity.toModel().apply { plano = entity.plano.toModel() }
    }
}