/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 ‭‭‭‭‭‭‭‭‭‭‭‭[smallbun] www.smallbun.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.lvb.shopsmall.lib.manage.user.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.lvb.shopsmall.lib.manage.role.entity.SysRoleEntity;
import org.lvb.shopsmall.lib.common.entity.DataEntity;
import org.lvb.shopsmall.lib.manage.org.entity.SysOrgEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static com.baomidou.mybatisplus.annotation.FieldStrategy.IGNORED;

/**
 * 用户实体类
 *
 * @author SanLi
 * Created by 2689170096@qq.com on 2018/4/30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName(value = "sys_user")
@Table(name="sys_user")
@Entity
public class SysUserEntity extends DataEntity<Long> {




	/**
	 * 姓名
	 */
	@Column(name = "full_name")
	private String fullName;
	/**
	 * 用户名
	 */
	@Column(name = "username")
	private String username;
	/**
	 * 密码
	 */
	@Column(name = "password")
	@JSONField(serialize = false)
	private String password;

	/**
	 * 昵称
	 */
	@Column(name = "nick_Name")
	private String nickName;
	/**
	 * 头像地址
	 */
	@Column(name = "head_portrait_url")
	private String headPortraitUrl;
	/**
	 * 手机号
	 */
	@Column(name = "phone")
	//@TableField(strategy = IGNORED)
	private String phone;
	/**
	 * 电话
	 */
	@Column(name = "telephone")
	//@TableField(strategy = IGNORED)
	private String telephone;
	/**
	 * 邮箱
	 */
	@Column(name = "email")
	@TableField(strategy = IGNORED)
	private String email;
	/**
	 * 生日
	 */
	@Column(name = "birthday")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	/**
	 * 性别
	 */
	@Column(name = "sex")
	private String sex;
	/**
	 * 二维码
	 */
	@Column(name = "qr_Code")
	private String qrCode;
	/**
	 * 最后登陆时间
	 */
	@Column(name = "last_login_time")
	private Timestamp lastLoginTime;
	/**
	 * 上次登录ip
	 */
	@Column(name = "last_login_ip")
	private String lastLoginIp;
	/**
	 * 上次登录地址
	 */
	@Column(name = "last_login_address")
	private String lastLoginAddress;
	/**
	 * 用户状态
	 */
	@Column(name = "user_status")
	private String userStatus;
	/**
	 * 用户类型
	 */
	@Column(name = "user_type")
	private String userType;
	/**
	 * 工号
	 */
	@Column(name = "job_number")
	private String jobNumber;
	/**
	 * 身份证号
	 */
	@Column(name = "id_card")
	@TableField(strategy = IGNORED)
	private String idCard;
	/**
	 * 用户角色集合
	 */

	@TableField(exist = false)
	@ManyToMany
	@JoinTable(name = "sys_role",joinColumns = @JoinColumn(name = "id"),
			inverseJoinColumns = @JoinColumn(name = "id"))
	private List<SysRoleEntity> roleList = Lists.newArrayList();
	/**
	 * 所属部门
	 */
	@Column(name = "org_id")
	private String orgId;
	/**
	 * 所属部门
	 */

	//@TableField(exist = false)
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示author不能为空。删除文章，不影响用户
	@JoinColumn(name="id")//设置在article表中的关联字段(外键)
	private SysOrgEntity org;
	/**
	 * 归属公司
	 */


	//@TableField(exist = false)
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示author不能为空。删除文章，不影响用户
	@JoinColumn(name="id")//设置在article表中的关联字段(外键)
	private SysOrgEntity company;
}
