/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.util.stream.*;
public class EventManagementApp {

    public static List<Attendee> filterAndSortAttendees(List<Attendee> attendees) {
        return attendees.stream().filter(age -> age.attendeeAge > 18).sorted(Comparator.comparing(Attendee::getEmpName).reversed()).collect(Collectors.toList());
    }

 public static void main(String[] args) {
        List<Attendee> attendees = new ArrayList<>();
        attendees.add(new Attendee(1, "Alice", 25));
        attendees.add(new Attendee(2, "Bob", 16));
        attendees.add(new Attendee(4, "David", 19));
        attendees.add(new Attendee(3, "Carol", 22));
        attendees.add(new Attendee(5, "Eve", 17));

        List<Attendee> filteredAndSorted = filterAndSortAttendees(attendees);
        filteredAndSorted.forEach( a -> System.out.println(a.attendeeID+" "+a.attendeeName+" "+a.attendeeAge));

	//implement code
 }
}


