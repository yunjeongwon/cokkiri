package corinee.cokkiri.request;

import lombok.Data;

@Data
public class UserSignupRequest {
    private String email;

    private String password;

    private String nickname;
}