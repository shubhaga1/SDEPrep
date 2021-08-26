package aakuTeaching;

import java.util.Scanner;

public class LinearSort {
    public static void main(String[] args) {
        int ar[] ={6,4,7,8,2,3};
        ar= linearSort(ar);
        for(int i :ar){
            System.out.println(i);
        }
    }

    public static int[] linearSort(int[] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i]<ar[j]){
                    int tem=ar[i];
                    ar[i]=ar[j];
                    ar[j]=tem;
                }
            }
        }
        return ar;
    }
}
