/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        String nama[]= {"Arif","Sindu","Monica","Wulan","Sari"};
        System.out.println("Masukkan nama: ");
       
        int angka =0;
        String nama1=masuk.next();
        
        for (int i=0; i< nama.length;i++){
     
        if(nama [i].equals(nama1)){
            System.out.println("Data ditemukan");
            System.out.println("Terdapat pada index ke-"+i);
            angka = 1;
        }else{
        }
        }
            if (angka==1){
            }else{
                System.out.println("Data tidak ditemukan");
            }
        }
        }
        
    
    

