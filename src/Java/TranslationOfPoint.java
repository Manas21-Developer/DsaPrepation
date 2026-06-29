package Java;

public class TranslationOfPoint {
        int x; int y;

        public TranslationOfPoint(int x ,int y){
            this.x = x;
            this.y = y;
        }

        public void translate(int dx , int dy){
            this.x += dx;
            this.y += dy;
        }
    public static void main(String[] args) {
        TranslationOfPoint obj = new TranslationOfPoint(2,3);
        obj.translate(4,6);
        System.out.println(obj.x +" "+obj.y);
    }
}


