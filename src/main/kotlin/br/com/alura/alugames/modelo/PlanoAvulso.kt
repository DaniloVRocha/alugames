package br.com.alura.alugames.modelo

class PlanoAvulso(tipo:String = "Avulso", id:Int = 0) : Plano(tipo, id){

    override fun obterValorAluguel(aluguel: Aluguel):Double{
        var valorOriginal = super.obterValorAluguel(aluguel)
        if(aluguel.gamer.media > 8){
            valorOriginal -= valorOriginal * 0.1
        }
        return valorOriginal
    }


}
