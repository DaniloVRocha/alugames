package org.example.br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Gamer
import br.com.alura.alugames.servicos.ConsumoApi
import transformarIdade
import java.util.*


fun main() {
/*    val leitura = Scanner(System.`in`);

    var gamer = Gamer.criarGamer(leitura);
    println("Cadastro concluido com sucesso: \n $gamer")

    println("Idade do Gamer: ${gamer.dataNascimento?.transformarIdade()}" )

    var buscaNovoJogo = "S"
    do {
        println("Digite um código de jogo: ")
        val codJogo = leitura.nextLine();

        val meuJogo = ConsumoApi.buscaJogo(codJogo);
        println(meuJogo)
        println("Deseja inserir uma descrição personalizada? S/N")
        val result = leitura.nextLine()

        if(result.equals("s", ignoreCase = true)){
            println("Digite a descrição: ")
            meuJogo?.descricao = leitura.nextLine()
        }else{
            meuJogo?.descricao = meuJogo?.titulo
        }
        println(meuJogo)

        gamer.jogosBuscados.add(meuJogo)

        println("Deseja buscar um novo jogo ? S/N")
        buscaNovoJogo = leitura.nextLine()
    }while (buscaNovoJogo.equals("S", ignoreCase = true))

    println("Jogos Buscados: ")
    for(jogo in gamer.jogosBuscados){
        println(jogo)
    }

    println("\n \n Jogos Ordenados: ")
    gamer.jogosBuscados.sortBy {
        it?.titulo
    }
    gamer.jogosBuscados.forEach{
        println("Titulo: ${it?.titulo}" )
    }

    println("\n \n Jogos Filtrados: ")
    val jogosFiltrados = gamer.jogosBuscados.filter{
        it?.titulo?.contains("batman", ignoreCase = true) ?: false
    }
    println(jogosFiltrados)*/
}