package lti.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "table_stateNodalOfficer")
public class StateNodalOfficer {
	@Id
	@SequenceGenerator(name = "sno_seq", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "sno_seq", strategy = GenerationType.SEQUENCE)
	int stateNodalOfficerId;
	String name;
	StateType type;

	// confused about (StateNodalOfficr-User) relationship need to discuss
	
	public int getStateNodalOfficerId() {
		return stateNodalOfficerId;
	}

	public void setStateNodalOfficerId(int stateNodalOfficerId) {
		this.stateNodalOfficerId = stateNodalOfficerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateType getType() {
		return type;
	}

	public void setType(StateType type) {
		this.type = type;
	}

}
