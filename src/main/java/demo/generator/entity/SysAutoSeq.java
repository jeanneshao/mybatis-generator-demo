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
@TableName("sys_auto_seq")
public class SysAutoSeq implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    /**
     * 资源编码
     */
    private String resourceCode;

    /**
     * 字段名字
     */
    private String fieldName;

    /**
     * 序列
     */
    private Long sequence;

    /**
     * 周期
     */
    private String period;
}
