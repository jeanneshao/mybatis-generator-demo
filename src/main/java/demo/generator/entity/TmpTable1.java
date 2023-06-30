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
@TableName("tmp_table1")
public class TmpTable1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private String resourceCode;

    private String resourceName;
}
