package br.com.alura.alugames.modelo

class PlanoAssinatura(
    tipo:String,
    val mensalidade:Double,
    val jogosIncluidos: Int,
    val percentualDescontoReputacao:Double,
    id:Int  = 0) : Plano(tipo, id){

    override fun obterValorAluguel(aluguel: Aluguel):Double{
        val totalJogosMes = aluguel.gamer.jogosDoMes(aluguel.periodo.monthValue).size + 1

        return if(totalJogosMes <= jogosIncluidos){
            0.0
        } else {
            var valorOriginal =  super.obterValorAluguel(aluguel)
            if(aluguel.gamer.media > 8){
                valorOriginal -= valorOriginal * percentualDescontoReputacao
            }
            valorOriginal
        }
    }

    override fun toString(): String {
        return "PlanoAssinatura(mensalidade=$mensalidade, jogosIncluidos=$jogosIncluidos, percentualDescontoReputacao=$percentualDescontoReputacao)"
    }


}
