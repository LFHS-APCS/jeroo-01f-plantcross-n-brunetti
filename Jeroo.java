/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
        moveToCross();
        plant();
        turn(LEFT);
        wing();
        wing();
        wing();
        wing();
    }
    // Put any helpermethods here
    
    
    
    public void wing(){
        hopPlant();
        turn(RIGHT);
        hopPlant();
        hopPlant();
        hopPlant();
        turn(LEFT);
        hopPlant();
        hopPlant();
        hopPlant();
        turn(RIGHT);
        hopPlant();
        
        
    }
    
    public void hopPlant(){
     hop();
      plant();
    }
    
    public void moveToCross(){
    turn(RIGHT);
        hop(7);
        turn(LEFT);
        hop(3);
        
         }
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
