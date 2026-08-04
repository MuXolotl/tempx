package defpackage;

/* JADX INFO: renamed from: lٕٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15934l {
    public static final C15934l amazon = new C10458l(0).yandex();
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean yandex;

    public C15934l(C10458l c10458l) {
        this.yandex = c10458l.loadAd;
        this.loadAd = c10458l.crashlytics;
        this.crashlytics = c10458l.amazon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15934l.class != obj.getClass()) {
            return false;
        }
        C15934l c15934l = (C15934l) obj;
        return this.yandex == c15934l.yandex && this.loadAd == c15934l.loadAd && this.crashlytics == c15934l.crashlytics;
    }

    public final int hashCode() {
        return ((this.yandex ? 1 : 0) << 2) + ((this.loadAd ? 1 : 0) << 1) + (this.crashlytics ? 1 : 0);
    }
}
