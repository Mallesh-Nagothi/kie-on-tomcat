/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-27 02:40:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.org_kie_workbench_drools_KIEDroolsWebapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inlineeditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

    response.setHeader("Cache-Control","no-cache");
    response.setHeader("Pragma","no-cache");
    response.setDateHeader ("Expires", -1);

      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head profile=\"http://purl.org/NET/erdf/profile\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta http-equiv=\"PRAGMA\" content=\"NO-CACHE\">\n");
      out.write("    <meta http-equiv=\"Expires\" content=\"-1\">\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/jbpm.gif\" />\n");
      out.write("  <!-- lib scripts -->\n");
      out.write("  <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/compressed/designer-lib.js\" type=\"text/javascript\"></script>\n");
      out.write("  <!-- ext scripts -->\n");
      out.write("  <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/compressed/designer-ext.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">jQuery.noConflict();</script>\n");
      out.write("\n");
      out.write("    <style xmlns=\"http://www.w3.org/1999/xhtml\" media=\"screen\" type=\"text/css\">@import url(\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/lib/ext-2.0.2/resources/css/ext-all.css\");\n");
      out.write("    .extensive-remove {\n");
      out.write("        background-image: url(");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/images/remove.gif) ! important;\n");
      out.write("    }\n");
      out.write("    .extensive-install {\n");
      out.write("        background-image: url(");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/images/wrench.png) ! important;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("    <!-- utility scripts -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/compressed/designer-utils.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("  <!-- compressed stylesheets -->\n");
      out.write("  <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/designer-compressed-stylesheets.css\" type=\"text/css\" />\n");
      out.write("  <!-- The sprite css files included here must come after the ext css because the classes override classes in ext styles -->\n");
      out.write("  <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"Stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/css/sprites/sprite-stylesheets.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("  <script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/CFInstall.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- schemas -->\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.dc\" href=\"http://purl.org/dc/elements/1.1/\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.dcTerms\" href=\"http://purl.org/dc/terms/\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.b3mn\" href=\"http://b3mn.org\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.oryx\" href=\"http://oryx-editor.org/\" />\n");
      out.write("    <link xmlns=\"http://www.w3.org/1999/xhtml\" rel=\"schema.raziel\" href=\"http://raziel.org/\" />\n");
      out.write("    <!-- core scripts -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/compressed/designer-core.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- translations -->\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "i18n/translation.jsp", out, false);
      out.write("\n");
      out.write("    <!-- plugins -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/compressed/designer-plugins.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- dynamic properties -->\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/editor/?uuid=");
      out.print(request.getParameter("uuid"));
      out.write("&profile=");
      out.print(request.getParameter("profile"));
      out.write("&pp=");
      out.print(request.getParameter("pp"));
      out.write("&editorid=");
      out.print(request.getParameter("editorid"));
      out.write("&readonly=");
      out.print(request.getParameter("readonly"));
      out.write("&instanceviewmode=");
      out.print(request.getParameter("instanceviewmode"));
      out.write("&ts=");
      out.print(request.getParameter("ts"));
      out.write("&sessionId=");
      out.print(request.getParameter("sessionId"));
      out.write("\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"overflow:hidden;\" onload=\"startit();\">\n");
      out.write("    <div id=\"Definition\"> <!-- <canvas id=\"comp\"></canvas> --> </div>\n");
      out.write("    <!-- <video id=\"video\" autoplay width=\"300\" style=\"display:none\"></video>\n");
      out.write("    <canvas id=\"canvas\" style=\"width:300px;display:none;\"></canvas>\n");
      out.write("    <script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"");
      out.print(request.getContextPath());
      out.write("/org.jbpm.designer.jBPMDesigner/js/gestures/gesture.js\" type=\"text/javascript\"></script>\n");
      out.write("    -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
