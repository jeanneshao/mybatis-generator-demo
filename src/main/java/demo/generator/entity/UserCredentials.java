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
 * @since 2023-05-06 06:06:53
 */
@Getter
@Setter
@TableName("user_credentials")
public class UserCredentials implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private String activateToken;

    private Boolean enabled;

    private String password;

    private String resetToken;

    private byte[] userId;
}
