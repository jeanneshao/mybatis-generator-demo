package demo.generator.entity;

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
@TableName("sys_menu20230317")
public class SysMenu20230317 implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private String menuName;

    private String menuType;

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
}
