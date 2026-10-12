public class Pet {

    //private data fields
    private int age;
    private String name;
    private String type;

    public Pet() {

        this.setAge(1);
        this.setName("Pet Name");
        this.setType("Animal");
    }

    public Pet(String newName, String newType, int newAge) {

        this.setName(newName);
        this.setType(newType);
        this.setAge(newAge);
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    // get methods
    public int getAge() {
        return this.age;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        String sound;

        if (this.type.equals("Dog")) {
            sound = "Meow";
        } else {
            sound = "Yowl";
        }
        return sound;
    }

    //toString method
    public String toString() {

        String output = "Pet information:\n";
        output += "Name: " + this.name + "\n";
        output += "Type: " + this.type + "\n";
        output += "Sound: " + this.speak() + "\n";

        return output;
    }
}