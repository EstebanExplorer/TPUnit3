/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.example.ejercicios;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author estebanh
 */
public class FacturacionTest {
  private static final Logger logger = LoggerFactory.getLogger(Facturacion.class);

  public FacturacionTest() {}

  @Test
  public void testMain() {
    logger.info("main");
    String[] args = null;
    Facturacion.main(args);
    logger.error("testing code");
  }
}
