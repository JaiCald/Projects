public class Towers {
    // Number of discs
    private int numDiscs;

    //Constructor sets the nunber of discs

    public Towers(int n) {
        this.numDiscs = n;

        // Move discs from peg 1 to peg 3
        // Peg 2 will be temp

        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }

    // Recursive method to move discs
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {


            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);

            // Display the move
            System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);

            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}