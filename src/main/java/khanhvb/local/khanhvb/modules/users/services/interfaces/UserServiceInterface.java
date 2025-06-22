package khanhvb.local.khanhvb.modules.users.services.interfaces;
import khanhvb.local.khanhvb.modules.users.dtos.LoginRequest;
import khanhvb.local.khanhvb.modules.users.dtos.LoginResponse;

public interface UserServiceInterface {

    LoginResponse login (LoginRequest request);
    
}
