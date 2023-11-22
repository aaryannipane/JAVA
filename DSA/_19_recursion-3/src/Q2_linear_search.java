import java.util.ArrayList;

public class Q2_linear_search {
    static boolean find(int[] arr, int target, int index){
        if(index > arr.length-1){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index > arr.length -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return findIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index > arr.length-1){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target, index+1, list);
    }

//    not optimal (important concept)
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index > arr.length-1){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5};
        System.out.println(find(arr, 3, 0));
        System.out.println(findIndex(arr, 3, 0));
        System.out.println(findAllIndex(arr, 3, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 3, 0));
    }
}
