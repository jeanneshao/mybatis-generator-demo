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
@TableName("oauth2_client_registration_template")
public class Oauth2ClientRegistrationTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private String additionalInfo;

    private String providerId;

    private String authorizationUri;

    private String tokenUri;

    private String scope;

    private String userInfoUri;

    private String userNameAttributeName;

    private String jwkSetUri;

    private String clientAuthenticationMethod;

    private String type;

    private String basicEmailAttributeKey;

    private String basicFirstNameAttributeKey;

    private String basicLastNameAttributeKey;

    private String basicTenantNameStrategy;

    private String basicTenantNamePattern;

    private String basicCustomerNamePattern;

    private String basicDefaultDashboardName;

    private Boolean basicAlwaysFullScreen;

    private String comment;

    private String loginButtonIcon;

    private String loginButtonLabel;

    private String helpLink;
}
