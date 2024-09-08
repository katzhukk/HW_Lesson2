import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {//Заголовок нашего скрипта /*не рекомендуется больше 50 тестов*/

    @Test
    void successfulSearchTest(){    //Успешный поиск в браузере Google Chrome

        open("https://www.google.com/");    /*Открывает гугл*/
        $("[name=q]").setValue("selenide").pressEnter();    /*Вводит в поисковую строку selenide*/
        $("[id=search]").shouldHave(text("https://ru.selenide.org")); /*Проверяет, что selenide появился в рез-тах поиска [id=search] или html*/
    }
}
