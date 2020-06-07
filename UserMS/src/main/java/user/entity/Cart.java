package user.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class Cart {
	 	@EmbeddedId
		@Column(name = "buyer_id", nullable = false)
		Integer buyerId;
	    @EmbeddedId
		@Column(name = "prod_id", nullable = false)
		Integer prodId;
	    @Column(name = "quantity", nullable = false)
		Integer quantity;
		public Integer getBuyerId() {
			return buyerId;
		}
		public void setBuyerId(Integer buyerId) {
			this.buyerId = buyerId;
		}
		public Integer getProdId() {
			return prodId;
		}
		public void setProdId(Integer prodId) {
			this.prodId = prodId;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
}