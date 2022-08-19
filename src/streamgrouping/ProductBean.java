package streamgrouping;

public class ProductBean {

	private int id;
	private String productDec;
	private String productCat;
	private String productGrp;
	private int quantity;

	public ProductBean(int id, String productDec, String productCat, String productGrp, int quantity) {
		super();
		this.id = id;
		this.productDec = productDec;
		this.productCat = productCat;
		this.productGrp = productGrp;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductDec() {
		return productDec;
	}

	public void setProductDec(String productDec) {
		this.productDec = productDec;
	}

	public String getProductCat() {
		return productCat;
	}

	public void setProductCat(String productCat) {
		this.productCat = productCat;
	}

	public String getProductGrp() {
		return productGrp;
	}

	public void setProductGrp(String productGrp) {
		this.productGrp = productGrp;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", productDec=" + productDec + ", productCat=" + productCat + ", productGrp="
				+ productGrp + ", quantity=" + quantity + "]";
	}

}
