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
 * 前端字段属性表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:52
 */
@Getter
@Setter
@TableName("ui_column_attribute")
public class UiColumnAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 表
     */
    private Long tableId;

    private Long columnId;

    /**
     * 校验项
     */
    private String attributeType;

    /**
     * 资产表里对应项目的ID
     */
    private byte[] assetId;

    /**
     * 错误信息
     */
    private String attributeName;

    /**
     * 不能为空
     */
    private String attributeValue;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;
}
