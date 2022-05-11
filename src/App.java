public abstract class EnemyShip {
         

        private String namex;
        private double speed;
        private double directionX;
        private double directionY;
        private double amtDamage;
        public String getName() { return namex; }
        public void setName(String newName) { namex = newName; }
        public double getDamage() { return amtDamage; }
        public void setDamage(double newDamage) { amtDamage = newDamage; }
        public void followHeroShip(){
  
            System.out.println(getName() + " is following the hero");
        }

        public void displayEnemyShip(){
  
            System.out.println(getName() + " is on the screen");
        }

        public void enemyShipShoots() {
            System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");

        }
    }
    

public class UFOEnemyShip extends EnemyShip {
    public UFOEnemyShip(){
        setName("UFO Enemy Ship");
        setDamage(20.0);
    }



public class RocketEnemyShip extends EnemyShip {
        public RocketEnemyShip(){
            setName("Rocket Enemy Ship");
            setDamage(10.0);
        }
    }
          
	public class BigUFOEnemyShip extends UFOEnemyShip {
            public BigUFOEnemyShip(){
                setName("Big UFO Enemy Ship");
                setDamage(40.0);
            }
        }