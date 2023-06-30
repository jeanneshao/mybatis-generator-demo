package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * API相互关联表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:50
 */
@Getter
@Setter
@TableName("api_group_dtl")
public class ApiGroupDtl implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;

    /**
     * api_def的ID
     */
    private byte[] apiDefId;

    /**
     * api编码
     */
    private Long apiId;

    /**
     * 关联的子api编码
     */
    private Long subApiId;

    /**
     * 入参code 默认 _indata
     */
    private String inParamCode;

    /**
     *  出参编码: dataList ,pagination
     */
    private String outParamCode;

    /**
     * 排序
     */
    private Integer sortId;

    /**
     * 调用类型备用字段
     */
    private Integer callType;
}
