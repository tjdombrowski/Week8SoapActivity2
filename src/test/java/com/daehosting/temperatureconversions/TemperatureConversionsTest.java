package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {
    TemperatureConversionsSoapType service;

    @BeforeEach
    void setUp() {
        service = new TemperatureConversions().getTemperatureConversionsSoap12();
    }

    @Test
    void getTemperatureCelsiusToFahrenheit() {
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));

        assertEquals(BigDecimal.valueOf(32), celsiusToFahrenheitResult);

    }

    @Test
    void getTemperatureFahrenheitToCelsius() {
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));

        assertEquals(BigDecimal.valueOf(0), fahrenheitToCelsiusResult);

    }

    @Test
    void getWindChillInCelsius() {
        BigDecimal windChillCelsius = service.windChillInCelsius(BigDecimal.valueOf(10), BigDecimal.valueOf(50));

        assertEquals(BigDecimal.valueOf(-6.64), windChillCelsius);
    }

    @Test
    void getWindChillInFahrenheit() {
        BigDecimal windChillCelsius = service.windChillInFahrenheit(BigDecimal.valueOf(50), BigDecimal.valueOf(50));

        assertEquals(BigDecimal.valueOf(20.048), windChillCelsius);
    }

}