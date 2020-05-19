package xxx.xxx.xxx.datascope.enums;

public enum DataScopeEnum {
    ALL(1, "全部"),
    OWN(2, "本人可见"),
    OWN_DEPT(3, "所在机构可见"),
    OWN_DEPT_CHILD(4, "所在机构及子级可见"),
    CUSTOM(5, "自定义");

    private final int type;
    private final String description;

    public static DataScopeEnum of(Integer dataScopeType) {
        /*==============================================*/
        /**
        *   迷惑行为No.1
        */
        if (dataScopeType == null) {
            return null;
        } else {

            DataScopeEnum[] values = values();
            DataScopeEnum[] var2 = values;
            int var3 = values.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                DataScopeEnum scopeTypeEnum = var2[var4];
                if (scopeTypeEnum.type == dataScopeType) {
                    return scopeTypeEnum;
                }
            }

            return null;
        }
        /*==============================================*/
    }

    public int getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    private DataScopeEnum(final int type, final String description) {
        this.type = type;
        this.description = description;
    }
}