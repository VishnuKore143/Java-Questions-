package SCA;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr;
        int n;
        System.out.println("Enter value ");
        n= sc.nextInt();
        arr = new int[n];
        for (int i =0; i<n; i++){
            System.out.println("Enter the number ");
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];

        }
        System.out.println("sum is :"+sum);
        System.out.println("Avg is :"+ (float)sum/n);

    }
}
