package Workbook5;

public class Animal {
    private boolean makeSound;
    private boolean wagTail;
    private String tailLength;
    private String name;

    public boolean isWagTail() {
        return wagTail;
    }
    public void setWagTail(boolean wagTail) {
        this.wagTail = wagTail;
        if(tailLength.equalsIgnoreCase("2 inches or more")|| name.equalsIgnoreCase("Luna")){
            System.out.println("My dog can wag its tail");
        }
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = String.valueOf(tailLength);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMakeSound() {
        return makeSound;
    }

    public void setMakeSound(boolean makeSound) {
        this.makeSound = makeSound;
        if (name.equalsIgnoreCase("Luna")){
            System.out.println("My dog is excited. She is barking a nd wagging her tail");
        }
    }
}
