package defpackage;

/* JADX INFO: renamed from: lؒ۠ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1387l {
    public final int crashlytics;
    public final int loadAd;
    public final /* synthetic */ int yandex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1387l(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.yandex = 1;
    }

    public static C2989l crashlytics() {
        return new C2989l(0, 1, 0, (byte) 0);
    }

    public static C2989l loadAd(AbstractC1387l abstractC1387l) {
        byte b = 0;
        return new C2989l(abstractC1387l.loadAd + abstractC1387l.crashlytics, 1, b, b);
    }

    public static C4130l yandex(AbstractC1387l abstractC1387l, InterfaceC1421l[] interfaceC1421lArr) {
        return new C4130l(abstractC1387l.loadAd + abstractC1387l.crashlytics, interfaceC1421lArr);
    }

    public abstract void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l);

    public C12317l billing(C12676l c12676l) {
        return null;
    }

    public abstract Object purchase(int i);

    public String toString() {
        switch (this.yandex) {
            case 1:
                String strLicense = AbstractC18202l.yandex.loadAd(getClass()).license();
                return strLicense == null ? "" : strLicense;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ AbstractC1387l(int i, int i2, int i3, byte b) {
        this.yandex = i3;
        this.loadAd = i;
        this.crashlytics = i2;
    }
}
