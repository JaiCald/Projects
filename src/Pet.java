public class Pet {

    //private data fields
    private String name;

    public Pet() {
        this.setName("");
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    //toString method
    public String toString() {
        String output = "Pet information:\n";
        output += "Name: " + this.name;
        return output;
    }

    //Main used to call and display the resulting text
    public static void main(String[] args) {

        Pet p1 = new Pet();
        p1.setName("pet name");
        System.out.println(p1.toString());

        Pet p2 = new Pet();
        p2.setName("Buster");
        System.out.println(p2.toString());
    }
}



