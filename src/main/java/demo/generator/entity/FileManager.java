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
@TableName("file_manager")
public class FileManager implements Serializable {

    private static final long serialVersionUID = 1L;

    private byte[] id;

    private Long createdTime;

    private byte[] busiId;

    private String busiKey;

    private String busiValue;

    private String module;

    private String oriFileName;

    private String fileName;

    private String filePath;

    private Long fileSize;

    private Integer fileType;

    private Integer status;

    private Integer downloadTime;

    private String remarks;
}
