package tp7;

abstract class Ustensile {
    protected int anne_fab;

    public Ustensile(int anne_fab) {
        this.anne_fab = anne_fab;
    }

    public double Valeur() {
        int age =2019-anne_fab;
        if (age < 50) {
            return 0;
        }
        return age-50;
    }
}
