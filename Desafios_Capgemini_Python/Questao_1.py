"""
    # Questão 01
    Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
    A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
"""


#Definição de variáveis
niveis    = 10
repetidor = 1

#Laço de repetição para construção da escada com asteristos (*)
while niveis > 0:

    print(" " * (niveis-1), "*" * repetidor)
    niveis    -= 1
    repetidor += 1




