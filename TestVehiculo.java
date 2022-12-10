class TestVehiculo {

    public static void main(String[] args) {

        //Crear un vehiculo
        Vehiculo auto1 = new Vehiculo();
        // auto1.anio = 2001;
        // auto1.marca = "Honda";
        // auto1.modelo = "Civic";
        // auto1.color = "blanco";
        // auto1.ruedas = 4;
        auto1.setAnio(2001);
        auto1.setMarca("Honda");
        auto1.setModelo("Civic");
        auto1.setColor("blanco");
        auto1.setRuedas(4);


        //Crear un segundo vehiculo
        Vehiculo auto2 = new Vehiculo(2018, "Mazda", "CX-3", "azul", 4);

        // System.out.println("Marca auto1: "+auto1.marca);
        // System.out.println("Marca auto2: "+auto2.marca);
        System.out.println("Marca auto1: "+ auto1.getMarca() );
        System.out.println("Marca auto2: "+ auto2.getMarca() );

        //Creo un vehículo con color
        Vehiculo autorojo = new Vehiculo("rojo");
        String color_autorojo = autorojo.getColor(); //"rojo"

        System.out.println("Color autorojo: "+color_autorojo);

        //Creo otro vehículo
        Vehiculo bicicleta = new Vehiculo("amarilla", 2);
        String color_bicicleta = bicicleta.getColor();
        System.out.println("Color bicicleta: "+color_bicicleta);

        auto2.imprimir();


    }

}