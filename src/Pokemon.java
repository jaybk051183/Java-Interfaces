//Een abstract super klasse met 5 private final variabelen, 1 privatevariabele, 1 constructor, 6 getters en 1 setter;

import java.util.List;

public abstract class Pokemon {
//Variabelen aanmaken welke algemeen zijn voor alle type Pokemons
    private final String name;
    private final int level;
    private final String type;
    private final String food;
    private final String sound;
    private int hp;

    // hp verandert daarom  geen final variabele

    //Constructor maken met params in juiste volgorde zoals in Main.java
    public Pokemon(String name, int level, int hp,String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.food = food;
        this.sound = sound;
        this.hp = hp;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    //Er zijn al 5 variabelen in de abstracte klasse en omdat we nog 1 methode toevoegen moet het een abstrace methode worden.
    public abstract List<String> getAttacks();

}
