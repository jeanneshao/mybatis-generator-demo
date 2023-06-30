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
@TableName("tmp_out_param_id")
public class TmpOutParamId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long paramId;
}
