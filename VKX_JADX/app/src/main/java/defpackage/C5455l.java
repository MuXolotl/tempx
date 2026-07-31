package defpackage;

/* JADX INFO: renamed from: lؘٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5455l implements InterfaceC1525l {
    public final String loadAd;
    public final int yandex;

    public C5455l(int i, String str) {
        this.yandex = i;
        this.loadAd = str;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.yandex);
        sb.append(",url=");
        return AbstractC0653l.ads(sb, this.loadAd, ")");
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
