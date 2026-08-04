package defpackage;

/* JADX INFO: renamed from: lْۥؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13782l extends AbstractC12946l {
    private static final C13782l DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634l PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private C7300l layout_;

    static {
        C13782l c13782l = new C13782l();
        DEFAULT_INSTANCE = c13782l;
        AbstractC12946l.firebase(C13782l.class, c13782l);
    }

    public static C8194l ads() {
        return (C8194l) DEFAULT_INSTANCE.crashlytics();
    }

    public static void metrica(C13782l c13782l, int i) {
        c13782l.layoutIndex_ = i;
    }

    public static void vip(C13782l c13782l, C7300l c7300l) {
        c13782l.getClass();
        c7300l.getClass();
        c13782l.layout_ = c7300l;
        c13782l.bitField0_ |= 1;
    }

    public final int adcel() {
        return this.layoutIndex_;
    }

    @Override // defpackage.AbstractC12946l
    public final Object amazon(int i) {
        InterfaceC6634l c1219l;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C15293l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new C13782l();
            case 4:
                return new C8194l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C13782l.class) {
                    try {
                        c1219l = PARSER;
                        if (c1219l == null) {
                            c1219l = new C1219l();
                            PARSER = c1219l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1219l;
            default:
                C3010l.mopub();
                return null;
        }
    }

    public final C7300l startapp() {
        C7300l c7300l = this.layout_;
        return c7300l == null ? C7300l.isVip() : c7300l;
    }
}
