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
public class JavaBitSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m, x = 0, y;
        n = in.nextInt();
        m = in.nextInt();

        BitSet[] myBitSet = new BitSet[n];
        for (int i = 1; i < myBitSet.length; i++) {
            myBitSet[i] = new BitSet(i);
        }

        for (int i = 0; i < m; i++) {
            String query = in.next();
            x = in.nextInt();
            y = in.nextInt();

            if (query.equals("AND")) {
                myBitSet[x].and(myBitSet[y]);

            } else if (query.equals("SET")) {
                myBitSet[x].set(y);
            } else if (query.equals("FLIP")) {
                myBitSet[x].flip(y);
            } else if (query.equals("OR")) {
                myBitSet[x].or(myBitSet[y]);
            } else if (query.equals("XOR")) {
                myBitSet[x].xor(myBitSet[y]);
            }
            System.out.println(myBitSet[1].cardinality() + " " + myBitSet[2].cardinality());
        }
    }
}
