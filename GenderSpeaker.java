//メインメソッド
public class GenderSpeaker {
  public static void main(String[] args) {
    Man man = new Man("男性");         // Manクラスを元にオブジェクト化する　同時にコンストラクタに引数として”男性”を渡す
    man.gender();                     // 性別判定メソッドの実行を命令
    man.speak();                      // しゃべるメソッドの実行を命令
    Woman woman = new Woman("女性");  // Womanクラスを元にオブジェクト化する　同時にコンストラクタに引数として”男性”を渡す
    woman.gender();                  // 性別判定メソッドの実行を命令
    woman.speak();                   // しゃべるメソッドの実行を命令
  }
}