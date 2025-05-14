package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.junit.jupiter.api.Test;

public class UserServiceTests {

    @Test
    public void testAddUser() {
        UserService userService = new UserServiceImpl(new FakeRepo());
        userService.addUser("Alice", "Smith");
    }

    @Test
    public void testGetUser() {
        UserServiceImpl service = new UserServiceImpl(new FakeRepo());
        service.addUser("Bob", "Jones");
        service.getUser(1);
    }

    @Test
    public void testRemoveUser() {
        UserServiceImpl service = new UserServiceImpl(new FakeRepo());
        service.addUser("Carol", "White");
        service.removeUser(1);
    }
}
