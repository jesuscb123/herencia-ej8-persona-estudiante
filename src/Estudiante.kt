class Estudiante(nombre: String, edad: Int, val carrera: String) : Persona(nombre,edad) {

    override fun toString(): String {
        return super.toString().replace(")",", Carrera = $carrera)")
    }


    override fun actividad() {
        println("$nombre está estudiando.")
    }
}