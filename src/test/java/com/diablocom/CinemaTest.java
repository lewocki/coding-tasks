package com.diablocom;

import techinterview.DiabolocomCodingTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * There is a row of seats in a cinema, which is represented as an array of integers (numbers):
 * 1 means that the place is occupied, 0 means it's free.
 * You need to sit a person as far away as possible from the closest neighbors (occupied seats).
 * <p>
 * Return an index of the array where to sit a person.
 * <p>
 * Input constraints:
 * there is always at least one empty and at least one occupied seat in the array.
 */
public class CinemaTest {

    @ParameterizedTest
    @MethodSource("caseProvider")
    void testAwesomePlace(Integer expected, List<Integer> cinemaSeats) {

        int seat = DiabolocomCodingTask.findSeat(cinemaSeats);

        Assertions.assertEquals(expected, seat);
    }

    @ParameterizedTest
    @MethodSource("caseProvider")
    void testFindBestSeat(Integer expected, List<Integer> cinemaSeats) {

        int seat = DiabolocomCodingTask.findBestSeat(cinemaSeats);

        Assertions.assertEquals(expected, seat);
    }

    static Stream<Arguments> caseProvider() {
        return Stream.of(
                arguments(4, List.of(0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0)),
                arguments(0, List.of(0, 1)),
                arguments(1, List.of(1, 0)),
                arguments(8, List.of(1, 1, 1, 1, 1, 1, 1, 1, 0)),
                arguments(0, List.of(0, 0, 0, 0, 0, 1)),
                arguments(5, List.of(1, 0, 0, 0, 0, 0)),
                arguments(9, List.of(0, 0, 0, 0, 1, 0, 0, 0, 0, 0)),
                arguments(0, List.of(0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0)),
                arguments(0, List.of(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1)),
                arguments(8, List.of(0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1))
        );
    }
}
