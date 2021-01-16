import java.util.*;
enum days {
SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetExample{
public static void main(String[] agrs){
Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);

Iterator<days> itr = set.iterator();
while(itr.hasNext())
System.out.println(itr.next());

}
}