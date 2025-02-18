class Estudiante(nombre: String, edad: Int, fechaNacimiento: String, val carrera: String) : Persona(nombre, edad, fechaNacimiento) {

    override fun toString(): String {
        return super.toString().replace(")",", Carrera = $carrera)")
    }


    override fun actividad() {
        println("$nombre está estudiando.")
    }
}