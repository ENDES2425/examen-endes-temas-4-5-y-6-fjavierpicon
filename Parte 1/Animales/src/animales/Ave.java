package animales;

public class Ave {
//Aquí se almacena la información del pájaro

    private String especie;
    private double envergadura;
    private double peso;

    public Ave(String nombre_especie, double envergadura, double peso) {
        this.especie = nombre_especie;
        this.envergadura = envergadura;
        this.peso = peso;
    }

    public Ave() {
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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

    public void imprimir_cabecera() {
        System.out.println("ZOOLÓGICO DE CUENCA – SECCIÓN DE AVES");
        System.out.println("Registro Sanitario No 48/38751");
        System.out.println("Para consultar el nombre del animal revise la etiqueta");
        imprimir_detalle();
    }

    public void imprimir_detalle() {
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Envergadura: " + this.getEnvergadura());
        System.out.println("Nombre de la especie: " + this.getEspecie());
    }
}
