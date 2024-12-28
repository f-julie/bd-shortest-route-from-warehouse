package org.example;

public class ShortestRouteFromWarehouseTest {
    // Happy case, providing the shortest route for an existent warehouse and list of Orders
    public boolean getShortestRouteFromWarehouse_fromNonNullWarehouseId_isShortestRoute() {
        // GIVEN
        // A non-null warehouse ID
        // We are giving a non-null test Warehouse ID and a list of Orders.
        // We happen to know the the shortest route would be orderC -> orderB -> orderA
        String exampleWarehouseId = "ABC1";
        Order orderA = new Order("numberA", "123 Address Lane");
        Order orderB = new Order("numberB", "234 Address Drive");
        Order orderC = new Order("numberC", "345 Address Street");
        List<Order> exampleOrders = new ArrayList<>();
        exampleOrders.add(orderA);
        exampleOrders.add(orderB);
        exampleOrders.add(orderC);

        // WHEN
        // We call getShortestRouteFromWarehouse()
        ShortestRouteFromWarehouse testClass = new ShortestRouteFromWarehouse();
        List<Order> result = testClass.getShortestRouteFromWarehouse(exampleWarehouseId, exampleOrders);

        // THEN
        // The result is the correct length and ordering
        if (result.size() != 3 ||
                !result.get(0).equals(orderC) ||
                !result.get(1).equals(orderB) ||
                !result.get(2).equals(orderA)) {
            System.out.println(
                    "Expected ordering to be C -> B -> A!");
            return false;
        }

        // The input is not modified
        if (exampleWarehouseId != "ABC1") {
            System.out.println(
                    "Expected warehouseId to remain ABC1!");
            return false;
        }

        // All conditions satisfied!
        System.out.println(
                "Use Case 'Requests Shortest Route from non-null Warehouse ID' passes!");
        return true;
    }


    // Alternate case, throwing an exception on invalid input
    public boolean getShortestRouteFromWarehouse_fromNullWarehouseId_throwsException() {
        // GIVEN
        // A null warehouse ID and a list of Orders
        String exampleWarehouseId = null;
        Order orderA = new Order("numberA", "123 Address Lane");
        Order orderB = new Order("numberB", "234 Address Drive");
        Order orderC = new Order("numberC", "345 Address Street");
        List<Order> exampleOrders = new ArrayList<>();
        exampleOrders.add(orderA);
        exampleOrders.add(orderB);
        exampleOrders.add(orderC);

        // WHEN
        // We call getShortestRouteFromWarehouse()
        ShortestRouteFromWarehouse testClass = new ShortestRouteFromWarehouse();
        List<Order> result = testClass.getShortestRouteFromWarehouse(exampleWarehouseId, exampleOrders);

        // THEN
        // The result is an exception
        System.out.println(
                "Expected shortest path from null Warehouse ID to raise IllegalArgumentException!");

        // The input is not modified
        if (exampleWarehouseId != "ABC1") {
            System.out.println(
                    "Expected warehouseId to remain ABC1!");
        }

        // An exception should have stopped us from getting here
        return false;
    }