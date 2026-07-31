package defpackage;

/* JADX INFO: renamed from: lِٟۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12028l extends AbstractC5357l {
    public final String loadAd;
    public final Object yandex;

    public C12028l(Object obj, String str) {
        this.yandex = obj;
        this.loadAd = str;
    }

    @Override // defpackage.AbstractC5357l
    public final String crashlytics() {
        return this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12028l)) {
            return false;
        }
        C12028l c12028l = (C12028l) obj;
        return AbstractC8576l.yandex(this.yandex, c12028l.yandex) && AbstractC8576l.yandex(this.loadAd, c12028l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.AbstractC5357l
    public final /* bridge */ /* synthetic */ Object loadAd() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Destroyed(configuration=");
        sb.append(this.yandex);
        sb.append(", key=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    @Override // defpackage.AbstractC5357l
    public final Object yandex() {
        return this.yandex;
    }
}
