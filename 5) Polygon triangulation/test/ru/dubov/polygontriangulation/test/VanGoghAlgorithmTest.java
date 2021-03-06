package ru.dubov.polygontriangulation.test;

import ru.dubov.polygontriangulation.VanGoghAlgorithm;
import junit.framework.TestCase;
import ru.dubov.primitives.Point;
import ru.dubov.primitives.Polygon;

public class VanGoghAlgorithmTest extends TestCase {

    public void testFast() {
        Polygon p = new Polygon();
        p.add(new Point(0,0));
        p.add(new Point(1,1));
        p.add(new Point(2,0));
        p.add(new Point(3,1));
        p.add(new Point(4,0));
        p.add(new Point(4,4));
        p.add(new Point(0,4));
        
        VanGoghAlgorithm.fast(p);
    }
    
    
}
