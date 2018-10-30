class Plant {

    // Defining essential variables
    int health;

    // Constructing a Zombie object
    Plant() {
        health = 100;

    }
    // Constructing a new zombie object
    Plant(int newHealth)   {
        health = newHealth;
    }
    // Method: attack
    int attack() {
        return (int) (Math.random() * 10);
    }

    // Method: return health
    int getHealth()   {
        return health;
    }
}