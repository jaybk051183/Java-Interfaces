import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

   List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
     super(name, level,hp, food, sound, "grass");

    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
     System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with  leafStorm");
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
    }

 @Override
 public List<String> getAttacks() {
  return attacks;
 }

}
