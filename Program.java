
public class Program{

     public static void main(String []args){
        Rect r = new Rect(1, 1, 10, 10);
        
        System.out.println(r.calcArea());
        System.out.println(r.isIn(5, 5));
         System.out.println(r.toString());
     }
     
    
}

class Rect{
    private int x1, x2, y1, y2;
    
    public Rect(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public int calcArea(){
        int height = (int)Math.abs(this.y1 - this.y2);
        int width = (int)Math.abs(this.x1 - this.x2);
        return height * width;
    }
    
    public boolean isIn(int x, int y){
        int minX = Math.min(this.x1, this.x2);
        int minY = Math.min(this.y1, this.y2);
        int maxX = Math.max(this.x1, this.x2);
        int maxY = Math.max(this.y1, this.y2);
        
        boolean isInX = x >= minX && x <= maxX;
        boolean isInY = y >= minY && y <= maxY;
        
        return isInX && isInY;
    }
    
    public String toString(){
        return String.format("(%d, %d, %d, %d)", this.x1, this.y1, this.x2, this.y2);
    }
}
