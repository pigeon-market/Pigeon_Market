package sell.model.vo;

import java.util.Date;

public class Product {

	public int productNo;
	public String userId;
	public int price;
	public String category_Code;
	public String approval;
	public String product_Title;
	public String product_IMG;
	public String product_Contents;
	public String product_File;
	public Date reg_Date;
	public String state;
	
	public Product() {
		
	}

	public Product(int productNo, String userId, int price, String category_Code, String approval, String product_Title,
			String product_IMG, String product_Contents, String product_File, Date reg_Date, String state) {
		super();
		this.productNo = productNo;
		this.userId = userId;
		this.price = price;
		this.category_Code = category_Code;
		this.approval = approval;
		this.product_Title = product_Title;
		this.product_IMG = product_IMG;
		this.product_Contents = product_Contents;
		this.product_File = product_File;
		this.reg_Date = reg_Date;
		this.state = state;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory_Code() {
		return category_Code;
	}

	public void setCategory_Code(String category_Code) {
		this.category_Code = category_Code;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public String getProduct_Title() {
		return product_Title;
	}

	public void setProduct_Title(String product_Title) {
		this.product_Title = product_Title;
	}

	public String getProduct_IMG() {
		return product_IMG;
	}

	public void setProduct_IMG(String product_IMG) {
		this.product_IMG = product_IMG;
	}

	public String getProduct_Contents() {
		return product_Contents;
	}

	public void setProduct_Contents(String product_Contents) {
		this.product_Contents = product_Contents;
	}

	public String getProduct_File() {
		return product_File;
	}

	public void setProduct_File(String product_File) {
		this.product_File = product_File;
	}

	public Date getReg_Date() {
		return reg_Date;
	}

	public void setReg_Date(Date reg_Date) {
		this.reg_Date = reg_Date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", userId=" + userId + ", price=" + price + ", category_Code="
				+ category_Code + ", approval=" + approval + ", product_Title=" + product_Title + ", product_IMG="
				+ product_IMG + ", product_Contents=" + product_Contents + ", product_File=" + product_File
				+ ", reg_Date=" + reg_Date + ", state=" + state + "]";
	}
	
	
}
