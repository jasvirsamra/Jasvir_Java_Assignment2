package utility;

import warrior.Warrior;

public class Ink {

  public Ink() {
    // do nothing
  } // contructor

  // Welcome Message
  public void welcomeMessage() {
    System.out.println("""
      __        __             _             ____   ___ ____  _  _   
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |  
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_ 
        \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|  
    """);
  }
  // Warrior Menu
  public void printWarriorMenu() {
    System.out.println("Select a Type: \n1) Human (Base Health: 75)\n2) Elf (Base Health: 50)\n3) Orc (Base Health:200 )");
  }

  // Weapon Menu
  public void printWeaponMenu() {
    System.out.println("Select a Weapon: \n1) Dagger (Damage amount:50)\n2) Sword(Damage amount:150)\n3) Axe (Damage amount:250)");
  }
  
  // Armor Menu
  public void printArmourMenu() {
    System.out.println("Armour Pick: \n1) Leather (Amountlevel:50)\n2) Chainmail (Amountlevel:150)\n3) Platemail(Amountlevel:250)");
  }

  // Attack Menu
  public void printAttackMenu() {
    System.out.println("\nAttack Type: \n1) Normal\n2) Heavy");
  }

  // Print Stats
  public void printStats(Warrior pWarrior, Warrior eWarrior) {
    System.out.printf("%-25s (%s)\n", "Player: ", pWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n", 
      pWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", 
      pWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n", 
      pWarrior.getDexterity());
    System.out.printf("%-25s (%s)\n", "Enemy: ", eWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n", 
      eWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", 
      eWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n", 
      eWarrior.getDexterity());
  } // printStats()

  // GameOver Message
  public void printGameOver(String winner) {
    System.out.printf("""
         __ __
      .-',,^,,'.
     / \\(0)(0)/ \\
     )/( ,_"_,)\\(
     `  >-`~(   ' 
   _N\\ |(`\\ |___
   \\' |/ \\ \\/_-,)
    '.(  \\`\\_<
       \\ _\\|
        | |_\\_
        \\_,_>-'
    winner: %s
        """, winner);
  } // printGameOver()

} // class