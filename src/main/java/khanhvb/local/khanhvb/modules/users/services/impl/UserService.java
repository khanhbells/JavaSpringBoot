package khanhvb.local.khanhvb.modules.users.services.impl;
import org.springframework.stereotype.Service;

import khanhvb.local.khanhvb.modules.users.dtos.LoginRequest;
import khanhvb.local.khanhvb.modules.users.dtos.LoginResponse;
import khanhvb.local.khanhvb.modules.users.dtos.UserDTO;
import khanhvb.local.khanhvb.modules.users.services.interfaces.UserServiceInterface;
import khanhvb.local.khanhvb.services.BaseService;

@Service
public class UserService extends BaseService implements UserServiceInterface {

    @Override
    public LoginResponse login(LoginRequest request) {
        try {
            
            // String email = request.getEmail();
            // String password = request.getPassword();

            String token = "random_token";
            UserDTO user = new UserDTO(1, "khanhvb@bap.jp");

            return new LoginResponse(token, user);
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException("Có vấn để xảy ra" );
        }
    }
    
}
