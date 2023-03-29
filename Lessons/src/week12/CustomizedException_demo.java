package week12;

public class CustomizedException_demo {
    public static void main(String[] args) throws CustomizedException {
        int i = 1;
        if (i == 1) {
            throw new CustomizedException("Parameter can't be 1");

        }
    }
}
