package defpackage;

/* JADX INFO: renamed from: lّٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C12787l {
    public static final C11070l Companion = new C11070l();
    public final String amazon;
    public final long crashlytics;
    public final String loadAd;
    public final C8206l purchase;
    public final int yandex;

    public /* synthetic */ C12787l(int i, int i2, String str, C10877l c10877l, String str2, C8206l c8206l) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C15677l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        this.crashlytics = c10877l.yandex;
        this.amazon = str2;
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = c8206l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12787l)) {
            return false;
        }
        C12787l c12787l = (C12787l) obj;
        return this.yandex == c12787l.yandex && AbstractC8576l.yandex(this.loadAd, c12787l.loadAd) && C10877l.yandex(this.crashlytics, c12787l.crashlytics) && AbstractC8576l.yandex(this.amazon, c12787l.amazon) && AbstractC8576l.yandex(this.purchase, c12787l.purchase);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert((C10877l.loadAd(this.crashlytics) + AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd)) * 31, 31, this.amazon);
        C8206l c8206l = this.purchase;
        return iAdvert + (c8206l == null ? 0 : c8206l.hashCode());
    }

    public final String toString() {
        return "AudioAudioAlbumDto(id=" + this.yandex + ", title=" + this.loadAd + ", ownerId=" + ((Object) String.valueOf(this.crashlytics)) + ", accessKey=" + this.amazon + ", thumb=" + this.purchase + ')';
    }

    public C12787l(int i, String str, long j, String str2, C8206l c8206l) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = j;
        this.amazon = str2;
        this.purchase = c8206l;
    }
}
