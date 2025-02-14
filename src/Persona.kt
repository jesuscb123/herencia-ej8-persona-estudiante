open class Persona(nombre: String, edad: Int) {
    var nombre = nombre
    var edad = edad
    init{
        require(this.nombre.isNotEmpty()) {"El nombre no puede estar vacío"}
        require(edad > 0) {"La edad no puede ser menor de 0."}
    }
    fun cumple(){
        edad += 1
    }

    fun mostrarEdad(){
        println("Edad: $edad")
    }

   open fun actividad(){
        print("$nombre está realizando una actividad")
    }


    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad)"
    }


}