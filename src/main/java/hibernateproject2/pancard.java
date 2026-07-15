package hibernateproject2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class pancard {
	public String getPan_no() {
		return pan_no;
	}


	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	@Id
	String pan_no;
}


