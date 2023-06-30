package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 参数定义
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:50
 */
@Getter
@Setter
@TableName("api_param_def")
public class ApiParamDef implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;

    /**
     * api_def的id
     */
    private byte[] apiDefId;

    /**
     * 1入参 2出参
     */
    private Integer paramType;

    /**
     * 参数编码
     */
    private Long paramId;

    /**
     * sql查询出来的code
     */
    private String code;

    /**
     * 字段name
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 保留字段 是否为必填字段，0：非必填，1：必填
     */
    private Integer mandatory;

    /**
     * 参数类型  1: char 2: number 3: boolean 4: date 5: long 6: string 7: double
     */
    private Integer type;

    /**
     * 保留字段
     */
    private Integer listType;

    /**
     * 排序
     */
    private Integer orderId;
}
