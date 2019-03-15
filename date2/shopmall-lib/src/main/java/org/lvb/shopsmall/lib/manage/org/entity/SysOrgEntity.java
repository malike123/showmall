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

package org.lvb.shopsmall.lib.manage.org.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.lvb.shopsmall.lib.common.entity.TreeDataEntity;
import org.lvb.shopsmall.lib.manage.role.entity.SysRoleEntity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static com.baomidou.mybatisplus.annotation.FieldStrategy.IGNORED;

/**
 * 部门机构实体类
 *
 * @author SanLi
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sys_org")
@Entity
@Table(name="sys_org")
public class SysOrgEntity extends TreeDataEntity<SysOrgEntity, Long> {



    /**
     * 名称
     */
    @Column(name = "org_name")
    private String orgName;
    /**
     * 机构编码
     */
    @Column(name = "org_code")
    private String orgCode;
    /**
     * 归属区域
     */
    @Column(name = "area_id")
    private Long areaId;
    /**
     * 机构类型
     */
    @Column(name = "org_type")
    private String orgType;
    /**
     * 机构等级
     */
    @Column(name = "grade")
    private String grade;

    /**
     * 经度
     */
    @Column(name = "longitude")
    private String longitude;
    /**
     * 纬度
     */
    @Column(name = "latitude")
    private String latitude;
    /**
     * 联系地址
     */
    @Column(name = "address")
    @TableField(strategy = IGNORED)
    private String address;
    /**
     * 邮政编码
     */
    @Column(name = "zip_code")
    @TableField(strategy = IGNORED)
    private String zipCode;
    /**
     * 负责人
     */
    @Column(name = "principal")
    @TableField(strategy = IGNORED)
    private String principal;
    /**
     * 电话
     */
    @Column(name = "telephone")
    @TableField(strategy = IGNORED)
    private String telephone;
    /**
     * 传真
     */
    @Column(name = "fax")
    @TableField(strategy = IGNORED)
    private String fax;
    /**
     * 邮箱
     */
    @Column(name = "email")
    @TableField(strategy = IGNORED)
    private String email;
    /**
     * 是否可用
     */
    @Column(name = "useable")
    private String useable;

    @ManyToMany
    @JoinTable(name = "sys_role",joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private List<SysRoleEntity> roleEntityList = new ArrayList<SysRoleEntity>();
}
