package tp7;

class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int anne_fab,double rayon) {
        super(anne_fab);
        this.rayon = rayon;
    }
    public double Surface(){
        return 3.14 * rayon * rayon;

    }

}
