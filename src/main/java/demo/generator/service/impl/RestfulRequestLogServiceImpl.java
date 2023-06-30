package demo.generator.service.impl;

import demo.generator.entity.RestfulRequestLog;
import demo.generator.mapper.RestfulRequestLogMapper;
import demo.generator.service.RestfulRequestLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:51
 */
@Service
public class RestfulRequestLogServiceImpl extends ServiceImpl<RestfulRequestLogMapper, RestfulRequestLog> implements RestfulRequestLogService {

}
