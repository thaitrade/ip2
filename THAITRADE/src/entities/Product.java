package entities;

public class Product {

	private String nomeProduto;
	private String descricaoProduto;
	private String segmentoProduto;
	private Double precoChProduto;
	private Double precoBRProduto;
	private Double impostosProduto;
	private Double pesoProduto;
	private String tamanhoProduto;
	private Boolean ativoProduto; // se o produto esta ativo na empresa ou ja foi finalizado
	private String admProduto; // tratamento administrativo do produto
	private String hsProduto; // HS Code do produto
	private String ncmProduto; // NCM do produto
	private String packingProduto; // como o produto vem embalado
	private String packingQuantidadeProduto; // quantas unidades por embalagem
	private String quantidadeProduto; // quantidade de produtos ou unitario
	private String clienteProduto; // cliente vinculado ao produto
	private String funcionarioProduto; // responsavel pelo processamento do produto
	private String tarefasProduto; // o que precisa ser feito com relação a este produto
	private String corProduto; // cor do produto
	private String variaProduto; // variaçãos do produto
	private String vendedorProduto; // Qual vendedor Thai responsável pelo produto
	private String vinculoProduto; // se o produto e vinculado a outro produto
	private Double comissaoProduto; // comissao gerada para o vendedor
	private Double lucroProduto; // lucro gerado em cenario atual
	private String imagemProduto; // imagens do produto
	private String imagem1Produto; // imagem principal a ser exibida
	private String especificaProduto; // especificações técnicas do produto
	private String gmProduto; // quem eh o gerente comercial do produto
	private String origemProduto; // qual pais o produto e fabricado
	private String fabricanteProduto; // quem fabrica esse produto
	private String fornecedorProduto; // se nao eh fabricado quem nos vende
	private int codigoProduto; // codigo interno do produto
	private Double geraCodProduto; // variavel que recebe codigo gerado
	private String barcodeProduto; // codigo de barras do produto
	private String generoProduto; // masculino feminino unisex
	private String estoqueProduto; // estoque nosso ou do cliente
	private String statusProduto; // em que fase da operação esta o produto
	private String marcaProduto; // qual a marca do produto
	private Boolean oemProduto; // esse produto eh OEM ?
	private String logoProduto; // imagem logo produto
	private String arteProduto; // arquivo com a arte do produto

	public Product() {

		int cod = peganumero();
		this.codigoProduto = cod;

	};

	public int peganumero() {
		return 0;

		// pegar numero no banco de dados
		// incrementar numero
		// validar numero
		// retornar numero

	}

}
