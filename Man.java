public class Man extends AbstractPerson { //AbstractPersonクラスのメンバを継承する

  public Man(String gender) {       //mainメソッドから受け取った引数”男性”をメンバ変数に代入
    this.gender = gender;
  }

  public void gender() {            //性別の判定メソッド
    if(gender.equals("男性")) {
    this.gender = ("I'm a man");
    }
  }
}