package org.lvb.shopsmall.lib.test.dao;


import org.lvb.shopsmall.lib.manage.user.entity.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface JpaSysUserRepository extends JpaRepository<SysUserEntity,Integer> {


    /**
     * 根据用户名获取用户
     *
     * @param username 用户名
     * @return 用户
     */

    SysUserEntity getByUsername(String username);

    @Query("select u from SysUserEntity u where id =?1 and u.password=?2")
    SysUserEntity findByIdAndPassword(Long id, String encode);

    //修改密码
    @Modifying
    @Query("update SysUserEntity a set a.password = ?2 where a.id =?1")
    int updatePassword(Long id, String encode);


}
