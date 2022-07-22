package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> activities = new ArrayList<>();
        activities.add("swimming");
        activities.add("playing football");
        activities.add("jogging");
        activities.add("cooking");
        activities.add("laundry");

        DaySchedule schedule = new DaySchedule(DaysOfTheWeek.SATURDAY, activities);
        System.out.println(schedule);

    }
}
