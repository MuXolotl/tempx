package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: renamed from: lٖۥ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16770l extends Cnative {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C10198l f32780l = new C10198l(InterfaceC0543l.f1905l, C14998l.f29509l);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Cstrictfp f32781l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cstrictfp f32782l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cthrow f32783l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10198l f32784l;

    public C16770l(Cclass cclass) {
        Enumeration enumerationMo170package = cclass.mo170package();
        this.f32783l = (Cthrow) enumerationMo170package.nextElement();
        this.f32782l = (Cstrictfp) enumerationMo170package.nextElement();
        if (!enumerationMo170package.hasMoreElements()) {
            this.f32781l = null;
            this.f32784l = null;
            return;
        }
        Object objNextElement = enumerationMo170package.nextElement();
        if (objNextElement instanceof Cstrictfp) {
            this.f32781l = Cstrictfp.premium(objNextElement);
            objNextElement = enumerationMo170package.hasMoreElements() ? enumerationMo170package.nextElement() : null;
        } else {
            this.f32781l = null;
        }
        if (objNextElement != null) {
            this.f32784l = C10198l.vip(objNextElement);
        } else {
            this.f32784l = null;
        }
    }

    public static C16770l vip(Object obj) {
        if (obj instanceof C16770l) {
            return (C16770l) obj;
        }
        if (obj != null) {
            return new C16770l(Cclass.inmobi(obj));
        }
        return null;
    }

    public final C10198l ads() {
        C10198l c10198l = this.f32784l;
        return c10198l != null ? c10198l : f32780l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(4, 0);
        appmetricaVar.purchase(this.f32783l);
        appmetricaVar.purchase(this.f32782l);
        Cstrictfp cstrictfp = this.f32781l;
        if (cstrictfp != null) {
            appmetricaVar.purchase(cstrictfp);
        }
        C10198l c10198l = this.f32784l;
        if (c10198l != null && !c10198l.equals(f32780l)) {
            appmetricaVar.purchase(c10198l);
        }
        C11138l c11138l = new C11138l(appmetricaVar);
        c11138l.f22357l = -1;
        return c11138l;
    }

    public final BigInteger metrica() {
        Cstrictfp cstrictfp = this.f32781l;
        if (cstrictfp != null) {
            return cstrictfp.appmetrica();
        }
        return null;
    }

    public final byte[] tapsense() {
        return AbstractC14024l.crashlytics(this.f32783l.f36593l);
    }

    public C16770l(byte[] bArr, int i, int i2, C10198l c10198l) {
        this.f32783l = new C11327l(AbstractC14024l.crashlytics(bArr));
        this.f32782l = Cstrictfp.m4580private(i);
        this.f32781l = i2 > 0 ? Cstrictfp.m4580private(i2) : null;
        this.f32784l = c10198l;
    }
}
