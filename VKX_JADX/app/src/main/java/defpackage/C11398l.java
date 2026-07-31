package defpackage;

/* JADX INFO: renamed from: lُِۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11398l extends AbstractC3188l {
    public final String admob;
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final String firebase;
    public final String isPro;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String smaato;
    public final String subs;
    public final Integer yandex;

    public C11398l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.yandex = num;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = str4;
        this.billing = str5;
        this.mopub = str6;
        this.admob = str7;
        this.subs = str8;
        this.isPro = str9;
        this.firebase = str10;
        this.smaato = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3188l)) {
            return false;
        }
        AbstractC3188l abstractC3188l = (AbstractC3188l) obj;
        if (!this.yandex.equals(((C11398l) abstractC3188l).yandex)) {
            return false;
        }
        if (!this.loadAd.equals(((C11398l) abstractC3188l).loadAd)) {
            return false;
        }
        if (!this.crashlytics.equals(((C11398l) abstractC3188l).crashlytics)) {
            return false;
        }
        if (!this.amazon.equals(((C11398l) abstractC3188l).amazon)) {
            return false;
        }
        if (!this.purchase.equals(((C11398l) abstractC3188l).purchase)) {
            return false;
        }
        if (!this.billing.equals(((C11398l) abstractC3188l).billing)) {
            return false;
        }
        if (!this.mopub.equals(((C11398l) abstractC3188l).mopub)) {
            return false;
        }
        if (!this.admob.equals(((C11398l) abstractC3188l).admob)) {
            return false;
        }
        if (!this.subs.equals(((C11398l) abstractC3188l).subs)) {
            return false;
        }
        if (!this.isPro.equals(((C11398l) abstractC3188l).isPro)) {
            return false;
        }
        if (this.firebase.equals(((C11398l) abstractC3188l).firebase)) {
            return this.smaato.equals(((C11398l) abstractC3188l).smaato);
        }
        return false;
    }

    public final int hashCode() {
        return this.smaato.hashCode() ^ ((((((((((((((((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon.hashCode()) * 1000003) ^ this.purchase.hashCode()) * 1000003) ^ this.billing.hashCode()) * 1000003) ^ this.mopub.hashCode()) * 1000003) ^ this.admob.hashCode()) * 1000003) ^ this.subs.hashCode()) * 1000003) ^ this.isPro.hashCode()) * 1000003) ^ this.firebase.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.yandex);
        sb.append(", model=");
        sb.append(this.loadAd);
        sb.append(", hardware=");
        sb.append(this.crashlytics);
        sb.append(", device=");
        sb.append(this.amazon);
        sb.append(", product=");
        sb.append(this.purchase);
        sb.append(", osBuild=");
        sb.append(this.billing);
        sb.append(", manufacturer=");
        sb.append(this.mopub);
        sb.append(", fingerprint=");
        sb.append(this.admob);
        sb.append(", locale=");
        sb.append(this.subs);
        sb.append(", country=");
        sb.append(this.isPro);
        sb.append(", mccMnc=");
        sb.append(this.firebase);
        sb.append(", applicationBuild=");
        return AbstractC0653l.ads(sb, this.smaato, "}");
    }
}
