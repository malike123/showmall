package org.lvb.shopmall.restful;

import org.lvb.shopmall.Dao.UserTest;
import org.lvb.shopmall.Dao.UserTestDao;
import org.lvb.shopsmall.lib.manage.user.entity.SysUserEntity;
import org.lvb.shopsmall.lib.manage.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/home")
public class HomeRestController {

   // @Autowired
    //private SysUserService sysUserService;
   @Autowired
   private UserTestDao testUserDao;
    @RequestMapping("index")
    public  String index()
    {
        UserTest user= new UserTest();
        user.setUsername("zhang san");
        user.setAge(23);
        testUserDao.save(user);
        Optional<UserTest> user1 = testUserDao.findById(1);
        System.out.println(user);

      //  SysUserEntity entity= sysUserService.findByUsername("admin");
       // return  entity;
        return "";
    }
}


