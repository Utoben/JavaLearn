package inheritance;

public class CatFamily {
    public int legs;
    public int eyes;

    public boolean canEatPerson;

    public  CatFamily(int legs, int eyes, boolean canEat){
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEat;
    }

    public void setLegs(int legs) {
//        if (legs < 5) {
            this.legs = legs;
//        }
    }
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
    public int getEyes() {
        return eyes;
    }
    public int getLegs() {
        return legs;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }
    public void setIsCanEatPerson(boolean can) {
       this.canEatPerson = can;
    }
}
