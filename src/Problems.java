import java.util.*;
import java.lang.*;
import java.io.*;

public class Problems {
    public static int[] Problem1(int[] nums, int target){
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]==target){
                int[] answer= {i};
                return answer;
            }
            for(int j=0; j< nums.length-1; j++){
                if(i!=j && nums[i]+nums[j]==target){
                    int[] answer= {i, j};
                    return answer;
                }
            }
        }
        return null;
    }

    public static boolean Problem2(int x){
         String xTranslated= Integer.toString(x);
         StringBuilder p = new StringBuilder();
         p.append(xTranslated);
         String reversed = String.valueOf(p.reverse());
         if(xTranslated.equals(reversed)){
             return true;
         }
        return false;
    }

    public String Problem3(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static int Problem4(String s) {
        System.out.println(s);
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value;
            if (ch == 'I') {
                value = 1;
            } else if (ch == 'V') {
                value = 5;
            } else if (ch == 'X') {
                value = 10;
            } else if (ch == 'L') {
                value = 50;
            } else if (ch == 'C') {
                value = 100;
            } else if (ch == 'D') {
                value = 500;
            } else if (ch == 'M') {
                value = 1000;
            } else {
                value = 0;
            }
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        System.out.println(result);
        return result;
    }

    public static boolean Problem5(String s) {
        int length;
        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while (s.length() != length);

        return s.isEmpty();
    }

    public static int[] Problem6(int[] l1, int[] l2) {
        int[] mergedL = new int[l1.length + l2.length];
        int i = 0, j = 0, k = 0;

        while (i < l1.length && j < l2.length) {
            if (l1[i] < l2[j]) {
                mergedL[k++] = l1[i++];
            } else {
                mergedL[k++] = l2[j++];
            }
        }
        while (i < l1.length) {
            mergedL[k++] = l1[i++];
        }
        while (j < l2.length) {
            mergedL[k++] = l2[j++];
        }
        return mergedL;
    }

    public static int[] Problem7(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNum = new int[n + 1];
        newNum[0] = 1;
        return newNum;
    }
    public static void main(){}
}