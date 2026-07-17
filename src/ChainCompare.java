public class ChainCompare {
    public static void main(String[] args) {
        //Comparacion de cadenas (Pool)
        var chain1 = "Java";
        var chain2 = "Java";
        var chain3 = new String("Java");
        //Compare chains (==) compare memory reference
        System.out.print("chain1 is equals to chain2 in reference :");
        System.out.println(chain1 == chain2);
        System.out.print("Chain 1 is equals to chain 3 :");
        System.out.println(chain1 == chain3);

        //to compare content, use equals method

        System.out.println("Chain1 has same content of Chain3 :" + chain1.equals(chain3));
    }
}
