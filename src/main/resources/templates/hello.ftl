<#import "common.ftl" as com>     <#-- 假设上面的模板页面名为common.ftl,导入页面 -->
<#assign dataList = bookList/>
<@com.page title="你好" bookLists= dataList>
</@com.page>


