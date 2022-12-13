class Project{

    private String nombre;
    private String descripcion;
    private double initialCost;

    public String elevatorPitch() {
        return this.nombre+"("+this.initialCost+"):"+this.descripcion;
    }

    public Project() { } /*Inicializa los atributos como null */

    /*  SOBRECARGA de método constructor
        Recibe nombre
        name = "Proyecto Mariposa"
        proyecto2.nombre = "Proyecto Mariposa"
     */
    public Project(String name) {
        this.nombre = name;
    }

    //name = "Proyecto Codifica"
    //description = "Este proyecto es sobre enseñar a más personas a codificar"
    //proyecto3.nombre = "Proyecto Codifica"
    //proyecto3.descripcion = "Este proyecto es sobre enseñar a más personas a codificar"
    public Project(String name, String description) { 
        this.nombre = name;
        this.descripcion = description;
    }

    /*GETTERS y SETTERS */
    public String getName() {
        return this.nombre;
    }

    //nombre = "Proyecto 1"
    //proyecto1.nombre = "Proyecto 1"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public String getDescripcion() {
        return this.descripcion;
    }

    //descripcion = "El Proyecto mariposa consiste en crear un santuario de mariposas"
    //proyecto2.descripcion = "El Proyecto mariposa consiste en crear un santuario de mariposas"
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getInitialCost() {
        return this.initialCost;
    }

    public void setInitialCost(double nuevoInitialCost) {
        this.initialCost = nuevoInitialCost;
    }


}