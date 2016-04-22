/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc141_mp3;

/**
 *
 * @author parfait
 */
import java.util.Scanner;

public class CMSC141_MP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Generations to be generated: ");
        int generations = scanner.nextInt();
        System.out.println("Initial Population: ");
        String init = scanner.next();
        
        Rule_30 r = new Rule_30();
        r.generator(generations, init);
    }
    
}
