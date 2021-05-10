package br.com.gusto.fatec.lista.estatica;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class SequentialListTest {

    public static void sequentialListTest() {
        SequentialList lista = new SequentialList(10);
        log.info(String.valueOf(lista.insert(23)));
        log.info(String.valueOf(lista.insert(-3)));
        log.info(String.valueOf(lista.insert(1)));
        log.info(String.valueOf(lista.insert(50)));
        log.info(String.valueOf(lista.insert(5)));
        lista.print();
        lista.insert(4);
        log.info(String.valueOf(lista.insert(lista.get(3), 1)));
        log.info(String.valueOf(lista.getSize()));
        log.info(String.valueOf(lista.remove(9)));
    }
}
