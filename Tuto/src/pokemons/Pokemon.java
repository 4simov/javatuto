package pokemons;

abstract class Pokemon {
    
    public String Nom;
    public int PV;
    public int MANA;
    
    
    public Pokemon(String Nom, int PV, int MANA) {
        this.Nom = Nom;
        this.PV = PV;
        this.MANA = MANA;
    }
    
    public Pokemon() {
        this("", 0, 0);
    }
    
    public void attack() {
        
    }
    
    public abstract void coupSpecial1();
    
    public abstract void coupSpecial2();
}
