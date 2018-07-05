/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergalactic.colosseum;

/**
 *
 * @author Brian Walls
 * 
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.text.DefaultCaret;

public class MAINGUI extends javax.swing.JFrame {
    
    public int getProgress(){
        return progressCounter;
    }
    
    public static void getNamesAndAdjectivies()throws IOException{
        names = new ArrayList();
        adjectives = new ArrayList();
        File name = new File("fNames.txt");
        File adj = new File("adjectives.txt");
        
        Scanner nameScanner = new Scanner(name);
        Scanner adjScanner = new Scanner(adj);
        
        while(nameScanner.hasNext()){
            names.add(nameScanner.next());
        }
        
        nameScanner.close();
        
        while(adjScanner.hasNext()){
            adjectives.add(adjScanner.nextLine());
        }
        
        adjScanner.close();
        
    }
    
    private Enemy generateEnemy(){
        int minA,maxA,minH,maxH, health, attack, randomName, randomAdj;
        String the = " The ";
        switch(progressCounter){
            case(1):
                minA = 2; 
                maxA = 3;
                
                minH = 3; 
                maxH = 5;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(2):
                minA = 2; 
                maxA = 4;
                
                minH = 6; 
                maxH = 8;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(3):
                minA = 3; 
                maxA = 5;
                
                minH = 9; 
                maxH = 11;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(4):
                minA = 4; 
                maxA = 6;
                
                minH = 14; 
                maxH = 16;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(5):
                minA = 6; 
                maxA = 8;
                
                minH = 19; 
                maxH = 21;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(6):
                minA = 8; 
                maxA = 10;
                
                minH = 24; 
                maxH = 26;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(7):
                minA = 10; 
                maxA = 12;
                
                minH = 29; 
                maxH = 31;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(8):
                minA = 12; 
                maxA = 14;
                
                minH = 34; 
                maxH = 36;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(9):
                minA = 14; 
                maxA = 16;
                
                minH = 39; 
                maxH = 41;
                health = ThreadLocalRandom.current().nextInt(minH, maxH + 1);
                attack = ThreadLocalRandom.current().nextInt(minA, maxA + 1);
                randomName = ThreadLocalRandom.current().nextInt(0, names.size());
                randomAdj = ThreadLocalRandom.current().nextInt(0, adjectives.size());
                return new Enemy(health, attack, names.get(randomName) + the + adjectives.get(randomAdj));
            case(10):
                health = 60;
                attack = 20;
                return new Enemy(health, attack, "CTHULHU");
            default:
                return null;
        }
    
    }

    public void startIntro(){
        spartPic.setVisible(false);
        vikingPic.setVisible(false);
        samPic.setVisible(false);
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        progressButton.setVisible(false);
        introScreen.setVisible(true);
        DefaultCaret caret = (DefaultCaret)introArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        introArea.append("Hello Challenger! Please enter your name and press enter:");
        Action action1;
        action1 = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                inputField.setVisible(false);
                progressButton.setVisible(true);
                introArea.append("\nYou are about to begin a journey of the ages, one where you will face many enemies.\n"
                        + "\nDuring the ancient times of roman rule, the colusseum was one of the biggest spectacles.\n"
                        + "\nPeople came from miles around to watch its glorious battles. \n"
                        + "\nLittle did we know, so did creatures from all realms of the milky way. \n"
                        + "\nSince the colousseum's end, these creatures have been building their own arena,\n"
                        + "\nlightyears away, deep inside the milkyway.\n"
                        + "\nThe first intergalactic games have begun, and you've been chosen to represent the human race.\n"
                        + "\nNow, who are you?\n");
                spartPic.setVisible(true);
                vikingPic.setVisible(true);
                samPic.setVisible(true);
                jRadioButton1.setSelected(true);
                jRadioButton1.setVisible(true);
                jRadioButton2.setVisible(true);
                jRadioButton3.setVisible(true);
                
            }
        };
        inputField.addActionListener(action1);
        
        Action action2;
        action2 = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int startHealth = 10, startAttack = 5;
                
                if(progressCounter == 0){
                    if(jRadioButton1.isSelected()){
                        player = new Player(startHealth, startAttack, inputField.getText() + " The Viking");
                    }else if(jRadioButton2.isSelected()){
                        player = new Player(startHealth, startAttack, inputField.getText() + " The Samurai");
                    }else{
                        player = new Player(startHealth, startAttack, inputField.getText() + " The Spartan");
                    }
                    spartPic.setVisible(false);
                    vikingPic.setVisible(false);
                    samPic.setVisible(false);
                    jRadioButton1.setVisible(false);
                    jRadioButton2.setVisible(false);
                    jRadioButton3.setVisible(false);
                    introArea.append("Welcome to the games " + player.getName() + "!\n");
                    progressCounter++;
                }else if(progressCounter == 1){
                    introArea.append("\nWhen you enter the arena you will be matched against dangerous opponents.\n"
                            +"To survive in battle youll need to know your battle options.\n\n"
                            
                            +"You and your opponent will both have three different choices while fighting.\n"
                            +"Attack, Block, Counter\n"
                            +"The amount of damage you do to each other depends on you and your opponents combination of moves.\n"
                            +"For instance,\n"
                            +"If you choose attack and your opponent chooses counter you will do your full damage to them.\n"
                            +"Similarly you can do half damage to your opponent if they block and you choose counter.\n"
                            +"However if you get caught attacking and your opponent blocks then you will do half of your damage to yourself.\n"
                            +"If you and your opponent choose attack, you both recieve full damage. Block will result in nothing happening, and counter will do half damage to each other.\n"
                            +"In this fashion different combinations of moves will lead to different outcomes.\n\n"
                            
                            +"As you progress and beat more enemies you will get more powerful,\n"
                            +"but so will they. \n\n"
                            
                            +"Every couple of rounds you will be able to upgrade the damage percentages of your moves.\n"
                            + "Such as,\n"
                            + "Block returns 60% damage to opponent.\n"
                            + "Attack increases attack damage to %110.\n"
                            + "Counter deals %60 damage to opponent.\n"
                            + "Each upgrade increases damage by %10 for that move.\n"
                            + "By upgrading certain characteristics you can adapt your strategy to different opponents.\n\n"
                            + "We wish you luck inside the arena.\n\n"
                            + "YOU'LL NEED IT..."
                    );
                    progressCounter++;
                }else if(progressCounter == 2){
                    introScreen.dispose();
                    try{
                        Thread.sleep(3000);
                    }catch(InterruptedException r){r.getMessage();}
                    progressCounter = 1;
                    startMainGame();
                }
            }
        };
       progressButton.addActionListener(action2);
        
    }
    
    public void startSpalsh() throws InterruptedException{
        splashScreen.pack();
        splashScreen.setVisible(true);
        Thread.sleep(5000);
        splashScreen.dispose();
    }
    
    private void updateGUI(){
        attackLabel.setText(Integer.toString(player.getDamage()));
        healthBar.setString(Integer.toString(player.getHealth()));
        healthBar.setValue((player.getHealth() * 100) / player.getStartHealth());
        livesValueLabel.setText(Integer.toString(player.getLives()));
        attackButton.setText("Attack: " + Integer.toString(player.getAttackDamage()));
        blockButton.setText("Block: " + Integer.toString((int)(currentEnemy.getDamage() * ( (player.getBlockUpgradePoints() + 5) * 0.1) )));
        counterButton.setText("Counter: " + Integer.toString(player.getCounterDamage()));
        attackValueLabel.setText(Integer.toString(currentEnemy.getDamage()));
        enemyHealthBar.setString(Integer.toString(currentEnemy.getHealth()));
        enemyHealthBar.setValue((currentEnemy.getHealth() * 100) / currentEnemy.getStartHealth());
    }
        
    private boolean checkWin(){
        if(player.getHealth() > 0){
            return currentEnemy.getHealth() <= 0;
        }else{
            return false;
        }
    }
    
    private void checkLoose(){
        if(player.getLives() == 1 && player.getHealth() <= 0){
            player.loseLife();
            updateGUI();
            mainTextArea.append("\n0 lives remaining.\n"
                    + "Humanity has been given their last chance.\n"
                    + "Your body is ripped apart and spread around the arena.\n"
                    + "Now the other species see Humanity's weakness.\n"
                    + "They travel to earth and feed upon it.\n"
                    + "Women and children are enslaved, Men are slaughtered.\n"
                    + "You have failed your kind\n");
            enemyNameLabel.setVisible(false);
            attackTitleLabel.setVisible(false);
            attackValueLabel.setVisible(false);
            enemyHealthLabel.setVisible(false);
            enemyHealthBar.setVisible(false);
            enemyPicture.setVisible(false);
            startButton.setText("Quit");
            startButton.setVisible(true);
            progressCounter = 11;
        }else if(player.getHealth() <= 0){
            player.loseLife();
            mainTextArea.append("\nYou have been beaten.\n"
                    + "You make humanity look weak.\n"
                    + "Your kind looks down upon you in shame.\n"
                    + "You have " + player.getLives() + " lives remaning.\n"
                    + "DO NOT FAIL THEM!\n");
            currentEnemy.resetHealth();
            player.resetHealth();
            updateGUI();
        }
    }
    
    private void goBackToMain(){
        upgradeScreen.setVisible(false);
        upgradeButton.setVisible(false);
        setVisible(true);
    }
    
    private void upgradePoints(){
        setVisible(false);
        attackUpgradeValueLabel.setText(Integer.toString(player.getAttackUpgradePoints()));
        blockUpgradeValueLabel.setText(Integer.toString(player.getBlockUpgradePoints()));
        counterUpgradeValueLabel.setText(Integer.toString(player.getCounterUpgradePoints()));
        upgradeScreen.setVisible(true); 
    }
    
    private void startNextRound(){
        enemyNameLabel.setVisible(false);
        attackTitleLabel.setVisible(false);
        attackValueLabel.setVisible(false);
        enemyHealthLabel.setVisible(false);
        enemyHealthBar.setVisible(false);
        enemyPicture.setVisible(false);
        startButton.setVisible(true);
        if(progressCounter == 9){
            player.upgradeStats(8, 2);
        }else if(progressCounter == 10){
            mainTextArea.append("\nYou have massacred everything laid before you.\n"
                    + "Nothing can beat you.\n"
                    + "The other species cower in fear.\n"
                    + "Humanity loves you,\n"
                    + "THEY WANT MORE!!!\n"
                    + "Overcome with power you destroy everyone and everything you can.\n"
                    + "Men, women and children fall victim to your bloodthirsty sword.\n"
                    + "The milky way grows dark as humanity rules over all and slaughters all.\n"
                    + "You are DESTRUCTION!! You are DEATH!! You are POWER!!\n"
                    + "Nothing can stop you.\n");
            startButton.setText("Quit");
        }else if(progressCounter % 2 == 0){
            mainTextArea.append("\nTime to upgrade! Click the upgrade button then one of the buttons on the next screen to upgrade a move.\n"
                                + "Or, if you are feeling confident then press start to skip your upgrades. Your health and attack will not increase and you would lose this upgrade point.\n");
            upgradeButton.setVisible(true);
            player.resetHealth();
        }else{
            player.upgradeStats(4, 1);
        }
        updateGUI();
    }
    
    private void startBattle(){
        enemyNameLabel.setText(currentEnemy.getName());
        attackValueLabel.setText(Integer.toString(currentEnemy.getDamage()));
        enemyHealthBar.setValue((currentEnemy.getHealth() * 100) / currentEnemy.getHealth());
        enemyHealthBar.setString(Integer.toString(currentEnemy.getHealth()));
        enemyNameLabel.setVisible(true);
        attackTitleLabel.setVisible(true);
        attackValueLabel.setVisible(true);
        enemyHealthLabel.setVisible(true);
        enemyHealthBar.setVisible(true);
        enemyPicture.setVisible(true);
        startButton.setVisible(false);
        upgradeButton.setVisible(false);
        updateGUI();     
    }
    
    public void startMainGame(){
        nameLabel.setText(player.getName());
        attackLabel.setText(Integer.toString(player.getDamage()));
        healthBar.setString(Integer.toString(player.getHealth()));
        enemyNameLabel.setVisible(false);
        attackTitleLabel.setVisible(false);
        attackValueLabel.setVisible(false);
        enemyHealthLabel.setVisible(false);
        enemyHealthBar.setVisible(false);
        upgradeButton.setVisible(false);
        enemyPicture.setVisible(false);
        DefaultCaret caret = (DefaultCaret)mainTextArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        setVisible(true);
        mainTextArea.append("Press start.\n");
  
        Action battleStartAction;
        battleStartAction = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                switch(progressCounter){
                    case(1):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_212_orc.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour first opponent is..."
                                + "THE ORC\n"
                                + "For as long as time the orcs have reigned over middle earth.\n"
                                + "Their brutal fighting and merciless tactics have spread fear everywhere they roam.\n"
                                + "Mutilated bodies and homes burnt to the ground,\n"
                                + "is all that will be left after the orcs have found you.\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(2):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_1_robotic_man.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "THE CYBORG\n"
                                + "Half human, HAlf robot, All deadly precision.\n"
                                + "Outfitted with laser tracking and fully automatic guns,\n"
                                + "The cyborg is the most notorious bountyhunter in the galaxy.\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(3):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_3_yeti.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "THE YETI\n"
                                + "Born and raised in temperatures far below 0,\n"
                                + "the Yeti has fur thick and strong enough to block the sharpest of blades.\n"
                                + "Its life in the mountains has given it muscles that could rip a human in half.\n"
                                + "Hopefully, you can stay out of his grasp.\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(4):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_4_minotaur.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "THE MINOTAUR\n"
                                + "The minotaur wileds two 8 foot tall battle axes.\n"
                                + "A hit from one of these could easily rip a small car in half.\n"
                                + "And even if those dont get you, \n"
                                + "his sharpened ivory horns will finish you off.\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(5):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_6_giant.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "THE GIANT\n"
                                + "The giant is a mythical creature that lives deep in the forest.\n"
                                + "Usually he feasts on deer, crushing them in his hands and swallowing them whole.\n"
                                + "However if a human wanders into the forest, they've been known to eat them alive,\n"
                                + "picking off their appendages one by one... good luck\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(6):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_5_alien.png")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "THE ALIEN\n"
                                + "With two sets of razor sharp teeth, claws, and the ability to spit acid,\n"
                                + "the alien can rip apart his prey in seconds.\n"
                                + "The alien is known to board passing shuttles and feast on the passengers inside.\n"
                                + "Hopefully you don't end your run in the colosseum as a meal.\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(7):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_8_robot.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "THE R2-DESTROYOU\n"
                                + "Created by the japanese in 2017 as a war machine,\n"
                                + "the R2-DESTROYOU was used to take over the earth.\n"
                                + "With Mechanized plasma guns and hydraulics able to crush a tank,\n"
                                + "the R2-DESTROYOU tore through every other country and burnt it to the ground.\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(8):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_7_golem.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "THE FIRE GOLEM\n"
                                + "Forged in the depths of a volcano, the fire golem is made of molten lava.\n"
                                + "Burning at over a thousand degrees fahrenheit,\n"
                                + "the fire golem chooses to either melt his enemies or simply crush them to death.\n"
                                + "Things are about to get hot.\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(9):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_9_demon.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "THE DEMON\n"
                                + "A spawn of satan himself, the demon is purely and wholey evil.\n"
                                + "He often possess his victims to use for his own will,\n"
                                + "before he devours their soul and leaves them as a shell of their former self.\n"
                                + "If you are defeated, he shall crush your skull in his hands and feast on you.\n"
                                + currentEnemy.toString());
                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(10):
                        enemyPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enemyImages/rsz_10_cthulu.jpg")));
                        currentEnemy = generateEnemy();
                        mainTextArea.append("\nYour next opponent is...\n"
                                + "CTHULU\n"
                                + "Cthulu is the god of nightmares.\n"
                                + "Since the beginning of time he has ruled over all and destroyed all.\n"
                                + "Rather than destroy worlds he swallows them whole and consumes all beings.\n"
                                + "This is the ruler of the universe and your last challenger."
                                + "Luck will not help you here.\n"
                                + currentEnemy.toString());

                        try{
                            Thread.sleep(1000);
                        }catch(InterruptedException i){}
                        startBattle();
                        break;
                    case(11):
                        System.exit(0);
                        break;
                }
            }
        };
        startButton.addActionListener(battleStartAction);
        
        Action upgradeAction;
        upgradeAction = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                upgradePoints();
            }
        };
        upgradeButton.addActionListener(upgradeAction);
        
        Action attackAction;
        attackAction = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(enemyPicture.isShowing()){
                    b.attack(player, currentEnemy);
                    mainTextArea.append("\n" + b.lastMessage + "\n");
                    updateGUI();
                    checkLoose();
                    if(checkWin()){
                        mainTextArea.append("\nSoaked in the blood of your enemy...\n"
                                + "YOU EMERGE VICTORIOUS!!\n"
                                + "Humanity rallies behind you,\n "
                                + "as you mercilessly slay another victim.\n"
                                + "Do not fail your kind.\n"
                                + "KILL AGAIN!\n");
                        startNextRound();
                        progressCounter++;
                    }
                }
                
            }
        };
        attackButton.addActionListener(attackAction);
        
        Action blockAction;
        blockAction = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(enemyPicture.isShowing()){
                    b.block(player, currentEnemy);
                    mainTextArea.append("\n" + b.lastMessage + "\n");
                    updateGUI();
                    checkLoose();
                    if(checkWin()){
                                 mainTextArea.append("\nSoaked in the blood of your enemy...\n"
                                + "YOU EMERGE VICTORIOUS!!\n"
                                + "Humanity rallies behind you,\n "
                                + "as you mercilessly slay another victim.\n"
                                + "Do not fail your kind.\n"
                                + "KILL AGAIN!\n");
                        startNextRound();
                        progressCounter++;
                    }
                }
            }
        };
        blockButton.addActionListener(blockAction);
        
        Action counterAction;
        counterAction = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(enemyPicture.isShowing()){
                    b.counter(player, currentEnemy);
                    mainTextArea.append("\n" + b.lastMessage + "\n");
                    updateGUI();
                    checkLoose();
                    if(checkWin()){
                        mainTextArea.append("\nSoaked in the blood of your enemy...\n"
                                + "YOU EMERGE VICTORIOUS!!\n"
                                + "Humanity rallies behind you,\n "
                                + "as you mercilessly slay another victim.\n"
                                + "Do not fail your kind.\n"
                                + "KILL AGAIN!\n");
                        startNextRound();
                        progressCounter++;
                    }
                }
            }
        };
        counterButton.addActionListener(counterAction);
        
        Action attackUpgradeAction;
        attackUpgradeAction = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                player.upgradeAttack();
                player.upgradeStats(4, 1);
                goBackToMain();
                updateGUI();
            }
        };
        upgradeAttackButton.addActionListener(attackUpgradeAction);
        
        Action blockUpgradeAction;
        blockUpgradeAction = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                player.upgradeBlock();
                player.upgradeStats(4, 1);
                goBackToMain();
                updateGUI();
            }
        };
        upgradeBlockButton.addActionListener(blockUpgradeAction);
        
        Action counterUpgradeAction;
        counterUpgradeAction = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                player.upgradeCounter();
                player.upgradeStats(4, 1);
                goBackToMain();
                updateGUI();
            }
        };
        upgradeCounterButton.addActionListener(counterUpgradeAction);
    }
   
    
    /**
     * Creates new form GUI
     */
    public MAINGUI() {
        progressCounter = 0;
        b = new Battle();
        try{
            getNamesAndAdjectivies();
        }catch(IOException e){}
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashScreen = new javax.swing.JFrame();
        imageSplash = new javax.swing.JLabel();
        introScreen = new javax.swing.JFrame();
        vikingPic = new javax.swing.JLabel();
        samPic = new javax.swing.JLabel();
        spartPic = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        inputField = new javax.swing.JTextField();
        progressButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        introArea = new javax.swing.JTextArea();
        introArea.setEditable(false);
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(127, 0), new java.awt.Dimension(127, 0), new java.awt.Dimension(127, 32767));
        buttonGroup1 = new javax.swing.ButtonGroup();
        upgradeScreen = new javax.swing.JFrame();
        upgradeAttackButton = new javax.swing.JButton();
        upgradeBlockButton = new javax.swing.JButton();
        upgradeCounterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        attackUpgradeValueLabel = new javax.swing.JLabel();
        blockUpgradeValueLabel = new javax.swing.JLabel();
        counterUpgradeValueLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        healthBar = new javax.swing.JProgressBar();
        attackLabel = new javax.swing.JLabel();
        enemyNameLabel = new javax.swing.JLabel();
        enemyHealthLabel = new javax.swing.JLabel();
        attackTitleLabel = new javax.swing.JLabel();
        attackValueLabel = new javax.swing.JLabel();
        counterButton = new javax.swing.JButton();
        blockButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        livesValueLabel = new javax.swing.JLabel();
        enemyHealthBar = new javax.swing.JProgressBar();
        startButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainTextArea = new javax.swing.JTextArea();
        mainTextArea.setEditable(false);
        upgradeButton = new javax.swing.JButton();
        enemyPicture = new javax.swing.JLabel();

        splashScreen.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        splashScreen.setTitle("Intergalactic Colosseum");
        splashScreen.setAlwaysOnTop(true);
        splashScreen.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        splashScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        splashScreen.setEnabled(false);
        splashScreen.setLocation(new java.awt.Point(0, 0));
        splashScreen.setUndecorated(true);
        splashScreen.setPreferredSize(new java.awt.Dimension(768, 600));
        splashScreen.setResizable(false);
        splashScreen.setSize(new java.awt.Dimension(768, 600));

        imageSplash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergalactic/colosseum/Images/rsz_space_arena_revised-page-001.jpg"))); // NOI18N

        javax.swing.GroupLayout splashScreenLayout = new javax.swing.GroupLayout(splashScreen.getContentPane());
        splashScreen.getContentPane().setLayout(splashScreenLayout);
        splashScreenLayout.setHorizontalGroup(
            splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashScreenLayout.createSequentialGroup()
                .addComponent(imageSplash, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        splashScreenLayout.setVerticalGroup(
            splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashScreenLayout.createSequentialGroup()
                .addComponent(imageSplash)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        splashScreen.pack();
        splashScreen.setLocationRelativeTo(null);

        introScreen.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        introScreen.setTitle("Intergalactic Colosseum");
        introScreen.setResizable(false);
        introScreen.setSize(new java.awt.Dimension(753, 403));

        vikingPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergalactic/colosseum/Images/rsz_viking.jpg"))); // NOI18N
        vikingPic.setText("l");

        samPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergalactic/colosseum/Images/rsz_samurai.jpg"))); // NOI18N

        spartPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergalactic/colosseum/Images/rsz_spartan.jpg"))); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Viking");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Samurai");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("Spartan");

        inputField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        progressButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        progressButton.setText("Next");

        introArea.setColumns(20);
        introArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        introArea.setRows(5);
        jScrollPane1.setViewportView(introArea);

        jScrollPane4.setViewportView(jScrollPane1);

        javax.swing.GroupLayout introScreenLayout = new javax.swing.GroupLayout(introScreen.getContentPane());
        introScreen.getContentPane().setLayout(introScreenLayout);
        introScreenLayout.setHorizontalGroup(
            introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(introScreenLayout.createSequentialGroup()
                        .addComponent(vikingPic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(introScreenLayout.createSequentialGroup()
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(introScreenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(samPic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introScreenLayout.createSequentialGroup()
                                .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(progressButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introScreenLayout.createSequentialGroup()
                                .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(spartPic)
                        .addContainerGap())
                    .addGroup(introScreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2)
                        .addGap(233, 233, 233)
                        .addComponent(jRadioButton3)
                        .addGap(22, 22, 22))))
            .addComponent(jScrollPane4)
        );
        introScreenLayout.setVerticalGroup(
            introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introScreenLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(introScreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(vikingPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spartPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(introScreenLayout.createSequentialGroup()
                                .addComponent(progressButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(introScreenLayout.createSequentialGroup()
                                .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(introScreenLayout.createSequentialGroup()
                                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introScreenLayout.createSequentialGroup()
                                        .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(11, 11, 11)))
                                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introScreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addComponent(samPic, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(introScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        upgradeScreen.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        upgradeScreen.setTitle("Intergalactic Colosseum");
        upgradeScreen.setResizable(false);
        upgradeScreen.setSize(new java.awt.Dimension(629, 368));

        upgradeAttackButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upgradeAttackButton.setText("Upgrade Attack");

        upgradeBlockButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upgradeBlockButton.setText("Upgrade Block");

        upgradeCounterButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upgradeCounterButton.setText("Upgrade Counter");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Attack");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Block");

        attackUpgradeValueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attackUpgradeValueLabel.setText("Current Level");

        blockUpgradeValueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blockUpgradeValueLabel.setText("Current Level");

        counterUpgradeValueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        counterUpgradeValueLabel.setText("Current Level");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Counter");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setText("Upgrades");

        javax.swing.GroupLayout upgradeScreenLayout = new javax.swing.GroupLayout(upgradeScreen.getContentPane());
        upgradeScreen.getContentPane().setLayout(upgradeScreenLayout);
        upgradeScreenLayout.setHorizontalGroup(
            upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upgradeScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(upgradeScreenLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upgradeScreenLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(attackUpgradeValueLabel))
                    .addGroup(upgradeScreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blockUpgradeValueLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upgradeScreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterUpgradeValueLabel)))
                .addGap(41, 41, 41)
                .addGroup(upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(upgradeCounterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upgradeBlockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upgradeAttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        upgradeScreenLayout.setVerticalGroup(
            upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upgradeScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(61, 61, 61)
                .addGroup(upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attackUpgradeValueLabel)
                    .addComponent(upgradeAttackButton))
                .addGroup(upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockUpgradeValueLabel)
                    .addComponent(upgradeBlockButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upgradeCounterButton)
                    .addGroup(upgradeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(counterUpgradeValueLabel)))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Intergalactic Colosseum");
        setResizable(false);
        setSize(new java.awt.Dimension(684, 360));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Attack:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Health:");

        attackButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attackButton.setText("Attack");

        healthBar.setValue(100);
        healthBar.setStringPainted(true);

        attackLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attackLabel.setText("11");

        enemyNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enemyNameLabel.setText("EnemyName");

        enemyHealthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enemyHealthLabel.setText("Health:");

        attackTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attackTitleLabel.setText("Attack:");

        attackValueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attackValueLabel.setText("jLabel9");

        counterButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        counterButton.setText("Counter");

        blockButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blockButton.setText("Block");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Lives:");

        livesValueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        livesValueLabel.setText("3");

        enemyHealthBar.setValue(100);
        enemyHealthBar.setStringPainted(true);

        startButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startButton.setText("Start");

        mainTextArea.setColumns(20);
        mainTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mainTextArea.setRows(5);
        jScrollPane2.setViewportView(mainTextArea);

        jScrollPane3.setViewportView(jScrollPane2);

        upgradeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upgradeButton.setText("Upgrade");

        enemyPicture.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(livesValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(healthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(counterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upgradeButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(attackTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(attackValueLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(enemyPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(enemyNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(enemyHealthLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel)
                        .addComponent(healthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(attackLabel)
                            .addComponent(jLabel10)
                            .addComponent(livesValueLabel))
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startButton)
                            .addComponent(upgradeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enemyHealthLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(attackTitleLabel)
                                .addComponent(attackValueLabel)
                                .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enemyNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackButton;
    private javax.swing.JLabel attackLabel;
    private javax.swing.JLabel attackTitleLabel;
    private javax.swing.JLabel attackUpgradeValueLabel;
    private javax.swing.JLabel attackValueLabel;
    private javax.swing.JButton blockButton;
    private javax.swing.JLabel blockUpgradeValueLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton counterButton;
    private javax.swing.JLabel counterUpgradeValueLabel;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel enemyHealthLabel;
    private javax.swing.JLabel enemyNameLabel;
    private javax.swing.JLabel enemyPicture;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JProgressBar healthBar;
    private javax.swing.JLabel imageSplash;
    private javax.swing.JTextField inputField;
    private javax.swing.JTextArea introArea;
    private javax.swing.JFrame introScreen;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel livesValueLabel;
    private javax.swing.JTextArea mainTextArea;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton progressButton;
    private javax.swing.JLabel samPic;
    private javax.swing.JLabel spartPic;
    private javax.swing.JFrame splashScreen;
    private javax.swing.JButton startButton;
    private javax.swing.JButton upgradeAttackButton;
    private javax.swing.JButton upgradeBlockButton;
    private javax.swing.JButton upgradeButton;
    private javax.swing.JButton upgradeCounterButton;
    private javax.swing.JFrame upgradeScreen;
    private javax.swing.JLabel vikingPic;
    // End of variables declaration//GEN-END:variables
    public Player player;
    public Enemy currentEnemy;
    private int progressCounter;
    private static ArrayList<String> names;
    private static ArrayList<String> adjectives;
    Battle b;
}
