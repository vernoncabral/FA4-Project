package user.dto;


public class Wishlist {
	Integer buyerid;
	Integer prodid;
	
	public Integer getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(Integer buyerid) {
		this.buyerid = buyerid;
	}
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}
	
	// Converts Entity into DTO
	public static Wishlist valueOf(user.entity.Wishlist wishlist) {
		Wishlist wishlistdto = new Wishlist();
		wishlistdto.setBuyerid(wishlist.getBuyerId());
		wishlistdto.setProdid(wishlist.getProdId());
		return wishlistdto;
	}
	
	@Override
	public String toString() {
		return "WishlistDTO [BuyerId="+ buyerid + "ProdId=" +prodid+"]";
	}
	

}
