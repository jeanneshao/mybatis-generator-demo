package demo.generator.service.impl;

import demo.generator.entity.UserCredentials;
import demo.generator.mapper.UserCredentialsMapper;
import demo.generator.service.UserCredentialsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:53
 */
@Service
public class UserCredentialsServiceImpl extends ServiceImpl<UserCredentialsMapper, UserCredentials> implements UserCredentialsService {

}
