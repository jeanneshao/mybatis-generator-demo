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
 * @since 2023-05-06 06:06:51
 */
@Getter
@Setter
@TableName("oauth2_params")
public class Oauth2Params implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Boolean enabled;

    private byte[] tenantId;

    private Integer createdTime;
}
