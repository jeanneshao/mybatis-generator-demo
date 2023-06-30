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
 * 项目资源表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:53
 */
@Getter
@Setter
@TableName("ui_table")
public class UiTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 项目主键ID
     */
    private Long projectId;

    /**
     * 实体编号
     */
    private String tableCode;

    /**
     * 实体名称
     */
    private String tableName;

    /**
     * 资产表里对应项目的ID
     */
    private byte[] assetId;

    /**
     * 预留字段
     */
    private String futureEnhance;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private String icon;
}
