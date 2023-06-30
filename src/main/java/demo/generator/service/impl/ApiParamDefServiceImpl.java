package demo.generator.service.impl;

import demo.generator.entity.ApiParamDef;
import demo.generator.mapper.ApiParamDefMapper;
import demo.generator.service.ApiParamDefService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 参数定义 服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:50
 */
@Service
public class ApiParamDefServiceImpl extends ServiceImpl<ApiParamDefMapper, ApiParamDef> implements ApiParamDefService {

}
