package defpackage;

/* JADX INFO: renamed from: lؑٓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0313l extends AbstractC13399l implements InterfaceC0974l {
    private static final C0313l DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        C0313l c0313l = new C0313l();
        DEFAULT_INSTANCE = c0313l;
        AbstractC13399l.license(C0313l.class, c0313l);
    }

    public static C16425l applovin() {
        return (C16425l) DEFAULT_INSTANCE.admob();
    }

    public static C0313l appmetrica(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C0313l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void isVip(C0313l c0313l, int i) {
        c0313l.keySize_ = i;
    }

    public final int premium() {
        return this.version_;
    }

    public final int signatures() {
        return this.keySize_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
        }
        if (iInmobi == 3) {
            return new C0313l();
        }
        if (iInmobi == 4) {
            return new C16425l(DEFAULT_INSTANCE);
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
        synchronized (C0313l.class) {
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
