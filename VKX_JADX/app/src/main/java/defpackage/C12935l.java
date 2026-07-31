package defpackage;

/* JADX INFO: renamed from: lّۢۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12935l extends AbstractC12946l {
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    private static final C12935l DEFAULT_INSTANCE;
    private static volatile InterfaceC6634l PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = "";
    private AbstractC16071l bundle_ = AbstractC16071l.f31494l;

    static {
        C12935l c12935l = new C12935l();
        DEFAULT_INSTANCE = c12935l;
        AbstractC12946l.firebase(C12935l.class, c12935l);
    }

    public static C6043l Signature() {
        return (C6043l) DEFAULT_INSTANCE.crashlytics();
    }

    public static void metrica(C12935l c12935l, int i) {
        c12935l.appWidgetId_ = i;
    }

    public static void startapp(C12935l c12935l, C15379l c15379l) {
        c12935l.getClass();
        c12935l.bundle_ = c15379l;
    }

    public static C12935l subscription() {
        return DEFAULT_INSTANCE;
    }

    public static void vip(C12935l c12935l, String str) {
        c12935l.getClass();
        str.getClass();
        c12935l.receiver_ = str;
    }

    public final int adcel() {
        return this.appWidgetId_;
    }

    public final AbstractC16071l ads() {
        return this.bundle_;
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
                return new C15293l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"receiver_", "appWidgetId_", "bundle_"});
            case 3:
                return new C12935l();
            case 4:
                return new C6043l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C12935l.class) {
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

    public final String tapsense() {
        return this.receiver_;
    }
}
