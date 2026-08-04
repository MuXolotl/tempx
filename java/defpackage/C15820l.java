package defpackage;

/* JADX INFO: renamed from: lٕٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15820l extends AbstractC13399l implements InterfaceC0974l {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C15820l DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER;
    private String configName_ = "";
    private InterfaceC9858l entry_ = C18368l.f35882l;

    static {
        C15820l c15820l = new C15820l();
        DEFAULT_INSTANCE = c15820l;
        AbstractC13399l.license(C15820l.class, c15820l);
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C2662l.class});
        }
        if (iInmobi == 3) {
            return new C15820l();
        }
        if (iInmobi == 4) {
            return new C13091l(DEFAULT_INSTANCE, 2);
        }
        if (iInmobi == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iInmobi != 6) {
            throw null;
        }
        InterfaceC14781l interfaceC14781l = PARSER;
        if (interfaceC14781l != null) {
            return interfaceC14781l;
        }
        synchronized (C15820l.class) {
            try {
                c6768l = PARSER;
                if (c6768l == null) {
                    c6768l = new C6768l();
                    PARSER = c6768l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6768l;
    }
}
