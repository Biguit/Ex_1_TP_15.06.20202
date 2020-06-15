/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg3.tp.pkg15.pkg06.pkg2020;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class Ex3TP15062020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double A, B, C;
        
    Scanner enter= new Scanner (System.in);
    System.out.println ("Informe o valor do lado A: ");
    A= enter.nextDouble();
    System.out.println ("Informe o valor do lado B: ");
    B= enter.nextDouble();
    System.out.println ("Informe o valor do lado C: ");
    C= enter.nextDouble();
    
    if ((A + B > C) && (A + C > B) && (B + C > A))
    {
                if ((A == B) && (A == C) && (B == C))
                    System.out.println ("O triângulo é Equilátero");
                else

                if ((A != B) && (A != C) && (B != C))
                    System.out.println ("O triângulo é Escaleno");
                else

                    if ((A == B) && (A != C) || (A == C) && (A != B) || (B == C) && (B != A))
                    System.out.println ("O triângulo é Isósceles");
            else
                System.out.println ("Não é um triângulo");
    }
        // TODO code application logic here
    }
    
}
