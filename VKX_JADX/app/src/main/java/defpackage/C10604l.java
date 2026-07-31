package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lَ۟۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C10604l extends Ccase implements Cdefault {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f21524l = new ad(8, C10604l.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f21525l;

    public C10604l(String str) {
        this.f21525l = AbstractC9008l.crashlytics(str);
    }

    public static C10604l premium(Object obj) {
        String strAds;
        if (obj == null || (obj instanceof C10604l)) {
            return (C10604l) obj;
        }
        if (obj instanceof applovin) {
            Ccase ccaseBilling = ((applovin) obj).billing();
            if (ccaseBilling instanceof C10604l) {
                return (C10604l) ccaseBilling;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (C10604l) f21524l.m215l((byte[]) obj);
            } catch (Exception e) {
                strAds = AbstractC5020l.ads(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            strAds = "illegal object in getInstance: ".concat(obj.getClass().getName());
        }
        C8339l.metrica(strAds);
        return null;
    }

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        return C7972l.m2216for(this.f21525l.length, z);
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return AbstractC14024l.ads(this.f21525l);
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        c7972l.m2240public(22, z, this.f21525l);
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        return AbstractC9008l.yandex(this.f21525l);
    }

    public String toString() {
        return AbstractC9008l.yandex(this.f21525l);
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof C10604l) {
            return Arrays.equals(this.f21525l, ((C10604l) ccase).f21525l);
        }
        return false;
    }

    public C10604l(byte[] bArr) {
        this.f21525l = bArr;
    }
}
