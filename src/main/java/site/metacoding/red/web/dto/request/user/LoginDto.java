package site.metacoding.red.web.dto.request.user;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class LoginDto {
	private String username;
	private String password;
}
