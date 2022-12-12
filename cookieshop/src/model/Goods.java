package model;

public class Goods {
	private int id;
	private String name;
	private String cover;
	private String image1;
	private String image2;
	private float price;
	private String intro;
	private int stock;
	
	private Type type;
	
	private boolean isNew;//新品
	private boolean isHot;//热销
	private boolean isScroll;//条幅
	
	public void setTypeid(int typeid) {
		if(type==null) {
			type=new Type();
		}
		type.setId(typeid);
	}
	
	public void setTypename(String typename) {
		if(type==null) {
			type=new Type();
		}
		type.setName(typename);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public boolean isHot() {
		return isHot;
	}
	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}
	public boolean isScroll() {
		return isScroll;
	}
	public void setScroll(boolean isScroll) {
		this.isScroll = isScroll;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", cover=" + cover + ", image1=" + image1 + ", image2=" + image2
				+ ", price=" + price + ", intro=" + intro + ", stock=" + stock + ", type=" + type + ", isNew=" + isNew
				+ ", isHot=" + isHot + ", isScroll=" + isScroll + "]";
	}
	
	
}
