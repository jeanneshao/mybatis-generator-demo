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
@TableName("table_relation_conf")
public class TableRelationConf implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private byte[] fieldsId;

    private byte[] resourceId;

    private byte[] toResourceId;

    private Integer toType;

    private Integer storeType;

    private String showFields;

    private String relationType;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;

    /**
     * 外键名字
     */
    private String foreignKey;

    private String tab;

    private Integer tabSort;
}
