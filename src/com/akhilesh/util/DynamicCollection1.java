/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.util;

/**
 *
 * @author Akhilesh
 */
public class DynamicCollection1 {

    private int pos = 0, value = -1;

    //instantiate collection
    private int[] coll = new int[0];

    public void add(int n) {
        if (coll.length == 0) {
            coll = new int[1];
            coll[0] = n;
        } else {
            int[] temp = new int[coll.length + 1];
            for (int i = 0; i < coll.length; i++) {
                temp[i] = coll[i];
            }
            temp[coll.length] = n;
            coll = temp;
        }
    }

    public int[] getAll() {
        return coll;
    }

    public boolean next() {
        if (coll.length == pos) {
            return false;
        }
        value = coll[pos];
        pos++;
        return true;
    }

    public int getValue() {
        return value;
    }
    
    public void sort(boolean order){
        SearchSort.sort(coll, order);
    }
    
    public boolean search(int n){
        return SearchSort.search(coll, n);
    }
}
