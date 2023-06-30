package demo.generator.entity;

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
 * @since 2023-05-06 06:06:50
 */
@Getter
@Setter
public class Asset implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private String additionalInfo;

    private byte[] customerId;

    private String name;

    private String label;

    private String searchText;

    private byte[] tenantId;

    private String type;

    private LocalDateTime updateTime;

    private Long updOperator;

    private Long creatorId;

    private Long ownerId;

    private Long departmentId;
}
