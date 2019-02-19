package drawLoop;

public class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Jaką długość ma długość prostokąta?");
        int lenght = Drawable.sc.nextInt();
        System.out.println("Jaką długość ma wysokość prostokąta?");
        int height = Drawable.sc.nextInt();
        drawStars(lenght,height);
    }

    private void drawStars(int lenght, int height) {
        StringBuilder builder = new StringBuilder();
        String star = "*";
        for (int i = 0; i < lenght; i++) {
            builder.append(star).append(" ");
        }
        for (int i = 0; i < height; i++) {
            System.out.println(builder.toString());
        }
    }
}
