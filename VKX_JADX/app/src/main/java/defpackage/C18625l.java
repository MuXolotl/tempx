package defpackage;

/* JADX INFO: renamed from: l۠ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18625l extends AbstractC5357l {
    public final String crashlytics;
    public final Object loadAd;
    public final Object yandex;

    public C18625l(Object obj, Object obj2, String str) {
        this.yandex = obj;
        this.loadAd = obj2;
        this.crashlytics = str;
    }

    @Override // defpackage.AbstractC5357l
    public final String crashlytics() {
        return this.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18625l)) {
            return false;
        }
        C18625l c18625l = (C18625l) obj;
        return AbstractC8576l.yandex(this.yandex, c18625l.yandex) && this.loadAd.equals(c18625l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c18625l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC5357l
    public final Object loadAd() {
        return this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Created(configuration=");
        sb.append(this.yandex);
        sb.append(", instance=");
        sb.append(this.loadAd);
        sb.append(", key=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }

    @Override // defpackage.AbstractC5357l
    public final Object yandex() {
        return this.yandex;
    }
}
