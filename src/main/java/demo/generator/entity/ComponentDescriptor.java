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
 * @since 2023-05-06 06:06:50
 */
@Getter
@Setter
@TableName("component_descriptor")
public class ComponentDescriptor implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private String actions;

    private String clazz;

    private String configurationDescriptor;

    private String name;

    private String scope;

    private String searchText;

    private String type;
}
