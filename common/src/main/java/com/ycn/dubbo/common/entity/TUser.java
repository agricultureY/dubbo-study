package com.ycn.dubbo.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @desc: user实体类
 * @author: ycn
 * @date: 2019/8/1 10:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_user")
public class TUser implements Serializable {
    private static final long serialVersionUID = -4097657639150501711L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_sex")
    private String userSex;

    @Column(name = "user_age")
    private String userAge;

}
