package defpackage;

/* JADX INFO: renamed from: lّۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12807l extends AbstractC12946l {
    private static final C12807l DEFAULT_INSTANCE;
    private static volatile InterfaceC6634l PARSER;

    static {
        C12807l c12807l = new C12807l();
        DEFAULT_INSTANCE = c12807l;
        AbstractC12946l.firebase(C12807l.class, c12807l);
    }

    public static C9463l vip() {
        return (C9463l) DEFAULT_INSTANCE.crashlytics();
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
                return new C15293l(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new C12807l();
            case 4:
                return new C9463l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C12807l.class) {
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
