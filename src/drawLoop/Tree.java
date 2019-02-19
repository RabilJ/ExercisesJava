package drawLoop;

public class Tree implements Drawable {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Jakiej wysokości ma być drzewo?");
        int height = Drawable.sc.nextInt();
        drawStars(height);

    }

    private void drawStars(int number) {
        String star = "*";
        String line = " ";
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < number; i++) {
            builder1.append(line);
        }
        for (int i = 0; i < number; i++) {
            System.out.print(builder1.toString());
            System.out.println(builder.toString());

            builder.append(star).append(" ");
            if (builder1.length() > 0) {
                builder1.deleteCharAt(0);
            }
        }
    }
}
