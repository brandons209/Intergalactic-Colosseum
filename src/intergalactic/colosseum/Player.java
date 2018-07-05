/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalactic.colosseum;

/**
 *
 * @author Brian Walls
 */
public class Player {
    private int health, startHealth;
    private int damage;
    private int attackUpgrade, blockUpgrade, counterUpgrade;
    private int attackDamage, counterDamage;
    private int lives;
    private String name;
    
    public Player(int health, int damage, String name){
        this.health = health;
        this.damage = damage;
        this.name = name;
        startHealth = health;
        lives = 3;
        attackUpgrade = 0;
        blockUpgrade = 0;
        counterUpgrade = 0;
        
        attackDamage = damage;
        counterDamage = (int)damage/2;
    }
    
    public int getAttackDamage(){
        return attackDamage;
    }

    public int getCounterDamage(){
        return counterDamage;
    }
    
    public int getAttackUpgradePoints(){
        return attackUpgrade;
    }
    
    public int getBlockUpgradePoints(){
        return blockUpgrade;
    }
    
    public int getCounterUpgradePoints(){
        return counterUpgrade;
    }
    
    public void takeDamage(int damage){
        health = health - damage;
    }
    
    public int getStartHealth(){
        return startHealth;
    }
    
    public void resetHealth(){
        health = startHealth;
    }
    
    public void upgradeStats(int healthAddition, int damageAddition){
        damage += damageAddition;
        startHealth += healthAddition;
        resetHealth();
        attackDamage = damage + (int)(damage * (attackUpgrade * 0.1));
        counterDamage = (int)( (damage * ((counterUpgrade + 5) * 0.1)) );
    }
    
    public void upgradeAttack(){
        attackUpgrade++;
        
    }
    
    public void upgradeBlock(){
        blockUpgrade++;
    }
     
    public void upgradeCounter(){
        counterUpgrade++;
    }
    public String toString(){
        return "Your name is " + name + " and your start out with " + health + " health and " + damage + " damage.";
    }
    
    public void loseLife(){
        lives--;
    }
    
    public int getLives(){
        return lives;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public String getName(){
        return name;
    }
    
}
