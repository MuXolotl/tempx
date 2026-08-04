package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؘۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5443l {
    public static final Object[] crashlytics;
    public static final float[] yandex = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile C18152l loadAd = new C18152l(0);

    static {
        Object[] objArr = new Object[0];
        crashlytics = objArr;
        synchronized (objArr) {
            loadAd.purchase(115, new C10230l(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            loadAd.purchase(130, new C10230l(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            loadAd.purchase(150, new C10230l(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            loadAd.purchase(180, new C10230l(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            loadAd.purchase(200, new C10230l(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.INSTANCE;
        }
        if ((loadAd.amazon(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC10280l.loadAd("You should only apply non-linear scaling to font scales > 1");
    }

    public static void loadAd(float f, C10230l c10230l) {
        synchronized (crashlytics) {
            C18152l c18152lClone = loadAd.clone();
            c18152lClone.purchase((int) (f * 100.0f), c10230l);
            loadAd = c18152lClone;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static InterfaceC8917l yandex(float f) {
        float fAmazon;
        InterfaceC8917l c10230l;
        float[] fArr = yandex;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        InterfaceC8917l interfaceC8917l = (InterfaceC8917l) loadAd.crashlytics(i);
        if (interfaceC8917l != null) {
            return interfaceC8917l;
        }
        C18152l c18152l = loadAd;
        int iLoadAd = AbstractC4918l.loadAd(c18152l.f35537l, i, c18152l.f35539l);
        if (iLoadAd >= 0) {
            return (InterfaceC8917l) loadAd.billing(iLoadAd);
        }
        int i2 = -(iLoadAd + 1);
        int i3 = i2 - 1;
        if (i2 >= loadAd.f35537l) {
            C10230l c10230l2 = new C10230l(new float[]{1.0f}, new float[]{f});
            loadAd(f, c10230l2);
            return c10230l2;
        }
        if (i3 < 0) {
            c10230l = new C10230l(fArr, fArr);
            fAmazon = 1.0f;
        } else {
            fAmazon = loadAd.amazon(i3) / 100.0f;
            c10230l = (InterfaceC8917l) loadAd.billing(i3);
        }
        float fAmazon2 = loadAd.amazon(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fAmazon == fAmazon2 ? 0.0f : (f - fAmazon) / (fAmazon2 - fAmazon))) * 1.0f) + 0.0f;
        InterfaceC8917l interfaceC8917l2 = (InterfaceC8917l) loadAd.billing(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fLoadAd = c10230l.loadAd(f2);
            fArr2[i4] = ((interfaceC8917l2.loadAd(f2) - fLoadAd) * fMax) + fLoadAd;
        }
        C10230l c10230l3 = new C10230l(fArr, fArr2);
        loadAd(f, c10230l3);
        return c10230l3;
    }
}
