package com.ivoronline.springboot_filter_exception;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Order(1)
@Component
public class MyFilter1 implements Filter {

  //==================================================================
  // DO FILTER
  //==================================================================
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException
  {
    try                         { chain.doFilter(request, response);                  }
    catch (Exception exception) { response.getWriter().write(exception.getMessage()); }
  }

}

