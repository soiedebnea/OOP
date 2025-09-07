public class TheStarStepsDisplay {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;
        
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}