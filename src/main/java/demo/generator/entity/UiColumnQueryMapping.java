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
 * 用于配置表单中需要关联其他表的字段，查询条件需要传过去的字段值
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:52
 */
@Getter
@Setter
@TableName("ui_column_query_mapping")
public class UiColumnQueryMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long columnId;

    /**
     * 表
     */
    private Long tableId;

    /**
     * 资产表里对应项目的ID
     */
    private byte[] assetId;

    /**
     * 当前表字段 -sourceName
     */
    private String source;

    /**
     * 关联表字段 -showName
     */
    private String target;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;
}
