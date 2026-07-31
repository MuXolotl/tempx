package defpackage;

/* JADX INFO: renamed from: lٖؓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16152l extends AbstractC13399l implements InterfaceC0974l {
    private static final C16152l DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        C16152l c16152l = new C16152l();
        DEFAULT_INSTANCE = c16152l;
        AbstractC13399l.license(C16152l.class, c16152l);
    }

    public static C1272l inmobi() {
        return (C1272l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C16152l c16152l, EnumC7004l enumC7004l) {
        c16152l.getClass();
        c16152l.hash_ = enumC7004l.loadAd();
    }

    public static C16152l premium() {
        return DEFAULT_INSTANCE;
    }

    public static void signatures(C16152l c16152l, int i) {
        c16152l.tagSize_ = i;
    }

    public final EnumC7004l applovin() {
        EnumC7004l enumC7004lYandex = EnumC7004l.yandex(this.hash_);
        return enumC7004lYandex == null ? EnumC7004l.UNRECOGNIZED : enumC7004lYandex;
    }

    public final int appmetrica() {
        return this.tagSize_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
        }
        if (iInmobi == 3) {
            return new C16152l();
        }
        if (iInmobi == 4) {
            return new C1272l(DEFAULT_INSTANCE);
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
        synchronized (C16152l.class) {
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
