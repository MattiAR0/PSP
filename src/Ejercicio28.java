public class Ejercicio28 {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[5];

        vehiculos[0] = new Vehiculo("Coche", "Toyota", "Corolla");
        vehiculos[1] = new Vehiculo("Motocicleta", "Honda", "CBR");
        vehiculos[2] = new Vehiculo("Camión", "Mercedes", "Actros");
        vehiculos[3] = new Vehiculo("Coche", "BMW", "Serie 3");
        vehiculos[4] = new Vehiculo("Bicicleta", "Giant", "Talon");

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }
}
