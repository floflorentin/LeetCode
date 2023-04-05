package fr.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution {
    public int computeDayGains(int nbSeats, int[] payingGuests, int[] guestMovements) {
        int totalGains = 0;
        int occupiedSeats = 0;

        ArrayList<Integer> alreadyPayed = new ArrayList<>();
        ArrayList<Integer> presentGuest = new ArrayList<>();
        ArrayDeque<Integer> waitingGuest = new ArrayDeque<>();

        for (int i = 0; i < payingGuests.length; i++) {
            int guestId = guestMovements[i];

            if (presentGuest.contains(guestId)) {
                presentGuest.remove(guestId);
                occupiedSeats--;
                if (!alreadyPayed.contains(guestId)) {
                    totalGains += payingGuests[guestId];
                    alreadyPayed.add(guestId);
                }

                if (!waitingGuest.isEmpty()) {
                    presentGuest.add(waitingGuest.pollLast());
                }
            } else if (waitingGuest.contains(guestId)) {
                waitingGuest.remove(guestId);
            } else if (occupiedSeats >= nbSeats) {
                waitingGuest.push(guestId);
            }  else {
                presentGuest.add(guestId);
                occupiedSeats++;
            }
        }

        return totalGains;
    }
}
