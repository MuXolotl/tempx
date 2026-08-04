package defpackage;

/* JADX INFO: renamed from: lٖۥؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16756l extends AbstractC13399l implements InterfaceC0974l {
    private static final C16756l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC15257l keyValue_ = AbstractC15257l.f29847l;
    private int version_;

    static {
        C16756l c16756l = new C16756l();
        DEFAULT_INSTANCE = c16756l;
        AbstractC13399l.license(C16756l.class, c16756l);
    }

    public static C12510l applovin() {
        return (C12510l) DEFAULT_INSTANCE.admob();
    }

    public static C16756l appmetrica(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C16756l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static InterfaceC14781l inmobi() {
        return DEFAULT_INSTANCE.smaato();
    }

    public static void isVip(C16756l c16756l, C14809l c14809l) {
        c16756l.getClass();
        c16756l.keyValue_ = c14809l;
    }

    public final int premium() {
        return this.version_;
    }

    public final AbstractC15257l signatures() {
        return this.keyValue_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
        }
        if (iInmobi == 3) {
            return new C16756l();
        }
        if (iInmobi == 4) {
            return new C12510l(DEFAULT_INSTANCE);
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
        synchronized (C16756l.class) {
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
