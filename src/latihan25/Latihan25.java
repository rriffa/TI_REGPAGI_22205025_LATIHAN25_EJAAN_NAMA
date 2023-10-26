/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan25;
import java.util.Scanner;
/**import java.util.Scanner;
 *
 * @author Lenovo
 Nama :Ma'rifatu Khirzah
 NIM :22205025
 Prodi :Teknik Informatika
 Deskripsi :Membuat program Ejaan Nama yang inputannya berasal dari user.
 */
public class Latihan25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        while(ulangi){
            System.out.print("Masukkan nama depan anda untuk dieja : ");
            String nama = input.next();
            
            System.out.println("Ejaan untuk '"+nama+"' adalah ");
            
            int panjangNama = nama.length();
            for(int i = 0; i<panjangNama; i++){
                char huruf = nama.charAt(i);
                System.out.println("Huruf ke-"+(i+1)+" : "+huruf);
            }
            
            System.out.print("Ulangi Aktifitas? (ya/tidak)");
            String ulang = input.next();
            if(ulang == "ya"){
                System.out.println("Program akan diulangi");
            }else if(ulang == "tidak"){
                System.out.println("Program berhenti terimakasih");
                ulangi = false; 
            }
        }
    }
    
}
