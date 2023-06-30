package demo.generator.service.impl;

import demo.generator.entity.Tenant;
import demo.generator.mapper.TenantMapper;
import demo.generator.service.TenantService;
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
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements TenantService {

}
