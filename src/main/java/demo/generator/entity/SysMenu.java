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
 * @since 2023-05-06 06:06:52
 */
@Getter
@Setter
@TableName("sys_menu")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "menu_id", type = IdType.AUTO)
    private Long menuId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private String menuName;

    private String menuType;

    /**
     * 弃用父菜单
     */
    private byte[] parentId;

    private Long orderNum;

    private String path;

    private String component;

    private String query;

    private Integer isFrame;

    private String icon;

    private byte[] tenantId;

    private byte[] projectId;

    private String describe;

    /**
     * 弃用主键
     */
    private byte[] id;

    /**
     * 备注
     */
    private String remark;

    /**
     * 父菜单id
     */
    private Long pId;
}
