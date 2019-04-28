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
public class BeautifulPictures implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 美女图片爬取
     */
    private String id;

    private String title;

    private String url;

    private Integer pictureurlsNum;

    private Integer zan;

    private String biaoqian;

    private String keywords;

    private LocalDateTime lastUpdateDate;


}
