# Introdução
Programa que recebe como entrada um texto e identifica o primeiro caractere que não se repete.

Alguns exemplos:
* Entrada: AAbCC, Saída: b
* Entrada: AAAccD, Saída: D 

# Como executar a aplicação
```sh
mvn exec:java -Dexec.args="AAAbCCC"
```
O argumento é obrigatório, substitua o valor pelo texto que preferir.
