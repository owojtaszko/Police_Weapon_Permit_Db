package com.example.demo.owner;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class OwnerDaoImpl extends HibernateDaoSupport implements OwnerDao {
    public void save(Owner owner) {
        getHibernateTemplate().save(owner);
    }

    public void update(Owner owner) {
        getHibernateTemplate().update(owner);
    }

    public void delete(Owner owner) {
        getHibernateTemplate().delete(owner);
    }

    public Owner findByPesel(String PESEL) {
        return (Owner) getHibernateTemplate().load(Owner.class, PESEL);
    }

    public Owner findBySurname(String SURNAME) {
        return (Owner) getHibernateTemplate().load(Owner.class, SURNAME);
    }

}

//public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
//
//    public void update(User user) {
//        getHibernateTemplate().update(user);
//    }
//
//    public void delete(User user) {
//        getHibernateTemplate().delete(user);
//    }
//
//    public User findByUserId(Long userId) {
//
//        return (User) getHibernateTemplate().load(User.class, userId);
//    }
//
//    public User findByUserName(String userName) {
//
//        return (User) getSession().createCriteria(User.class)
//                .add(Restrictions.eq("username", userName))
//                .uniqueResult();
//    }
//
//    public void save2objects(User user, Department department) {
//        getHibernateTemplate().save(department);
//        getHibernateTemplate().save(user);
//    }
//
//    public void save(User user) {
//        getHibernateTemplate().save(user);
//    }
//
//    @Override
//    public List<User> findSubordinatesByManagerId(Long managerId) {
//
//        List list = getSession().createCriteria(User.class)
//                .add(Restrictions.eq("manager.userId", managerId))
//                .list();
//
//        return list;
//    }
//}