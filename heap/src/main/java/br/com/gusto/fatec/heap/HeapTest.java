package br.com.gusto.fatec.heap;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HeapTest {
    public static void heapTest() {
        Heap heap = new Heap(100);
        heap.insere(16);
        heap.insere(8);
        heap.insere(3);
        heap.insere(1);
        log.info(heap.printHeap(1));
        heap.insere(50);
        log.info(heap.printHeap(1));
        heap.remover();
        log.info(heap.printHeap(1));
    }
}
