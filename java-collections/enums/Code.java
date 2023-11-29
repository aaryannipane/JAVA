public class Code{

    // https://www.w3schools.com/java/java_enums.asp

    /* An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters: */
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {

        // PRINT VALUE FROM ENUM
        System.out.println(Level.HIGH);

        // LOOP ENUMS
        // The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }
    }
}