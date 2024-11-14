package projeto.model;

public abstract class Model {
	
	private int id;
	private String produto;
	private String cliente;
	private float valor;
	private float preco;
	
	public Model(int id, String produto, String cliente, float valor, float preco) {
		super();
		this.id = id;
		this.produto = produto;
		this.cliente = cliente;
		this.valor = valor;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public boolean comprar(float valor) {

	    if (this.getPreco() > valor) {
	        System.out.println("\n Quantia Insuficiente!");
	        return false;
	    }

	    this.setPreco(this.getPreco() - valor);
	    return true;
	}
	
	
	public void visualizar() {

	    String tipo = "";

	    System.out.println("\n-------------------------------------------\n");
	    System.out.println("Cadastro: ");
	    System.out.println("\n-------------------------------------------\n");
	    System.out.println("Nome do Cliente: " + this.cliente);
	    System.out.println("Id do cadastro: " + id);
	    System.out.println("Produto: " + this.produto);
	    System.out.println("Preço: " + this.preco);
	    System.out.println("Valor fornecido pelo cliente: " + this.valor);
	}




	
	
	
	

}
