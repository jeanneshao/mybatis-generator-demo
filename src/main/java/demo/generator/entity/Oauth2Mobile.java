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
@TableName("oauth2_mobile")
public class Oauth2Mobile implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private byte[] oauth2ParamsId;

    private Long createdTime;

    private String pkgName;

    private String appSecret;
}
