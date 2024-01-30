package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = Math.abs(t);
        String s = "" + t;
        for (int i = 0; i < s.length(); i++){
            int j = Character.digit(s.charAt(i), 10);
            sum += j;
        }
        System.out.println(sum);

    }
}
