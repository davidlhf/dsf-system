package com.dsfsys.pub.utils;

public class Sort {

    private Sort(){

    }

    public static void quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int i,j,temp,change;
        i=low;
        j=high;
        temp = arr[low];
        while (i<j){
            while(arr[j]>=temp&&i<j){
                j--;
            }
            while(arr[i]<=temp&&i<j){
                i++;
            }
            if(i<j){
                change = arr[i];
                arr[i] = arr[j];
                arr[j] = change;
            }
        }
        if(temp < arr[low]){
            i--;
            arr[low] = arr[i];
            arr[i] = temp;
        }else{
            arr[low] = arr[i];
            arr[i] = temp;
        }
        quickSort(arr,low,i-1);//l
        quickSort(arr,i+1,high);//r
    }

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[temp]>arr[j]){
                    temp = j;
                }
            }
            if(temp!=i){
                int t = arr[temp];
                arr[temp] =  arr[i];
                arr[i] = t;
            }
        }
    }

    public static void bobbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
       /* int[] arr = {1,6,7,3,2,1,657,657,657,68,7,98,98,9,345,2,543,543,5};
        quickSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+",");*/

       String a = "abc";
       String b = "a";
       String c = "bc";
       String d = b+"bc";
        System.out.println(a==d);
        System.out.println(a==(b+c));
    }

}
