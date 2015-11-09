/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.core.cors;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tutu
 */
@Component
@EnableConfigurationProperties
public class CORSFilter implements Filter {

    @Value("${spring.cors.allowOrigin}")
    private String allowOrigin;
    @Value("${spring.cors.allowCredentials}")
    private String allowCredentials;
    @Value("${spring.cors.allowMethods}")
    private String allowMethods;
    @Value("${spring.cors.allowHeaders}")
    private String allowHeaders;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", allowOrigin);
        response.setHeader("Access-Control-Allow-Credentials", allowCredentials);
        response.setHeader("Access-Control-Allow-Methods", allowMethods);
        response.setHeader("Access-Control-Allow-Headers", allowHeaders);
        chain.doFilter(req, res);

    }

    @Override
    public void init(FilterConfig filterConfig) {
        // should be empty - has to be overdriven, but isn't needed
    }

    @Override
    public void destroy() {
        // should be empty - has to be overdriven, but isn't needed
    }

}

