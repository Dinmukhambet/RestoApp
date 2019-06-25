package kz.devyellow.RestoApp.modules.auth;

import lombok.Getter;
import lombok.Setter;

public class RestoUserDto {

    @Getter
    @Setter
    private String login;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String email;
}
