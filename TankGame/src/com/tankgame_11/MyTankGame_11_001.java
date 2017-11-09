    -->
  <!--                       [Platform default]                             -->
  <!--                                                                      -->
  <!--   outputEncoding      The encoding to use for the page that results  -->
  <!--                       from the SSI processing. [UTF-8]               -->
  <!--                                                                      -->
  <!--   allowExec           Is use of the exec command enabled? [false]    -->

<!--
    <servlet>
        <servlet-name>ssi</servlet-name>
        <servlet-class>
          org.apache.catalina.ssi.SSIServlet
        </servlet-class>
        <init-param>
          <param-name>buffered</param-name>
          <param-value>1</param-value>
        </init-param>
        <init-param>
          <param-name>debug</param-name>
          <param-value>0</param-value>
        </init-param>
        <init-param>
          <param-name>expires</param-name>
          <param-value>666</param-value>
        </init-param>
        <init-param>
          <param-name>isVirtualWebappRelative</param-name>
          <param-value>false</param-value>
        </init-param>
        <load-on-startup>4</load-on-startup>
    </servlet>
-->


  <!-- Common Gateway Includes (CGI) processing servlet, which supports     -->
  <!-- execution of external applications that conform to the CGI spec      -->
  <!-- requirements.  Typically, this servlet is mapped to the URL pattern  -->
  <!-- "/cgi-bin/*", which means that any CGI applications that are         -->
  <!-- executed must be present within the web application.  This servlet   -->
  <!-- supports the following initialization parameters (default values     -->
  <!-- are in square brackets):                                             -->
  <!--                                                                      -->
  <!--   cgiPathPrefix        The CGI search path will start at             -->
  <!--                        webAppRootDir + File.separator + this prefix. -->
  <!--                        If not set, then webAppRootDir is used.       -->
  <!--                        Recommended value: WEB-INF/cgi                -->
  <!--                                                                      -->
  <!--   enableCmdLineArguments                                             -->
  <!--                        Are command line parameters generated from    -->
  <!--                        the query string as per section 4.4 of 3875   -->
  <!--                        RFC? [true]                                   -->
  <!--                                                                      -->
  <!--   executable           Name of the executable used to run the        -->
  <!--                        script. [perl]                                -->
  <!--                                                                      -->
  <!--   envHttpHeaders       A regular expression used to select the HTTP  -->
  <!--                        headers passed to the CGI process as          -->
  <!--                        environment variables. Note that headers are  -->
  <!--                        converted to upper case before matching and   -->
  <!--                        that the entire header name must match the    -->
  <!--                        pattern.                                      -->
  <!--                        [ACCEPT[-0-9A-Z]*|CACHE-CONTROL|COOKIE|HOST|  -->
  <!--                         IF-[-0-9A-Z]*|REFERER|USER-AGENT]            -->
  <!--                                                                      -->
  <!--  environment-variable- An environment to be set for the execution    -->
  <!--                        environment of the CGI script. The name of    -->
  <!--                        variable is taken from the parameter name.    -->
  <!--                        To configure an environment variable named    -->
  <!--                        FOO, configure a parameter named              -->
  <!--                        environment-variable-FOO. The parameter value -->
  <!--                        is used as the environment variable value.    -->
  <!--                        The default is no environment variables.      -->
  <!--                                                                      -->
  <!--   parameterEncoding    Name of parameter encoding to be used with    -->
  <!--                        CGI servlet.                                  -->
  <!--                        [System.getProperty("file.encoding","UTF-8")] -->
  <!--                                                                      -->
  <!--   passShellEnvironment Should the shell environment variables (if    -->
  <!--                        any) be passed to the CGI script? [false]     -->
  <!--                                                                      -->
  <!--   stderrTimeout        The time (in milliseconds) to wait for the    -->
  <!--                        reading of stderr to complete before          -->
  <!--                        terminating the CGI process. [2000]           -->

<!--
    <servlet>
        <servlet-name>cgi</servlet-name>
        <servlet-class>org.apache.catalina.servlets.CGIServlet</servlet-class>
        <init-param>
          <param-name>cgiPathPrefix</param-name>
          <param-value>WEB-INF/cgi</param-value>
        </init-param>
        <load-on-startup>5</load-on-startup>
    </servlet>
-->


  <!-- ================ Built In Servlet Mappings ========================= -->


  <!-- The servlet mappings for the built in servlets defined above.  Note  -->
  <!-- that, by default, the CGI and SSI servlets are *not* mapped.  You    -->
  <!-- must uncomment these mappings (or add them to your application's own -->
  <!-- web.xml deployment descriptor) to enable these services              -->

    <!-- The mapping for the default servlet -->
    <servlet-mapping>
        <servlet-name>default</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>

    <!-- The mappings for the JSP servlet -->
    <servlet-mapping>
        <servlet-name>jsp</servlet-name>
        <url-pattern>*.jsp</url-pattern>
        <url-pattern>*.jspx</url-pattern>
    </servlet-mapping>

    <!-- The mapping for the SSI servlet -->
<!--
    <servlet-mapping>
        <servlet-name>ssi</servlet-name>
        <url-pattern>*.shtml</url-pattern>
    </servlet-mapping>
-->

    <!-- The mapping for the CGI Gateway servlet -->

<!--
    <servlet-mapping>
        <servlet-name>cgi</servlet-name>
        <url-pattern>/cgi-bin/*</url-pattern>
    </servlet-mapping>
-->


  <!-- ================== Built In Filter Definitions ===================== -->

  <!-- A filter that sets various security related HTTP Response headers.   -->
  <!-- This filter supports the following initialization parameters         -->
  <!-- (default values are in square brackets):                             -->
  <!--                                                                      -->
  <!--   hstsEnabled         Should the HTTP Strict Transport Security      -->
  <!--                       (HSTS) header be added to the response? See    -->
  <!--                       RFC 6797 for more information on HSTS. [true]  -->
  <!--                                                                      -->
  <!--   hstsMaxAgeSeconds   The max age value that should be used in the   -->
  <!--                       HSTS header. Negative values will be treated   -->
  <!--                       as zero. [0]                                   -->
  <!--                                                                      -->
  <!--   hstsIncludeSubDomains                                              -->
  <!--                       Should the includeSubDomains parameter be      -->
  <!--                       included in the HSTS header.                   -->
  <!--                                                                      -->
  <!--   antiClickJackingEnabled                                            -->
  <!--                       Should the anti click-jacking header           -->
  <!--                       X-Frame-Options be added to every response?    -->
  <!--                       [true]                                         -->
  <!--                                                                      -->
  <!--   antiClickJackingOption                                             -->
  <!--                       What value should be used for the header. Must -->
  <!--                