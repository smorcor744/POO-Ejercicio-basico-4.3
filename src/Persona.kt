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

}