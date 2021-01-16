import java.util.*;
public class EnumMapExample2{
public enum Days {
Monday, Tuesday, Wednesday, Thursday
};
public static void main(String [] agrs){
EnumMap<Days,String> map = new EnumMap<Days, String>(Days.class);
map.put(Days.Monday,"1");
map.put(Days.Tuesday,"2");
map.put(Days.Wednesday,"3");
map.put(Days.Thursday,"4");
//print
for(Map.Entry m: map.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
}
}