package iceking.base.utils;

import iceking.base.page.ColumnFilter;
import iceking.base.page.PageRequest;

public class ColumnFilterUtils {
    /**
     * 获取过滤字段的值
     * @param filterName
     * @return
     */
    public static String getColumnFilterValue(PageRequest pageRequest, String filterName) {
        String value = null;
        ColumnFilter columnFilter = pageRequest.getColumnFilter(filterName);
        if(columnFilter != null) {
            value = columnFilter.getValue();
        }
        return value;
    }
}
