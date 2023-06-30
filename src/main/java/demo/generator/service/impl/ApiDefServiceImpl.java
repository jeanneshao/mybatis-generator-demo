package demo.generator.service.impl;

import demo.generator.entity.ApiDef;
import demo.generator.mapper.ApiDefMapper;
import demo.generator.service.ApiDefService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * API定义表 服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:50
 */
@Service
public class ApiDefServiceImpl extends ServiceImpl<ApiDefMapper, ApiDef> implements ApiDefService {

}
