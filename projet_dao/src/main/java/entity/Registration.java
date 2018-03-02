package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration implements java.io.Serializable {

	@EmbeddedId
	@Column(name = "library_id")
	private RegistrationId registrationId;
	
    private Date registrationDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "library", insertable = false, updatable = false)
    private Library registrationLibrary;

    // bi-directional many-to-one association to FournisseurDepartement
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member", insertable = false, updatable = false)
    private Member registrationMember;
    
	

	public Registration() {
		// TODO Auto-generated constructor stub
	}

}
