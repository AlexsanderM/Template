package com.malov.template.stream;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

@Service
public class StreamTemplate {

    //flat map return only stream
    public void flatMapStream() {
        List<Integer> together = Stream.of(asList(1,2), asList(3,4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());

        System.out.println(together);
        System.out.println(asList(1, 2, 3, 4).equals(together));
    }
}
