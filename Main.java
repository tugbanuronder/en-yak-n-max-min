import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr= {15, 12 ,788 ,1 , -1 , -778, 2, 0};

        Scanner input= new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int value=input.nextInt();

        int min = arr[0];
        int max = arr[0];

        Arrays.sort(arr);

        for(int i:arr){

            if(i < value){

                min=i;
            }
            if(i > value){

                max=i;
                break;
            }
        }

        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Girilen Sayı : " + value);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);


    }
}