package br.com.flaviostudy.thelordoftheringsapi;

public class Character {
    
    private String name;
    private String image;
    private String characterClass;
    
    public Character(String name, String image, String characterClass) {
        this.name = name;
        this.image = image;
        this.characterClass = characterClass;
    }
    
    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }
    public String getCharacterClass() {
        return characterClass;
    }
    

}
