class ProjectTest {

    public static void main(String[] args) {

        //Proyecto vacío
        Project proyecto1 = new Project();
        proyecto1.setNombre("Proyecto 1");
        proyecto1.setDescripcion("Esta es la descripción del proyecto 1");
        proyecto1.setInitialCost(199.99);

        System.out.println(proyecto1.elevatorPitch());

        Project proyecto2 = new Project("Proyecto Mariposa");
        proyecto2.setDescripcion("El Proyecto mariposa consiste en crear un santuario de mariposas");
        proyecto2.setInitialCost(5000.50);

        System.out.println(proyecto2.elevatorPitch());

        Project proyecto3 = new Project("Proyecto Codifica", "Este proyecto es sobre enseñar a más personas a codificar");
        proyecto3.setInitialCost(30000);

        System.out.println(proyecto3.elevatorPitch());


    }

}