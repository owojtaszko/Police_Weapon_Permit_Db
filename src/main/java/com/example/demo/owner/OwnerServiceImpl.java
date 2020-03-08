package com.example.demo.owner;

import org.springframework.transaction.annotation.Transactional;

public class OwnerServiceImpl implements OwnerServiceInterface {

    OwnerDao ownerDao;

    public OwnerDao getOwnerDao(){
        return ownerDao;
    }

    public void setOwnerDao(OwnerDao ownerDao){
        this.ownerDao = ownerDao;
    }
    @Transactional
    public void save(Owner owner) {
        ownerDao.save(owner);
    }
    public void update(Owner owner) {
       ownerDao.update(owner);
    }

    public void delete(Owner owner) {
        ownerDao.delete(owner);
    }
    public Owner findByPesel(String PESEL) {
        return ownerDao.findByPesel(PESEL);
    }
    public Owner findBySurname(String SURNAME) {
        return ownerDao.findByPesel(SURNAME);
    }
}


//public class UserServiceImpl implements UserServiceInterface {
//
//    UserDao userDao;
//
//    public UserDao getUserDao() {
//        return userDao;
//    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @Transactional
//    public void save2objects(User user, Department department) {
//        userDao.save2objects(user, department);
//    }
//
//    @Transactional
//    public void save(User user) {
//        userDao.save(user);
//    }
//
//    public void update(User user) {
//        userDao.update(user);
//    }
//
//    public void delete(User user) {
//        userDao.delete(user);
//    }
//
//    public List<User> findSubordinatesByManagerId(Long managerId) {
//        return userDao.findSubordinatesByManagerId(managerId);
//    }
//
//    public User findByUserId(Long userId) {
//        return userDao.findByUserId(userId);
//    }
//
//    public User findByUserName(String userName) {
//        return userDao.findByUserName(userName);
//    }
//
//}