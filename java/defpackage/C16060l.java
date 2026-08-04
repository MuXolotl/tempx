package defpackage;

/* JADX INFO: renamed from: lٕۦؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16060l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final String yandex;

    public C16060l(String str, String str2, String str3, String str4, String str5) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16060l) && ((C16060l) obj).yandex.equals(this.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return this.yandex;
    }
}
