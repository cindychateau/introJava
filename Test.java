import java.util.ArrayList;
import java.util.HashMap;
public class Test {
    //Método principal, se ejecuta a primer instancia al ejecutar nuestro código
    public static void main(String[] args){
        System.out.println("Hola mundo !");

        //Variables primitivas
        int nuestroInt; //Podemos declarar una variable sin establecer un valor
        nuestroInt = 400; //int es un número entero. Podemos asignar el valor a la variable más adelante en nuestro código
        double pi = 3.14159265; //double es un valor con decimales. Podemos declarar y asignar un valor en la misma línea
        boolean bool = true; //boolean puede ser true o false
        char unCaracter = 'A';

        String multiplesCaracteres = "ABCDE";
        System.out.println(multiplesCaracteres);

        //Variables tipo objeto
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        //Gracias a las variables tipo objeto, nosotros podemos utilizar métodos o funciones pre-hechas
        String myString = myInt.toString(); //myString = "5";
        System.out.println(myString.length()); //tamaño de myString -> 1

        //Cadenas - Strings
        String cadena = "Buenos días a todos mis Compañeros";
        int length = cadena.length();
        System.out.println("La longitud de mi cadena es: " + length);
        char letra = cadena.charAt(1); //obtenemos una letra en la posición que indicamos
        System.out.println(letra);

        int posicion1 = cadena.indexOf("Buenos"); //Me regresa la posición donde se encuentra lo que estamos buscando;
        System.out.println(posicion1);
        int posicion2 = cadena.indexOf("compañeros"); //Es case sensitive, si no encontramos la palabra nos regresa -1
        System.out.println(posicion2);

        System.out.println(cadena.toLowerCase()); //Todas minúsculas
        System.out.println(cadena.toUpperCase()); //Todas mayúsculas

        String str1 = "Mi nombre es ";
        String str2 = "Cynthia Castillo";
        String str3 = str1.concat(str2); //Juntamos dos strings
        System.out.println(str3);

        String hola1 = "hola";
        String hola2 = "Hola";
        System.out.println(hola1.equals(hola2)); //Compara dos strings y nos regresa true si son iguales

        int[] myArray; //Inicialización
        myArray = new int[5]; //Cuántas posiciones tendrá mi arreglo
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;

        int[] myArray2 = {4, 8, 8, 5, 9};

        System.out.println("Hola \n ¿Cómo estás?");

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);

        ArrayList<Integer> myArray3 = new ArrayList<Integer>(); //Inicializamos una variable objeto de una lista
        myArray3.add(10);

        //CONDICIONALES 
        int numero1 = 5;
        int numero2 = 5;

        if(numero1 == numero2) { //== si son iguales, != si son distintos
            System.out.println("Números iguales");
        } else {
            System.out.println("Números distintos");
        }   

        int numero3 = 4;
        if(numero1 != numero3) {
            System.out.println("Números 1 y 3 son distintos");
        } else {
            System.out.println("Números iguales");
        }

        boolean llueve = false;
        boolean soleado = true;

        if(llueve) {
            System.out.println("Lleva paraguas.");
        } else if (soleado) {
            System.out.println("Ponte bloqueador");
        } else {
            System.out.println("Disfruta tu día");
        }

        llueve = true;
        if(llueve && soleado) { //&& AMBAS condicionales deben de cumplirse
            System.out.println("Busca el arcoiris");
        }

        soleado = false;
        if(llueve || soleado) { //|| Si se cumple con cualquiera de las condicionales entramos
            System.out.println("Esta lloviendo O está soleado, no lo sé");
        }

        //BUCLES o CICLOS

        /*
        i = 0
        IMPRIME Foo
        i = 1
        IMPRIME Foo
        i = 2
        IMPRIME Foo
        ...
        i = 7
        */
        int i = 0;
        while(i < 7){
            System.out.println("Foo");
            i++;
        }

        /*
        j = 0
        IMPRIME Bar
        j = 1
        IMPRIME Bar
        j = 2
        IMPRIME Bar
        ...
        j = 7
        */
        for (int j = 0; j < 7; j++) {
            System.out.println("Bar");
        }

        HelloWorld helloApp = new HelloWorld(); //Inicializamos la clase HelloWorld
        System.out.println(helloApp.hola());
        System.out.println(helloApp.hola("Elena"));
        System.out.println(helloApp.hola("Elena", "De Troya"));
        System.out.println(helloApp.hola("Elena", 15));
        
        helloApp.hola_void();

        //HASHMAP
        HashMap<String, String> usuario = new HashMap<String, String>();
        usuario.put("nombre", "Elena");
        usuario.put("apellido", "De Troya");
        usuario.put("email", "elena@codingdojo.com");
        usuario.put("curso", "Java");

        System.out.println("Nombre:"+usuario.get("nombre")+" Apellido"+usuario.get("apellido"));

    } 

}