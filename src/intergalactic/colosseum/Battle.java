/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalactic.colosseum;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Battle {
    
    public Battle(){
        lastMessage = "";
        d = new DecimalFormat("#.00");
        lastPlayerChoice = 0;
    }
    
    private int generateEnemyChoice(){
        
        if(lastPlayerChoice == 1){//this structure gives more of a chance for an enemy to choose counter whatever the last player choice was.
           int rawChoice = ThreadLocalRandom.current().nextInt(1, 5);
           if(rawChoice == 2 || rawChoice == 4){
               return 2;
           }else{
               return rawChoice;
           }
        }else if(lastPlayerChoice == 2){
            int rawChoice = ThreadLocalRandom.current().nextInt(1, 5);
            if(rawChoice == 3 || rawChoice == 4){
                return 3;
            }else{
                return rawChoice;
            }
        }else if(lastPlayerChoice == 3){
            int rawChoice = ThreadLocalRandom.current().nextInt(1, 5);
            if(rawChoice == 1 || rawChoice == 4){
                return 1;
            }else{
                return rawChoice;
            }
        }
        
        return ThreadLocalRandom.current().nextInt(1, 4);
    }
    
    public void attack(Player player, Enemy enemy){
        switch(generateEnemyChoice()){
            case(1):
                player.takeDamage(enemy.getDamage());
                enemy.takeDamage(player.getAttackDamage());
                lastMessage = enemy.getName() + " attacked! you both dealt full attack damage to each other.";
                break;
            case(2):
                player.takeDamage(player.getDamage() / 2);
                lastMessage = enemy.getName() + " blocked! you dealt half of your damage to yourself.";
                break;
            case(3):
                enemy.takeDamage(player.getAttackDamage());
                lastMessage = enemy.getName() + " countered! you dealt full attack damage to them.";
                break;
        }
        lastPlayerChoice = 1;
    }
    
    public void counter(Player player, Enemy enemy){
        switch(generateEnemyChoice()){
            case(1):
                player.takeDamage(enemy.getDamage());
                lastMessage = enemy.getName() + " attacked! you took full damage.";
                break;
            case(2):
                enemy.takeDamage(player.getCounterDamage());
                lastMessage = enemy.getName() + " blocked! you dealt " + d.format((player.getCounterUpgradePoints() + 5) * 0.1) + " damage to them.";
                break;
            case(3):
                enemy.takeDamage(player.getCounterDamage());
                player.takeDamage(enemy.getDamage() / 2);
                lastMessage = enemy.getName() + " countered! you both dealt counter damage to each other.";
                break;
        }
        lastPlayerChoice = 3;
    }
    
    public void block(Player player, Enemy enemy){
         switch(generateEnemyChoice()){
            case(1):
                enemy.takeDamage((int)(enemy.getDamage() * ((player.getBlockUpgradePoints() + 5) * 0.1)) );
                lastMessage = enemy.getName() + " attacked! they dealt " + d.format( ( (player.getBlockUpgradePoints() + 5) * 0.1) ) + " of their damage to themselves.";
                break;
            case(2):
                lastMessage = enemy.getName() + " blocked! nothing happened.";
                break;
            case(3):
                player.takeDamage(enemy.getDamage() / 2);
                lastMessage = enemy.getName() + " countered! you took half of their damage.";
                break;
        }
        lastPlayerChoice = 2;
    }
   
    DecimalFormat d;
    public String lastMessage;
    private int lastPlayerChoice;
}
