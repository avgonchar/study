package com.company;

import static org.junit.jupiter.api.Assertions.*;



class MainTest {

    Main obj;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("BeforeEach");

        obj = new Main();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @org.junit.jupiter.api.Test
    void main() {
        System.out.println("test main");
    }

    @org.junit.jupiter.api.Test
    void calc() {
        assertEquals(8,obj.calc(2,3));
    }
}