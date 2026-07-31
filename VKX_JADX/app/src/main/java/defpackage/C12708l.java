package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lّٛۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12708l implements InterfaceC3687l {
    public final int amazon;
    public final String billing;
    public final String crashlytics;
    public final InterfaceC3509l loadAd;
    public final boolean purchase;
    public final AudioPlaylist yandex;

    public C12708l(AudioPlaylist audioPlaylist, InterfaceC3509l interfaceC3509l, String str, int i, boolean z, String str2) {
        this.yandex = audioPlaylist;
        this.loadAd = interfaceC3509l;
        this.crashlytics = str;
        this.amazon = i;
        this.purchase = z;
        this.billing = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12708l)) {
            return false;
        }
        C12708l c12708l = (C12708l) obj;
        return this.yandex.equals(c12708l.yandex) && this.loadAd.equals(c12708l.loadAd) && this.crashlytics.equals(c12708l.crashlytics) && this.amazon == c12708l.amazon && this.purchase == c12708l.purchase && this.billing.equals(c12708l.billing);
    }

    public final int hashCode() {
        return this.billing.hashCode() + ((AbstractC0653l.firebase(this.amazon, AbstractC12589l.advert((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31, 31, this.crashlytics), 31) + (this.purchase ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Ready(playlist=");
        sb.append(this.yandex);
        sb.append(", author=");
        sb.append(this.loadAd);
        sb.append(", coverUrl=");
        sb.append(this.crashlytics);
        sb.append(", type=");
        int i = this.amazon;
        if (i == 1) {
            str = "COLLECTION";
        } else if (i == 2) {
            str = "ONLY_ARTIST";
        } else if (i == 3) {
            str = "FEAT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "LIBRARY";
        } else {
            str = "PLAYLIST";
        }
        sb.append(str);
        sb.append(", typeWithIndexes=");
        sb.append(this.purchase);
        sb.append(", subtitle=");
        return AbstractC2812l.tapsense(sb, this.billing, ')');
    }
}
