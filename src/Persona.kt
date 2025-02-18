import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Persona(nombre: String, edad: Int = 20, fechaNacimiento: String) {
    private val formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    private val fechaNacimientoPersona = LocalDate.parse(fechaNacimiento,formatoFecha)

    var nombre = nombre
    var edad = edad
        get() = Period.between(fechaNacimientoPersona,fechaActual).years
        private set

    private var fechaActual = LocalDate.now()

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
        println("$nombre está realizando una actividad")
    }


    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad)"
    }


}