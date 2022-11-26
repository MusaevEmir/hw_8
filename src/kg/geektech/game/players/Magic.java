package kg.geektech.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int boost = 10;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this.getHealth() > 0 ){
                heroes[i].setDamage(boost + heroes[i].getDamage());
            }
        }
        System.out.println("Magic дабовил урон ");
    }
}
