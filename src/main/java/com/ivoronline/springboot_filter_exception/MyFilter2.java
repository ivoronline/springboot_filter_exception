package com.ivoronline.springboot_filter_exception;

import java.io.EOFException;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class MyFilter2 implements Filter {

  //==================================================================
  // DO FILTER
  //==================================================================
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {

    //THROW EXCEPTION DURING REQUEST
    if(1==1) { throw new EOFException("Filter Request Exception"); }

    //DIVIDES HTTP REQUEST AND RESPONSE CODE
    chain.doFilter(request, response);

  }

}
