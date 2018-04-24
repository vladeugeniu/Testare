package main.java;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DistanceLimitationTest {
    @Test
    public void arePointsInLimits() throws Exception {

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(.0, .0));
        points.add(new Point(1.0, 1.0));
        points.add(new Point(2.0, 2.0));
        points.add(new Point(3.0, 3.0));
        points.add(new Point(4.0, 4.0));
        points.add(new Point(5.0, 5.0));

        // Cauzrile pentru al 4-lea parametru
        assertEquals(DistanceLimitation.arePointsInLimits(points, 0, 10, Point.Quadrant.first), true);
        assertEquals(DistanceLimitation.arePointsInLimits(points, 0, 10, null), false);
    /*
        assertEquals(DistanceLimitation.arePointsInLimits(points, 0, 10, Point.Quadrant.second),false);
        assertEquals(DistanceLimitation.arePointsInLimits(points, 0, 10, Point.Quadrant.third), false);
        assertEquals(DistanceLimitation.arePointsInLimits(points, 0, 10, Point.Quadrant.fourth),false);
    */
        // Cazurile pentru cel de-al 3-lea parametru
        assertEquals (DistanceLimitation.arePointsInLimits(points, 0, 10, Point.Quadrant.first), true);
        try {
           DistanceLimitation.arePointsInLimits(points, 0, -1, Point.Quadrant.first);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Distantele trebuie sa fie mai mari sau egale cu 0");
        }

        // Cazurile pentru cel de-al 2-lea parametru
        assertEquals (DistanceLimitation.arePointsInLimits(points, 0, 10, Point.Quadrant.first), true);
        try {
           DistanceLimitation.arePointsInLimits(points, -1, 5, Point.Quadrant.first);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Distantele trebuie sa fie mai mari sau egale cu 0");
        }
    }
}