//finding duplicates in an array,false if every element is distinct
//Hashsets is a good approach to use for these kind of problems(if we are asked to find distinct )

import java.util.HashSet;

class containsDuplicate {
    public boolean ContainsDuplicate(int[] num){
        HashSet<Integer> numbers = new HashSet<>();
        for(int i =0;i<num.length;i++){
            if(numbers.contains(num[i])){
                return true;}else{
                numbers.add(num[i]);//if the element is not seen before, add to set
            
        }
    }
    return false;//if it doesnt have duplicates
    
}
}

// uses a HashSet to check for duplicates in an array. 
// A HashSet only stores unique elements and allows fast lookups. 
// As we iterate through the array, we check if the current number is already in the set using contains(). 
// If it is, that means a duplicate exists, so we return true. 
// If it is not in the set, we add it using add() and continue. 
// If we finish iterating without finding duplicates, we return false. 
// Using a HashSet makes this approach efficient with O(n) time complexity instead of O(n^2) with nested loops.
