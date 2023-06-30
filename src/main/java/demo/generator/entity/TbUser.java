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
@TableName("tb_user")
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private String additionalInfo;

    private String authority;

    private byte[] customerId;

    private String email;

    private String firstName;

    private String lastName;

    private String searchText;

    private byte[] tenantId;
}
