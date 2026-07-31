package defpackage;

/* JADX INFO: renamed from: lؚؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0179l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C18707l f1128l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C2095l f1127l = null;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C9018l f1126l = null;

    public C0179l(C18707l c18707l) {
        this.f1128l = c18707l;
    }

    public static void vip(StringBuilder sb, String str, String str2, String str3) {
        AbstractC9361l.appmetrica(sb, "    ", str2, ":", str);
        AbstractC9361l.appmetrica(sb, "    ", "    ", str3, str);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(3, 0);
        C18707l c18707l = this.f1128l;
        if (c18707l != null) {
            appmetricaVar.purchase(new C9320l(true, 0, c18707l));
        }
        C2095l c2095l = this.f1127l;
        if (c2095l != null) {
            appmetricaVar.purchase(new C9320l(false, 1, c2095l));
        }
        C9018l c9018l = this.f1126l;
        if (c9018l != null) {
            appmetricaVar.purchase(new C9320l(false, 2, c9018l));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final String toString() {
        String str = AbstractC9008l.yandex;
        StringBuilder sbAdvert = AbstractC5020l.advert("DistributionPoint: [", str);
        C18707l c18707l = this.f1128l;
        if (c18707l != null) {
            vip(sbAdvert, str, "distributionPoint", c18707l.toString());
        }
        C2095l c2095l = this.f1127l;
        if (c2095l != null) {
            vip(sbAdvert, str, "reasons", c2095l.mopub());
        }
        C9018l c9018l = this.f1126l;
        if (c9018l != null) {
            vip(sbAdvert, str, "cRLIssuer", c9018l.toString());
        }
        return AbstractC0653l.ads(sbAdvert, "]", str);
    }
}
