import java.util.List;
// Klasse met 8 variabelen, constructor, getters en setters.
public class PokemonTrainer {
    //Variabelen maken (3 alvast van PokemonGymOwner,.java) welke private zijn
    private String name;
    private  String town;
    private List<Pokemon> pokemons;



    //Constructor maken

    public PokemonTrainer() {




    }


    //Getters & Setters

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    //Methoden maken


}
