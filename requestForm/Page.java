
//サーブレット共通部分のパーツ化　HTMLのヘッダー記述　フッター記述
package requestForm;

import java.io.PrintWriter;

public class Page{
    //headerの処理メソッド
    public void header(PrintWriter out){
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>確認</title>");
        out.println("</head>");
        out.println("<body>");
    }

    //foooterの処理メソッド
    public void footer(PrintWriter out){
        out.println("<footer>");
        out.println("<br><address>株式会社　sato<br>");
        out.println("<small>宮崎県宮崎市柳丸<br>");
        out.println("tel：0985-00-0000<br>");
        out.println("e-mail：xxxx@yy.bb<small></address>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
    }
}
