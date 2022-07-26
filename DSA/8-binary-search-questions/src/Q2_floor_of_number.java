

public class Q2_floor_of_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floorNumber(arr, target);
        System.out.println(arr[ans]);
    }

    // https://youtu.be/W9QJ8HaRvJQ?t=625
//    floor means greatest number that is <= target number
    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }

        return end;
    }
}
