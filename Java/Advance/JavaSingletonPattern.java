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
class Singleton{
    final static Singleton singleton = new Singleton();
    public String str;
	private Singleton() {
	}

	public static Singleton getSingleInstance () {
		return singleton;
	}
}