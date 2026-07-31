package defpackage;

/* JADX INFO: renamed from: lُؚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3251l extends AbstractC13399l implements InterfaceC0974l {
    private static final C3251l DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C0874l keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        C3251l c3251l = new C3251l();
        DEFAULT_INSTANCE = c3251l;
        AbstractC13399l.license(C3251l.class, c3251l);
    }

    public static void applovin(C3251l c3251l, EnumC8938l enumC8938l) {
        c3251l.getClass();
        c3251l.status_ = enumC8938l.yandex();
    }

    public static void isVip(C3251l c3251l, C0874l c0874l) {
        c3251l.getClass();
        c3251l.keyData_ = c0874l;
        c3251l.bitField0_ |= 1;
    }

    public static void premium(C3251l c3251l, EnumC9483l enumC9483l) {
        c3251l.getClass();
        c3251l.outputPrefixType_ = enumC9483l.loadAd();
    }

    public static void signatures(C3251l c3251l, int i) {
        c3251l.keyId_ = i;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static C3824l m1307strictfp() {
        return (C3824l) DEFAULT_INSTANCE.admob();
    }

    public final C0874l appmetrica() {
        C0874l c0874l = this.keyData_;
        return c0874l == null ? C0874l.applovin() : c0874l;
    }

    public final int inmobi() {
        return this.keyId_;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final EnumC8938l m1308package() {
        EnumC8938l enumC8938l;
        int i = this.status_;
        if (i == 0) {
            enumC8938l = EnumC8938l.UNKNOWN_STATUS;
        } else if (i == 1) {
            enumC8938l = EnumC8938l.ENABLED;
        } else if (i != 2) {
            enumC8938l = i != 3 ? null : EnumC8938l.DESTROYED;
        } else {
            enumC8938l = EnumC8938l.DISABLED;
        }
        return enumC8938l == null ? EnumC8938l.UNRECOGNIZED : enumC8938l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iInmobi == 3) {
            return new C3251l();
        }
        if (iInmobi == 4) {
            return new C3824l(DEFAULT_INSTANCE);
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
        synchronized (C3251l.class) {
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

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m1309synchronized() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final EnumC9483l m1310throws() {
        EnumC9483l enumC9483lYandex = EnumC9483l.yandex(this.outputPrefixType_);
        return enumC9483lYandex == null ? EnumC9483l.UNRECOGNIZED : enumC9483lYandex;
    }
}
