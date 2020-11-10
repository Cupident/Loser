## startPage()方法解析
```java
/**
 *startPage()-TableSupport.buildPageRequest();
 *-getPageDomain();
**/
class TableSupport{
public static PageDomain getPageDomain(){
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(Constants.IS_ASC));
        return pageDomain;
    }
//之后是ServletUtils解析getParameterToInt
//解析getRequest().getParameter(name)
//解析getRequestAttributes().getRequest()
//RequestContextHolder.getRequestAttributes();boss出现
//boss持有上下文的Request容器


}
```