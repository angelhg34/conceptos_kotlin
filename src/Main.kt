fun main() {
    //creando variables en kotlin con la palabra reservada var------------------------------------------------------------------
    var edad: Int = 30
    edad = 31 //se puede reasignar debido a que es una variable
    println(edad)

    var correo="miguel1516q6@gmail.com";
    println(correo);


    //creando constantes con la palabra reservada val-------------------------------------------
    val nombre: String ="Miguel Ortiz";
    //nombre="miguel" //no se puede reasignar debido a que es una constante

    val pi=3.1416
    println(pi)

    //creando opcionales y nulos en kotiln-----------------------------
    var nombre2: String? = null;
    //nombre2="Camilo Perez";
    println("Longitud del nombre: $nombre2");

    //como la variable nombre 2 esta comentada el valor opcional en este caso es 0
    val longitud = nombre2?.length ?:0
    println("Longitud del nombre : $longitud");
    
    var telefono: String?= null;
    telefono="3134685626";
    println("Telefono: $telefono");

    //como se re asigna telefono como null, el valor que imprime es no disponible
    telefono = null;
    println("Teléfono después de asignar null: ${telefono?.length ?: "No disponible"}")





}