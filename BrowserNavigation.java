import java.util.Stack;

interface NavigationManager {
    void openTab(String tabName);
    void goBack();
    void goForward();
    void currentTab();
}

class BrowserTab implements NavigationManager {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String current = null;

    @Override
    public void openTab(String tabName) {
        if (current != null) {
            backStack.push(current);
        }
        current = tabName;
        forwardStack.clear();
        System.out.println("Opened tab: " + current);
    }

    @Override
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(current);
            current = backStack.pop();
            System.out.println("Back to tab: " + current);
        } else {
            System.out.println("No back history.");
        }
    }

    @Override
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(current);
            current = forwardStack.pop();
            System.out.println("Forward to tab: " + current);
        } else {
            System.out.println("No forward history.");
        }
    }

    @Override
    public void currentTab() {
        System.out.println("Current tab: " + (current != null ? current : "No tab open"));
    }
}

class MobileTab extends BrowserTab {
    @Override
    public void openTab(String tabName) {
        System.out.println("[Mobile]");
        super.openTab(tabName);
    }
}

class DesktopTab extends BrowserTab {
    @Override
    public void openTab(String tabName) {
        System.out.println("[Desktop]");
        super.openTab(tabName);
    }
}

public class BrowserNavigation {
    public static void main(String[] args) {
        NavigationManager browser = new DesktopTab();

        browser.openTab("Google");
        browser.openTab("YouTube");
        browser.openTab("ChatGPT");

        browser.goBack();
        browser.goBack();
        browser.goForward();

        browser.currentTab();
    }
}
