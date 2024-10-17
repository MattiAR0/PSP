public class Vehiculo {
    String tipo;
    String marca;
    String modelo;

    Vehiculo(String tipo, String marca, String modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Modelo: " + modelo);
    }
}
