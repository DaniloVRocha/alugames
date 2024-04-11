package br.com.alura.alugames.servicos

import br.com.alura.alugames.modelo.Gamer
import br.com.alura.alugames.modelo.InfoGamerJson
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import convertListInfoGamer
import org.example.br.com.alura.alugames.modelo.Jogo
import org.example.br.com.alura.alugames.modelo.infoJogo
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.http.HttpResponse.BodyHandlers

class ConsumoApi {


    companion object{
        fun consumoDados(url:String): String{
            val client: HttpClient = HttpClient.newHttpClient()
            val request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build()
            val response = client
                .send(request, HttpResponse.BodyHandlers.ofString())

            return response.body()
        }

        fun buscaJogos(): List<Jogo> {
            val json = this.consumoDados("https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/jogos.json")
            val gson = Gson()
            var meuJogo:Jogo? = null;

            val meuJogoTipo = object: TypeToken<List<Jogo>>() {}.type
            val listaJogo:List<Jogo> = gson.fromJson(json, meuJogoTipo)

            return listaJogo;
        }
        fun buscaGamers(): List<Gamer> {
            val endereco = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/gamers.json"

            val json = this.consumoDados(endereco)
            val gson = Gson()
            val meuGamerTipo = object: TypeToken<List<InfoGamerJson>>() {}.type
            val listaInfoGamer:List<InfoGamerJson> = gson.fromJson(json, meuGamerTipo)

            val listaGamer = listaInfoGamer.convertListInfoGamer()

            return listaGamer
        }
    }


}