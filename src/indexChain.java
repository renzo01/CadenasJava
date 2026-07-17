public class indexChain {
    public static void main(String[] args) {
        //handle index on a chain
        var chain1 = "Hello World";

        //get first element
        var firstLetter = chain1.charAt(0);
        System.out.println(firstLetter);

        var lastLetter = chain1.charAt(chain1.length()-1);
        System.out.println(lastLetter);
    }
}
