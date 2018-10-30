class Zombie {

    // Defining essential variables
    int health;

    // Constructing a Zombie object
    Zombie() {
        health = 100;

    }
    // Constructing a new zombie object
    Zombie(int newHealth)   {
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

