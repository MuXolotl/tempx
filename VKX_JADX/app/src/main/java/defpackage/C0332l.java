package defpackage;

/* JADX INFO: renamed from: lؑٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0332l extends AbstractC13399l implements InterfaceC0974l {
    private static final C0332l DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC9858l keyInfo_ = C18368l.f35882l;
    private int primaryKeyId_;

    static {
        C0332l c0332l = new C0332l();
        DEFAULT_INSTANCE = c0332l;
        AbstractC13399l.license(C0332l.class, c0332l);
    }

    public static void isVip(C0332l c0332l, C3433l c3433l) {
        c0332l.getClass();
        InterfaceC9858l interfaceC9858l = c0332l.keyInfo_;
        if (!((AbstractC7021l) interfaceC9858l).f14716l) {
            c0332l.keyInfo_ = interfaceC9858l.yandex(interfaceC9858l.size() * 2);
        }
        c0332l.keyInfo_.add(c3433l);
    }

    public static C12294l premium() {
        return (C12294l) DEFAULT_INSTANCE.admob();
    }

    public static void signatures(C0332l c0332l, int i) {
        c0332l.primaryKeyId_ = i;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C3433l.class});
        }
        if (iInmobi == 3) {
            return new C0332l();
        }
        if (iInmobi == 4) {
            return new C12294l(DEFAULT_INSTANCE);
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
        synchronized (C0332l.class) {
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
