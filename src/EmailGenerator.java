public class EmailGenerator {
    public static void main(String[] args) {
        var name = "Renzo Manuel Gomez Cesare";
        var business = "Globant";
        var domain = "com";

        var result = name.toLowerCase().replace(" ", ".") + "@" + business.toLowerCase() + "." + domain;
        System.out.println("Generated Email :"+result);
    }
}
