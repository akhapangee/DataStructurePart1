/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds;

import com.akhilesh.util.DynamicCollection;
import com.akhilesh.util.SearchSort;

/**
 *
 * @author Akhilesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {10, 5, 1, 25, 3, 7};
        int input = 5;

        System.out.println(SearchSort.search(array, input) ? "Found" : "Not found");

        System.out.println("====================after sort============");
        //true = ascending order, false = descending order
        array = SearchSort.sort(array, true);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================================Dynamic Collection=====================");

        DynamicCollection coll = new DynamicCollection();
        coll.add(434);
        coll.add(343);
        coll.add(4);

        for (int i : coll.getAll()) {
            System.out.println(i);
        }
        
       
        

    }

}
