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
@TableName("table_fields_conf")
public class TableFieldsConf implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private byte[] tenantId;

    private byte[] resourceId;

    private String showName;

    private String fieldName;

    private String remark;

    private String widgetType;

    private Integer sort;

    private Integer groupSort;

    private String verification;

    private String privacy;

    private String security;

    private String authority;

    private String description;

    private String style;

    private String collect;

    private String enumData;

    private String relation;

    private String location;

    private String extend;

    /**
     * 字段类型0 默认配置 1界面配置
     */
    private Integer fieldType;

    /**
     * db数据类型
     */
    private String fieldDataType;

    private byte[] projectId;

    private String locationDetail;

    private Integer locationSort;

    private Integer locationDetailSort;
}
