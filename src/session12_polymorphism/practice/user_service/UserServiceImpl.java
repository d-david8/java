package session12_polymorphism.practice.user_service;

class UserServiceImpl implements UserService {
    @Override
    public void createUser() {
        // TODO document why this method is empty
    }

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserService userService = userServiceImpl;
    }
}
