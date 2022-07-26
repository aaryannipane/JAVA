

public class Q1_ceiling_of_number {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        int ans = ceilingNumber(arr, target);
        System.out.println(arr[ans]);

    }

    //https://youtu.be/W9QJ8HaRvJQ?t=625
//    cieling of number means lowest number that is >= target number
//    ex target is 15 so we will get 16 as ans
    static int ceilingNumber(int[] arr, int target){


//        when target is greater than last element we can't return lowest number that is >= target number
        if(target > arr[arr.length - 1])
            return -1;

        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return start;

    }

}
