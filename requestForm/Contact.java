//contact.htmlからのリクエストパラメーターを受けるサーブレット
package requestForm;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/requestForm/contact"})

public class Contact extends HttpServlet{
    public void doPost(
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException{
        //リクエストパラメーターを受けるための文字エンコーディング指定
        request.setCharacterEncoding("utf-8");
        //リクエストパラメーターをString型の変数に代入
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String tel = request.getParameter("tel");
        String mail = request.getParameter("mail");
        String check = request.getParameter("check");
        String contents = request.getParameter("contents");
        String answer = request.getParameter("answer");

        //レスポンス表示のための文字エンコーディング指定
        response.setContentType("text/html; charset=utf-8");
        //戻り値がPrintWriterのオブジェクトであるresponse.getWriterメソッドでクライアントにテキストを送信する準備
        PrintWriter out = response.getWriter();
        //クライアントに表示するためのHTMLの記述
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<mata charset=\"utf-8\">");
        out.println("<title>入力確認</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>お名前："+name+"\n様</p>");
        out.println("<p>ご住所:"+address+"</p>");
        out.println("<p>お電話番号:"+tel+"</p>");
        out.println("<p>e-mail:"+mail+"</p>");
        out.println("<p>お問い合わせ内容:"+check+"</p>");
        out.println("<p>"+contents+"</p>");
        out.println("<p>ご連絡方法:"+answer+"</p>");
        out.println("</body>");
        out.println("</html>");
    }

}
