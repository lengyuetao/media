package com.tao.common;

/**
 * Created by cloud on 2017/10/11.
 */
public class CommonConstant {

    public final static byte STATUS_0 = 0;
    public final static byte STATUS_1 = 1;
    public final static byte STATUS_2 = 2;
    public final static byte STATUS_3 = 3;

    

	public static final String HANDER_USER_ID = "userId";
	public static final String USER_NAME="userName";
	public static final String HANDER_TICKET = "ticket";
	public static final String HANDER_PLATFORM = "platform";
	
	public static final String RES_DATA = "data";
	public static final String RES_TOTAL = "total";
	public static final String RES_LIST = "list";
	public static final String RES_ITEMS="items";
	public static final String RES_SUBS="subs";

	public static final String RESULT_VOLUME = "volume";
	public static final String RESULT_TREND = "trend";
	/**
	 * 次新价格
	 */
	public static final String SECOND_PRICE = "secondPrice";

	/**
	 * 随机输出字母、数字或者随机 char=字母 num=数字 all=随机
	 */
	public static final String RADOM_OUT_CHAR = "char";
	public static final String RADOM_OUT_NUM = "num";
	public static final String RADOM_OUT_ALL = "all";


	/**支付交易请求人民币代码**/
	public static final String PAY_CNY_TYPE = "CNY";
	
	/**人民币代码**/
	public static final String COIN_CNY_CODE = "EX";

	/**默认转换币种**/
	public static final String DEFAULT_MONEY_TYPE = "EX";
	
	
	/**
	 * 用户token
	 */
	public static final String USER_TOKEN="user_token";
	
	/**
	 * 验证码输入错误次数参数
	 */
	public static final String ERROR_CODE_NUMBER="errorCode_number_";
	/**
	 * 验证码输入错误最大次数
	 */
	public static final short ERROR_CODE_COUNTS=6;
	/**
	 * 邮件验证码
	 */
	public static final String EMAIL_CODE="_email_code";
	/**
	 * 验证码长度
	 */
	public static final short EMAIL_CODE_LENGTH=6;
	
	
	
	/**
	 * 服务名称(一般定义为常量) 如 Google Github 印象笔记 等(不参与运算,只是为了与其他服务作区分)
	 */
	public static final String AUTH_ISSUER="天牛交易系统";
	/**
	 * 获取用户名称(从数据库或者缓存),可以是登录名,邮箱,手机(不参与运算,只是为了与其他服务作区分)
	 */
	public static final String AUTH_ACCOUNT="kaipai.net";
	/**
	 * 用户双重认证密钥
	 */
	public static final String AUTH_USER_SECRETKEY="_auth_user_secret";
	/**
	 * 登录双重验证
	 */
	public static final String LOGIN_AUTH_TYPE="login_auth_type";
	/**
	 * 资金转出双重验证
	 */
	public static final String MONEY_AUTH_TYPE="money_auth_type";
	
	/**
	 * 登录双重验证token
	 */
	public static final String Login_ATUTH_TOEKN="login_auth_token";
	/**
	 * 资金转出双重验证token
	 */
	public static final String MONEY_AUTH_TOKEN="money_auth_token";
	/**
	 * 开启双重验证session缓存
	 */
	public static final short AUTH_TOKEN_ON=1;


	public static final String TRADE_WHITE_IP = "white_ips";
	
	/**
	 * 邮箱正则表达式
	 */
	public static final String EMAIL_REGEX = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
	
	public static final int  USER_RANDOM_PASSWORD_LENGTH=8;//随机密码长度
	/**
	 * 用户激活码
	 */
	public static final String USER_ACTIVE_CODE="_active_code";
	
	public static final String QRCODE_IMAGE_PATH="/WEB-INF/codeImgs/";


	public static final String CANCEL_ORDER_SOURCE_USER= "USER";
	public static final String CANCEL_ORDER_SOURCE_SYS= "SYS";

	/**提现类型WX**/
	public static final int WITHDRAW_TYPE_WX= 0;
	/**提现类型银联**/
	public static final int WITHDRAW_TYPE_YL= 2;

	/**提现待审核**/
	public static final int WITHDRAW_AUDIT_STATUS_ZERO= 0;
	/**提现审核通过**/
	public static final int WITHDRAW_AUDIT_STATUS_YES= 1;
	/**提现审核驳回**/
	public static final int WITHDRAW_AUDIT_STATUS_FAIL= 2;
	/**提现审核处理中**/
	public static final int WITHDRAW_AUDIT_STATUS_RUNING= 3;

	/**快速提现状态1**/
	public static final int WITHDRAW_QUCIK_STATUS_YES= 1;
}
