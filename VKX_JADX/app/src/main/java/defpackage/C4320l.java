package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؖۖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4320l {
    public AbstractC11657l admob;
    public long amazon;
    public boolean billing;
    public String crashlytics;
    public List firebase;
    public AbstractC8314l isPro;
    public String loadAd;
    public AbstractC9034l mopub;
    public Long purchase;
    public byte remoteconfig;
    public int smaato;
    public AbstractC17613l subs;
    public String yandex;

    public final C9428l yandex() {
        String str;
        String str2;
        AbstractC9034l abstractC9034l;
        if (this.remoteconfig == 7 && (str = this.yandex) != null && (str2 = this.loadAd) != null && (abstractC9034l = this.mopub) != null) {
            return new C9428l(str, str2, this.crashlytics, this.amazon, this.purchase, this.billing, abstractC9034l, this.admob, this.subs, this.isPro, this.firebase, this.smaato);
        }
        StringBuilder sb = new StringBuilder();
        if (this.yandex == null) {
            sb.append(" generator");
        }
        if (this.loadAd == null) {
            sb.append(" identifier");
        }
        if ((this.remoteconfig & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.remoteconfig & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.mopub == null) {
            sb.append(" app");
        }
        if ((this.remoteconfig & 4) == 0) {
            sb.append(" generatorType");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }
}
