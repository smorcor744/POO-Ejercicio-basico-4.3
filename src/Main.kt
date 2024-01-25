fun main() {
    val persona1 = Persona(70.0, 1.80)
    val persona2 = Persona(65.0, 1.68)
    val persona3 = Persona(80.0, 1.80)


    println("Introduce un nuevo nombre para la persona1:")
    persona1.nombre = readln()
    persona2.nombre = "Marta"
    persona3.nombre = "Alberto"

    println("${persona1.nombre}: mide ${persona1.altura}m y pesa ${persona1.peso}")

    println("Mide ${persona1.altura}m, pesa ${persona1.peso} y su imc es de ${persona3.imc}")

    do {
        println("Introduce una nueva altura para ${persona3.nombre}")
        try {
            persona3.altura = readln().toDouble()
        }catch (e: Exception) {
            println("Altura no valida")
        }
    } while (false)

    println("Mide ${persona3.altura}m, pesa ${persona3.peso} y su imc es de ${persona3.imc}")
    persona3.altura = persona2.altura
    println(persona2)
    println(persona3)
    val comparacion = comparar(persona2,persona3)
    if (comparacion) println("Son iguales")
    print(persona2.equals(persona3))
}
fun comparar(persona1:Persona,persona2:Persona):Boolean{
    if (persona1 == persona2) return true else return false
}