                      -->
  <!--                                                                      -->
  <!--   readmeFile          File to display together with the directory    -->
  <!--                       contents. [null]                               -->
  <!--                                                                      -->
  <!--   sendfileSize        If the connector used supports sendfile, this  -->
  <!--                       represents the minimal file size in KB for     -->
  <!--                       which sendfile will be used. Use a negative    -->
  <!--                       value to always disable sendfile.  [48]        -->
  <!--                                                                      -->
  <!--   useAcceptRanges     Should the Accept-Ranges header be included    -->
  <!--                       in responses where appropriate? [true]         -->
  <!--                                                                      -->
  <!--  For directory listing customization. Checks localXsltFile, then     -->
  <!--  globalXsltFile, then defaults to original behavior.                 -->
  <!--                                                                      -->
  <!--   localXsltFile       Make directory listings an XML doc and         -->
  <!--                       pass the result to this style sheet residing   -->
  <!--                       in that directory. This overrides              -->
  <!--                       contextXsltFile and globalXsltFile[null]       -->
  <!--                                                                      -->
  <!--   contextXsltFile     Make directory listings an XML doc and         -->
  <!--                       pass the result to this style sheet which is   -->
  <!--                       relative to the context root. This overrides   -->
  <!--                       globalXsltFile[null]                           -->
  <!--                                                                      -->
  <!--   globalXsltFile      Site wide configuration version of             -->
  <!--                       localXsltFile. This argument must either be an -->
  <!--                       absolute or relative (to either                -->
  <!--                       $CATALINA_BASE/conf or $CATALINA_HOME/conf)    -->
  <!--                       path that points to a location below either    -->
  <!--                       $CATALINA_BASE/conf (checked first) or         -->
  <!--                       $CATALINA_HOME/conf (checked second).[null]    -->
  <!--                                                                      -->
  <!--   showServerInfo      Should server information be presented in the  -->
  <!--                       response sent to clients when directory        -->
  <!--                       listings is enabled? [true]                    -->

    <servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
            <param-value>0</param-value>
        </init-param>
        <init-param>
            <param-name>listings</param-name>
            <param-value>false</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>


  <!-- The JSP page compiler and execution servlet, which is the mechanism  -->
  <!-- used by Tomcat to support JSP pages.  Traditionally, this servlet    -->
  <!-- is mapped to the URL pattern "*.jsp".  This servlet supports the     -->
  <!-- following initialization parameters (default values are in square    -->
  <!-- brackets):                                                           -->
  <!--                                                                      -->
  <!--   checkInterval       If development is false and checkInterval is   -->
  <!--                       greater than zero, background compilations are -->
  <!--                       enabled. checkInterval is the time in seconds  -->
  <!--                       between checks to see if a JSP page (and its   -->
  <!--                       dependent files) needs to  be recompiled. [0]  -->
  <!--                                                                      -->
  <!--   classdebuginfo      Should the class file be compiled with         -->
  <!--                       debugging information?  [true]                 -->
  <!--                                                                      -->
  <!--   classpath           What class path should I use while compili