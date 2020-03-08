package com.example.demo.owner;

public interface OwnerDao {
    void save(Owner owner);     //zapis Posiadacza do bazy
    void update(Owner owner);   //zmiana w bazie danych Posiadacza
    void delete(Owner owner);   //usuwanie Posiadacza z bazy

    Owner findByPesel(String PESEL);
    Owner findBySurname(String SURNAME);

//    public interface UserDao {
//
//        void save(User user);
//        void save2objects(User user,Department department);
//
//        void update(User user);
//
//        void delete(User user);
//
//        User findByUserId(Long userId);
//        User findByUserName(String userName);
//        List<User> findSubordinatesByManagerId(Long managerId);
//
//    }
}
