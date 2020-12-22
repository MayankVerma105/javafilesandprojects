import java.util.StringTokenizer;
public class Simple{
public static void main(String[] agrs){
StringTokenizer st = new StringTokenizer("my name is khan"," ");
while (st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}
}