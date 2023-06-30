package demo.generator.service.impl;

import demo.generator.entity.AdminSettings;
import demo.generator.mapper.AdminSettingsMapper;
import demo.generator.service.AdminSettingsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:49
 */
@Service
public class AdminSettingsServiceImpl extends ServiceImpl<AdminSettingsMapper, AdminSettings> implements AdminSettingsService {

}
