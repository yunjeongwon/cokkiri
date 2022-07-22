package corinee.cokkiri.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class User {

    @Id
    private String email;
    private String password;
    private String nickname;
    private String refreshToken;
    private Long authState;

    public User(){

    }

}
