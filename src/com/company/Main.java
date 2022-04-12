package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n, i, j, a[], ptr, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("how many element do u want to enter :");
        n = sc.nextInt();
        a = new int[n];
        System.out.print("enter the element:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 1; i <= n - 1; i++) {
            temp = a[i];
            j = i - 1;
            while (temp < a[j] && j >=0)
        {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
        for (i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}

