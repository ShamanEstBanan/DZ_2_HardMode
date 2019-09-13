package Protey;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class authorization {

    @BeforeMethod
    public void settings(){
        Configuration.browser = "chrome";
        //Configuration.startMaximized = Boolean.parseBoolean("true");

    }

    @Test
    public void test_1(){   //Валидная авторизация

        //авторизация
        open("file:///C:/Users/bugag/Desktop/qa/qa-test.html");
        $("#loginEmail").setValue("test@protei.ru"); //валидный Email
        $("#loginPassword").setValue("test");//валидный пароль
        $("#authButton").click();


        //ввод данных в базу
        $("#dataEmail").setValue("test1@protei.ru"); //Ввод Email
        $("#dataName").setValue("Иван");//Ввод имени
        $$("#dataGender").findBy(value("Мужской")).click();//Выбор варианта "Мужской" из выпадающего списка "Пол"
        //sleep(2000);

        $("#dataGender").selectOption("Женский");
       // sleep(2000);
        //$$("#dataGender").findBy(text("Мужской")).click();//Выбор варианта "Мужской" из выпадающего списка "Пол"
        $("#dataCheck11").click(); //чекбокс "Вариант 1.1"
        $("#dataSelect21").click();//радиокнопка "Вариант 2.1"
        $("#dataSend").click();// клик на кнопку "Добавить"

        sleep(5000);
      //  9213758768


    }




}
