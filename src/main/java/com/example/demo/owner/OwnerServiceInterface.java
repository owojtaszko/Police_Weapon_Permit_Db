package com.example.demo.owner;

public interface OwnerServiceInterface {
    void save(Owner owner);
    void update(Owner owner);
    void delete(Owner owner);
    Owner findByPesel(String PESEL);
    Owner findBySurname(String SURNAME);
}
//public interface UserServiceInterface {
//
//    void save(User user);
//
//    void save2objects(User user, Department department);
//
//    void update(User user);
//
//    void delete(User user);
//
//    List<User> findSubordinatesByManagerId(Long managerId);
//
//    User findByUserId(Long userId);
//
//    User findByUserName(String userName);
//
//}