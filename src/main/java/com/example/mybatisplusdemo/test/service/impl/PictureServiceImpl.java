package com.example.mybatisplusdemo.test.service.impl;

import com.example.mybatisplusdemo.test.entity.Picture;
import com.example.mybatisplusdemo.test.mapper.PictureMapper;
import com.example.mybatisplusdemo.test.service.IPictureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zmf
 * @since 2019-04-25
 */
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture> implements IPictureService {

    public void save() {

    }
}
