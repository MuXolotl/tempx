package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٍُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C17841l {
    public final float[] yandex;

    public C17841l(float[] fArr) {
        this.yandex = fArr;
        if (fArr.length == 8) {
            return;
        }
        C8339l.metrica("Points array size should be 8");
        throw null;
    }

    public final C8195l amazon(float f) {
        float f2 = 1.0f - f;
        long jCrashlytics = crashlytics(f);
        float[] fArr = this.yandex;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = f2 * f2;
        float f8 = 2.0f * f2 * f;
        float f9 = f * f;
        return new C8195l(AbstractC4603l.yandex(f3, f4, (f5 * f) + (f3 * f2), (f6 * f) + (f4 * f2), (fArr[4] * f9) + (f5 * f8) + (f3 * f7), (fArr[5] * f9) + (f6 * f8) + (f4 * f7), AbstractC10433l.mopub(jCrashlytics), AbstractC10433l.admob(jCrashlytics)), AbstractC4603l.yandex(AbstractC10433l.mopub(jCrashlytics), AbstractC10433l.admob(jCrashlytics), (yandex() * f9) + (fArr[4] * f8) + (fArr[2] * f7), (loadAd() * f9) + (fArr[5] * f8) + (fArr[3] * f7), (yandex() * f) + (fArr[4] * f2), (loadAd() * f) + (fArr[5] * f2), yandex(), loadAd()));
    }

    public final boolean billing() {
        float[] fArr = this.yandex;
        return Math.abs(fArr[0] - yandex()) < 1.0E-4f && Math.abs(fArr[1] - loadAd()) < 1.0E-4f;
    }

    public final long crashlytics(float f) {
        float f2 = 1.0f - f;
        float[] fArr = this.yandex;
        float f3 = f2 * f2 * f2;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = (fArr[4] * f6) + (fArr[2] * f5) + (fArr[0] * f3);
        float f8 = f * f * f;
        return C9699l.yandex((yandex() * f8) + f7, (loadAd() * f8) + (fArr[5] * f6) + (fArr[3] * f5) + (fArr[1] * f3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17841l)) {
            return false;
        }
        return Arrays.equals(this.yandex, ((C17841l) obj).yandex);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.yandex);
    }

    public final float loadAd() {
        return this.yandex[7];
    }

    public final C8102l purchase(InterfaceC6951l interfaceC6951l) {
        float[] fArr = new float[8];
        C8102l c8102l = new C8102l(fArr);
        AbstractC8669l.appmetrica(this.yandex, fArr, 14);
        c8102l.mopub(interfaceC6951l, 0);
        c8102l.mopub(interfaceC6951l, 2);
        c8102l.mopub(interfaceC6951l, 4);
        c8102l.mopub(interfaceC6951l, 6);
        return c8102l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.yandex;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(yandex());
        sb.append(", ");
        sb.append(loadAd());
        sb.append(')');
        return sb.toString();
    }

    public final float yandex() {
        return this.yandex[6];
    }
}
