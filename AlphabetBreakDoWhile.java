public class AlphabetBreakDoWhile {
    public static void main(String[] args) {
        char ch = 'a';
        
        do {
            System.out.print(ch + " ");
            if (ch == 'k') {
                break;
            }
            ch++;
        } while (ch <= 'z');
    }
}