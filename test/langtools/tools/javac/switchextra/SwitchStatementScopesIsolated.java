/*
 * @test /nodynamiccopyright/
 * @bug 8206986
 * @summary Verify that scopes in rule cases are isolated.
 * @compile/fail/ref=SwitchStatementScopesIsolated.out -XDrawDiagnostics --enable-preview -source 13 SwitchStatementScopesIsolated.java
 */

public class SwitchStatementScopesIsolated {

    private void scopesIsolated(int i) {
        switch (i) {
            case 0 -> { String res = "NULL-A"; }
            case 1 -> { res = "NULL-A"; }
            default -> { res = "NULL-A"; }
        }
    }

}
