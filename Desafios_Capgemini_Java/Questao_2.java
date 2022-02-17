 /*
    Questão 02
    Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
    Possui no mínimo 6 caracteres. Ok
    Contém no mínimo 1 digito. Ok
    Contém no mínimo 1 letra em minúsculo.
    Contém no mínimo 1 letra em maiúsculo.
    Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
*/

import java.util.Scanner;

public class Questao_2
{
    public static void main( String[] args )
    {
       
        //Mensagem informativa
        System.out.println("\n===========================================================");
        System.out.println("  Deixar o campo SENHA em branco para encerrar o processo. ");
        System.out.println("===========================================================\n");

        //Entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do usuário: "); 
        String nome = sc.nextLine(); 
        System.out.print("          Senha: "); 
        String senha = sc.nextLine(); 
        System.out.println(" ");
        int tam = senha.length();
        
        //Testa variavel senha vazia para encerramento da aplicação
        if (senha.isEmpty()) {
            System.out.println("\n <<<<  PROCESSO ENCERRADO  >>>>\n");

        } else {
        
            //Testa a qtde mínima de caracteres para a senha
            if  (tam < 6) {
                System.out.println("ATENÇÃO: Sua senha precisa ter mais " + (6 - tam) + " caracteres, totalizando o mínimo de 6 caracteres.");
            }

    
            //Testa se tem ao menos um dígito
            boolean digito_num = false;
            for (int i = 0; i <= tam-1; i++) {
                String numeros = "0123456789";
                if (numeros.contains(senha.substring(i, i+1) )) {
                    digito_num = true;
                }
            }
            if (digito_num == false) {
                System.out.println("ATENÇÃO: Sua senha precisa ter no mínimo 1 dígito.");
            }


            //Testa se tem ao menos uma letra minúscula
            boolean letra_minuscula = false;
            for (int i = 0; i <= tam-1; i++) {
                String caract = senha.substring(i, i+1);
                char c = caract.charAt(0);
                if (Character.isLowerCase(c))  { 
                    letra_minuscula = true;
                }
            }
            if (letra_minuscula == false) {
                System.out.println("ATENÇÃO: Sua senha precisa ter no mínimo 1 caracter minúsculo.");
            }

            
            //Testa se tem ao menos uma letra maiúscula
            boolean letra_maiuscula = false;
            for (int i = 0; i <= tam-1; i++) {
                String caract = senha.substring(i, i+1);
                char c = caract.charAt(0);
                if (Character.isUpperCase(c)) {
                    letra_maiuscula = true;
                }
            }
            if (letra_maiuscula == false) {
                System.out.println("ATENÇÃO: Sua senha precisa ter no mínimo 1 caracter maiúsculo.");
            }


            //Testa se tem ao menos um caracter especial
            boolean caract_especial = false;
            for (int i = 0; i <= tam-1; i++) {
                String especiais = "!@#$%^&*()-+";
                if (especiais.contains(senha.substring(i, i+1) )) {
                    caract_especial = true;
                }
            }
            if (caract_especial == false) {
                System.out.println("ATENÇÃO: Sua senha precisa ter no mínimo 1 caracter especial.");
            }
        }

        //Estética de apresentação, seprando o bloco dos demais textos do terminal
        System.out.println("\n");
    }    
}
