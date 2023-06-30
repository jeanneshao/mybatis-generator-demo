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
@TableName("api_obj_out_param_mapping")
public class ApiObjOutParamMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;

    /**
     * api_obj_def表的主键
     */
    private Long objId;

    /**
     * api_param_def表的id
     */
    private Long paramId;

    /**
     * 数据库出参;根据查出来的字段,再映射的字段
     */
    private String columnName;

    /**
     *  数据类型 1: char 2: number 3: boolean 4: date 5: long 6: string 7: double
     */
    private Integer columnValueType;

    /**
     * 转换脚本，部分字段值可能需要经过转换或者运算才能得出真正需要的值
     */
    private String formula;
}
