package org.example.ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Facturacion {
  record Factura(String cliente, LocalDate fechaFactura, List<Double> precioProducto) {}

  public static void main(String[] args) {
    List<Factura> facturas = new ArrayList<>();
    facturas.add(
        new Factura("Maria Sanabria", LocalDate.of(1999, 7, 1), List.of(4500D, 5000D, 2500D)));
    facturas.add(
        new Factura("Juan Perez", LocalDate.of(2000, 8, 15), List.of(3500D, 6000D, 2800D)));

    for (int i = 0; i < facturas.size(); i++) {
      double totalValorFactura = calcularTotalFactura(facturas.get(i).precioProducto);
      imprimirFactura("Factura " + (i + 1), facturas.get(i), totalValorFactura);
    }
  }

  private static double calcularTotalFactura(List<Double> preciosProductos) {
    return preciosProductos.stream().mapToDouble(Double::doubleValue).sum();
  }

  private static void imprimirFactura(String titulo, Factura factura, double total) {
    System.out.println(titulo);
    System.out.println("Cliente: " + factura.cliente());
    System.out.println("Fecha de Factura: " + factura.fechaFactura());
    System.out.println("Total: " + total);
  }
}
