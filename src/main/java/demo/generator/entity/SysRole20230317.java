package demo.generator.entity;

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
@TableName("sys_role20230317")
public class SysRole20230317 implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

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
     *  资源权限配置 resourceCode:READ
     */
    private String resourcePerms;

    /**
     * 页面按钮操作权限配置 resourceCode:READ
     */
    private String elementPerms;

    /**
     * 1系统默认角色不想允许删除修改,2自定义角色
     */
    private Integer roleType;

    private byte[] tenantId;

    private byte[] projectId;
}
