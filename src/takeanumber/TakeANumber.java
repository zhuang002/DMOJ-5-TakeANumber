/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeanumber;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class TakeANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt()-1;
        sc.nextLine();
        int serves=0;
        int takes=0;
        do {
            s=sc.next();
            if (s.equals("TAKE")) {
                number=(number+1)%999;
                takes++;
            } else if (s.equals("SERVE")) {
                serves++;
            } else if (s.equals("CLOSE")) {
                System.out.println(takes+" "+(takes-serves)+" "+(number+1));
            }
        }while (!s.equals("EOF"));
    }
    
}
