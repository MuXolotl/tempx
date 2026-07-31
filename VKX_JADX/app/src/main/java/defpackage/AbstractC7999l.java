package defpackage;

/* JADX INFO: renamed from: lًؙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7999l {
    public static final C14813l amazon;
    public static final C14813l crashlytics;
    public static final C14813l loadAd;
    public static final C9676l yandex = new C9676l("NO_THREAD_ELEMENTS", 2);

    static {
        byte b = 0;
        loadAd = new C14813l(b, 20);
        crashlytics = new C14813l(b, 21);
        amazon = new C14813l(b, 22);
    }

    public static final Object loadAd(InterfaceC12932l interfaceC12932l, Object obj) {
        if (obj == null) {
            obj = interfaceC12932l.mo247l(0, loadAd);
        }
        if (obj == 0) {
            return yandex;
        }
        return obj instanceof Integer ? interfaceC12932l.mo247l(new C13090l(((Number) obj).intValue(), interfaceC12932l), amazon) : ((C0474l) obj).loadAd();
    }

    public static final void yandex(InterfaceC12932l interfaceC12932l, Object obj) {
        if (obj == yandex) {
            return;
        }
        if (!(obj instanceof C13090l)) {
            ((C0474l) interfaceC12932l.mo247l(null, crashlytics)).yandex(obj);
            return;
        }
        C13090l c13090l = (C13090l) obj;
        C0474l[] c0474lArr = c13090l.crashlytics;
        int length = c0474lArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            c0474lArr[length].yandex(c13090l.loadAd[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
