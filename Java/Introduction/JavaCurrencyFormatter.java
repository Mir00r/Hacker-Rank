/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_code;

import java.util.*;
import java.text.*;

/**
 *
 * @author Created by Mir00r
 */
public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us, india, china, france;

        NumberFormat usNf, indiaNf, chinaNf, franceNf;

        usNf = NumberFormat.getCurrencyInstance(Locale.US);
        us = usNf.format(payment);

        indiaNf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        india = indiaNf.format(payment);

        chinaNf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = chinaNf.format(payment);

        franceNf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = franceNf.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
