package password.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {

    private String nom;
    private String password;
	public String getUsername() {
		return nom;
	}
	public void setUsername(String username) {
		this.nom = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}