public class AlphabetBreakWhile {
    public static void main(String[] args) {
        char ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            if (ch == 'k') {
                break;
            }
            ch++;
        }
    }
}