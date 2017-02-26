import java.time.LocalDateTime;

/**
 * Message クラス
 *
 * @author  辻裕央 ←あなたの氏名を入力してください
 */
public class Message {

    /** メンバ変数の宣言 */
	/** メッセージ内容を格納する */
	private String message;
	/** メッセージ日時を格納する */
    private LocalDateTime date;

    /** コンストラクター(引数なし) */
    public Message() {
        this.message = "デフォルトメッセージ";
        this.date = LocalDateTime.now();
    }

    /**
     * コンストラクター(引数１つ)
     *
     * @param message メッセージを引数として指定します。
     */
    public Message(String message) {
        this.message = message;
        this.date = LocalDateTime.now();
    }

    /**
     * メンバ変数messageを取り出すメソッド
     *
     * @return String message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * メンバ変数dateを取り出すメソッド
     *
     * @return LocalDateTime date
     */
    public LocalDateTime getDate() {
        return this.date;
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
