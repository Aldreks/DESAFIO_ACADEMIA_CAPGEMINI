 /*
    # Questão 01
    Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
*/

public class Questao_1
{
    public static void main( String[] args )
    {       
        //Declarações de variáveis
        int niveis  = 10;
        int repetidor = 1;

        //Estética de apresentação, seprando o bloco dos demais textos do terminal
        System.out.println(" ");

        //Laço de repetição para construção da escada com asteristos (*)
        do {
		    System.out.println(" ".repeat(niveis) + "*".repeat(repetidor));
		    niveis--;
		    repetidor++;
		} while (repetidor <= 10);

        //Estética de apresentação, seprando o bloco dos demais textos do terminal
        System.out.println(" ");
    } 
}
