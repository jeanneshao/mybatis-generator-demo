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
 * @since 2023-05-06 06:06:50
 */
@Getter
@Setter
@TableName("audit_log")
public class AuditLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private byte[] tenantId;

    private byte[] customerId;

    private byte[] entityId;

    private String entityType;

    private String entityName;

    private byte[] userId;

    private String userName;

    private String actionType;

    private String actionData;

    private String actionStatus;

    private String actionFailureDetails;
}
