package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
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
@TableName("table_res_web_conf")
public class TableResWebConf implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDate updateTime;

    private String updOperator;

    private byte[] tenantId;

    private String paginationType;

    private String editor;

    private String deleteType;

    private byte[] resourceId;
}
