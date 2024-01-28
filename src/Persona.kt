/**
 * Ejercicio 4.3
 * Actualizar el ejercicio 1 para añadir a la clase el siguiente comportamiento:
 *
 * Debe retornar un saludo con su nombre... saludar():String
 * Debe retornar si altura por encima de la media (solo si altura >= 1.75)... alturaEncimaMedia():Boolean
 * Debe retornar si peso por encima de la media (solo si peso >= 70)... alturaEncimaMedia():Boolean
 * Sería conveniente añadir también un método obtenerDescImc() para usar en mostrarDesc(), que implemente el retorno de la descripción del rango de tipo de imc al que equivale su cálculo.
 * Nota: * Si el IMC es menos de 18.5, se encuentra dentro del rango de "peso insuficiente". * Si el IMC está entre 18.5 y 24.9, se encuentra dentro del rango de "peso saludable". * Si el IMC está entre 25.0 y 29.9, se encuentra dentro del rango de "sobrepeso". * Si el IMC es 30.0 o superior, se encuentra dentro del rango de "obesidad".
 *
 * Debe implementar también un método que muestre una descripción completa de la persona... mostrarDesc():String. Por ejemplo, este método mostrará por pantalla algo así:
 *
 * "Julia con una altura de 1.72m (Por debajo de la media) y un peso 64.7kg (Por encima de la media) tiene un IMC de 21,87 (peso saludable)".
 * 2. Crear en el main() una estructura de datos con 4 o 5 personas más, recorrer la estructura y por cada persona debe saludar y mostrar su descripción completa.
 * Finalmente, revisa el IDE e intenta actualizar el modificador de visibilidad de los métodos de tu clase cómo os estará indicando... veréis que los métodos que realmente no van a ser llamados desde fuera de la clase te recomienda que sean privados a la misma. De esta manera estamos encapsulando estos métodos para que se puedan utilizar solo desde dentro de la clase y no sean públicos.
 *
 */
class Persona( var peso: Double, var altura: Double ) {
    val imc = this.peso / (this.altura * this.altura)
    var nombre: String = ""
        set(value) {
            require(true and (value != "")){"El nombre no puede ser nulo o vacio."}
            field = value
        }
    constructor(nombre: String, peso: Double, altura: Double, ) : this(peso, altura) {
        this.nombre = nombre
    }
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString() = "${this.nombre} con una altura de ${this.altura}m y un peso ${this.peso}kg tiene un IMC de ${this.imc}"

    fun saludar() {
        return println("Buenas ${this.nombre}.")
    }
    private fun alturaEncimaMedia():Boolean {
        if (altura >= 1.75) {
            return true
        } else return false
    }
    private fun pesoEncimaMedia(): Boolean {
        if (peso >= 70) {
            return true
        } else return false
    }
    private fun obtenerDescImc(): String {
        when {
            this.imc in 18.5..24.9 -> return "peso saludable"
            this.imc < 18.5 -> return "peso insuficiente"
            this.imc in 25.0..29.9 -> return "sobrepeso"
            this.imc > 30.0 -> return "obesidad"
            else -> return "ballenato"
        }
    }
    private fun estatura(): String{
        if (alturaEncimaMedia()) return "Por encima de la media" else return "Por debajo de la media"
    }
    private fun masa():String{
        if (pesoEncimaMedia()) return "Por encima de la media" else return "Por debajo de la media"
    }
    fun mostrarDesc(){
        println("${this.nombre} con una altura de ${this.altura}m(${estatura()}) y un peso ${this.peso}kg (${masa()}) tiene un IMC de ${this.imc} (${obtenerDescImc()})")}

}