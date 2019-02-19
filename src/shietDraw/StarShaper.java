package shietDraw;

public class StarShaper {
    public static StringBuilder stors(int number){
        String starLine = "*";
        StringBuilder builder = new StringBuilder(starLine);
        for (int i = 0; i <number-1 ; i++) {
            builder.append(starLine);
        }
        return builder;
    }
    public static StringBuilder spaces(int number){
        String line = " ";
        StringBuilder builder = new StringBuilder(line);
        for (int i = 0; i <number-1 ; i++) {
            builder.append(line);
        }
        return builder;
    }
}
