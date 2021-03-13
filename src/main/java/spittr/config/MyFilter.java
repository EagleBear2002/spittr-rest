package spittr.config;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Enumeration<String> names = ((HttpServletRequest) servletRequest).getHeaderNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = ((HttpServletRequest) servletRequest).getHeader(name);
            System.out.println("name: " + name + "  value: " + value);
        }
        System.out.println("======end=======");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
