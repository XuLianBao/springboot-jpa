<#macro page title,bookLists>
<html>
<head>
    <title>${title?html}</title>
</head>
<body>
<#-- ...用于引入用户自定义指令的标签体 -->
    <@bookList books=bookLists/>
</body>
</html>
</#macro>

<#macro bookList books>
 <#if books??>
书名:<select>
     <option>请选择</option>
     <#list books as item>
         <option value="${item.bookType}">${item.bookName}</option>
     </#list>
 </select>
 </#if>
</#macro>