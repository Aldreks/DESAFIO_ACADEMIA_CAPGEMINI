"""
Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres. Ok
Contém no mínimo 1 digito. Ok
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

"""

import getpass

print("\n*** Deixar o campo SENHA em branco para encerrar o processo. ***\n")

nome  = input("Nome do usuário: ")
senha = getpass.getpass(prompt="          Senha: ", stream=None)

tam = len(senha)

if senha == "":
    print("\n====== PROCESSO ENCERRADO =====\n")


    #Testa a qtde mínima de caracteres para a senha
    if  tam < 6:
        print(f"ATENÇÃO: Sua senha precisa ter mais {6-tam} caracteres, totalizando o mínimo de 6 caracteres.")


    #Testa se tem ao menos um dígito
    digito_num = False
    for i in range(tam):
        if senha[i] in "0123456789":
            digito_num = True
    if digito_num == False:
        print("ATENÇÃO: Sua senha precisa ter no mínimo 1 dígito.")


    #Testa se tem ao menos uma letra minúscula
    letra_minuscula = False
    for i in range(tam):
        if senha[i].islower() :
            letra_minuscula = True
    if letra_minuscula == False:
        print("ATENÇÃO: Sua senha precisa ter no mínimo 1 caracter minúsculo.")


    #Testa se tem ao menos uma letra maiúscula
    letra_minuscula = False
    for i in range(tam):
        if senha[i].isupper() :
            letra_minuscula = True
    if letra_minuscula == False:
        print("ATENÇÃO: Sua senha precisa ter no mínimo 1 caracter maiúsculo.")


    #Testa se tem ao menos um caracter especial
    caract_especial = False
    for i in range(tam):
        if senha[i] in "!@#$%^&*()-+":
            caract_especial = True
    if caract_especial == False:
        print("ATENÇÃO: Sua senha precisa ter no mínimo 1 caracter especial.")

print("\n")