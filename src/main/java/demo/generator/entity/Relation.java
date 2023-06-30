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
 * @since 2023-05-06 06:06:51
 */
@Getter
@Setter
public class Relation implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] fromId;

    private String fromType;

    private byte[] toId;

    private String toType;

    private String relationTypeGroup;

    private String relationType;

    private String additionalInfo;
}
