package demo.generator.service.impl;

import demo.generator.entity.ApiObjDef;
import demo.generator.mapper.ApiObjDefMapper;
import demo.generator.service.ApiObjDefService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * api相互关联表 服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:50
 */
@Service
public class ApiObjDefServiceImpl extends ServiceImpl<ApiObjDefMapper, ApiObjDef> implements ApiObjDefService {

}
