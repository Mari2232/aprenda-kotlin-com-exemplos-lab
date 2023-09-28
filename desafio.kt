import kotlin.collections.mutableListOf

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(val nome: String, val email: String, val tel: String, var curso: List<Formacao>)

data class ConteudoEducacional(val nome: String, val duracao: Int, val dificuldade: Nivel) {
   
    val conteudo = mutableListOf<ConteudoEducacional>()
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    
    val form = mutableListOf<Formacao>()
}
    

val users = mutableListOf<Usuario>()
//fun matricular(novoUser: Usuario()) { 
    
 //   users.add(novoUser)                      
//}
    
fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val conteudo1 = mutableListOf<ConteudoEducacional>(
        ConteudoEducacional("Conteudo1", 40, Nivel.BASICO),
        ConteudoEducacional("Conteudo2", 60, Nivel.INTERMEDIARIO),
		ConteudoEducacional("Conteudo3", 80, Nivel.AVANÇADO)   
    )
    //println(conteudo1)
    
    val conteudo2 = mutableListOf<ConteudoEducacional>(
        ConteudoEducacional("Conteudo11", 80, Nivel.BASICO),
        ConteudoEducacional("Conteudo22", 40, Nivel.INTERMEDIARIO),
		ConteudoEducacional("Conteudo32", 30, Nivel.AVANÇADO)   
    )
    //println(conteudo2)
    
    val form1 = mutableListOf<Formacao>(
    	Formacao("Formação1", conteudo1)
    )
    //println(form1)
    
    val form2 = mutableListOf<Formacao>(
    	Formacao("Formação2", conteudo2))
    
    val users = mutableListOf<Usuario> (
    	Usuario("Pedro", "pedro123@gmail.com", "61981456879", form1),
        Usuario("Marina", "mari_na@gmail.com", "18981446600", form1),
    )
    println("Inscritos na Formação1:")
    println(users)
    
    val users2 = mutableListOf<Usuario> (
    	Usuario("Julia", "juju@gmail.com", "66981156889", form2),
        Usuario("Mariana", "mari_ana@gmail.com", "17981446600", form2),
    )
    println("Inscritos na Formação2:")
    println(users2)
    
    val user = Usuario("Joana", "joana@gmail.com", "17985647854", form1)
    println("Adicionado novo $user em $form1: ${users.add(user)}")
    println(users)
    
    val user1 = Usuario("Patrick", "patrickebob@gmail.com", "41985647214", form2)
    println("Adicionado novo $user1: ${users.add(user1)}") 
   
    println(user1)
   
    
    val user2 = Usuario("Peter", "peter@gmail.com", "48975547214", form2)
    println("Adicionado novo $user2: ${users.add(user2)}")
    
    
}