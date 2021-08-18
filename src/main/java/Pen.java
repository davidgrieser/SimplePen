public class Pen {
    int inkLevel;
    boolean clicked;

    // This is the initial state of the pen
    Pen() {
        inkLevel = 100;
        clicked = false;
    }

    public int inkLeft() {
        return inkLevel;
    }

    public void click() {
        // change to opposite
        // if clicked is true/false
        if(clicked) {
            clicked = false;
        } else {
            clicked = true;
        }
    }

    public boolean canWrite() {
        // if clicked or not
        if(clicked) {
            //  return true if clicked open
            return true;
        }
        // return false if clicked closed
        return false;
    }
}
