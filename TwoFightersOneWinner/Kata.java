package TwoFightersOneWinner;

public class Kata {
        public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
            int damage1 =   (int)Math.ceil((double)fighter1.health / fighter2.damagePerAttack);
            int damage2 = (int)Math.ceil((double)fighter2.health/ fighter1.damagePerAttack);

            if( damage1 > damage2){
                return fighter2.name;
            } else if(damage1 < damage2){
                return fighter1.name;
            }
            return firstAttacker;

        }

        public class Fighter{

            public String name;
            public int health, damagePerAttack;
            public Fighter(String name, int health, int damagePerAttack) {
                this.name = name;
                this.health = health;
                this.damagePerAttack = damagePerAttack;
            }
    }

    public void  main(String[] args) {


    }
}
