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
@TableName("api_obj_def_20221114")
public class ApiObjDef20221114 implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    /**
     * api_def的id
     */
    private byte[] apiDefId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;

    /**
     * obj编码
     */
    private Long objId;

    /**
     * api编码
     */
    private Long apiId;

    /**
     * 数据库表名字
     */
    private String tableName;

    /**
     *  枚举:1新增 2删除 3更新 4查询
     */
    private Integer actType;

    /**
     * 排序字段
     */
    private Integer sortId;

    /**
     * 1分页 0不分页
     */
    private Integer limitFlag;

    /**
     * sql脚本
     */
    private String sqlScript;

    /**
     * 实体名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     *  条件脚本
     */
    private String conScript;

    /**
     *  条件脚本
     */
    private String chkScript;
}
