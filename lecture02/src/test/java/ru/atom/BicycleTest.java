package ru.atom;

import org.junit.Test;

public class BicycleTest {

    @Test
    public void testBaseClassBicyle() throws Exception {
        Bicycle bcl = new Bicycle(12, 23,45);
    }

    @Test
    public void testMountainBicycle() throws  Exception {
        MountainBike mbike = new MountainBike(43, 12, 54, 6);
    }
}
