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
@TableName("tenant_profile")
public class TenantProfile implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private String name;

    private String profileData;

    private String description;

    private String searchText;

    private Boolean isDefault;

    private Boolean isolatedTbCore;

    private Boolean isolatedTbRuleEngine;
}
