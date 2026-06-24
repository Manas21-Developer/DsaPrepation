public class RectangleOverlap {
    int x1 ,y1,x2,y2;

    public RectangleOverlap(int x1 , int y1 ,int x2 ,int y2 ) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public boolean isOverlap(RectangleOverlap r){
            // top  && bottom
            if (this.x2 <r.x1 || r.x2 <this.x1) return false;

            // right  && left
            if (this.y2 < r.y1 || r.y2 <this.y1) return false;

            return true;
    }
    public static void main(String[] args) {
        RectangleOverlap r1 = new RectangleOverlap(0,0,4,4);
        RectangleOverlap r2 =  new RectangleOverlap(0,0,6,6);
        System.out.println(r1.isOverlap(r2));
    }
}






