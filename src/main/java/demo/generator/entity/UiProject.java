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
 * 项目信息表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:53
 */
@Getter
@Setter
@TableName("ui_project")
public class UiProject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 资产表里对应项目的ID
     */
    private byte[] assetId;

    /**
     * 项目编码
     */
    private String projectCode;

    /**
     * 项目名称
     */
    private String projectName;

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
