package Exercise4;

import java.util.List;

public class DaySchedule {
//    public static void main(String[] args) {
//        DaysOfTheWeek sunday = DaysOfTheWeek.SUNDAY;
//        DaysOfTheWeek monday = DaysOfTheWeek.MONDAY;
//        DaysOfTheWeek tuesday = DaysOfTheWeek.TUESDAY;
//        DaysOfTheWeek wednesday = DaysOfTheWeek.WEDNESDAY;
//        DaysOfTheWeek thursday = DaysOfTheWeek.THURSDAY;
//        DaysOfTheWeek friday = DaysOfTheWeek.FRIDAY;
//        DaysOfTheWeek saturday = DaysOfTheWeek.SATURDAY;
    private DaysOfTheWeek day;
    private List<String> activities;

    public DaySchedule(DaysOfTheWeek day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }
//    List<DaysOfTheWeek>, activities (String activities){
//        List<>
    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
