package animales;

public class Pajaro {
//Aquí se almacena la información del pájaro

    String nombre_especie;
    double envergadura;
    double peso;

    public Pajaro(String nombre_especie, double envergadura, double peso) {
        this.nombre_especie = nombre_especie;
        this.envergadura = envergadura;
        this.peso = peso;
    }

    public Pajaro() {
    }

    public String getNombre_especie() {
        return nombre_especie;
    }

    public void setNombre_especie(String nombre_especie) {
        this.nombre_especie = nombre_especie;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimir() {
        System.out.println("ZOOLÓGICO DE CUENCA – SECCIÓN DE AVES");
        System.out.println("Registro Sanitario No 48/38751");
        System.out.println("Para consultar el nombre del animal revise la etiqueta");
        System.out.println("Peso: " + this.peso);
        System.out.println("Envergadura: " + this.envergadura);
        System.out.println("Nombre de la especie: " + this.nombre_especie);
    }

}
