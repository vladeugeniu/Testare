package main.java;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.ArrayList;

public class DistanceLimitation {

    static boolean arePointsInLimits(ArrayList<Point> points, double minDistance, double maxDistance, Point.Quadrant quadrant) throws Exception {


        if (minDistance < 0 || maxDistance < 0)
            throw new Exception(("Distantele trebuie sa fie mai mari sau egale cu 0"));

        if (minDistance > maxDistance)
            throw new Exception("Distanta minima trebuie sa fie mai mica decat distanta maxima");

        for(Point point : points)
        {
            if(point.getQuarter() != quadrant)
                return  false;

            for(Point point2 : points)
            {
                double distance = point.distanceTo(point2);

                if(maxDistance < distance)
                    return false;
                if(minDistance > distance)
                    return  false;
            }
        }
        return true;
    }
    static void vezi()
    {

    }
}
