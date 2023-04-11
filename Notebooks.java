package Homework_6;

public class Notebooks {
    private String Random_access_memory;
    private String HDD;
    private String OS;
    private String Color;

    public void setRAM (String Random_access_memory) {
        this.Random_access_memory = Random_access_memory;
    }


    public String getRAM () {
        return Random_access_memory;
    }
    
    public void setHDD (String HDD) {
        this.HDD = HDD;
    }

    public String getHDD () {
        return HDD;
    }

    public void setOS (String OS) {
        this.OS = OS;
    }

    public String getOS (String OS){
        return OS;
    }

    public void setColor (String Color) {
        this.Color = Color;
    }

    public String getColor (String Color){
        return Color;
    }

    public void characteristics (){
        System.out.printf("Характеристика ноутбука: %s, HDD %s, OS %s, %s\n", this.Random_access_memory, this.HDD,  this.OS, this.Color);
    }
}
