package spells;

public class Spell {

    private Element element;
    private int power;

    public Spell(Element element, int power) {
        this.element = element;
        this.power = power;
    }

    public Element getElement(){
        return this.element;
    }

    public void setElement(Element element){
        this.element = element;
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
        this.power = power;
    }
}
