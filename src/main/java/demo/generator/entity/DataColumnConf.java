package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("data_column_conf")
public class DataColumnConf implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private byte[] tableId;

    private String columnName;

    private Long busiType;

    private String exeService;

    private String exeMethod;

    private Long sort;

    private String exceptionMessage;

    private String additionalInfo;

    private byte[] tenantId;
}
