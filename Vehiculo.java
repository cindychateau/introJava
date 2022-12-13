class Vehiculo {
    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;

    private static int cantidadVehiculos = 0; //Una variable estática se comparte entre todas las instancias de la clase

    /*Método constructor: La que crea la instancia de Vehiculo */
    public Vehiculo() {
        cantidadVehiculos++;
    }
    
    /*Sobrecargamos el método constructor  
    color = "rojo"
    autorojo.color = "rojo";
    */
    public Vehiculo(String color) {
        this.color = color;
        cantidadVehiculos++;
    }
    /*
    color = "amarilla"
    ruedas = 2
    bicicleta.color = "amarilla"
    bicicleta.ruedas = 2
     */
    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
        cantidadVehiculos++;
    }

    /*
    anio = 2018
    marca = "Mazda"
    modelo = "CX-3"
    color = "azul"
    ruedas = 4
     */
    public Vehiculo(int anio, String marca, String modelo, String color, int ruedas) {
       this.anio = anio; //auto2.anio = 2018
       this.marca = marca; //auto2.marca = "Mazda"
       this.modelo = modelo; //auto2.modelo = "CX-3"
       this.color = color; //auto2.color = "azul"
       this.ruedas = ruedas; //auto2.ruedas = 4
       cantidadVehiculos++;
    }

    /*Función para imprimir 
    this = auto2*/
    public void imprimir() {
        System.out.println("Año:"+this.anio+" Marca:"+this.marca+" Modelo:"+this.modelo+" Color:"+this.color+" Ruedas:"+this.ruedas);
    }

    /* GETTER - me regresa el valor del atributo */
    public int getAnio() {
        return this.anio;
    }

    /* SETTER - Recibe un valor y lo guarda en el atributo */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

}