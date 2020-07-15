
//　サーブレットのヘッダーフッター処理クラス
package tool;

import java.io.PrintWriter;

public class Page{
  //headerの処理メソッド
  public static void header(PrintWriter out){
    out.println("<!doctype html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>servlet/jps sample prgrams</title>");
    out.println("</head>");
    out.println("<body>");
  }

  //foooterの処理メソッド
  public static void footer(PrintWriter out){
    out.println("</body>");
    out.println("</html>");
  }
}
