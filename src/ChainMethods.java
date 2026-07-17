public class ChainMethods {
    public static void main(String[] args) {
        var chain1 = "Hello World";
        //get length of chain
        var length = chain1.length();
        //replace value from chain
        var newChain = chain1.replace("o", "a");
        System.out.println(newChain);
        //to UpperCase
        var upperCase = chain1.toUpperCase();
        System.out.println("Chain in uppercase :"+upperCase);
        //to lowercase
        var lowercase = chain1.toLowerCase();
        System.out.println("Chain in lowercase :"+lowercase);
    }
}
