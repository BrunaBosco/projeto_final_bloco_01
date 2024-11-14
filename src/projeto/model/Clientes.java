package projeto.model;

public class Clientes extends Model {

    private float troco;

    public Clientes(int id, String produto, String cliente, float valor, float preco, float troco) {
        super(id, produto, cliente, valor, preco);
        this.troco = valor - preco;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

    public boolean comprar(int id, String produto, String cliente, float valor, float preco) {
       
        if (valor < preco) {
            System.out.println("\nSaldo Insuficiente!");
            return false;
        }
        return true;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Troco da compra: " + this.troco);
    }
}
