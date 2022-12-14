package lectureTasks.day39_Encapsulation_Inheritence.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Server server1 = new Server("Barney", 34, 'M', "Sommelier",34,1000,"ValiAsr" );
        Server server2 = new Server("Anna", 31, 'F', "Bartender",45,900,"PedideShandiz" );
        Server server3 = new Server("Siyavesh", 43, 'M', "Server",87,700,"ValiAsr" );

        Server[] servers = {server1, server2, server3};

        Chef chef1 = new Chef("Ali", 24, 'M', "Sous Chef",14,1200,"Hanok2");
        Chef chef2 = new Chef("Jasmine", 36, 'F', "Pastry Chef",90,1900,"PedideShandiz");
        Chef chef3 = new Chef("Mehramiz", 49, 'F', "Kitchen Manager",49,2700,"ValiAsr" );

        Chef[] chefs = {chef1, chef2, chef3};


        Restaurant restaurant1 = new Restaurant("ValiAsr","Big Boss" , "North Sicily",5);
        Restaurant restaurant2 = new Restaurant("PedideShandiz","Funky Monkey" , "North Sicily",4);

        restaurant1.addChef(chefs);
        restaurant1.addServer(servers);
        System.out.println(restaurant1);
        System.out.println(restaurant1.serverList);
        System.out.println(restaurant1.chefList);
        System.out.println("----------------------------------------------------");

        //restaurant1.removeChef(49);
        restaurant1.removeServer(34);
        System.out.println(restaurant1);
        System.out.println(restaurant1.serverList);
        System.out.println(restaurant1.chefList);

        System.out.println("------------------------------------------------");

        for (Chef chef : restaurant1.chefList) {
            System.out.println(chef.getName() +" : "+"$"+chef.getSalary());
        }

        System.out.println("------------------------------------------------");

        for (Server server : restaurant1.serverList) {
            System.out.println(server.getName()+" : "+"$"+server.getSalary());
        }

        System.out.println("------------------restaurant2----------------------");

        restaurant2.addChef(chefs);
        restaurant2.addServer(servers);
        System.out.println(restaurant2);
        System.out.println(restaurant2.serverList);
        System.out.println(restaurant2.chefList);
        System.out.println("----------------------------------------------------");

        for (Chef chef : restaurant2.chefList) {
            System.out.println(chef.getName()+" is a "+chef.getJobTitle()+" / Salary : "+"$"+chef.getSalary());
        }

        for (Server server : restaurant2.serverList) {
            System.out.println(server.getName()+" is a "+server.getJobTitle()+" / Salary : "+"$"+server.getSalary());
        }
    }
}
