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
 * 资源按钮表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:53
 */
@Getter
@Setter
@TableName("ui_table_buttons")
public class UiTableButtons implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * asset表 type为tableResConf的表记录的id
     */
    private Long tableId;

    private String buttonPosition;

    /**
     * 0-内嵌按钮 1-特殊按钮
     */
    private Boolean customButton;

    private String integratedButton;

    /**
     * 按钮的编号，权限控制使用
     */
    private String buttonCode;

    /**
     * 自定义按钮的名称
     */
    private String buttonName;

    /**
     * 资产表里对应项目的ID
     */
    private byte[] assetId;

    /**
     * 自定义按钮的icon
     */
    private byte[] buttonIcon;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;
}
