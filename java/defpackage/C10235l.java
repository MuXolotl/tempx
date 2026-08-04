package defpackage;

/* JADX INFO: renamed from: lَُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10235l {
    public final String loadAd;
    public final String yandex;

    public C10235l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10235l)) {
            return false;
        }
        C10235l c10235l = (C10235l) obj;
        return AbstractC8576l.yandex(this.yandex, c10235l.yandex) && AbstractC8576l.yandex(this.loadAd, c10235l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueRestorationModel(title=");
        sb.append(this.yandex);
        sb.append(", artist=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
