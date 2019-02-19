package drawLoop;

public class Square implements Drawable{
    private int sideLenght;

    public int getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public void draw() {
        System.out.println("Jaką długość ma bok kwadratu?");
        int lenght = Drawable.sc.nextInt();
        drawStars(lenght);
    }

    private void drawStars(int lenght) {
        StringBuilder builder = new StringBuilder();
        String star = "*";
        for (int i = 0; i < lenght; i++) {
            builder.append(star).append(" ");
        }
        for (int i = 0; i < lenght; i++) {
            System.out.println(builder.toString());
        }
        }

    }

