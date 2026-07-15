package hibernateproject2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class person {
	@Column
	String p_name;
	@Id
	int p_id;
	@Column
	long ph_no;
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	
	@OneToOne
	pancard p1;
	public pancard getP1() {
		return p1;
	}
	public void setP1(pancard p1) {
		this.p1 = p1;
	}
	

}
