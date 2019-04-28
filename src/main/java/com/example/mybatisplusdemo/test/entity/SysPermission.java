package com.example.mybatisplusdemo.test.entity;

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
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * url地址
     */
    private String url;

    /**
     * url描述
     */
    private String name;


}
