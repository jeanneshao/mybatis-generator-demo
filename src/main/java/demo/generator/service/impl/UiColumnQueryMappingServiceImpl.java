package demo.generator.service.impl;

import demo.generator.entity.UiColumnQueryMapping;
import demo.generator.mapper.UiColumnQueryMappingMapper;
import demo.generator.service.UiColumnQueryMappingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用于配置表单中需要关联其他表的字段，查询条件需要传过去的字段值 服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:52
 */
@Service
public class UiColumnQueryMappingServiceImpl extends ServiceImpl<UiColumnQueryMappingMapper, UiColumnQueryMapping> implements UiColumnQueryMappingService {

}
