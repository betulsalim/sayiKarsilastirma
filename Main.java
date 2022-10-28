import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int say1,say2,say3;

        Scanner input = new Scanner(System.in);
        System.out.println("Karşılaştırmak için 3 sayı giriniz:");
        say1 = input.nextInt();
        say2 = input.nextInt();
        say3 = input.nextInt();

        if(say2<say1 && say2<say3 && say1<say3){
            System.out.print("küçükten büyüğe: "+say2);
            System.out.print("\t "+say1);
            System.out.println("\t "+say3);
        }
        else if(say2<say1 && say2<say3 && say3<say1){
            System.out.print("küçükten büyüğe: "+say2);
            System.out.print("\t "+say3);
            System.out.println("\t "+say1);
        }
        else if (say1<say2 && say1<say3 && say2<say3) {
            System.out.print("küçükten büyüğe: "+say1);
            System.out.print("\t "+say2);
            System.out.println("\t "+say3);
        }
        else if (say1<say2 && say1<say3 && say3<say2) {
            System.out.print("küçükten büyüğe: "+say1);
            System.out.print("\t "+say3);
            System.out.println("\t "+say2);
        }
        else if(say3<say1 && say3<say2 && say1<say2){
            System.out.print("küçükten büyüğe: "+say3);
            System.out.print("\t "+say1);
            System.out.println("\t "+say2);
        }
        else if(say3<say1 && say3<say2 && say2<say1){
            System.out.print("küçükten büyüğe: "+say3);
            System.out.print("\t "+say2);
            System.out.println("\t "+say1);
        }
        else{
            System.out.println("Sayılar eşittir sıralama yapılamaz");
        }
    }
}
