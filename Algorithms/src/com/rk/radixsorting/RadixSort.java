package com.rk.radixsorting;

import java.util.Arrays;

public class RadixSort {
	
    public int getMax(int arr[])
    {
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    public void countSort(int arr[], int exp)
    {
        int output[] = new int[arr.length];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        for (i = 0; i < arr.length; i++)
            count[(arr[i] / exp) % 10]++;
 
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        for (i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        for (i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }
 
    public void radixsort(int arr[])
    {
        int m = getMax(arr);
 
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, exp);
    }
 
    public void display(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
}