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
 * @since 2023-05-06 06:06:52
 */
@Getter
@Setter
@TableName("sys_enum")
public class SysEnum implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private String value;

    private String label;

    private String type;

    private String description;

    private Long sort;

    private String parentIds;

    private String childs;

    private byte[] tenantId;

    private Long valueType;

    private String valueEnum;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] projectId;
}
