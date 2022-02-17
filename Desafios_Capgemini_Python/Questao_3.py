"""
# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. 
Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
"""

#Mensagem informativa
print("\n=====================================================")
print("  Deixar o campo em branco para encerrar o processo. ")
print("=====================================================\n")


#Entrada de daados
palavra = input("Entre com a palavra: ")

#Testa variavel vazia para encerramento da aplicação
if (palavra ==""): 
    print("\n<<<<  PROCESSO ENCERRADO  >>>>\n")
    quit
else:
    palavra2 = palavra
    tam_palavra = len(palavra)
    array = []
    posi_orig = 0
    posi_correlata = 0

    while (posi_orig + 1) <= tam_palavra:
            
        #Teste se estamos nos referenciando a mesma posição entre as duas variaveis
        if posi_orig == posi_correlata:
            posi_correlata += 1
        
        #Testa se completou todas as posicoes da palavra correlata
        if posi_correlata == tam_palavra: 
            posi_orig += 1
            posi_correlata = 0
        else:
            nova_palavra = palavra[posi_orig] + palavra2[posi_correlata]           
            ja_existe = False
            
            #Testa se a nova palavra já existe no array
            for i in array:
                if i == nova_palavra:
                    ja_existe = True

            if ja_existe == False:
                array.append(nova_palavra)
                posi_correlata += 1
            else:
                posi_correlata += 1    

    #Saída de impressao em tela
    print(" Palavras possívels: ", len(array), " pares: ", sorted(array), "\n")


