package com.diabolocom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DiabolocomCodingTask {

    public static void main(String[] args) {

        List<Integer> cinemaSeats = List.of(0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0);
        //index=4
        System.out.println(findSeat(cinemaSeats));
        List<Integer> oneSeat = List.of(0, 1);
        //index=0
        System.out.println(findSeat(oneSeat));
        List<Integer> lastSeat = List.of(1, 0);
        //index=1
        System.out.println(findSeat(lastSeat));
        List<Integer> lastSeats = List.of(1, 1, 1, 1, 1, 1, 1, 1, 0);
        System.out.println(findSeat(lastSeats));

        System.out.println(findSeat(List.of(0, 0, 0, 0, 0, 1)));

        System.out.println(findSeat(List.of(1, 0, 0, 0, 0, 0)));

        System.out.println(findSeat(List.of(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1)));

    }

    /**
     * There is a row of seats in a cinema, which is represented as an array of integers (numbers):
     * 1 means that the place is occupied, 0 means it's free.
     * You need to sit a person as far away as possible from the closest neighbors (occupied seats).
     *
     * Return an index of the array where to sit a person.
     *
     * Input constraints:
     * there is always at least one empty and at least one occupied seat in the array.
     */
    public static int findSeat(List<Integer> seats) {
        System.out.println("SEATS: " + seats);
        int key = 0;
        boolean previousSeatEmpty = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < seats.size(); i++) {
            if (seats.get(i) == 0) {
                key = previousSeatEmpty ? key : i;
                int value = map.getOrDefault(key, 0) + 1;
                map.put(key, value);
                previousSeatEmpty = true;
            } else {
                previousSeatEmpty = false;
            }
        }

        Optional<Map.Entry<Integer, Integer>> maxEntryOptional = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        Map.Entry<Integer, Integer> maxEntry = maxEntryOptional.get();

        if (maxEntry.getKey() + maxEntry.getValue() == seats.size()) {
            return seats.size() - 1;
        }

        if (map.containsKey(0) && map.get(0) > maxEntry.getValue() / 2) {
            return 0;
        }

        return maxEntry.getKey() + maxEntry.getValue() / 2;
    }

}
