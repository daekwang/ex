package java0725_collection.prob;

class SmartPhone{
	private String productId;
	private String name;
	private int price;
	private String maker;
	private int amount;

	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	
	
	@Override
	public String toString(){
  return "제품번호 : "+productId+", 제품명 : "+name+", 수량 : "+amount+", 가격 : "+price+", 수량 : "+amount+", 제조사 : "+maker;
	}
}




