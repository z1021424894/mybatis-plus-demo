package com.example.mybatisplusdemo.test.service.impl;

import com.example.mybatisplusdemo.test.entity.SysUser;
import com.example.mybatisplusdemo.test.mapper.SysUserMapper;
import com.example.mybatisplusdemo.test.service.ISysUserService;
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
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
