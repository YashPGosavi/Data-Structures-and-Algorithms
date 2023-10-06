public class _11_swappingWithoutUsingTemp {
    public static void main(String[] args) {
        int x = 10;
        int y=2;

        x = x^y;
        y = x^y;
        x = y^x;
        
        System.out.println("X--> "+ x+"\nY--> "+y);
    }
}
