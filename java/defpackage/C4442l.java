package defpackage;

/* JADX INFO: renamed from: lٍؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4442l {
    public static final C4442l loadAd = new C4442l(C9735l.isPro);
    public final long yandex;

    public C4442l(long j) {
        this.yandex = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4442l.class == obj.getClass() && C9735l.crashlytics(this.yandex, ((C4442l) obj).yandex) && C14467l.loadAd(0.0f, 0.0f);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return Float.floatToIntBits(0.0f) + (C10882l.yandex(this.yandex) * 31);
    }

    public final String toString() {
        return "Glow(elevationColor=" + ((Object) C9735l.subs(this.yandex)) + ", elevation=" + ((Object) C14467l.crashlytics(0.0f)) + ')';
    }
}
