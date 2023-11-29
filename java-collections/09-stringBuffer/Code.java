import java.util.Random;

public class Code {
    public static void main(String[] args) {
        // https://www.javatpoint.com/StringBuffer-class
        // Java StringBuffer class is used to create mutable (modifiable) String
        // objects. The StringBuffer class in Java is the same as String class except it
        // is mutable i.e. it can be changed.

        StringBuffer buffer = new StringBuffer();

        // The append() method concatenates the given argument with this String.
        buffer.append("aryan");
        System.out.println(buffer);

        // The insert() method inserts the given String with this string at the given
        // position.
        buffer.insert(0, "hello ");
        System.out.println(buffer);

        // The replace() method replaces the given String from the specified beginIndex
        // and endIndex.
        buffer.replace(6, 12, "Java");
        System.out.println(buffer);

        // The delete() method of the StringBuffer class deletes the String from the
        // specified beginIndex to endIndex.
        buffer.delete(0, 5);
        System.out.println(buffer);

        // The reverse() method of the StringBuilder class reverses the current String.
        buffer.reverse();
        System.out.println(buffer);

        // more methods visit javatpoint website
        String hash = randomString(5);
        System.out.println(hash);

        String sentence = "shi  asdsaf fnf f ja fasf ffd fd";
        removeSpace(sentence);
    }

    public static String randomString(int size){

        StringBuffer sb = new StringBuffer(size);
        
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            // characters ascii start from 97
            char randomCh = (char)(97 + (int)(random.nextFloat()*26));
            sb.append(randomCh);
        }

        return sb.toString();
    }

    static void removeSpace(String sentence){
        // \\s is for selecting spaces its regEX
        System.out.println(sentence.replaceAll("\\s", ""));
    
    }
}
