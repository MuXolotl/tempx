package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: renamed from: lؒۨ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1516l extends Cclass {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f3784l;

    @Override // defpackage.Ccase
    public final int Signature(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f3784l;
        }
        return bArr != null ? C7972l.m2216for(bArr.length, z) : super.signatures().Signature(z);
    }

    @Override // defpackage.Cclass, defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        m964private();
        return super.hashCode();
    }

    @Override // defpackage.Cclass, defpackage.Ccase
    public final Ccase isVip() {
        m964private();
        return super.isVip();
    }

    @Override // defpackage.Cclass, java.lang.Iterable
    public final Iterator iterator() {
        m964private();
        return super.iterator();
    }

    @Override // defpackage.Ccase
    public final void metrica(C7972l c7972l, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f3784l;
        }
        if (bArr != null) {
            c7972l.m2240public(48, z, bArr);
        } else {
            super.signatures().metrica(c7972l, z);
        }
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: native */
    public final Cinterface mo169native() {
        return ((Cclass) signatures()).mo169native();
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: package */
    public final Enumeration mo170package() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f3784l;
        }
        if (bArr == null) {
            return new Ccontinue(this);
        }
        C14236l c14236l = new C14236l();
        c14236l.yandex = new Csynchronized(bArr, 0);
        c14236l.loadAd = c14236l.yandex();
        return c14236l;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final synchronized void m964private() {
        appmetrica appmetricaVar;
        if (this.f3784l != null) {
            Csynchronized csynchronized = new Csynchronized(this.f3784l, 0);
            try {
                Ccase ccaseAds = csynchronized.ads();
                if (ccaseAds == null) {
                    appmetricaVar = new appmetrica(0, 0);
                } else {
                    appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
                    do {
                        appmetricaVar2.purchase(ccaseAds);
                        ccaseAds = csynchronized.ads();
                    } while (ccaseAds != null);
                    appmetricaVar = appmetricaVar2;
                }
                csynchronized.close();
                this.f504l = appmetricaVar.m167switch();
                this.f3784l = null;
            } catch (IOException e) {
                throw new Celse("malformed ASN.1: " + e, e, 0);
            }
        }
    }

    @Override // defpackage.Cclass, defpackage.Ccase
    public final Ccase signatures() {
        m964private();
        return super.signatures();
    }

    @Override // defpackage.Cclass
    public final int size() {
        m964private();
        return this.f504l.length;
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: strictfp */
    public final C4848l mo171strictfp() {
        return ((Cclass) signatures()).mo171strictfp();
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: synchronized */
    public final advert mo172synchronized() {
        return ((Cclass) signatures()).mo172synchronized();
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: throws */
    public final applovin mo173throws(int i) {
        m964private();
        return this.f504l[i];
    }

    @Override // defpackage.Cclass
    /* JADX INFO: renamed from: volatile */
    public final Cthrow mo174volatile() {
        return ((Cclass) signatures()).mo174volatile();
    }
}
