fun main(){
    val persona1 = Persona("jesus",26,"15/01/1998")
    val estudiante = Estudiante("David",24,"20/10/1993","DAM1")
    persona1.cumple()
    println(persona1.nombre)
    persona1.mostrarEdad()
    println(persona1)
    println(estudiante)
    estudiante.actividad()
    persona1.actividad()

    try{
        val persona2 = Persona("jesus",-40, fechaNacimiento = "09/06/2000")
    }catch (e: IllegalArgumentException){
        println("$e")
    }
}