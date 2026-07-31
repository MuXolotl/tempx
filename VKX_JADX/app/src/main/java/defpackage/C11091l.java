package defpackage;

/* JADX INFO: renamed from: lُٗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11091l extends AbstractC2236l {
    public final String admob;
    public final int amazon;
    public final String billing;
    public final String crashlytics;
    public final AbstractC5638l firebase;
    public final String isPro;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final AbstractC5235l remoteconfig;
    public final AbstractC2869l smaato;
    public final String subs;

    public C11091l(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, AbstractC5638l abstractC5638l, AbstractC2869l abstractC2869l, AbstractC5235l abstractC5235l) {
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = i;
        this.purchase = str3;
        this.billing = str4;
        this.mopub = str5;
        this.admob = str6;
        this.subs = str7;
        this.isPro = str8;
        this.firebase = abstractC5638l;
        this.smaato = abstractC2869l;
        this.remoteconfig = abstractC5235l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2236l) {
            C11091l c11091l = (C11091l) ((AbstractC2236l) obj);
            if (this.loadAd.equals(c11091l.loadAd) && this.crashlytics.equals(c11091l.crashlytics) && this.amazon == c11091l.amazon && this.purchase.equals(c11091l.purchase)) {
                String str = c11091l.billing;
                String str2 = this.billing;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c11091l.mopub;
                    String str4 = this.mopub;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c11091l.admob;
                        String str6 = this.admob;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.subs.equals(c11091l.subs) && this.isPro.equals(c11091l.isPro)) {
                                AbstractC5638l abstractC5638l = c11091l.firebase;
                                AbstractC5638l abstractC5638l2 = this.firebase;
                                if (abstractC5638l2 != null ? abstractC5638l2.equals(abstractC5638l) : abstractC5638l == null) {
                                    AbstractC2869l abstractC2869l = c11091l.smaato;
                                    AbstractC2869l abstractC2869l2 = this.smaato;
                                    if (abstractC2869l2 != null ? abstractC2869l2.equals(abstractC2869l) : abstractC2869l == null) {
                                        AbstractC5235l abstractC5235l = c11091l.remoteconfig;
                                        AbstractC5235l abstractC5235l2 = this.remoteconfig;
                                        if (abstractC5235l2 != null ? abstractC5235l2.equals(abstractC5235l) : abstractC5235l == null) {
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
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.loadAd.hashCode() ^ 1000003) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon) * 1000003) ^ this.purchase.hashCode()) * 1000003;
        String str = this.billing;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mopub;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.admob;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.subs.hashCode()) * 1000003) ^ this.isPro.hashCode()) * 1000003;
        AbstractC5638l abstractC5638l = this.firebase;
        int iHashCode5 = (iHashCode4 ^ (abstractC5638l == null ? 0 : abstractC5638l.hashCode())) * 1000003;
        AbstractC2869l abstractC2869l = this.smaato;
        int iHashCode6 = (iHashCode5 ^ (abstractC2869l == null ? 0 : abstractC2869l.hashCode())) * 1000003;
        AbstractC5235l abstractC5235l = this.remoteconfig;
        return iHashCode6 ^ (abstractC5235l != null ? abstractC5235l.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.loadAd + ", gmpAppId=" + this.crashlytics + ", platform=" + this.amazon + ", installationUuid=" + this.purchase + ", firebaseInstallationId=" + this.billing + ", firebaseAuthenticationToken=" + this.mopub + ", appQualitySessionId=" + this.admob + ", buildVersion=" + this.subs + ", displayVersion=" + this.isPro + ", session=" + this.firebase + ", ndkPayload=" + this.smaato + ", appExitInfo=" + this.remoteconfig + "}";
    }

    public final C10221l yandex() {
        C10221l c10221l = new C10221l();
        c10221l.yandex = this.loadAd;
        c10221l.loadAd = this.crashlytics;
        c10221l.crashlytics = this.amazon;
        c10221l.amazon = this.purchase;
        c10221l.purchase = this.billing;
        c10221l.billing = this.mopub;
        c10221l.mopub = this.admob;
        c10221l.admob = this.subs;
        c10221l.subs = this.isPro;
        c10221l.isPro = this.firebase;
        c10221l.firebase = this.smaato;
        c10221l.smaato = this.remoteconfig;
        c10221l.remoteconfig = (byte) 1;
        return c10221l;
    }
}
