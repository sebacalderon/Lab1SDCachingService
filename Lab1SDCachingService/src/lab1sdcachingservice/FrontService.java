/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1sdcachingservice;

/**
 *
 * @author Seba
 */
import java.util.*;


public class FrontService {
    
    public static void main(String[] args) {
        String query = "Query ";
        int numero;
        
        for (int i = 0; i < 2; i++) {
            String numero_query = Integer.toString(i);
            String query2  = query + numero_query;
            (new Thread (new HiloFrontService(i, query2))).start();   
        }
    }

}