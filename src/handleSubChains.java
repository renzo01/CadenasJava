public class handleSubChains {
    public static void main(String[] args) {
        var chain1 = "Hello World";

        //subcadena
        var subChain = chain1.substring(0, 5);
        System.out.println("Subcadena :"+subChain);

        var subChain2 = chain1.substring(6);
        System.out.println("Subcadena :"+subChain2);
    }
}
