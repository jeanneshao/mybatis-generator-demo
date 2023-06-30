package demo.generator.entity;

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
public class Tenant implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private String additionalInfo;

    private byte[] tenantProfileId;

    private String address;

    private String address2;

    private String city;

    private String country;

    private String email;

    private String phone;

    private String region;

    private String searchText;

    private String state;

    private String title;

    private String zip;
}
