package br.com.gusto.fatec.heapsort;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.util.Arrays;

import static br.com.gusto.fatec.heapsort.HeapSort.heapSort;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HeapSortTest {
    public static void heapSortTest() {
        var vetor = new int[]{1, 60, 10, 2, 7, 90, 0, 100, 35, 96};
        log.info("Desordenado");
        for (int valor : vetor) log.info(valor + " ");
        log.info(Arrays.toString(heapSort(vetor)));
        log.info("\n\nOrdenado:");
        for (int valor : vetor) log.info(valor + " ");
    }
}
