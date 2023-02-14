package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;



public class HelloWorldAction extends AnAction {
    private static final String CMD = "curl -o- https://raw.githubusercontent.com/" +
            "Privado-Inc/privado-cli/main/install.sh | bash\n";
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

    }

}
