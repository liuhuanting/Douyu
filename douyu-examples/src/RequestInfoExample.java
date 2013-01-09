///*
//* Licensed to the Apache Software Foundation (ASF) under one or more
//* contributor license agreements.  See the NOTICE file distributed with
//* this work for additional information regarding copyright ownership.
//* The ASF licenses this file to You under the Apache License, Version 2.0
//* (the "License"); you may not use this file except in compliance with
//* the License.  You may obtain a copy of the License at
//*
//*     http://www.apache.org/licenses/LICENSE-2.0
//*
//* Unless required by applicable law or agreed to in writing, software
//* distributed under the License is distributed on an "AS IS" BASIS,
//* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//* See the License for the specific language governing permissions and
//* limitations under the License.
//*/
///* $Id: RequestInfoExample.java 982412 2010-08-04 21:55:19Z markt $
// *
// */
//
//import java.io.PrintWriter;
//import java.util.ResourceBundle;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import util.HTMLFilter;
//
///**
// * Example servlet showing request information.
// *
// * @author James Duncan Davidson <duncan@eng.sun.com>
// */
//@douyu.mvc.Controller
//public class RequestInfoExample {
//
//	private static final ResourceBundle RB = ResourceBundle.getBundle("LocalStrings");
//
//	public void index(HttpRequest request, HttpResponse response, PrintWriter out) {
//		response.setContentType("text/html");
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<head>");
//
//		String title = RB.getString("requestinfo.title");
//		out.println("<title>" + title + "</title>");
//		out.println("</head>");
//		out.println("<body bgcolor=\"white\">");
//
//		// img stuff not req'd for source code html showing
//		// all links relative!
//
//		// XXX
//		// making these absolute till we work out the
//		// addition of a PathInfo issue
//
//		out.println("<a href=\"../reqinfo.html\">");
//		out.println("<img src=\"../images/code.gif\" height=24 " + "width=24 align=right border=0 alt=\"view code\"></a>");
//		out.println("<a href=\"../index.html\">");
//		out.println("<img src=\"../images/return.gif\" height=24 " + "width=24 align=right border=0 alt=\"return\"></a>");
//
//		out.println("<h3>" + title + "</h3>");
//		out.println("<table border=0><tr><td>");
//		out.println(RB.getString("requestinfo.label.method"));
//		out.println("</td><td>");
//		out.println(request.getMethod());
//		out.println("</td></tr><tr><td>");
//		out.println(RB.getString("requestinfo.label.requesturi"));
//		out.println("</td><td>");
//		out.println(HTMLFilter.filter(request.getRequestURI()));
//		out.println("</td></tr><tr><td>");
//		out.println(RB.getString("requestinfo.label.protocol"));
//		out.println("</td><td>");
//		out.println(request.getProtocol());
//		out.println("</td></tr><tr><td>");
//		out.println(RB.getString("requestinfo.label.pathinfo"));
//		out.println("</td><td>");
//		out.println(HTMLFilter.filter(request.getPathInfo()));
//		out.println("</td></tr><tr><td>");
//		out.println(RB.getString("requestinfo.label.remoteaddr"));
//
//		String cipherSuite = (String) request.getAttribute("javax.servlet.request.cipher_suite");
//		out.println("</td><td>");
//		out.println(request.getRemoteAddr());
//		out.println("</table>");
//
//		if (cipherSuite != null) {
//			out.println("</td></tr><tr><td>");
//			out.println("SSLCipherSuite:");
//			out.println("</td>");
//			out.println("<td>");
//			out.println(request.getAttribute("javax.servlet.request.cipher_suite"));
//			out.println("</td>");
//		}
//	}
//}
