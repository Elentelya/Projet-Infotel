package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RegistrationId implements java.io.Serializable {
	
	 @Column(name = "library")
	    private int registrationLibrary;

	    @Column(name = "member")
	    private int registrationMember;

		public RegistrationId() {
			super();
			// TODO Auto-generated constructor stub
		}

		public RegistrationId(int registrationLibrary, int registrationMember) {
			super();
			this.registrationLibrary = registrationLibrary;
			this.registrationMember = registrationMember;
		}

		public int getRegistrationLibrary() {
			return registrationLibrary;
		}

		public void setRegistrationLibrary(int registrationLibrary) {
			this.registrationLibrary = registrationLibrary;
		}

		public int getRegistrationMember() {
			return registrationMember;
		}

		public void setRegistrationMember(int registrationMember) {
			this.registrationMember = registrationMember;
		}



}
