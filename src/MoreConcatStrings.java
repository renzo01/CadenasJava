public class MoreConcatStrings {
    public static void main(String[] args) {
        var chain1 = "Hello";
        var chain2 = "World";
        var chain3 = chain1 + " " + chain2;
        System.out.println("Concatenated Chain :"+chain3);

        chain3 = chain1.concat(" ").concat(chain2);
        System.out.println("Concatenated Chain using concat() :"+chain3);

        //String Builder
        var builderMethod = new StringBuilder();
        builderMethod.append(chain1);
        builderMethod.append(" ");
        builderMethod.append(chain2);
        System.out.println("Concatenated Chain using StringBuilder :"+builderMethod.toString());

        //String Buffer
        var bufferMethod = new StringBuffer();
        bufferMethod.append(chain1);
        bufferMethod.append(" ");
        bufferMethod.append(chain2);
        System.out.println("Concatenated Chain using StringBuffer :"+bufferMethod.toString());

        //String Join
        var joinMethod = String.join(" ", chain1, chain2);
        System.out.println("Concatenated Chain using String.join() :"+joinMethod);
    }
}
