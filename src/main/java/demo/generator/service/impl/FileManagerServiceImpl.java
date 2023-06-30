package demo.generator.service.impl;

import demo.generator.entity.FileManager;
import demo.generator.mapper.FileManagerMapper;
import demo.generator.service.FileManagerService;
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
public class FileManagerServiceImpl extends ServiceImpl<FileManagerMapper, FileManager> implements FileManagerService {

}
