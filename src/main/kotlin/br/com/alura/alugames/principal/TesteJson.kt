package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Periodo
import br.com.alura.alugames.modelo.Plano
import br.com.alura.alugames.modelo.PlanoAssinatura
import br.com.alura.alugames.servicos.ConsumoApi
import com.google.gson.GsonBuilder
import org.example.br.com.alura.alugames.modelo.Jogo
import java.io.File
import java.time.LocalDate

fun main(){
/*    val listaGamers = ConsumoApi.buscaGamers()
    val listaJogos = ConsumoApi.buscaJogos()

    val camila = listaGamers[2]

    camila.plano = PlanoAssinatura("Prata", 9.90, 3, 0.15, 0)
    val periodoc = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
    val aluguelc2 = camila.alugaJogo(listaJogos[0], periodoc)
    val aluguelc3 = camila.alugaJogo(listaJogos[1], periodoc)
    val aluguelc4 = camila.alugaJogo(listaJogos[2], periodoc)
    val aluguelc5 = camila.alugaJogo(listaJogos[3], periodoc)
    camila.recomendar(7)
    camila.recomendar(10)
    camila.recomendar(8)
    val aluguelc7 = camila.alugaJogo(listaJogos[0], periodoc)

    camila.recomendarJogo(listaJogos[2], 10)
    camila.recomendarJogo(listaJogos[0], 7)


    val gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    val serializacao = gson.toJson(camila.jogosRecomendados)

    val arquivo = File("jogosRecomendados-${camila.nome}.json")
    arquivo.writeText(serializacao)


    print(listaJogos[0]);

    println(arquivo.absolutePath)*/
}