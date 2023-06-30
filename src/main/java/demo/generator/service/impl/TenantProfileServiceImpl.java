package demo.generator.service.impl;

import demo.generator.entity.TenantProfile;
import demo.generator.mapper.TenantProfileMapper;
import demo.generator.service.TenantProfileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:52
 */
@Service
public class TenantProfileServiceImpl extends ServiceImpl<TenantProfileMapper, TenantProfile> implements TenantProfileService {

}
