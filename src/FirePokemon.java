import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    //Constructor aanmaken zonder String type omdat FirePokemon al een type is.

    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon (String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno");
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }
}
