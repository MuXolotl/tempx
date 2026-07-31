package defpackage;

/* JADX INFO: renamed from: lٜؗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C5476l.class)
public abstract class AbstractC5303l {
    public static final C4030l Companion = new C4030l();
    public static final C0066l loadAd;
    public static final C14146l yandex;

    static {
        C14146l c14146lLoadAd = new C14146l(1L).loadAd(1000).loadAd(1000).loadAd(1000);
        yandex = c14146lLoadAd;
        c14146lLoadAd.loadAd(60).loadAd(60);
        loadAd = new C0066l(1);
        new C0066l(7);
        new C8655l(1);
        long j = ((long) 1) * 3;
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        new C8655l(i);
        long j2 = ((long) 1) * 12;
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        new C8655l(i2);
        long j3 = ((long) i2) * 100;
        int i3 = (int) j3;
        if (j3 != i3) {
            throw new ArithmeticException();
        }
        new C8655l(i3);
    }

    public static String yandex(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
