/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds;

import com.akhilesh.util.DynamicCollection1;

/**
 * Iterator design pattern
 *
 * @author Akhilesh
 */
public class IteratorDesignPatternDemo {

    public static void main(String[] args) {
        DynamicCollection1 coll = new DynamicCollection1();
        coll.add(5);
        coll.add(7);
        coll.add(4);

        coll.sort(false);
        while (coll.next()) {
            System.out.println(coll.getValue());
        }
        System.out.println("==========================Search============");
        System.out.println(coll.search(5) ? "Found" : "Not found");

    }
}
