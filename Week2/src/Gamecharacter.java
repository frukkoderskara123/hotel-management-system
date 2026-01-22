class Gamecharacter {
    private String name;
    private int health;
    private int damage;
    public Gamecharacter(String name,int health,int damage) {
        this.name=name;
        if (health>=0 && health<=100) {
            this.health=health;
        }
        this.damage=damage;
    }
    public void attack(Gamecharacter target) {
        target .takedamage(this.damage);
        System.out.printf( "[%s] attacked [%s] for [%d] damage.",this.name,target.name,this.damage);
    }
    public void takedamage(int amount) {
        this.health-=amount;
        if (this.health<0) {
            this.health=0;
        }
        System.out.printf("[%s] took [%d] damage. Remaining HP: [%d]\n",this.name,amount,this.health);




    }

}
class palaadin extends Gamecharacter {
    int armor;
    public palaadin(String name,int health,int damage,int armor) {
        super(name,health,damage);// çoçuk class için constructor da super kullanmalısın:çünkü çoçuk klass babanın private yada public olsun super kullanması lazım erişmek için.
        this.armor=armor;
    }
    @Override
    public void takedamage() {
        

    }

}