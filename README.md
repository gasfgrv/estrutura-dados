# Estruturas de Dados

## Vetores (Arrays unidimensionais)

- São identificados por um único nome;
- São individualizados por índices;
- O conteúdo é homogêneo, ou seja, do mesmo tipo.

## Matrizes (Arrays bidimensionais)

- São identificados por um único nome;
- São individualizados por 2 índices (linhas e colunas);
- O conteúdo é homogêneo, ou seja, do mesmo tipo.

Lista linear

- Estrutura de dados na qual cada elemento é precedido por um
  elemento e sucedido por outro (exceto o primeiro que não tem
  predecessor e o último que não tem sucessor);
- Os elementos estão em uma dada ordem (por exemplo, a ordem
  de inclusão ou ordenados por uma chave);
- Uma lista linear pode ser sequencial (estática) ou encadeada
  /ligada (dinâmica).

## Lista linear encadeada/ligada

- Vimos que na lista linear sequencial as operações de inserção e
  remoção são consideradas custosas, pois potencialmente
  precisamos deslocar vários elementos;
- Para evitar o deslocamento de elementos durante a inserção e
  remoção utilizaremos uma lista encadeada/ligada;
- Assim como a lista sequencial a lista encadeada/ligada também
  é uma lista linear (cada elemento possui no máximo um
  predecessor e um sucessor).

## Pilha

- É uma lista linear em que todas as inserções, remoções e,
  geralmente, todos os acessos são feitos em apenas um extremo
  da lista, comumente chamado de topo;
- O último elemento inserido é o primeiro elemento que pode ser
  retirado da lista, por isso pilhas são chamadas de listas LIFO
  (“Last-In, First-Out”);
- É ideal para processamento de estruturas aninhadas de
  profundidade imprevisível;

# Pilha dinâmica

- Uma pilha dinâmica é uma lista linear que pode/deve ser
  implementada como uma lista encadeada/ligada.

## Recursividade

- A recursividade é uma estratégia que pode ser utilizada sempre
  que uma função f pode ser escrita em função dela própria.
- Muitas estruturas de dados como listas e árvores tem natureza
  recursiva, então é importante compreender a recursividade.
- Nenhum programa, nem função, pode ser exclusivamente
  definido por si própria, pois:
    - O programa seria um loop infinito
    - A função teria uma definição circular
- Condição de parada (também chamado de base da recursão)
    - Permite que o procedimento pare de se executar
    - Por exemplo, f(x) >0 com x decrescente

```java
public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println("Fatorial de " + 4 + " é " + fatorial(4));
    }

    public static long fatorial(long n) {
        if (n == 0) return 1; //condição de parada
        else return n * fatorial(n - 1);
    }

}
```

## Fila

- É uma lista linear em que as inserções ocorrem no final da lista e
as remoções no início, é a mesma lógica de uma fila de pessoas,
por exemplo;
- O primeiro elemento inserido é o primeiro elemento que pode
ser retirado da lista, por isso filas são chamadas de listas FIFO
(“First-In, First-Out”);
- É importante para situações em que devem ser determinadas a
ordem de atendimento;

## Fila dinâmica

- Uma fila dinâmica é uma lista linear que pode/deve ser
implementada como uma lista encadeada/ligada.

## Árvores

- Árvores são estruturas de dados que caracterizam uma relação
hierárquica (não linear) entre seus elementos, chamados nós.
- Essa hierarquia é tal que se um nó x é imediatamente superior a
um nó y, então dizemos que x é pai de y e y é filho de x.
- O único nó que não tem pai é chamado de raiz da árvore, e todo
nó que não tem filho é chamado de folha.
- A altura de uma árvore é o número de nós do maior caminho (da
raiz até a folha).
- Uma árvore é binária se cada um de seus nós tem no máximo 2
filhos.
- Os filhos de um nó em uma árvore são chamados de filho
esquerdo e filho direito.

## Fila de prioridade

- Fila de prioridade é uma estrutura de dados que mantém uma
coleção de elementos, cada um com uma prioridade.
- Temos que as operações básicas sobre uma fila de prioridade são:
  - Inserir um novo elemento na fila de prioridade;
  - Remover o elemento com maior prioridade da fila de
  prioridade.

## Heap

- Heap é uma estrutura de árvore binária em que cada nó não
folha tem prioridade maior ou igual à prioridade de seus nós
filhos.
- O heap é uma árvore quase completa, ou seja, no último nível
pode não conter os nós mais a direita.