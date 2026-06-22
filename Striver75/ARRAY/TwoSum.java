//day 1: TWO SUM
import java.util.HashMap;

public class TwoSum {
    boolean twoSum(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                return true;
            }

            map.put(arr[i], i);
        }

        return false;
    }
}
/*Two Sum (Hashing Approach) ke liye ye 5 points notes mein likh lo:

HashMap mein (number, index) store karte hain.

HashMap<Integer, Integer> map = new HashMap<>();

Har element ke liye complement nikalte hain.

complement = target - nums[i];

Agar complement map mein mil jaye, to answer mil gaya.

if(map.containsKey(complement))

Agar complement nahi mile, to current element aur uska index map mein store kar do.

map.put(nums[i], i);
Time Complexity: O(n) aur Space Complexity: O(n)
Ek hi loop chal raha hai → O(n)
HashMap extra space le raha hai → O(n)

Shortcut mein yaad rakhne ke liye:

"Check complement first → If found return indices → Else store current element in HashMap." */
