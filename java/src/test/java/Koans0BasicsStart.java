import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class Koans0BasicsStart {
    @Test
    void Koan01_first_of_all_run_all_test_of_this_file_with_cursor_on_top_of_the_file(){
        // by using ^⇧R | Ctrl+Shift+F10
        assertThat("Then change this to make this test pass").isEqualTo(true);
    }

    @Test
    void Koan02_make_this_test_pass_and_rerun_last_test_execution() {
        // by using  ^R  |  Shift + F10
        assertThat(true).isFalse();
    }

    @Test
    void Koan03_you_can_also_navigate_to_next_failing_test(){
        // by using F2
        assertThat("it's quite easier isn't it ?").isEqualTo("then make this test pass");
    }

    @Test
    void Koan04_make_this_test_pass_and_rerun_only_this_test(){
        //  by using ^⇧R | Crtl+Shift+F10 with cursor inside this test scope
        assertThat(true).isFalse();
    }

    @Test
    void Koan05_make_this_test_pass_and_rerun_all_test() {
        //  by using ^⇧R | Crtl+Shift+F10 with cursor between two tests
        assertThat(true).isFalse();
    }

    @Test
    void Koan06_you_can_open_run_menu() {
        // by using ^⌥R | Shift+Alt+F10 and select the configuration you want
        assertThat(true).isFalse();
    }

    @Test
    void Koan07_you_can_open_next_koan_by_Navigate_to_file() {
        // by using ⌘⇧O | Ctrl+Shift+N
        assertThat(true).isFalse();
    }
}
