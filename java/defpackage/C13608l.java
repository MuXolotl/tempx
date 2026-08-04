package defpackage;

/* JADX INFO: renamed from: lْٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13608l extends AbstractC13399l implements InterfaceC0974l {
    private static final C13608l DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC15257l value_ = AbstractC15257l.f29847l;

    static {
        C13608l c13608l = new C13608l();
        DEFAULT_INSTANCE = c13608l;
        AbstractC13399l.license(C13608l.class, c13608l);
    }

    public static C13608l applovin() {
        return DEFAULT_INSTANCE;
    }

    public static void isVip(C13608l c13608l, EnumC9483l enumC9483l) {
        c13608l.getClass();
        c13608l.outputPrefixType_ = enumC9483l.loadAd();
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C5001l m3650package() {
        return (C5001l) DEFAULT_INSTANCE.admob();
    }

    public static void premium(C13608l c13608l, AbstractC15257l abstractC15257l) {
        c13608l.getClass();
        abstractC15257l.getClass();
        c13608l.value_ = abstractC15257l;
    }

    public static void signatures(C13608l c13608l, String str) {
        c13608l.getClass();
        str.getClass();
        c13608l.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static C13608l m3651strictfp(byte[] bArr, C7597l c7597l) {
        return (C13608l) AbstractC13399l.tapsense(DEFAULT_INSTANCE, bArr, c7597l);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static C5001l m3652synchronized(C13608l c13608l) {
        AbstractC9397l abstractC9397lAdmob = DEFAULT_INSTANCE.admob();
        abstractC9397lAdmob.billing(c13608l);
        return (C5001l) abstractC9397lAdmob;
    }

    public final EnumC9483l appmetrica() {
        EnumC9483l enumC9483lYandex = EnumC9483l.yandex(this.outputPrefixType_);
        return enumC9483lYandex == null ? EnumC9483l.UNRECOGNIZED : enumC9483lYandex;
    }

    public final String inmobi() {
        return this.typeUrl_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
        }
        if (iInmobi == 3) {
            return new C13608l();
        }
        if (iInmobi == 4) {
            return new C5001l(DEFAULT_INSTANCE);
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
        synchronized (C13608l.class) {
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

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final AbstractC15257l m3653throws() {
        return this.value_;
    }
}
