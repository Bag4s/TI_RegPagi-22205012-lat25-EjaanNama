/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.bagas;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TI_RegPagi_22205012_Latihan25 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
     System.out.print("Masukan nama depan anda : ");
        String nama1 = scanner.nextLine();
        System.out.println("Ejaan untuk \"" + nama1 + "\" adalah :");
        for (int i = 0; i < nama1.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama1.charAt(i));
        }
    }
}
    

