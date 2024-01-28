fun main() {
    val persona1 = Persona(70.0, 1.80)
    val persona2 = Persona(65.0, 1.68)
    val persona3 = Persona(80.0, 1.80)
    val persona4 = Persona(80.0, 1.80)
    val persona5 = Persona(80.0, 1.80)
    val personas = listOf(persona1,persona2,persona3,persona4,persona5 )
    mostrar(personas)
}
fun mostrar(personas:List<Persona>){
    personas.forEach { it.saludar()
        it.mostrarDesc()}
}