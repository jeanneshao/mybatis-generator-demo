package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("sys_role_field_rel")
public class SysRoleFieldRel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private byte[] resourceId;

    private String resourceCode;

    private byte[] fieldId;

    private String fieldName;

    private byte[] projectId;

    private String fieldPerms;

    private Long roleId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;
}
