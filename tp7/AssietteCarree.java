package tp7;

class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int anne_fab,double cote) {
        super(anne_fab);
        this.cote = cote;
    }
    public double Surface(){
        return cote * cote;

    }
    public double Valeur(){
        return 5 * super.Valeur();
    }
}
