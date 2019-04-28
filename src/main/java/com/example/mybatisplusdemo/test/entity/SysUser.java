package com.example.mybatisplusdemo.test.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zmf
 * @since 2019-04-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 邮箱|登录帐号
     */
    private String email;

    /**
     * 密码
     */
    private String pswd;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 1:有效，0:禁止登录
     */
    private String status;

    private String createNameId;

    private LocalDateTime lastUpdateTime;

    private String lastUpdateNameId;


}
