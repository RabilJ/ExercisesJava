package airconditionerAbstractInter;

public class Loop {
    private Building building;

    public Loop(Building building) {
        this.building = building;
    }
    public void controlLoop(){
        while(!building.areAllRoomsCool()){
            System.out.println(building);
            building.coolRooms();
            sleepOneSecond();
        }
        System.out.println("Wszystkie pokoje są schłodzone");
    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
