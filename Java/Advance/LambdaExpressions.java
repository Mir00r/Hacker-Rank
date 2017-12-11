/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Created by Mir00r
 */
interface PerformOperation {

    boolean check(int a);
}

class MyMath {

    public static PerformOperation isOdd() {
        return (int a) -> {
            if (a % 2 == 0) {
                return false;
            } else {
                return true;
            }
        };
    }

    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a < 2) {
                return false;
            } else {
                for (int i = 2; i * i < a; i++) {
                    if (a % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static PerformOperation isPalindrome() {
        return (int a) -> {
            int tmpNum = a;
            int reverse = 0;
            while (a != 0) {
                reverse = reverse * 10;
                reverse = reverse + a % 10;
                a = a / 10;
            }

            if (tmpNum == reverse) {
                return true;
            } else {
                return false;
            }
        };
    }

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}

public class LambdaExpressions {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
