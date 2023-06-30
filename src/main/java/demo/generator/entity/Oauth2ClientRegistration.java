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
@TableName("oauth2_client_registration")
public class Oauth2ClientRegistration implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private String domainName;

    private String domainScheme;

    private byte[] clientRegistrationInfoId;
}
