import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class NewTest {

    @Test
    void shouldTest() {
        open("http://localhost:9999/");
        SelenideElement form = $("[action]");
        form.$(".input.input_type_text input").setValue("Иван Иванов");
        form.$(".input.input_type_tel input").setValue("+79999990909");
        form.$(".checkbox").click();
        form.$("button").click();
        $(".paragraph").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}
