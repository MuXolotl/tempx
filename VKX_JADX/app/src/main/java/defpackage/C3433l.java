package defpackage;

/* JADX INFO: renamed from: lؕٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3433l extends AbstractC13399l implements InterfaceC0974l {
    private static final C3433l DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        C3433l c3433l = new C3433l();
        DEFAULT_INSTANCE = c3433l;
        AbstractC13399l.license(C3433l.class, c3433l);
    }

    public static void applovin(C3433l c3433l, String str) {
        c3433l.getClass();
        str.getClass();
        c3433l.typeUrl_ = str;
    }

    public static C16389l appmetrica() {
        return (C16389l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C3433l c3433l, int i) {
        c3433l.keyId_ = i;
    }

    public static void premium(C3433l c3433l, EnumC8938l enumC8938l) {
        c3433l.getClass();
        c3433l.status_ = enumC8938l.yandex();
    }

    public static void signatures(C3433l c3433l, EnumC9483l enumC9483l) {
        c3433l.getClass();
        c3433l.outputPrefixType_ = enumC9483l.loadAd();
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iInmobi == 3) {
            return new C3433l();
        }
        if (iInmobi == 4) {
            return new C16389l(DEFAULT_INSTANCE);
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
        synchronized (C3433l.class) {
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
