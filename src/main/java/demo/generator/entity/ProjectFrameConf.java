package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("project_frame_conf")
public class ProjectFrameConf implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private byte[] projectId;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;

    private String loginImg;

    private byte[] loginImgId;

    private String loginLogoImg;

    private byte[] loginLogoImgId;

    private String logoImg;

    private byte[] logoImgId;

    private Boolean rememberUsed;

    private Boolean forgetPwUsed;

    private Boolean registerUsed;

    private Boolean agreementUsed;

    private Boolean privacyUsed;

    private String copyright;

    private Integer frameMenu;

    private byte[] tenantId;
}
