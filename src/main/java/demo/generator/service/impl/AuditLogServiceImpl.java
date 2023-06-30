package demo.generator.service.impl;

import demo.generator.entity.AuditLog;
import demo.generator.mapper.AuditLogMapper;
import demo.generator.service.AuditLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:50
 */
@Service
public class AuditLogServiceImpl extends ServiceImpl<AuditLogMapper, AuditLog> implements AuditLogService {

}
