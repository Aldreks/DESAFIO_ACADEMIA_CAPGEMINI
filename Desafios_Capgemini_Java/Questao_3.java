/*
    # Questão 03
    Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Questao_3
{   
    public static void main( String[] args ) 
    {   
        //Estética de apresentação, seprando o bloco dos demais textos do terminal
        System.out.println(" ");

        //Mensagem informativa
        System.out.println("\n=====================================================");
        System.out.println("  Deixar o campo em branco para encerrar o processo. ");
        System.out.println("=====================================================\n");

        //Entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a palavra: "); 
        String palavra = sc.nextLine(); 

        //Testa variavel vazia para encerramento da aplicação
        if (palavra.isEmpty()) {            
            System.out.println("\n<<<<  PROCESSO ENCERRADO  >>>>\n");
            return;
        }

        //Declaração de Variáveis
        String palavra2 = palavra;
        String nova_palavra = "";
        String conteudo;
        int tam_palavra = palavra.length();
        int tam;
        int posi_orig = 0;
        int posi_correlata = 0;        
        boolean primeira_vez = true;
        boolean ja_existe;
        boolean igual;
        ArrayList<String> array = new ArrayList();
           
        do {        

            //Testa se é a mesma posição entre as duas variaveis
            if (posi_orig == posi_correlata) {
                posi_correlata += 1;
            }      

            //Testa se já usou todas as letras/posicoes da palavra correlata
            if (posi_correlata + 1 > tam_palavra) { 
                posi_orig += 1;
                posi_correlata = 0;
            }         
                
            //forma a nova palavra encontrada              
            nova_palavra = palavra.substring(posi_orig, posi_orig + 1) + palavra2.substring(posi_correlata, posi_correlata + 1);
            
            //flag indica se a nova palavra já existe no array, evitando duplicidade
            ja_existe = false; 

            if (primeira_vez == false) {                

                //checa o novo tamanho do array
                tam = array.size();

                //Testa se a nova palavra já existe no array
                for (int i = 0; i < tam; i++) {
                    conteudo = array.get(i);
                    igual = conteudo.equals(nova_palavra);

                    if (igual == true) { 
                        ja_existe = true;
                    } 
                }
            }
                  
            //teste para inclusao de nova palavra
            if (ja_existe == false || primeira_vez == true) {
                array.add(nova_palavra); 
                primeira_vez = false; 
            }

            posi_correlata += 1; 
               
        } while ((posi_orig + 1) < tam_palavra);

        //Saída de impressao em tela
        System.out.println(" Palavras possíveis: " + array.size() + " pares: " +  array  + "\n"); 
    }
}

