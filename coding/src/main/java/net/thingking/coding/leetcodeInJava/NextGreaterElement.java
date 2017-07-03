package net.thingking.coding.leetcodeInJava;

import java.util.*;

/**
 * Created by darlynn on 4/16/17.
 *
 * No.556 from www.leetcode.com
 *
 * Description:
 * Given a positive 32-bit integer n, you need to find the smallest 32-bit integer
 * which has exactly the same digits existing in the integer n and is greater in value than n.
 * If no such positive 32-bit integer exists, you need to return -1.
 *
 * Example 1:
 *  Input: 12
 *  Output: 21
 *
 * Example 2:
 *  Input: 21
 *  Output: -1
 */
public class NextGreaterElement {
    public static int nextGreaterElement(int n) {
        if (n<10)
            return -1;
        int tmp = n;
        List bits = new ArrayList<Integer>();
        while (tmp>=10){
            bits.add(tmp%10);
            tmp = tmp/10;
        }
        bits.add(tmp);
        bits.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -1;
            }
        });
        Iterator it = bits.iterator();
        int result = 0;
        while(it.hasNext()){
            result = result*10+(Integer)it.next();
        }
        if(result>n)
            return result;
        return -1;
    }


    /**
     * Solution:
     *
     * At first, lets look at the edge cases -
     *
     * If all digits sorted in descending order, then output is always “Not Possible”. For example, 4321.
     * If all digits are sorted in ascending order, then we need to swap last two digits. For example, 1234.
     * For other cases, we need to process the number from rightmost side (why? because we need to find the smallest of all greater numbers)
     * Now the main algorithm works in following steps -
     *
     * I) Traverse the given number from rightmost digit, keep traversing till you find a digit which is smaller than the previously traversed digit. For example, if the input number is “534976”, we stop at 4 because 4 is smaller than next digit 9. If we do not find such a digit, then output is “Not Possible”.
     *
     * II) Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. For “534976″, the right side of 4 contains “976”. The smallest digit greater than 4 is 6.
     *
     * III) Swap the above found two digits, we get 536974 in above example.
     *
     * IV) Now sort all digits from position next to ‘d’ to the end of number. The number that we get after sorting is the output. For above example, we sort digits in bold 536974. We get “536479” which is the next greater number for input 534976.
     * */
    public static int solution2(int n) {
        char[] number = (n+"").toCharArray();
        int i,j;

        //find the descending from the rightmost at the first time
        for(i=number.length-1; i>0; i--) {
            if(number[i-1]<number[i])
                break;
        }

        //if no such digit is found , its the edge case1;
        if (i==0)
            return -1;

        // II) Find the smallest digit on right side of (i-1)'th
        // digit that is greater than number[i-1]
        char x = number[i-1];
        int smallest = i;
        for(j=i+1; j<number.length; j++) {
            if(number[j]>x && number[j]<number[smallest]) {
                smallest = j;
            }
        }

        //swap the above found smallest digit with number[i-1]
        char tmp = number[i-1];
        number[i-1] = number[smallest];
        number[smallest] = tmp;

        // sort the digit after the i-1 in ascending order
        Arrays.sort(number, i, number.length);

        long var = Long.parseLong(new String(number));
        return (var<=Integer.MAX_VALUE)? (int)var:-1;
    }
}
