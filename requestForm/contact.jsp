<%--JSPによるフォーム入力用のhtmlの記述--%>
<%@page contentType="text/html; charset=utf-8"%>
<%--ヘッダー部分の外部htmlファイルの読み込み--%>
<%@include file="header.html"%>
<%--以下contact.htmlのbodyのコピー--%>
    <h3>お問い合わせ</h3>
    <P>ご意見・ご質問等がございましたらお気軽にお問い合わせください。</P>

    <form action="contact" method="post">
            <p>
                <label>氏名<br>
                <input type="text" name="name" required></label>
            </p>
            <p>
                <label>住所<br>
                <input type="text" name="address" size="60" required></label>
            </p>

            <p>
                <label>電話番号<br>
                <input type="tel" name="tel" required></label>
            </p>

            <p>
                <label>メールアドレス<br>
                <input type="mail" name="mail" size="40" required></label>
            </p>
            <!--チェックボックス　入力されたなければnullがリクエストパラメーターになる-->
            <p>
                お問い合わせ内容<br>
                <label><input type="checkbox" name="check" value="商品について">商品について</label>
                <label><input type="checkbox" name="check" value="配送について">配送について</label>
                <label><input type="checkbox" name="check" value="お支払いについて">お支払いについて</label>
                <label><input type="checkbox" name="check" value="その他">その他</label>
            </p>
            <p>
                詳細な問い合わせ内容をご記入ください<br>
                <textarea name="contents" rows="10" cols="50"></textarea>
            </p>
            <!--ラジオボタン-->
            <p>
                弊社からのご連絡方法<br>
                <label><input type="radio" name="answer" value="電話">電話</label>
                <label><input type="radio" name="answer" value="メール">メール</label>
                <label><input type="radio" name="answer" value="郵便">郵便</label>
            </p>
            <p>
                お買い得情報メールマガジンの配信設定<br>
                <label><input type="radio" name="mailmgzn" value="配信を希望する">配信を希望する</label>
                <label><input type="radio" name="mailmgzn" value="配信を希望しない">配信を希望しない</label>
            </p>
            <p>
                メールマガジンで欲しい情報のジャンルを選択してください（複数可）<br>
                <label><input type="checkbox" name="inf" value="食品">食品</label>
                <label><input type="checkbox" name="inf" value="健康">健康</label>
                <label><input type="checkbox" name="inf" value="ダイエット">ダイエット</label>
                <label><input type="checkbox" name="inf" value="栄養補助食品">栄養補助食品</label>
                <label><input type="checkbox" name="inf" value="サプリメント">サプリメント</label>
                <label><input type="checkbox" name="inf" value="スポーツ">スポーツ</label>
                <label><input type="checkbox" name="inf" value="デトックス">デトックス</label>
                <label><input type="checkbox" name="inf" value="基礎トレーニング">基礎トレーニング</label>
            </p>
            <input type="submit" value="送信する">
    </form>

<%@include file="footer.html"%>
