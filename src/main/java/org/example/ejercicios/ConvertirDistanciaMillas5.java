package org.example.ejercicios;

public class ConvertirDistanciaMillas5 {
  record DistanciaViaje(String origen, String destino, double distanciaKilometros) {}

  public static void main(String[] args) {
    DistanciaViaje viaje = new DistanciaViaje("Medellin", "Bogotá", 100.0);

    double distanciaKilometros = obtenerDistanciaEnKilometros(viaje);
    double distanciaMillas = convertirAKilometrosAMillas(distanciaKilometros);
    imprimirDistanciaEnMillas(viaje, distanciaMillas);
  }

  public static double obtenerDistanciaEnKilometros(DistanciaViaje viaje) {
    return viaje.distanciaKilometros();
  }

  public static double convertirAKilometrosAMillas(double distanciaKilometros) {
    return distanciaKilometros * 0.621371;
  }

  public static void imprimirDistanciaEnMillas(DistanciaViaje viaje, double distanciaMillas) {
    System.out.println(
        "La distancia entre "
            + viaje.origen()
            + " y "
            + viaje.destino()
            + " es de "
            + distanciaMillas
            + " millas.");
  }
}
