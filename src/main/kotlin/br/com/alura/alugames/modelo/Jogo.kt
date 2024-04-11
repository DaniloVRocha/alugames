package org.example.br.com.alura.alugames.modelo

import br.com.alura.alugames.modelo.Recomendavel
import com.google.gson.annotations.Expose
import javax.persistence.*


data class Jogo(@Expose val titulo:String,
                @Expose val capa:String): Recomendavel {

    var descricao: String? = null
    var preco = 0.0
    var id = 0
    private var listaNotas: MutableList<Int> = mutableListOf<Int>()
    override val media: Double
        get() = listaNotas.average()

    constructor(titulo: String, capa: String, preco: Double, descricao: String, id:Int):
            this(titulo, capa) {
        this.preco = preco
        this.id = id
        this.descricao = descricao
        this.listaNotas = mutableListOf<Int>()
    }

    constructor(titulo: String, capa: String, preco: Double, descricao: String):
            this(titulo, capa) {
        this.preco = preco
        this.descricao = descricao
        this.listaNotas = mutableListOf<Int>()
    }

    override fun recomendar(nota: Int) {
        if(listaNotas.isNullOrEmpty()){
            listaNotas = mutableListOf<Int>()
        }
        listaNotas.add(nota)
    }

    override fun toString(): String {
        return "Meu Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao \n" +
                "Preço: $preco \n" +
                "Reputação: $media \n" +
                "id: $id"
    }
}
