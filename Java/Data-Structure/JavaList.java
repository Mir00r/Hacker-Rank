/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_code;

import java.util.*;

/**
 *
 * @author Created by Mir00r
 */
public class JavaList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, val, q, x, y;

        n = in.nextInt();
        List<Integer> myList = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            val = in.nextInt();
            myList.add(val);
        }
        q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String query = in.next();
            if (query.equals("Insert")) {
                x = in.nextInt();
                y = in.nextInt();
                myList.add(x, y);
            } else if (query.equals("Delete")) {
                x = in.nextInt();
                myList.remove(x);
            }
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}
