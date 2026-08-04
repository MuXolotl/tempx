package defpackage;

/* JADX INFO: renamed from: lَۖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10493l {
    public static final C8372l amazon;
    public static final C8372l crashlytics;
    public static final C8540l yandex = new C8540l(new C5146l(2));
    public static final C8540l loadAd = new C8540l(new C5266l(1));

    static {
        long j = C9735l.firebase;
        crashlytics = new C8372l(true, Float.NaN, j, null, true);
        amazon = new C8372l(false, Float.NaN, j, null, true);
    }

    public static C8372l yandex(boolean z, float f, long j, InterfaceC6347l interfaceC6347l, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        if ((i & 4) != 0) {
            j = C9735l.firebase;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            interfaceC6347l = null;
        }
        InterfaceC6347l interfaceC6347l2 = interfaceC6347l;
        if (C14467l.loadAd(f2, Float.NaN) && C9735l.crashlytics(j2, C9735l.firebase) && interfaceC6347l2 == null) {
            return z2 ? crashlytics : amazon;
        }
        return new C8372l(z2, f2, j2, interfaceC6347l2, true);
    }
}
