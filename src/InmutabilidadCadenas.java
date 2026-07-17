public class InmutabilidadCadenas {
    public static void main(String[] args) {
        var chain1 = "Hola";
        System.out.println("Cadena 1 :"+chain1);
        var chain2 = chain1;
        chain1 = "Adios";
        
        System.out.println("Cadena 1 modificada :"+chain1);
        System.out.println("Cadena 2 :"+chain2);
    }
}
