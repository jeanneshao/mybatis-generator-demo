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
 * @since 2023-05-06 06:06:50
 */
@Getter
@Setter
@TableName("api_def_20221114")
public class ApiDef20221114 implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;

    /**
     * 资源ID
     */
    private byte[] resourceId;

    /**
     * api编码
     */
    private Long apiId;

    /**
     * api请求URL
     */
    private String apiUrl;

    /**
     * api类型 0普通查询 3组合查询
     */
    private Integer apiType;

    /**
     * 保留字段
     */
    private Integer apiMethod;

    /**
     * 保留字段
     */
    private Integer sts;

    private String description;

    /**
     * 入参编码列表,逗号隔开
     */
    private String inParamId;

    /**
     * 出参编码列表,逗号隔开
     */
    private String outParamId;

    /**
     * 0:实体 1:列表
     */
    private Integer inParamType;

    /**
     * 0:实体 1:列表
     */
    private Integer outParamType;

    /**
     * 资源ID
     */
    private String mustParamId;
}
