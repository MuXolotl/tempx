package defpackage;

/* JADX INFO: renamed from: lًْۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8283l {
    public int admob;
    public long amazon;
    public final C13143l billing;
    public int crashlytics;
    public int loadAd;
    public final C13143l mopub;
    public final boolean purchase;
    public int subs;
    public final int yandex;

    public C8283l(C13143l c13143l, C13143l c13143l2, boolean z) throws C17655l {
        this.mopub = c13143l;
        this.billing = c13143l2;
        this.purchase = z;
        c13143l2.m3562for(12);
        this.yandex = c13143l2.inmobi();
        c13143l.m3562for(12);
        this.subs = c13143l.inmobi();
        AbstractC0377l.loadAd("first_chunk must be 1", c13143l.remoteconfig() == 1);
        this.loadAd = -1;
    }

    public final boolean yandex() {
        int i = this.loadAd + 1;
        this.loadAd = i;
        if (i == this.yandex) {
            return false;
        }
        boolean z = this.purchase;
        C13143l c13143l = this.billing;
        this.amazon = z ? c13143l.m3564package() : c13143l.applovin();
        if (this.loadAd == this.admob) {
            C13143l c13143l2 = this.mopub;
            this.crashlytics = c13143l2.inmobi();
            c13143l2.m3568throw(4);
            int i2 = this.subs - 1;
            this.subs = i2;
            this.admob = i2 > 0 ? c13143l2.inmobi() - 1 : -1;
        }
        return true;
    }
}
