package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* JADX INFO: renamed from: lؔٞۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2795l extends Cnative implements premium {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Ccase f6091l;

    public C2795l(Ccase ccase) {
        if ((ccase instanceof Cnew) || (ccase instanceof Cpackage)) {
            this.f6091l = ccase;
        } else {
            C8339l.metrica("unknown object passed to Time");
            throw null;
        }
    }

    public static C2795l metrica(applovin applovinVar) {
        if (applovinVar == null || (applovinVar instanceof C2795l)) {
            return (C2795l) applovinVar;
        }
        if (applovinVar instanceof Cnew) {
            return new C2795l((Cnew) applovinVar);
        }
        if (applovinVar instanceof Cpackage) {
            return new C2795l((Cpackage) applovinVar);
        }
        C8339l.metrica("unknown object in factory: ".concat(applovinVar.getClass().getName()));
        return null;
    }

    public final String ads() {
        Ccase ccase = this.f6091l;
        if (!(ccase instanceof Cnew)) {
            return ((Cpackage) ccase).m4578throws();
        }
        String strPremium = ((Cnew) ccase).premium();
        return strPremium.charAt(0) < '5' ? "20".concat(strPremium) : "19".concat(strPremium);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f6091l;
    }

    public final String toString() {
        return ads();
    }

    public final Date vip() {
        try {
            Ccase ccase = this.f6091l;
            if (!(ccase instanceof Cnew)) {
                return ((Cpackage) ccase).appmetrica();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", AbstractC12215l.yandex);
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            String strPremium = ((Cnew) ccase).premium();
            return simpleDateFormat.parse((strPremium.charAt(0) < '5' ? "20" : "19").concat(strPremium));
        } catch (ParseException e) {
            C1759l.isPro(e.getMessage(), "invalid date string: ");
            return null;
        }
    }
}
