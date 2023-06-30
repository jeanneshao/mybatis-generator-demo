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
 * 系统角色表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:52
 */
@Getter
@Setter
@TableName("sys_role")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_id", type = IdType.AUTO)
    private Long roleId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private String roleCode;

    /**
     * 项目ID
     */
    private String roleName;

    /**
     * 菜单名字
     */
    private Integer roleSort;

    /**
     * 数据范围,--暂时预留
     */
    private String dataScope;

    /**
     * 1系统默认角色不想允许删除修改,2自定义角色
     */
    private Integer roleType;

    private byte[] tenantId;

    private byte[] projectId;

    /**
     * 弃用主键
     */
    private byte[] id;

    private String remark;

    /**
     * 页面按钮操作权限配置 resourceCode:READ
     */
    private String elementPerms;

    /**
     *  资源权限配置 resourceCode:READ
     */
    private String resourcePerms;

    private String fieldPerms;

    private String apiPerms;

    private String menuPerms;
}
