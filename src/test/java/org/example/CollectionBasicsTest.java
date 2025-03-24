package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionBasicsTest {

    @Test
    @DisplayName("╯°□°）╯")
    public void testIterator() {
        List<Integer> list = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toList());
        ListIterator<Integer> it = list.listIterator(list.size());
        List<Integer> result = new ArrayList<>(list.size());
        while (it.hasPrevious()) {
            result.add(it.previous());
        }
        Collections.reverse(list);

        assertEquals(result, list);
    }

}
