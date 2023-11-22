public class _02_find_distinct_element {
    public static void main(String[] args) {
        // https://practice.geeksforgeeks.org/problems/element-appearing-once2552/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

        int[] arr = {1,2,1,5,5};
        // to cancel duplicates we can use XOR operation on the array
        int ans = 0;
        for(int i : arr){
            ans ^= i;
        }

        System.out.println(ans);
    }
}
