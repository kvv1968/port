package ru.java.configuration.model;

public class PortProcesses {
    private tasks_from_mentor.Port.Berth[] berths ;
    private tasks_from_mentor.Port.Raid raid;
    private static int raidCapacity = 10;

    public PortProcesses() {
        this.berths = new tasks_from_mentor.Port.Berth[]{
                new tasks_from_mentor.Port.Berth(TypeCargo.LIGHT),
                new tasks_from_mentor.Port.Berth(TypeCargo.HEAVY),
                new tasks_from_mentor.Port.Berth(TypeCargo.MEDIUM)
        };
        this.raid = new tasks_from_mentor.Port.Raid(raidCapacity);
    }

    //выгрузка груза на причале
    public void unloadingCargoBerth(tasks_from_mentor.Port.Ship ship){
        TypeCargo typeCargo = ship.getCargo();
        tasks_from_mentor.Port.Berth berth;
        for (tasks_from_mentor.Port.Berth ber:berths){
            if (typeCargo == ber.getTypeCargo()) {

                System.out.println("Тип груза совпадает, причал свободный");
                System.out.printf("Удаляем корабль %s с рейда%n", ship);
                raid.getShipList().remove(ship);
                berth = ber;
                berth.setShip(ship);
                berth.unloadingBerth();
            }
        }
    }

    public tasks_from_mentor.Port.Raid getRaid() {
        return raid;
    }
}
