package leet.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
//        ArrayList ar = new ArrayList();
//        ar.add(3);
//        ar.add(2);
//        ar.add(7);
//        ar.add(10);
//        ar.add(11);
//        ar.add(15);
        int ar[] ={1,21,3,4,5,6,7};
//        System.out.println("Enter the target value: ");
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
        int target = 25;
        System.out.println(sum(ar, target));
    }

    private static int[] sum(int[] ar, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;  i<ar.length;i++){
            if(hm.containsKey(target- ar[i])){
                result[1]=ar[i];
                result[0]= (target-ar[i]);
                System.out.println(result[0]);
                System.out.println(result[1]);
                System.out.println(Arrays.toString(result));
                return result;
            }
            hm.put(ar[i],i);
        }
        return result;
    }
}
