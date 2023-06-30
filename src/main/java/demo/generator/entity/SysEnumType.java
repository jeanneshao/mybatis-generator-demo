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
@TableName("sys_enum_type")
public class SysEnumType implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private String type;

    private String name;

    private String description;

    private Integer isSystem;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;

    private byte[] projectId;
}
