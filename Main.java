// ==========================================
// PRACTICE EXERCISE: OOP (Encapsulation & Inheritance)
// ==========================================

// TODO 1: Gumawa ng Parent Class na nagngangalang 'GameCharacter' with variable of name, level, health
class GameCharacter{
    private String name;
    private int level;
    private int health;
    
    // TODO 3: Gumawa ng Constructor para tanggapin ang name, level, at health gamit ang 'this'
public GameCharacter(String name, int level, int health){
    this.name = name;
    this.level = level;
    this.health = health;
}

    // TODO 4: Gumawa ng mga Getter methods para makuha ang private variables
    // - getName()
    // - getLevel()
    // - getHealth()
public String getName(){
    return name;
}

public int getLevel(){
    return level;
}

public int getHealth(){
    return health;
    }

    // TODO 5: Gumawa ng method na tinatawag na 'attack()' na mag-i-print ng:
    // "[name] attacks the enemy with a basic attack!"

public void attack(){
    System.out.println(name + " attacks the enemy with a basic attack!");
}

}

// TODO 6: Gumawa ng Child Class na 'Mage' na nagmamana kay 'GameCharacter' gamit ang 'extends'
class Mage extends GameCharacter {
    // TODO 7: Magdagdag ng sariling private variable para kay Mage:
    // - private int manaPoints;
    private int manaPoints;


    // TODO 8: Gumawa ng Constructor para kay Mage na may 4 parameters 
    // (name, level, health, manaPoints) at gamitin ang 'super()' para sa parent fields
    public Mage(String name, int level, int health, int manaPoints){
        // Isulat ang super(...) at this.manaPoints dito
        super(name, level, health);
        this.manaPoints = manaPoints;
        
    }

    // TODO 9: Gumawa ng getter para sa mana (getManaPoints)
    public int getManaPoints(){
        return manaPoints;
    }


    // TODO 10: Gumawa ng sariling method na 'castSpell()' na mag-i-print ng:
    // "[name] casts a fireball! Mana left: [manaPoints]"
    // (Tip: Gamitin ang getName() para makuha ang pangalan dahil naka-private ito sa parent)
    public void castSpell(){
        System.out.println(getName() + "casts a fireball! Mana left: " + manaPoints);
    }
}
// ==========================================
// MAIN CLASS PARA SA PAG-RUN NG PROGRAM
// ==========================================
public class Main {
    public static void main(String[] arg){
        // TODO 11: Gumawa ng object ng Mage (Halimbawa: pangalan "Gandalf", level 10, health 100, mana 250)
        Mage mymage = new Mage("Gandalf", 10, 100, 250);

        // TODO 12: I-print ang lahat ng detalye ng Mage gamit ang getters (Encapsulation)
        System.out.println("Character: " + mymage.getName());
        System.out.println("Level: " + mymage.getLevel());
        System.out.println("Health: " + mymage.getHealth());
        System.out.println("Mana: " + mymage.getManaPoints());

        // TODO 13: Tawagin ang attack() at castSpell() methods
        mymage.attack();
        mymage.castSpell();
    }
}