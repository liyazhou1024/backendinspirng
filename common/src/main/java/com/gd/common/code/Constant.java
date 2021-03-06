package com.gd.common.code;

public final class Constant {
    /**
     * 生成代码所在的基础包名称，可根据自己公司的项目修改
     * （注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）
     */
    public static final String BASE_PACKAGE = "com.gd.business";

    /**
     * common所在的基础包
     */
    public static final String BASE_PACKAGE_FRAME = "com.gd.common";

    /**
     * 生成的Model所在包
     */
    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".pojo";

    /**
     * 生成的Mapper所在包
     */
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";

    /**
     * 生成的Service所在包
     */
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";

    /**
     * 生成的ServiceImpl所在包
     */
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";

    /**
     * 生成的Controller所在包
     */
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".rest";

    /**
     * java文件路径
     */
    public static final String JAVA_PATH = "/business/src/main/java";

    /**
     * 资源文件路径
     */
    public static final String RESOURCES_PATH = "/business/src/main/resources";
}
