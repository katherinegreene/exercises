//write a func to find the longest common prefix string amongst an array of strings
//if there is no common prefix return empty string ""

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return ""; // Step 1: check if array is empty

        for (int i = 0; i < strs[0].length(); i++) { // Step 2: loop over letters of first word
            char ch = strs[0].charAt(i); // Step 3: get the i-th letter of the first word

            for (int j = 1; j < strs.length; j++) { // Step 4: loop over the rest of the words
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    // Step 5: if we reach end of a word OR letters don't match
                    return strs[0].substring(0, i); // Step 6: return prefix up to this point
                }
            }
        }

        return strs[0]; // Step 7: if all letters of first word matched, return whole first word
    }

    // Optional: main method to test
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strs)); // Output: "fl"
    }
}


/*Take the first string as the base.
Example: "flower".

Loop through each character in the first string. Let’s call the index i.

For each character at position i in the first string, check all other strings:

If any string is shorter than i (doesn’t have that character) OR

The character at i in that string is not equal to the character in the first string
Stop there, and return the prefix up to i.

If you go through all characters of the first string without stopping, the whole first string is the prefix. */
/*Step 1: Handle empty input
if (strs.length == 0) return "";


If the array has no words, there’s nothing to compare → return empty string.

Step 2: Loop over letters of first word
for (int i = 0; i < strs[0].length(); i++)


i is the position of the letter in the first word.

Example: "flower" → i = 0 → 'f', i = 1 → 'l', etc.

Step 3: Get the letter at position i
char ch = strs[0].charAt(i);


ch = current letter we are checking from the first word.

Example: i = 0 → ch = 'f'

Step 4: Loop over the rest of the words
for (int j = 1; j < strs.length; j++)


j points to each other word in the array, starting from the second word.

We compare the letter at position i in every other word with ch.

Step 5: Check mismatch
if (i >= strs[j].length() || strs[j].charAt(i) != ch)


Two ways to stop:

i >= strs[j].length() → we reached the end of a word (so prefix can’t be longer than this word)

strs[j].charAt(i) != ch → the letters don’t match

Step 6: Return the prefix so far
return strs[0].substring(0, i);


substring(0, i) → take letters from start of first word up to but not including index i.

Example: i = 2 → "fl"

Step 7: All letters matched
return strs[0];


If you loop through all letters of the first word and there was never a mismatch, the whole first word is the prefix.

Example Walkthrough
String[] strs = {"flower", "flow", "flight"};


First word = "flower"

i = 0 → ch = 'f'

Compare with "flow"[0] = 'f', "flight"[0] = 'f' → match

i = 1 → ch = 'l'

Compare with "flow"[1] = 'l', "flight"[1] = 'l' → match

i = 2 → ch = 'o'

Compare with "flow"[2] = 'o' → match

Compare with "flight"[2] = 'i' → mismatch

Return "flower".substring(0, 2) → "fl" */