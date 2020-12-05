public class Cerveja extends Produto {

    private double teorAlcoolico;
    private String prazoValidade;

    Cerveja(String nome, double preco){
        super(nome, preco);
    }

    public void setTeorAlcoolico(double teorAlcoolico){
        this.teorAlcoolico = teorAlcoolico;
    }
    public void setPrazoValidade(String prazoValidade){
        this.prazoValidade = prazoValidade;
    }

    public double getTeorAlcoolico(){
        return this.teorAlcoolico;
    }

    public String getPrazoValidade(){
        return this.prazoValidade;
    }

}
