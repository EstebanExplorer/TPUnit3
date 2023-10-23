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
public class ConvertirDistanciaMillas5Test {
  private static final Logger logger = LoggerFactory.getLogger(ConvertirDistanciaMillas5.class);

  public ConvertirDistanciaMillas5Test() {}

  @Test
  public void testMain() {
    logger.info("main");
    String[] args = null;
    ConvertirDistanciaMillas5.main(args);
    logger.error("testing code");
  }

  @Test
  public void testConvertirAKilometrosAMillas() {
    logger.info("Convert to kilometers to miles");
    double distanciaKilometros = 0.0;
    double expResult = 0.0;
    double result = ConvertirDistanciaMillas5.convertirAKilometrosAMillas(distanciaKilometros);
    assertEquals(expResult, result, 0);
    logger.error("testing code");
  }
}
