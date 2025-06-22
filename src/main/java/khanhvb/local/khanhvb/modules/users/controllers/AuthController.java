package khanhvb.local.khanhvb.modules.users.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import khanhvb.local.khanhvb.modules.users.dtos.LoginRequest;
import khanhvb.local.khanhvb.modules.users.services.interfaces.UserServiceInterface;
import khanhvb.local.khanhvb.modules.users.dtos.LoginResponse;

@RestController
@RequestMapping("v1/auth")
public class AuthController {

    private final UserServiceInterface userService;

    public AuthController(
        UserServiceInterface userService
    ) {
        this.userService = userService;
    }

    @PostMapping("login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        LoginResponse auth = userService.login(request);   

        return ResponseEntity.ok(auth);
    }


    
}
