public class ReplaceInChain {
    public static void main(String[] args) {
        var chain1 = "Hello World";
        System.out.println("Original chain :"+chain1);

        //replace "world" with "everyone"
        var replacedChain = chain1.replace("World", "everyone");
        System.out.println("Replaced Chain :"+replacedChain);
    }
}
