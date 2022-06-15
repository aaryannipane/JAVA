package code;


//linear search of character in a string
public class _2_linear_search_string {
    public static void main(String[] args) {
        String name = "Aryan";
        System.out.println(search(name, 'n'));
    }

    static boolean search(String str, char target){

        if(str.length() == 0){
            return false;
        }

//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == target){
//                return true;
//            }
//        }

//        foreach loop on string
        for(char ch : str.toCharArray()){
            if(ch == target)
                return true;
        }

        return false;

    }
}
