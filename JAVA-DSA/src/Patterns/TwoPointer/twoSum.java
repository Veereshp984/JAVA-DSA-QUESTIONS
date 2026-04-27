package Patterns.TwoPointer;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 22;
int result[] = twoSum(arr,target);
        System.out.println(result[0] + "," + result[1]);

    }
    public static int[] twoSum(int arr[] , int target){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{arr[i] , arr[j]};
            } else if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }
        }
        return new int[]{-1,-1};
    }
    }

