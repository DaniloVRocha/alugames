import br.com.alura.alugames.dados.GamerEntity
import br.com.alura.alugames.modelo.Gamer
import br.com.alura.alugames.modelo.InfoGamerJson
import br.com.alura.alugames.utilitarios.toEntity

fun List<InfoGamerJson>.convertListInfoGamer(): List<Gamer>{
    return this.map { infoGamer -> Gamer(infoGamer.nome, infoGamer.email, infoGamer.dataNascimento, infoGamer.usuario) }
}

fun InfoGamerJson.convertInfoGamer(): Gamer{
    return Gamer(this.nome, this.email, this.dataNascimento, this.usuario)
}

fun Gamer.toEntity(): GamerEntity {
    return GamerEntity(this.nome, this.email, this.dataNascimento, this.usuario, this.id,  this.plano.toEntity())
}

fun GamerEntity.toModel(): Gamer {
    return Gamer(this.nome, this.email, this.dataNascimento, this.usuario, this.id)
}