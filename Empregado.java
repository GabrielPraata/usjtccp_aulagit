public class Empregado{
    private string nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public double calculaSalario (){
        switch (tipo){
            case 1:
            return salario;
            case 2:
            return salario + salario * comissao;
            case 3:
            return salario + bonus;
        }
    }
    public string getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(string nome) {
        this.nome = nome;
    }


}
