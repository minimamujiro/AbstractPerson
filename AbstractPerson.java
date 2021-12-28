// ここで共通する事項を継承させる
public abstract class AbstractPerson {  //抽象メソッドがクラス内に含まれている事を宣言している
   //性別変数
   String gender;
   //メソッドがあることは分かっているがどんなメソッドか分かっていない（抽象メソッド）
   abstract void gender();
   //言葉を発するメソット
   public void speak() {
    System.out.println(gender);
   }
}