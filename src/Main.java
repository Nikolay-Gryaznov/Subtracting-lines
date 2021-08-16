import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] task = in.nextLine().split(" ");
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < task[1].length();) {
            char c = task[1].charAt(i);
            if(task[0].indexOf(c) != -1) {
                task[0] = task[0].replaceFirst(""+c,"");
                task[1] = task[1].replaceFirst(""+c,"");
            } else {
                postfix.append(c);
                i++;
            }
        }
        task[0] += postfix;
        System.out.println(task[0]);
    }
}