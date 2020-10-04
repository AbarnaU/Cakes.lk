package com.example.cakeslk;

import com.example.cakeslk.Orders.CalculateAmount;
import com.example.cakeslk.cakes.TotalCalculation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    private TotalCalculation totalCalculation;
    private CalculateAmount calculateAmount;


    @Before
    public void setUp(){

        totalCalculation = new TotalCalculation();
        calculateAmount = new CalculateAmount();

    }

//IT19116952 - Abarna.U
    @Test
    public void total_amount_pass(){
        double total = totalCalculation.totalCalculate(3000.00,2);
        assertEquals(6000.00,total,0.001);
    }

    @Test
    public void total_amount_fail(){
        double total = totalCalculation.totalCalculate(4500.00,4);
        assertEquals(10000.00,total,0.001);
    }

//IT19000886 - S.Hariscumar
    @Test
    public void cal_pass(){
        double amount = calculateAmount.calAmount(05,250);
        assertEquals(500,amount,0.001);
    }

    @Test
    public void cal_fail(){
        double amount = calculateAmount.calAmount(10,250);
        assertEquals(5000,amount,0.001);
    }
}