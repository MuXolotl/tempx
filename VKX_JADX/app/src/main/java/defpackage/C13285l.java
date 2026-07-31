package defpackage;

/* JADX INFO: renamed from: lؘُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13285l extends AbstractC12946l {
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    private static final C13285l DEFAULT_INSTANCE;
    private static volatile InterfaceC6634l PARSER;
    private int appWidgetId_;
    private String className_ = "";
    private AbstractC16071l actionParameters_ = AbstractC16071l.f31494l;

    static {
        C13285l c13285l = new C13285l();
        DEFAULT_INSTANCE = c13285l;
        AbstractC12946l.firebase(C13285l.class, c13285l);
    }

    public static void metrica(C13285l c13285l, int i) {
        c13285l.appWidgetId_ = i;
    }

    public static void startapp(C13285l c13285l, C15379l c15379l) {
        c13285l.getClass();
        c13285l.actionParameters_ = c15379l;
    }

    public static C13285l subscription() {
        return DEFAULT_INSTANCE;
    }

    public static C4075l tapsense() {
        return (C4075l) DEFAULT_INSTANCE.crashlytics();
    }

    public static void vip(C13285l c13285l, String str) {
        c13285l.getClass();
        c13285l.className_ = str;
    }

    public final AbstractC16071l adcel() {
        return this.actionParameters_;
    }

    public final String ads() {
        return this.className_;
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
                return new C15293l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"className_", "appWidgetId_", "actionParameters_"});
            case 3:
                return new C13285l();
            case 4:
                return new C4075l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C13285l.class) {
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
}
