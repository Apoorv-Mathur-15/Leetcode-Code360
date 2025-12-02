package src.CodingNinja;

import java.util.List;

public class HotelBookings {
    public static int hotelBookings(List<String> queries) {
        int count = 0;
        for(String query : queries) {
            if(query.charAt(0) == '+')
                count++;
        }
        return count;
    }
}
