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
 * 公共审批
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:50
 */
@Getter
@Setter
@TableName("apply_common")
public class ApplyCommon implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 操作员ID
     */
    private Long creatorId;

    /**
     * 拥有者ID
     */
    private Long ownerId;

    /**
     * 部门ID
     */
    private Long departmentId;

    /**
     * 更新人
     */
    private Long updOperator;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    /**
     * 业务类型
     */
    private Integer busiType;

    /**
     * 审批单号
     */
    private String applyNo;

    /**
     * 审批单类型
     */
    private Integer applyType;

    /**
     * 节点审批人
     */
    private String targetUserIds;

    /**
     * 审批状态
     */
    private Integer sts;

    /**
     * 权限串
     */
    private String authority;

    /**
     * 业务Id
     */
    private Long busiId;

    /**
     * 业务名称
     */
    private String busiName;

    /**
     * 审批单Id
     */
    private Long applyId;

    /**
     * 节点Id
     */
    private String nodeKey;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 流程实例iD
     */
    private String procInsId;

    /**
     * 可编辑字段
     */
    private String editColumns;
}
