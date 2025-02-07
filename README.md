# Heap Sort 
***
Heap sort (ou "ordenamento por heap") é um algoritmo de ordenação eficiente
que utiliza uma estrutura de dados chamada heap para organizar os elementos deum array.
Ele é classificadocomo um algoritmo de ordenação porcomparação etem uma complexidade detempo de 
O(nlog⁡n)O(nlogn),o que o torna adequado para ordenar grandes volumes de dados.
***
Um heap é uma estrutura de dados baseada em uma árvore binária completa (todos os níveis estão preenchidos, 
exceto possivelmente o último, que é preenchido da esquerda para a direita). Existem dois tipos de heap:
***

## Exemplo

     Array inicial: [12, 11, 13, 5, 6, 7]

    Construir o Max Heap:

   Após a construção, o array se torna: [13, 11, 12, 5, 6, 7].

    Extrair e Ordenar:

     Troque o primeiro elemento (13) com o último (7) e ajuste o heap: [12, 11, 7, 5, 6, 13].

   Repita o processo até que o array esteja ordenado.

    Resultado Final:
     Array ordenado: [5, 6, 7, 11, 12, 13].

Complexidade do Tempo

    Construir o heap: O(n)O(n)

    Extrair elementos e ajustar o heap: O(nlog⁡n)O(nlogn)

    Total: O(nlog⁡n)O(nlogn)

Vantagens

    Eficiente para grandes conjuntos de dados.

    Complexidade de tempo garantida de O(nlog⁡n)O(nlogn).

    Ordenação in-place (não requer memória adicional).

Desvantagens

    Não é estável (a ordem relativa de elementos iguais pode não ser preservada).

    Na prática, pode ser mais lento que outros algoritmos como quicksort ou mergesort para conjuntos de dados pequenos.
