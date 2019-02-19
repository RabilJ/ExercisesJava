package airconditionerAbstractInter;

public class Test {
    public static void main(String[] args){
        Loop loop = new Loop(new Building(5));
        loop.controlLoop();
    }
}
