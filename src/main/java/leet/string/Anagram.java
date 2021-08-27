package leet.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "abacbc~!@#";
        String b = "abacbc~!@*";

//        Anagram(a, b);
//        Anagram2(a, b);
       Anagram3(a, b);
    }


    //n
    private static void Anagram3(String a, String b) {
        System.out.println("test");
        int temArr[] = new int[256];
        boolean isAnagram;
        if (a.length() == b.length()) {
            isAnagram = true;
            for (int i = 0; i < a.length(); i++) {
                int n = (int) a.charAt(i);
                temArr[n] +=1;
            }
            for (int j = 0; j < b.length(); j++) {
                int n = (int) b.charAt(j);
                temArr[n] -=1;
            }

            for (int k = 0; k < 256; k++) {
                if (temArr[k] > 0) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram)
                System.out.println(a + " is an anagram");
            else
                System.out.println(a + " is  not an anagram");

        } else
            System.out.println(a + " is not an anagram");
    }

    // nlogn
    private static void Anagram2(String a, String b) {
        char temArr[] = a.toCharArray();
        Arrays.sort(temArr);
        char temArr1[] = b.toCharArray();
        Arrays.sort(temArr1);
        boolean isAnagram;
        if (temArr.length == temArr1.length) {
            isAnagram = false;
            for (int i = 0; i < temArr.length; i++) {
                if (temArr[i] == temArr1[i]) {
                    isAnagram = true;
                } else {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram)
                System.out.println(a + " is an an anagram");
            else
                System.out.println(a + " is  not an anagram");

        } else
            System.out.println(a + " is not an anagram");
    }

    // O(n2)
    private static void Anagram(String a, String b) {
        boolean isAnagram = false;
        boolean[] isVisited = new boolean[b.length()];
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c && !isVisited[j]) {
                        isVisited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    System.out.println("String " + a + " is not an anagram");
                    break;
                }
            }
            if (isAnagram)
                System.out.println("String " + a + " is anagram");
        } else
            System.out.println("String " + a + " is not an anagram");
    }
}
