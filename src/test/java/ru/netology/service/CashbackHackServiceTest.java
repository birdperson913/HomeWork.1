package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

     @Test //тест суммы до 1000р , ответ 1
    public void OneTest(){
         CashbackHackService service = new CashbackHackService();
         int actual = service.remain(999);
         int expected =1;
         assertEquals(actual,expected);
     }
    // //тест суммы д1000р , ответ 1
    @Test
    public void twoTest() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }


    @Test // //тест суммы до 1001р , ответ 999
    public void ThreeTest() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }


    @Test//Середина диапазона
    public void FourTest() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }


}