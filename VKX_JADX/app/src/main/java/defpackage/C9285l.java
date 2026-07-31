package defpackage;

/* JADX INFO: renamed from: lٍٍؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9285l {
    public C11090l amazon;
    public InterfaceC16061l crashlytics;
    public InterfaceC13490l loadAd;
    public Object purchase;
    public EnumC9931l yandex;
    public final C10086l billing = AbstractC8020l.smaato(Boolean.TRUE);
    public long mopub = 0;

    public C9285l(EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l, InterfaceC16061l interfaceC16061l, C11090l c11090l, Object obj) {
        this.yandex = enumC9931l;
        this.loadAd = interfaceC13490l;
        this.crashlytics = interfaceC16061l;
        this.amazon = c11090l;
        this.purchase = obj;
    }

    public static void yandex(C9285l c9285l, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l, C11090l c11090l, int i) {
        if ((i & 1) != 0) {
            enumC9931l = c9285l.yandex;
        }
        if ((i & 2) != 0) {
            interfaceC13490l = c9285l.loadAd;
        }
        InterfaceC16061l interfaceC16061l = c9285l.crashlytics;
        if ((i & 8) != 0) {
            c11090l = c9285l.amazon;
        }
        Object obj = c9285l.purchase;
        EnumC9931l enumC9931l2 = c9285l.yandex;
        C10086l c10086l = c9285l.billing;
        if (enumC9931l == enumC9931l2 && AbstractC8576l.yandex(interfaceC13490l, c9285l.loadAd) && AbstractC8576l.yandex(interfaceC16061l, c9285l.crashlytics) && AbstractC8576l.yandex(c11090l, c9285l.amazon)) {
            if (AbstractC8576l.yandex(obj, c9285l.purchase)) {
                return;
            }
            c9285l.purchase = obj;
            c10086l.setValue(Boolean.TRUE);
            return;
        }
        c9285l.yandex = enumC9931l;
        c9285l.loadAd = interfaceC13490l;
        c9285l.crashlytics = interfaceC16061l;
        c9285l.amazon = c11090l;
        c10086l.setValue(Boolean.TRUE);
    }
}
