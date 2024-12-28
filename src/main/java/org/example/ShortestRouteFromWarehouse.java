package org.example;

public class ShortestRouteFromWarehouse {

    private ShortestRouteService shortestRouteService = new ShortestRouteService();

    // Both cases: "Caller calls the function"
    public List<Order> getShortestRouteFromWarehouse(String warehouseId, List<Order> orders) {
        // Alternate case: "function raises exception"
        if (warehouseId == null) {
            throw new IllegalArgumentException(
                    "Can't calculate shortest route from null warehouseId!");
        }

        // Happy case: "algorithm calculates return ordering"
        // The algorithm our scientist gave us is implemented in a separate class:
        List<Order> shortestRoute = shortestRouteService.getShortestRoute(warehouseId, orders);

        return shortestRoute;
    }

}
