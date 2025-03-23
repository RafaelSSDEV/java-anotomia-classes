public class ExemploMetodo {
    public static void main (String [] args){
        
        String primeiroNome = "Rafael";
        String segundoNome = "da Silva";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}
