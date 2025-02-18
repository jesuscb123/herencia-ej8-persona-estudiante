## Ejercicio 8: Persona y Estudiante¶
1.Clases y Objetos Básicos:

2. Crea una clase Persona que tenga dos propiedades: nombre y edad. Luego, en el main crea un objeto de esta clase e imprime sus propiedades.

3. Métodos Simples:

4. Añade un método cumple a la clase Persona que incremente la edad de la persona en uno cada vez que se llama.
   
5. Sobreescribe el método toString() y prográmalo para que se muestre una persona con todas sus propiedades. Por ejemplo "Persona (nombre = Lucía, edad = 21)".
   
6. En el main ejecuta el cumple de la persona y muestra su información de dos formas: accediendo a sus propiedades y mediante el método toString() (recuerda que no es necesario llamar al método toString(), sino que se invocará automáticamente cuando necesite realizar la conversión del contenido a String).

7. Encapsulamiento:

8. Modifica la clase Persona para que reciba la fecha de nacimiento por el constructor, y se almacene en una propiedad privada. Modificar la edad para que no se pueda modificar, pero se pueda consultar su valor, calculándolo con respecto a la fecha de nacimiento.

9. Herencia:
    
10. Crea una clase Estudiante que herede de Persona y añade una propiedad carrera. Las propiedades deben incluir el modificador open (vuelve a dejar la propiedad edad pública).
    
11. Realiza de nuevo un override de toString() para completar la información de Estudiante (intenta usar el resultado del método de la clase padre y completarlo).

12. Polimorfismo:

13. Añade un método actividad() a la clase Persona que imprima "Lucía está realizando una actividad." y sobreescribe en Estudiante para que muestre un mensaje específico para estudiantes.
    
14. Crea en el main a una persona y un estudiante y muestra la actividad que realizan.

15. Clases y Objetos con Validación:

16. Modifica la clase Persona para que no acepte nombres vacíos y edades negativas. Utiliza un constructor primario con valores por defecto para edad.
    
17. Prueba a crear un estudiante con una edad negativa, controlando las excepciones y mostrando el mensaje de error específico.
    
Objetivo: Aprender a crear clases y objetos, a utilizar métodos y propiedades, a aplicar el encapsulamiento, a utilizar la herencia y el polimorfismo, y a controlar las excepciones.
