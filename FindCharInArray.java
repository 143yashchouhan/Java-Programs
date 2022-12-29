import java.util.*;
public class findcharinarray {
    public static void main(String[] args) {
        String sent = "java is programming language and I love java";
        char find = 'o';
        int i, times = 0;
        for(i = 0; i < sent.length(); i++ ){
            if(sent.charAt(i) == find){
                times++;
            }
        }
        System.out.println("O Printed : " + times);
    }
}
