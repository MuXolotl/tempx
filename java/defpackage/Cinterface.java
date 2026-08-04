package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: interface, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cinterface extends Ccase implements Iterable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final ad f840l = new ad(18, Cinterface.class);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public applovin[] f841l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final applovin[] f842l;

    public Cinterface(appmetrica appmetricaVar, boolean z) {
        applovin[] applovinVarArrM167switch;
        int i;
        if (appmetricaVar == null) {
            C6541l.subs("'elementVector' cannot be null");
            throw null;
        }
        if (!z || (i = appmetricaVar.f489l) < 2) {
            applovinVarArrM167switch = appmetricaVar.m167switch();
        } else {
            if (i == 0) {
                applovinVarArrM167switch = appmetrica.f487l;
            } else {
                applovin[] applovinVarArr = new applovin[i];
                System.arraycopy((applovin[]) appmetricaVar.f492l, 0, applovinVarArr, 0, i);
                applovinVarArrM167switch = applovinVarArr;
            }
            inmobi(applovinVarArrM167switch);
        }
        this.f842l = applovinVarArrM167switch;
        this.f841l = (z || applovinVarArrM167switch.length < 2) ? applovinVarArrM167switch : null;
    }

    public static Cinterface applovin(Object obj) {
        String strAdcel;
        if (obj == null || (obj instanceof Cinterface)) {
            return (Cinterface) obj;
        }
        if (!(obj instanceof applovin)) {
            if (obj instanceof byte[]) {
                try {
                    return (Cinterface) f840l.m215l((byte[]) obj);
                } catch (IOException e) {
                    strAdcel = AbstractC5020l.adcel(e, new StringBuilder("failed to construct set from byte[]: "));
                }
            }
            C8339l.metrica(strAdcel);
            return null;
        }
        Ccase ccaseBilling = ((applovin) obj).billing();
        if (ccaseBilling instanceof Cinterface) {
            return (Cinterface) ccaseBilling;
        }
        strAdcel = "unknown object in getInstance: ".concat(obj.getClass().getName());
        C8339l.metrica(strAdcel);
        return null;
    }

    public static boolean appmetrica(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    public static void inmobi(applovin[] applovinVarArr) {
        int i;
        int length = applovinVarArr.length;
        if (length < 2) {
            return;
        }
        applovin applovinVar = applovinVarArr[0];
        applovin applovinVar2 = applovinVarArr[1];
        byte[] bArrPremium = premium(applovinVar);
        byte[] bArrPremium2 = premium(applovinVar2);
        if (appmetrica(bArrPremium2, bArrPremium)) {
            applovinVar2 = applovinVar;
            applovinVar = applovinVar2;
            bArrPremium2 = bArrPremium;
            bArrPremium = bArrPremium2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            applovin applovinVar3 = applovinVarArr[i2];
            byte[] bArrPremium3 = premium(applovinVar3);
            if (appmetrica(bArrPremium2, bArrPremium3)) {
                applovinVarArr[i2 - 2] = applovinVar;
                applovinVar = applovinVar2;
                bArrPremium = bArrPremium2;
                applovinVar2 = applovinVar3;
                bArrPremium2 = bArrPremium3;
            } else if (appmetrica(bArrPremium, bArrPremium3)) {
                applovinVarArr[i2 - 2] = applovinVar;
                applovinVar = applovinVar3;
                bArrPremium = bArrPremium3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    applovin applovinVar4 = applovinVarArr[i3 - 2];
                    if (appmetrica(premium(applovinVar4), bArrPremium3)) {
                        break;
                    }
                    applovinVarArr[i] = applovinVar4;
                    i3 = i;
                }
                applovinVarArr[i] = applovinVar3;
            }
        }
        applovinVarArr[length - 2] = applovinVar;
        applovinVarArr[length - 1] = applovinVar2;
    }

    public static byte[] premium(applovin applovinVar) {
        try {
            return applovinVar.billing().remoteconfig("DER");
        } catch (IOException unused) {
            C8339l.metrica("cannot encode object added to SET");
            return null;
        }
    }

    @Override // defpackage.Ccase
    public final boolean ads() {
        return true;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        applovin[] applovinVarArr = this.f842l;
        int length = applovinVarArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += applovinVarArr[length].billing().hashCode();
        }
    }

    @Override // defpackage.Ccase
    public Ccase isVip() {
        if (this.f841l == null) {
            applovin[] applovinVarArr = (applovin[]) this.f842l.clone();
            this.f841l = applovinVarArr;
            inmobi(applovinVarArr);
        }
        C2930l c2930l = new C2930l(true, this.f841l);
        c2930l.f6383l = -1;
        return c2930l;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C15037l(1, appmetrica.isPro(this.f842l));
    }

    @Override // defpackage.Ccase
    public Ccase signatures() {
        C12609l c12609l = new C12609l(this.f842l, this.f841l);
        c12609l.f24835l = -1;
        return c12609l;
    }

    public final String toString() {
        applovin[] applovinVarArr = this.f842l;
        int length = applovinVarArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append(applovinVarArr[i]);
            i++;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (ccase instanceof Cinterface) {
            Cinterface cinterface = (Cinterface) ccase;
            int length = this.f842l.length;
            if (cinterface.f842l.length == length) {
                C2930l c2930l = (C2930l) isVip();
                C2930l c2930l2 = (C2930l) cinterface.isVip();
                for (int i = 0; i < length; i++) {
                    Ccase ccaseBilling = c2930l.f842l[i].billing();
                    Ccase ccaseBilling2 = c2930l2.f842l[i].billing();
                    if (ccaseBilling == ccaseBilling2 || ccaseBilling.vip(ccaseBilling2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Cinterface(applovin applovinVar) {
        if (applovinVar == null) {
            C6541l.subs("'element' cannot be null");
            throw null;
        }
        applovin[] applovinVarArr = {applovinVar};
        this.f842l = applovinVarArr;
        this.f841l = applovinVarArr;
    }

    public Cinterface() {
        applovin[] applovinVarArr = appmetrica.f487l;
        this.f842l = applovinVarArr;
        this.f841l = applovinVarArr;
    }

    public Cinterface(boolean z, applovin[] applovinVarArr) {
        this.f842l = applovinVarArr;
        if (!z && applovinVarArr.length >= 2) {
            applovinVarArr = null;
        }
        this.f841l = applovinVarArr;
    }

    public Cinterface(applovin[] applovinVarArr) {
        for (applovin applovinVar : applovinVarArr) {
            if (applovinVar == null) {
                C6541l.subs("'elements' cannot be null, or contain null");
                throw null;
            }
        }
        applovin[] applovinVarArrIsPro = appmetrica.isPro(applovinVarArr);
        if (applovinVarArrIsPro.length >= 2) {
            inmobi(applovinVarArrIsPro);
        }
        this.f842l = applovinVarArrIsPro;
        this.f841l = applovinVarArr;
    }

    public Cinterface(applovin[] applovinVarArr, applovin[] applovinVarArr2) {
        this.f842l = applovinVarArr;
        this.f841l = applovinVarArr2;
    }
}
