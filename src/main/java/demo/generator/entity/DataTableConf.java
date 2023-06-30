package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:51
 */
@Getter
@Setter
@TableName("data_table_conf")
public class DataTableConf implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String storageTable;

    private String storageType;

    private Long operateType;

    private String additionalInfo;

    private byte[] tenantId;
}
