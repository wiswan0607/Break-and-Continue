/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Break.Continue;

/**
 *
 * @author apit
 */
public class Break {
    public static void main (String [] arg){
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
            if (i==4){
                break;
            }
        }
    }
    
}
