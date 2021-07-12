package com.malov.template.stream;

import com.malov.template.stream.unit.Track;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

    public void getMinForStream() {
        List<Track> trackList = asList(new Track("Bone", 33),
                new Track("Prodigy", 5),
                new Track("Rock", 8));

        Optional<Track> trackMin = trackList.stream().min(Comparator.comparing(Track::getLength));
        System.out.println(trackMin.get().getName());
    }
}
