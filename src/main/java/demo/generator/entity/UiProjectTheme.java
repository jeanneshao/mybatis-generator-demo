package demo.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 前台主题表
 * </p>
 *
 * @author wanggc
 * @since 2023-05-06 06:06:53
 */
@Getter
@Setter
@TableName("ui_project_theme")
public class UiProjectTheme implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 项目ID,ui_project
     */
    private Long projectId;

    /**
     * 登录页左侧图片所在的部署地址
     */
    private String loginImgName;

    /**
     * 浏览器Tab页图标所在的部署地址
     */
    private String titleImgName;

    /**
     * 页面导航栏图标所在的部署地址
     */
    private String frameImgName;

    /**
     * 登录页右侧项目图标所在的部署地址
     */
    private String logoImgName;

    /**
     * 按钮颜色
     */
    private String qPrimary;

    /**
     * 高亮字段颜色
     */
    private String qSecondary;

    /**
     * 顶部栏颜色
     */
    private String verisPrimary;

    /**
     * 菜单栏底色
     */
    private String verisSecondary;

    /**
     * 详情页标题栏底色
     */
    private String verisThird;

    /**
     * 菜单高亮色
     */
    private String verisPrimaryContrast;

    /**
     * 详情页图标色
     */
    private String verisSecondaryContrast;

    /**
     * 主背景色
     */
    private String verisBgSecondary;

    /**
     * 字段文字颜色
     */
    private String verisTextPrimary;

    /**
     * 字段标题颜色
     */
    private String verisTextSecondary;

    /**
     * 表格右上角按钮颜色
     */
    private String verisTextThird;

    /**
     * 表格文字颜色
     */
    private String verisTextFourth;

    /**
     * Tooltip背景色
     */
    private String verisTooltipColor;

    /**
     * 表格文字/表单标题字号大小
     */
    private String verisTextsizePrimary;

    /**
     * 详情页正文字号大小
     */
    private String verisTextsizeSecondary;

    /**
     * 正文最小高度、表格业务名、详情页实体名字
     */
    private String verisTextsizeThird;

    /**
     * 按钮默认宽度
     */
    private String verisBtnWidth;

    /**
     * 预留字段
     */
    private String futureEnhance;

    /**
     * 租户ID
     */
    private byte[] tenantId;

    /**
     * 项目ID
     */
    private byte[] assetId;

    private LocalDateTime createdTime;

    private String operator;

    private LocalDateTime updateTime;

    private String updOperator;
}
