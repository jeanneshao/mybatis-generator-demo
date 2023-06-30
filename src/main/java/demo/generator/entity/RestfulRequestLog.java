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
@TableName("restful_request_log")
public class RestfulRequestLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String requestMethod;

    private String url;

    /**
     * 请求结果 1已发出 2 成功 3 失败
     */
    private Integer status;

    private String msg;

    private String requestBody;

    private String requestHeader;

    private String response;

    /**
     * 业务类型
     */
    private String busiType;

    /**
     * 业务调用方法
     */
    private String busiMethod;

    private LocalDateTime requestDate;

    private LocalDateTime responseDate;

    private String userId;
}
