package session11.practice.user_service;

public interface UserService {

    /**
     * Creates a user
     *
     * @param userDTO
     */
    void createUser(UserDTO userDTO);

    /**
     * @param id
     * @return
     */
    UserDTO findUserById(long id);

    void deleteUser(long id);
}