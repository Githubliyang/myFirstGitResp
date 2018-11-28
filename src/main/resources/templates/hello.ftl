<html>
<body>
<#setting classic_compatible=true>
hello!freemarker
<#if cityList??>
    <#list cityList as city>
    ${city.id}
    ${city.provinceid}
    ${city.cityname}
    ${city.description}
    </#list>
</#if>
</body>
</html>