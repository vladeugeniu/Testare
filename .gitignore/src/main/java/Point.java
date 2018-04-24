package main.java;

public class Point {
   private Double x;
   private Double y;

    enum Quadrant
    {
        first,
        second,
        third,
        fourth
    };

   Point(){
       x = .0;
       y = .0;
   }

   Point(Double x, Double y){
       this.x = x;
       this.y = y;
   }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

   Double distanceTo(Point point)
   {
       return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
   }

    Quadrant getQuarter()
    {
        if(x >= 0 && y >= 0)
            return Quadrant.first;

        if(x <= 0 && y >= 0)
            return Quadrant.second;

        if(x <= 0 && y <= 0)
            return Quadrant.third;

        return Quadrant.fourth;
    }
}
