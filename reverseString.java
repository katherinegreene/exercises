/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class reverseString{
    public static void reverseString(){
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        int left = 0;
        int right = s.length - 1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
            
        }
        System.out.println(s);
    }
    public static void main(String[]args){
        reverseString();
    }

}










 //java doesn't use pointers,it uses references*
 /*How references work
int[] a = {1, 2, 3};
int[] b = a;


a and b reference the same array

Modifying through one reference affects the same object

b[0] = 99;
System.out.println(a[0]); // 99


This behavior is central to Java and frequently tested.

Key idea:
A Java reference is a safe abstraction over a pointer */
/*Why Java uses references instead of pointers???

Java deliberately removed pointers to:

Prevent memory corruption

Eliminate dangling pointers

Avoid buffer overflows

Simplify memory management

Improve runtime security

This design choice is often explicitly discussed in interviews. */