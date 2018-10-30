public class PlantsVSZombies {
    public static void main(String [] args)   {

        // Calling in object zombie
        Zombie zombie1 = new Zombie();
        System.out.println("A Zombie with health: " + zombie1.getHealth() + " Has  been raised !!!");

        // Calling in object Plant
        Plant plant1 = new Plant();
        System.out.println("A Plant with health: " + plant1.getHealth() + " Has  been grown !!!");

        // creating a fighting loop
        int status = 1;
        int increase = 0;
        int plantHealthTemp = plant1.getHealth();
        while (status > 0)   {
            plant1.health -= zombie1.attack();
            zombie1.health += plantHealthTemp - plant1.getHealth();
            plantHealthTemp = plant1.getHealth();
            zombie1.health -= (plant1.attack() + increase);
            increase++;
            System.out.println(
                    "The health status is: Zombie health: " + zombie1.getHealth() + " and Plant health: " +
                            plant1.getHealth());
            if (zombie1.getHealth() == plant1.getHealth())
                status = zombie1.getHealth();
            else if (zombie1.getHealth() <= plant1.getHealth())
                status = zombie1.getHealth();
            else
                status = plant1.getHealth();

        }
    }

}
