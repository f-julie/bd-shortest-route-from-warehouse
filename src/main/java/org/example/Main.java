package org.example;

// Magic invocation to test all the use cases in this class

public class Main {
    public static void main(String[] args) {
        ShortestRouteFromWarehouseTest test = new ShortestRouteFromWarehouseTest();

        // Test the happy case
        if (test.getShortestRouteFromWarehouse_fromNonNullWarehouseId_isShortestRoute()) {
            System.out.println(
                    "Test getShortestRouteFromWarehouse_fromNonNullWarehouseId_isShortestRoute passes!");
        } else {
            System.out.println(
                    "Test getShortestRouteFromWarehouse_fromNonNullWarehouseId_isShortestRoute fails!");
        }

        // Test the alternate case
        System.out.println(
                "Test getShortestRouteFromWarehouse_fromNullWarehouseId_throwsException should throw an exception...");
        test.getShortestRouteFromWarehouse_fromNullWarehouseId_throwsException();
        System.out.println("Test getShortestRouteFromWarehouse_fromNullWarehouseId_throwsException fails!");
    }
}