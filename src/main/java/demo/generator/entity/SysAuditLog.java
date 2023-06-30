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
 * @since 2023-05-06 06:06:51
 */
@Getter
@Setter
@TableName("sys_audit_log")
public class SysAuditLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库唯一ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private LocalDateTime createdTime;

    private String tenantId;

    private String customerId;

    private String resourceId;

    private String resourceCode;

    private String resourceName;

    private String userId;

    private String userName;

    private String actionType;

    private String originalData;

    private String actionData;

    private String actionStatus;

    private String actionFailureDetails;

    private String approval;

    private String updFieldName;

    private String departmentId;

    private String departmentName;
}
