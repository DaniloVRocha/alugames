package br.com.alura.alugames.dados

import javax.persistence.*

@Entity
@Table(name="gamer")
class GamerEntity(
    val nome: String = "Nome de Usuário",
    val email: String = "Email do Usuário",
    val dataNascimento: String = "01/01/1900",
    val usuario: String = "usuario",
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int = 0,
    @ManyToOne
    val plano: PlanoEntity = PlanoAvulsoEntity()) {
}