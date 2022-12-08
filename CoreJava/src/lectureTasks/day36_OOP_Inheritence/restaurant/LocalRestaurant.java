package lectureTasks.day36_OOP_Inheritence.restaurant;

import java.util.ArrayList;
public class LocalRestaurant {
    public static void main(String[] args) {
        Server server1 = new Server("Barney", 34, 'M', "Sommelier",34,1000,"ValiAsr" );
        Server server2 = new Server("Anna", 31, 'f', "Bartender",45,900,"PedideShandiz" );
        Server server3 = new Server("Siyavesh", 43, 'm', "Server",87,700,"Hanok" );

        Server[] servers = {server1, server2, server3};

        Chef chef1 = new Chef("Ali", 24, 'M', "Sous Chef",14,1200,"Hanok2");
        Chef chef2 = new Chef("Jasmine", 36, 'f', "Pastry Chef",90,1900,"Shandiz");
        Chef chef3 = new Chef("Mehramiz", 49, 'f', "Kitchen Manager",49,2700,"ValiAsr" );

        Chef[] chefs = {chef1, chef2, chef3};
        System.out.println("----------------------------------------------------");

        Restaurant restaurant = new Restaurant("Big Boss", "North Sicily", 5);

        restaurant.addChef(chefs);
        restaurant.addServer(servers);
        System.out.println(restaurant);
        System.out.println("----------------------------------------------------");

        restaurant.removeChef(90);
        restaurant.removeServer(45);
        System.out.println(restaurant);

    }
}