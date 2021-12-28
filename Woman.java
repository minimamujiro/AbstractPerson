public class Woman extends AbstractPerson {  //AbstractPersonクラスのメンバを継承する

  public Woman(String gender) {        //mainメソッドから受け取った引数”男性”をメンバ変数に代入
    this.gender = gender;
  }

  public void gender() {                //性別の判定メソッド
    if(gender.equals("女性")){
       this.gender = "I'm a woman";
    }
  }
}