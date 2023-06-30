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
 * 资源Tab页展示的子资源表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:53
 */
@Getter
@Setter
@TableName("ui_table_tabs")
public class UiTableTabs implements Serializable {

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

    /**
     * 详情页嵌套资源
     */
    private String associatedTable;

    /**
     * 嵌套资源标题
     */
    private String tabTitle;

    /**
     * Tab页组件
     */
    private String tabComponent;

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
}
