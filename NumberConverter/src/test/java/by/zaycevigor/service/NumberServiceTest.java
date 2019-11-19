package by.zaycevigor.service;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Scanner;

import static by.zaycevigor.service.NumberService.SERVICE;
import static org.junit.jupiter.api.Assertions.*;

public class NumberServiceTest {
    static String[][] numbers = {{"123", "сто двадцать три"},
                {"951051001921", "девятьсот пятьдесят один миллиард пятьдесят один миллион одна тысяча девятьсот двадцать один"},
                {"000001", "один"},
                {"2", "два"}};


    @Test
    void convertTest() throws NumberException {
        for (String[] pair : numbers) {
            assertEquals(pair[1].trim(), (SERVICE.convert(pair[0]).trim()).toLowerCase());
        }
    }
}


