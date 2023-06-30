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
@TableName("project_sync_record")
public class ProjectSyncRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private LocalDateTime createdTime;

    private byte[] projectId;

    private String projectCode;

    private String operator;

    private String branch;

    private String result;

    private String remark;

    private byte[] tenantId;
}
