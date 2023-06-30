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
 * 不同位置要展示哪些字段，以及字段顺序
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:52
 */
@Getter
@Setter
@TableName("ui_column_displays")
public class UiColumnDisplays implements Serializable {

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

    /**
     * 字段
     */
    private Long columnId;

    /**
     * 字段第几个展示
     */
    private Byte sequence;

    /**
     * 资产表里对应项目的ID
     */
    private byte[] assetId;

    /**
     * 字段分组
     */
    private String groupName;

    /**
     * 分组的图标
     */
    private String groupIcon;

    /**
     * 字段分组位置,TableStandAlone- 外层表格第几个展示,TableAssociated -tab页中内嵌关联表格第几个展示,Table2Associate-待关联弹框表格里第几个展示,EditDialog-新增修改弹框分组和第几个展示，分组暂时没做,DetailPage-详情页正文分组和第几个展示,TitleLane-详情页标题行第几个展示，分组会忽略,TableStandaloneQueryCriteria-外层表格查询条件第几个展示,TableAssociatedQueryCriteria-tab页嵌套表格查询条件第几个展示，Table2AssociateQueryCriteria-待关联弹框查询条件第几个展示,NameKey-详情页图标旁边名字对应的字段，只能有一条
     */
    private String displayPositions;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private Integer displaySequence;
}
