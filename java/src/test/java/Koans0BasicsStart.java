import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/// Start by these koans to be friendly with running test with shortcuts
class Koans0BasicsStart {
    @Test
    void Koan00_One_shortcut_to_rule_them_all(){
        // use ⌘⇧A | Ctrl+Shift+A and search a command to toggle case
        assertThat("SHOULD BE LOWER CASE").isEqualTo("should be lower case");
    }

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
    void Koan03_make_this_test_pass_and_run_only_this_test(){
        //  by using ^⇧R | Crtl+Shift+F10 with cursor inside this test scope
        assertThat(true).isFalse();
    }

    @Test
    void Koan04_make_this_test_pass_and_rerun_all_test_of_this_class() {
        //  by using ^⇧R | Crtl+Shift+F10 with cursor between two tests
        assertThat(true).isFalse();
    }

    @Test
    void Koan05_you_can_open_run_menu_and_select_the_configuration_you_want() {
        // by using ^⌥R | Shift+Alt+F10 and select the configuration you want
        assertThat(true).isFalse();
    }

    @Test
    void Koan06_you_can_run_all_tests_by_open_run_menu_and_modify_a_configuration() {
        // by using ^⌥R | Shift+Alt+F10
        // TIP if you choose Edit configuration,
        // you can select one and modify it to run all test in your workspace
        // Then you will be abble to run all your project tests by using ^⌥R | Shift+Alt+F10
        assertThat(true).isFalse();
    }

    @Test
    void Koan07_you_can_open_next_koan_by_Navigate_to_file() {
        // by using ⌘⇧O | Ctrl+Shift+N
        assertThat(true).isFalse();
    }
}
