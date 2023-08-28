//package org.example.servlet;
//
//import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
//import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
//import org.apache.hc.client5.http.impl.classic.HttpClients;
//import org.apache.hc.core5.http.ClassicHttpRequest;
//import org.apache.hc.core5.http.HttpEntity;
//import org.apache.hc.core5.http.io.entity.EntityUtils;
//import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;
//import org.apache.hc.core5.http.message.BasicNameValuePair;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.charset.StandardCharsets;
//import java.util.Arrays;
//import java.util.List;
//
//@WebServlet("/test01")
//public class Test01Servlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//
//        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
//            ClassicHttpRequest httpGet = ClassicRequestBuilder
//                    .get("http://127.0.0.1:8081/ajax02/test02").build();
//            String result = httpclient.execute(httpGet, response -> {
//                final HttpEntity entity = response.getEntity();
//                String content = EntityUtils.toString(entity);
//                EntityUtils.consume(entity);
//                return content;
//            });
//            resp.getWriter().println(result);
//        }
//
////        resp.getWriter().println("1...");
//
//
////        req.setCharacterEncoding("utf-8");
////        resp.setContentType("text/html;charset=utf-8");
//
////        String name = req.getParameter("name");
////        String sex = req.getParameter("sex");
////        resp.getWriter().println(
////                "<h3>servlet....</h3><br/>"
////                        + "name:" + name + ", sex:" + sex
////        );
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
//            ClassicHttpRequest httpPost = ClassicRequestBuilder
//                    .post("http://127.0.0.1:8081/ajax02/test02")
//                    .setEntity(new UrlEncodedFormEntity(Arrays.asList(
//                            new BasicNameValuePair("username", "vip"),
//                            new BasicNameValuePair("password", "secret"))
//                    )).build();
//            String result = httpclient.execute(httpPost, response -> {
//                final HttpEntity entity = response.getEntity();
//                String content = EntityUtils.toString(entity);
//                EntityUtils.consume(entity);
//                return content;
//            });
//            resp.getWriter().println(result);
//        }
//
//
//        //        this.doGet(req, resp);
//        // alt+右击拖拽--->连选
//
////        String username = req.getParameter("username");
////        String password = req.getParameter("password");
////        System.out.println("password = " + password);
////        resp.getWriter().println(username + ": " + password);
//
//    }
//
//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        // text/xml传输xml数据
//        resp.setContentType("text/xml;charset=utf-8");
//
//        // 读取user.xml文件内容
//        String filePath = getServletContext().getRealPath("/WEB-INF/user.xml");
//        byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
//        // 文件读取也要转码
//        String xmlData = new String(fileBytes, StandardCharsets.UTF_8);
//        resp.getWriter().write(xmlData);
//    }
//}
