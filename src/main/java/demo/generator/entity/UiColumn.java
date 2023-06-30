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
 * 前台资源字段表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:52
 */
@Getter
@Setter
@TableName("ui_column")
public class UiColumn implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 字段所属的表ID
     */
    private Long tableId;

    /**
     * 字段
     */
    private String columnField;

    /**
     * 字段页面展示名称（Label，Title）
     */
    private String displayName;

    /**
     * 宽度（1-12）
     */
    private Byte columnSpan;

    /**
     * 组件类型
     */
    private String component;

    /**
     * 提示信息
     */
    private String tooltip;

    /**
     * 资产表里对应项目的ID
     */
    private byte[] assetId;

    /**
     * 组件原生类型
     */
    private String valueType;

    private String widgetType;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;
}
