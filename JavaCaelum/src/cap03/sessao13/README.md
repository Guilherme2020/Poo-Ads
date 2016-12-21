
5. valores como 20,30,40
 porque mudar a variavel fatorial de int para long?
Pelo fato do calculo de fatorial ser trabalhoso por crescer muito  tipos primitivos do tipo int so armazenam de -2.147.483.648 até o máximo 2.147.483.647

entao quando fatorial passa n > 12 o Java imprime errado pois passa do maximo que o tipo int pode suportar. 

Já o tipo long suporta ate 20! == 2.432.902.008.176.640.000
