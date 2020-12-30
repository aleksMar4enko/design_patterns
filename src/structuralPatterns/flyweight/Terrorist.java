package structuralPatterns.flyweight;

public class Terrorist implements Player {

    private static final String MISSION = "planr a bomb";

    private String weapon;

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void showInformation() {
        System.out.printf("Player 'Terrorist' added. Weapon: %s. Mission: %s %n", weapon, MISSION);
    }
}
