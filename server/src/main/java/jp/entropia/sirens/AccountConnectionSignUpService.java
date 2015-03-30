package jp.entropia.sirens;

import java.util.UUID;

import jp.entropia.sirens.service.UsersService;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;

public class AccountConnectionSignUpService implements ConnectionSignUp {

	private final UsersService usersService;
	
	public AccountConnectionSignUpService(UsersService usersService) {
		this.usersService = usersService;
	}
	
    public String execute(Connection<?> connection) {
        String userId = UUID.randomUUID().toString();
        usersService.createUser(userId, connection);
        return userId;
    }

}
