package defpackage;

/* JADX INFO: renamed from: lٍِِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11775l {
    public final InterfaceC15954l crashlytics;
    public final C9389l loadAd;
    public final float yandex;

    public C11775l() {
        InterfaceC15954l.f31326l.getClass();
        C1770l c1770l = C13253l.loadAd;
        this.yandex = 0.25f;
        this.loadAd = C9389l.yandex;
        this.crashlytics = c1770l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11775l.class != obj.getClass()) {
            return false;
        }
        C11775l c11775l = (C11775l) obj;
        return this.yandex == c11775l.yandex && AbstractC8576l.yandex(this.loadAd, c11775l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11775l.crashlytics);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.yandex) * 31;
        this.loadAd.getClass();
        return this.crashlytics.hashCode() + ((iFloatToIntBits - 1858767230) * 31);
    }
}
