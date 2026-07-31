package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: renamed from: class, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cclass extends Ccase implements Iterable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f503l = new ad(17, Cclass.class);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public applovin[] f504l;

    public Cclass(applovin applovinVar, applovin applovinVar2) {
        if (applovinVar == null) {
            C6541l.subs("'element1' cannot be null");
            throw null;
        }
        if (applovinVar2 != null) {
            this.f504l = new applovin[]{applovinVar, applovinVar2};
        } else {
            C6541l.subs("'element2' cannot be null");
            throw null;
        }
    }

    public static Cclass appmetrica(Cfinal cfinal, boolean z) {
        return (Cclass) f503l.m222l(cfinal, z);
    }

    public static Cclass inmobi(Object obj) {
        String strAdcel;
        if (obj == null || (obj instanceof Cclass)) {
            return (Cclass) obj;
        }
        if (!(obj instanceof applovin)) {
            if (obj instanceof byte[]) {
                try {
                    return (Cclass) f503l.m215l((byte[]) obj);
                } catch (IOException e) {
                    strAdcel = AbstractC5020l.adcel(e, new StringBuilder("failed to construct sequence from byte[]: "));
                }
            }
            C8339l.metrica(strAdcel);
            return null;
        }
        Ccase ccaseBilling = ((applovin) obj).billing();
        if (ccaseBilling instanceof Cclass) {
            return (Cclass) ccaseBilling;
        }
        strAdcel = "unknown object in getInstance: ".concat(obj.getClass().getName());
        C8339l.metrica(strAdcel);
        return null;
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return true;
    }

    public final Cthrow[] applovin() {
        int size = size();
        Cthrow[] cthrowArr = new Cthrow[size];
        for (int i = 0; i < size; i++) {
            cthrowArr[i] = Cthrow.premium(this.f504l[i]);
        }
        return cthrowArr;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public int hashCode() {
        int length = this.f504l.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f504l[length].billing().hashCode();
        }
    }

    @Override // defpackage.Ccase
    public Ccase isVip() {
        C11138l c11138l = new C11138l(this.f504l, 0);
        c11138l.f22357l = -1;
        return c11138l;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C15037l(1, this.f504l);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public abstract Cinterface mo169native();

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public Enumeration mo170package() {
        return new Ccontinue(this);
    }

    public final advert[] premium() {
        int size = size();
        advert[] advertVarArr = new advert[size];
        for (int i = 0; i < size; i++) {
            advertVarArr[i] = advert.appmetrica(this.f504l[i]);
        }
        return advertVarArr;
    }

    @Override // defpackage.Ccase
    public Ccase signatures() {
        C3884l c3884l = new C3884l(this.f504l, 0);
        c3884l.f8024l = -1;
        return c3884l;
    }

    public int size() {
        return this.f504l.length;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public abstract C4848l mo171strictfp();

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public abstract advert mo172synchronized();

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public applovin mo173throws(int i) {
        return this.f504l[i];
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append(this.f504l[i]);
            i++;
            if (i >= size) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (!(ccase instanceof Cclass)) {
            return false;
        }
        Cclass cclass = (Cclass) ccase;
        int size = size();
        if (cclass.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            Ccase ccaseBilling = this.f504l[i].billing();
            Ccase ccaseBilling2 = cclass.f504l[i].billing();
            if (ccaseBilling != ccaseBilling2 && !ccaseBilling.vip(ccaseBilling2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public abstract Cthrow mo174volatile();

    public Cclass(applovin applovinVar) {
        if (applovinVar != null) {
            this.f504l = new applovin[]{applovinVar};
        } else {
            C6541l.subs("'element' cannot be null");
            throw null;
        }
    }

    public Cclass() {
        this.f504l = appmetrica.f487l;
    }

    public Cclass(appmetrica appmetricaVar) {
        if (appmetricaVar != null) {
            this.f504l = appmetricaVar.m167switch();
        } else {
            C6541l.subs("'elementVector' cannot be null");
            throw null;
        }
    }

    public Cclass(applovin[] applovinVarArr) {
        if (applovinVarArr != null) {
            for (applovin applovinVar : applovinVarArr) {
                if (applovinVar != null) {
                }
            }
            this.f504l = appmetrica.isPro(applovinVarArr);
            return;
        }
        C6541l.subs("'elements' cannot be null, or contain null");
        throw null;
    }

    public Cclass(applovin[] applovinVarArr, int i) {
        this.f504l = applovinVarArr;
    }
}
