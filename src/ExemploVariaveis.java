public class ExemploVariaveis {
    public static void main(String[] args) {
        /*
         * variaveis: Pode conter apenas os caracteres especiais _ $ 
         * Não pode começar com numero. 
         * Não pode ser uma palavra reservada e nem conter espaços 
         * Por padrão seguir o camelCase
         * Constantes por padrão são escritas em UPPERCASE e não devem ser alteradas 
         */

        final String BR = "Brasil"; // Constante (não pode ser alterada)
        int ano = 2021; // Variável (pode ser alterada)
        ano = 2025;

        System.out.print("País: " + BR + ", Ano: " + ano); 

    }
}