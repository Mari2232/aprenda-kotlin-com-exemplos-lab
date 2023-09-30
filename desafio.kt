import kotlin.collections.mutableListOf

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(val nome: String, val email: String, val tel: String, var cursos: MutableList<Formacao>)

data class ConteudoEducacional(val nome: String, val duracao: Int, val dificuldade: Nivel) {
   
    val conteudo = mutableListOf<ConteudoEducacional>()
}

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>, var matriculados: MutableList<Usuario>) {
    
    val form = mutableListOf<Formacao>()
}
    
val inscritos1 = mutableListOf<Usuario>()
val inscritos2 = mutableListOf<Usuario>()

fun matricular(novoUser: Usuario, formacao: Formacao) { 
    formacao.matriculados.add(novoUser)
    novoUser.cursos.add(formacao)
                        
}
    
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
    
    val form1 = Formacao("Formação1", conteudo1, inscritos1)   
    
    val form2 = Formacao("Formação2", conteudo2, inscritos2)
    
    
    	val usuario1 = Usuario("Pedro", "pedro123@gmail.com", "61981456879", mutableListOf()) 
        val usuario2 = Usuario("Marina", "mari_na@gmail.com", "18981446600", mutableListOf())   
    	val usuario3 = Usuario("Julia", "juju@gmail.com", "66981156889", mutableListOf())
        val usuario4 = Usuario("Mariana", "mari_ana@gmail.com", "17981446600", mutableListOf())
        
    
   matricular(usuario1,form1)
   matricular(usuario2,form2)
   matricular(usuario3,form1)
   matricular(usuario4,form2)
   
   
   println("Inscritos formacao1:\n")
   form1.matriculados.forEach{ aluno ->
       println("${aluno.nome}\n")
   }  
   
    println("Inscritos formacao2:\n")
   form2.matriculados.forEach{ aluno ->
       println("${aluno.nome}\n")    
       
   }