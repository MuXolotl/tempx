package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌٍ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9428l extends AbstractC5638l {
    public final AbstractC11657l admob;
    public final long amazon;
    public final boolean billing;
    public final String crashlytics;
    public final List firebase;
    public final AbstractC8314l isPro;
    public final String loadAd;
    public final AbstractC9034l mopub;
    public final Long purchase;
    public final int smaato;
    public final AbstractC17613l subs;
    public final String yandex;

    public C9428l(String str, String str2, String str3, long j, Long l, boolean z, AbstractC9034l abstractC9034l, AbstractC11657l abstractC11657l, AbstractC17613l abstractC17613l, AbstractC8314l abstractC8314l, List list, int i) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = j;
        this.purchase = l;
        this.billing = z;
        this.mopub = abstractC9034l;
        this.admob = abstractC11657l;
        this.subs = abstractC17613l;
        this.isPro = abstractC8314l;
        this.firebase = list;
        this.smaato = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5638l) {
            C9428l c9428l = (C9428l) ((AbstractC5638l) obj);
            if (this.yandex.equals(c9428l.yandex) && this.loadAd.equals(c9428l.loadAd)) {
                String str = c9428l.crashlytics;
                String str2 = this.crashlytics;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.amazon == c9428l.amazon) {
                        Long l = c9428l.purchase;
                        Long l2 = this.purchase;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.billing == c9428l.billing && this.mopub.equals(c9428l.mopub)) {
                                AbstractC11657l abstractC11657l = c9428l.admob;
                                AbstractC11657l abstractC11657l2 = this.admob;
                                if (abstractC11657l2 != null ? abstractC11657l2.equals(abstractC11657l) : abstractC11657l == null) {
                                    AbstractC17613l abstractC17613l = c9428l.subs;
                                    AbstractC17613l abstractC17613l2 = this.subs;
                                    if (abstractC17613l2 != null ? abstractC17613l2.equals(abstractC17613l) : abstractC17613l == null) {
                                        AbstractC8314l abstractC8314l = c9428l.isPro;
                                        AbstractC8314l abstractC8314l2 = this.isPro;
                                        if (abstractC8314l2 != null ? abstractC8314l2.equals(abstractC8314l) : abstractC8314l == null) {
                                            List list = c9428l.firebase;
                                            List list2 = this.firebase;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.smaato == c9428l.smaato) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003;
        String str = this.crashlytics;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.amazon;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.purchase;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.billing ? 1231 : 1237)) * 1000003) ^ this.mopub.hashCode()) * 1000003;
        AbstractC11657l abstractC11657l = this.admob;
        int iHashCode4 = (iHashCode3 ^ (abstractC11657l == null ? 0 : abstractC11657l.hashCode())) * 1000003;
        AbstractC17613l abstractC17613l = this.subs;
        int iHashCode5 = (iHashCode4 ^ (abstractC17613l == null ? 0 : abstractC17613l.hashCode())) * 1000003;
        AbstractC8314l abstractC8314l = this.isPro;
        int iHashCode6 = (iHashCode5 ^ (abstractC8314l == null ? 0 : abstractC8314l.hashCode())) * 1000003;
        List list = this.firebase;
        return this.smaato ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.yandex);
        sb.append(", identifier=");
        sb.append(this.loadAd);
        sb.append(", appQualitySessionId=");
        sb.append(this.crashlytics);
        sb.append(", startedAt=");
        sb.append(this.amazon);
        sb.append(", endedAt=");
        sb.append(this.purchase);
        sb.append(", crashed=");
        sb.append(this.billing);
        sb.append(", app=");
        sb.append(this.mopub);
        sb.append(", user=");
        sb.append(this.admob);
        sb.append(", os=");
        sb.append(this.subs);
        sb.append(", device=");
        sb.append(this.isPro);
        sb.append(", events=");
        sb.append(this.firebase);
        sb.append(", generatorType=");
        return AbstractC14814l.remoteconfig(this.smaato, "}", sb);
    }

    @Override // defpackage.AbstractC5638l
    public final C4320l yandex() {
        C4320l c4320l = new C4320l();
        c4320l.yandex = this.yandex;
        c4320l.loadAd = this.loadAd;
        c4320l.crashlytics = this.crashlytics;
        c4320l.amazon = this.amazon;
        c4320l.purchase = this.purchase;
        c4320l.billing = this.billing;
        c4320l.mopub = this.mopub;
        c4320l.admob = this.admob;
        c4320l.subs = this.subs;
        c4320l.isPro = this.isPro;
        c4320l.firebase = this.firebase;
        c4320l.smaato = this.smaato;
        c4320l.remoteconfig = (byte) 7;
        return c4320l;
    }
}
