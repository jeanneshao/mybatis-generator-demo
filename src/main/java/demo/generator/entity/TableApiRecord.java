package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("table_api_record")
public class TableApiRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private byte[] resourceId;

    private String resourceCode;

    private String name;

    private String url;

    private byte[] tenantId;
}
