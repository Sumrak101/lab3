package org.example;

import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    @Ignore
    public void zadacha1() {
        String input = "300";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int a = Main.USN(200);
        assertEquals(12,a);
    }

    @Test(timeout = 300)
    public void zadacha2() {
        String input = "300";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int a = Main.USN(200);
        assertEquals(12,a);
    }
}