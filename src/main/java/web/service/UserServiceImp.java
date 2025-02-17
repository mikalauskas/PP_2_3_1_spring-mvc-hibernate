package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public void update(User user) {
      userDao.update(user);
   }

   @Transactional
   @Override
   public void delete(User user) {
      userDao.delete(user);
   }

   @Transactional
   public void delete(Long id) {
      userDao.delete(id);
   }

   @Transactional(readOnly = true)
   @Override
   public User findById(Long id) {
      return userDao.findById(id);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }
}
