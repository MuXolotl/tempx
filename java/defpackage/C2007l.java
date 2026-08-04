package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؓٞ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2007l {
    public String admob;
    public int amazon;
    public long billing;
    public int crashlytics;
    public byte isPro;
    public String loadAd;
    public long mopub;
    public long purchase;
    public List subs;
    public int yandex;

    public final C1379l yandex() {
        String str;
        if (this.isPro == 63 && (str = this.loadAd) != null) {
            return new C1379l(this.yandex, str, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.isPro & 1) == 0) {
            sb.append(" pid");
        }
        if (this.loadAd == null) {
            sb.append(" processName");
        }
        if ((this.isPro & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.isPro & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.isPro & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.isPro & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.isPro & 32) == 0) {
            sb.append(" timestamp");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
