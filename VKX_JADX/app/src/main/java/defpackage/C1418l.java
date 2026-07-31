package defpackage;

/* JADX INFO: renamed from: lُؒۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1418l extends AbstractC13399l implements InterfaceC0974l {
    private static final C1418l DEFAULT_INSTANCE;
    private static volatile InterfaceC14781l PARSER;

    static {
        C1418l c1418l = new C1418l();
        DEFAULT_INSTANCE = c1418l;
        AbstractC13399l.license(C1418l.class, c1418l);
    }

    public static C1418l isVip() {
        return DEFAULT_INSTANCE;
    }

    public static void signatures(AbstractC15257l abstractC15257l, C7597l c7597l) {
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iInmobi == 3) {
            return new C1418l();
        }
        if (iInmobi == 4) {
            return new C13091l(DEFAULT_INSTANCE, 0);
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
        synchronized (C1418l.class) {
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
