package com.example.mybatisplusdemo.test.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.mybatisplusdemo.test.entity.Picture;
import com.example.mybatisplusdemo.test.mapper.PictureMapper;
import com.example.mybatisplusdemo.test.service.impl.PictureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zmf
 * @since 2019-04-25
 */
@Controller
@RequestMapping("/test/picture")
public class PictureController {
    @Autowired
    private PictureServiceImpl pictureService;


    @ResponseBody
    @GetMapping("d")
    public String d() {
        QueryWrapper<Picture> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pictures_Id", "794");
        return pictureService.list(queryWrapper).toString();
    }
}
