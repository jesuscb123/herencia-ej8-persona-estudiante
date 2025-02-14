fun main(){
    val persona1 = Persona("jesus",26)
    val estudiante = Estudiante("David",29,"DAM1")
    persona1.cumple()
    println(persona1.nombre)
    persona1.mostrarEdad()
    println(persona1)
    println(estudiante)
    estudiante.actividad()
    persona1.actividad()
}