package khanhvb.local.khanhvb.modules.users.dtos;

public class UserDTO {

    private final Long id;
    private final String email;

    public UserDTO(
        long id,
        String emil
    ) {
        this.id = id;
        this.email = emil;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    
}
