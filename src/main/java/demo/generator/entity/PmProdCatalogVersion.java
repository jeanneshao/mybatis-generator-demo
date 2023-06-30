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
@TableName("pm_prod_catalog_version")
public class PmProdCatalogVersion implements Serializable {

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
    private LocalDateTime createTime;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    /**
     * 审批状态
     */
    private Boolean isApplying;

    /**
     * 审批类型
     */
    private String applyType;

    /**
     * 审批版本
     */
    private String newVersion;

    /**
     * 版本状态
     */
    private Integer versionSts;

    /**
     * 历史版本
     */
    private String hisVersion;

    /**
     * 备注
     */
    private String remark;

    private Object testDouble;
}
