package defpackage;

/* JADX INFO: renamed from: lٞ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18478l extends AbstractC16800l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;

    public C18478l(String str, String str2, String str3) {
        super("----");
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18478l.class != obj.getClass()) {
            return false;
        }
        C18478l c18478l = (C18478l) obj;
        return this.crashlytics.equals(c18478l.crashlytics) && this.loadAd.equals(c18478l.loadAd) && this.amazon.equals(c18478l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(527, 31, this.loadAd), 31, this.crashlytics);
    }

    @Override // defpackage.AbstractC16800l
    public final String toString() {
        return this.yandex + ": domain=" + this.loadAd + ", description=" + this.crashlytics;
    }
}
