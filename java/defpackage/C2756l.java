package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lَٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2756l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cthrow f5960l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10198l f5961l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cstrictfp f5962l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public advert f5963l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cinterface f5964l;

    public C2756l(C10198l c10198l, byte[] bArr, Cinterface cinterface, byte[] bArr2) {
        this.f5962l = new Cstrictfp(bArr2 != null ? AbstractC16784l.loadAd : AbstractC16784l.yandex);
        this.f5961l = c10198l;
        this.f5960l = new C11327l(bArr);
        this.f5964l = cinterface;
        this.f5963l = bArr2 == null ? null : new C13353l(bArr2, 0);
    }

    public static C2756l vip(Object obj) {
        if (obj instanceof C2756l) {
            return (C2756l) obj;
        }
        if (obj != null) {
            Cclass cclassInmobi = Cclass.inmobi(obj);
            C2756l c2756l = new C2756l();
            Enumeration enumerationMo170package = cclassInmobi.mo170package();
            Cstrictfp cstrictfpPremium = Cstrictfp.premium(enumerationMo170package.nextElement());
            c2756l.f5962l = cstrictfpPremium;
            int iM4585strictfp = cstrictfpPremium.m4585strictfp();
            if (iM4585strictfp >= 0 && iM4585strictfp <= 1) {
                c2756l.f5961l = C10198l.vip(enumerationMo170package.nextElement());
                c2756l.f5960l = Cthrow.premium(enumerationMo170package.nextElement());
                int i = -1;
                while (enumerationMo170package.hasMoreElements()) {
                    Cfinal cfinal = (Cfinal) enumerationMo170package.nextElement();
                    int i2 = cfinal.f821l;
                    if (i2 <= i) {
                        C8339l.metrica("invalid optional field in private key info");
                        return null;
                    }
                    if (i2 == 0) {
                        AbstractC9027l.loadAd(cfinal);
                        ad adVar = Cinterface.f840l;
                        Ccase ccaseApplovin = cfinal.applovin(false, adVar);
                        adVar.m230l(ccaseApplovin);
                        c2756l.f5964l = (Cinterface) ccaseApplovin;
                    } else {
                        if (i2 != 1) {
                            C8339l.metrica("unknown optional field in private key info");
                            return null;
                        }
                        if (iM4585strictfp < 1) {
                            C8339l.metrica("'publicKey' requires version v2(1) or later");
                            return null;
                        }
                        AbstractC9027l.loadAd(cfinal);
                        ad adVar2 = advert.f9l;
                        Ccase ccaseApplovin2 = cfinal.applovin(false, adVar2);
                        adVar2.m230l(ccaseApplovin2);
                        c2756l.f5963l = (advert) ccaseApplovin2;
                    }
                    i = i2;
                }
                return c2756l;
            }
            C8339l.metrica("invalid version for private key info");
        }
        return null;
    }

    public final Ccase ads() {
        return Ccase.advert(this.f5960l.f36593l);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(5, 0);
        appmetricaVar.purchase(this.f5962l);
        appmetricaVar.purchase(this.f5961l);
        appmetricaVar.purchase(this.f5960l);
        Cinterface cinterface = this.f5964l;
        if (cinterface != null) {
            appmetricaVar.purchase(new C9320l(false, 0, cinterface));
        }
        advert advertVar = this.f5963l;
        if (advertVar != null) {
            appmetricaVar.purchase(new C9320l(false, 1, advertVar));
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final Cthrow metrica() {
        return new C11327l(this.f5960l.f36593l);
    }

    public C2756l(C10198l c10198l, Ccase ccase, Cinterface cinterface) {
        this(c10198l, ccase, cinterface, (byte[]) null);
    }

    public C2756l(C10198l c10198l, Cnative cnative, Cinterface cinterface, byte[] bArr) {
        this(c10198l, cnative.billing().remoteconfig("DER"), cinterface, bArr);
    }
}
