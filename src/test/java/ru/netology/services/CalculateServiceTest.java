package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateServiceTest {


    @Test
    void testCalculate1() {
        CalculateService service = new CalculateService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculate2() {
        CalculateService service = new CalculateService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data_test.csv")
    void testWithParams(int income, int expense, int threshold, int expected){
        CalculateService service = new CalculateService();

        int actual = service.calculate(income, expense,threshold);

        Assertions.assertEquals(expected, actual);
    }
}
