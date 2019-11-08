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
public class Continue {
    public static void main(String [] arg){
        int i=1;
        while (i<10){
            if (i==6){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    
}
