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
 * @since 2023-05-06 06:06:50
 */
@Getter
@Setter
public class Alarm implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private Long ackTs;

    private Long clearTs;

    private String additionalInfo;

    private Long endTs;

    private byte[] originatorId;

    private Integer originatorType;

    private Boolean propagate;

    private String severity;

    private Long startTs;

    private String status;

    private byte[] tenantId;

    private byte[] customerId;

    private String propagateRelationTypes;

    private String type;
}
