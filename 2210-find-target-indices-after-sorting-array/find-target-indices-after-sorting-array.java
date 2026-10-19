import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // 1. Binary Search requires a sorted array
        Arrays.sort(nums);
        
        List<Integer> result = new ArrayList<>();
        
        // 2. Find upper and lower bounds using binary search
        int firstIndex = findFirst(nums, target);
        
        // If target doesn't exist, return empty list
        if (firstIndex == -1) {
            return result;
        }
        
        int lastIndex = findLast(nums, target);
        
        // Add all indices from first to last
        for (int i = firstIndex; i <= lastIndex; i++) {
            result.add(i);
        }
        
        return result;
    }

    // Binary search for the FIRST occurrence of target
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                first = mid;      // Record possible first index
                right = mid - 1;  // Keep looking to the left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    // Binary search for the LAST occurrence of target
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int last = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                last = mid;      // Record possible last index
                left = mid + 1;  // Keep looking to the right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
}