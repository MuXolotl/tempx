package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: final, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cfinal extends Ccase implements InterfaceC12254l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f821l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f822l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f823l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final applovin f824l;

    public Cfinal(int i, int i2, int i3, applovin applovinVar) {
        if (applovinVar == null) {
            C6541l.subs("'obj' cannot be null");
            throw null;
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            C8339l.metrica(AbstractC0653l.vip(i2, "invalid tag class: "));
            throw null;
        }
        this.f823l = applovinVar instanceof premium ? 1 : i;
        this.f822l = i2;
        this.f821l = i3;
        this.f824l = applovinVar;
    }

    public static Cfinal inmobi(Object obj) {
        String strAdcel;
        if (obj == null || (obj instanceof Cfinal)) {
            return (Cfinal) obj;
        }
        if (!(obj instanceof applovin)) {
            if (obj instanceof byte[]) {
                try {
                    Ccase ccaseAdvert = Ccase.advert((byte[]) obj);
                    if (ccaseAdvert instanceof Cfinal) {
                        return (Cfinal) ccaseAdvert;
                    }
                    throw new IllegalStateException("unexpected object: ".concat(ccaseAdvert.getClass().getName()));
                } catch (IOException e) {
                    strAdcel = AbstractC5020l.adcel(e, new StringBuilder("failed to construct tagged object from byte[]: "));
                }
            }
            C8339l.metrica(strAdcel);
            return null;
        }
        Ccase ccaseBilling = ((applovin) obj).billing();
        if (ccaseBilling instanceof Cfinal) {
            return (Cfinal) ccaseBilling;
        }
        strAdcel = "unknown object in getInstance: ".concat(obj.getClass().getName());
        C8339l.metrica(strAdcel);
        return null;
    }

    public final Ccase applovin(boolean z, Cgoto cgoto) {
        String str;
        applovin applovinVar = this.f824l;
        if (!z) {
            int i = this.f823l;
            if (1 != i) {
                Ccase ccaseBilling = applovinVar.billing();
                if (i == 3) {
                    return cgoto.mo10l(mo186package(ccaseBilling));
                }
                if (i == 4) {
                    return ccaseBilling instanceof Cclass ? cgoto.mo10l((Cclass) ccaseBilling) : cgoto.mo9l((C11327l) ccaseBilling);
                }
                cgoto.m230l(ccaseBilling);
                return ccaseBilling;
            }
            str = "object explicit - implicit expected.";
        } else {
            if (m187throws()) {
                Ccase ccaseBilling2 = applovinVar.billing();
                cgoto.m230l(ccaseBilling2);
                return ccaseBilling2;
            }
            str = "object implicit - explicit expected.";
        }
        C8339l.smaato(str);
        return null;
    }

    public final Cnative appmetrica() {
        if (m187throws()) {
            applovin applovinVar = this.f824l;
            return applovinVar instanceof Cnative ? (Cnative) applovinVar : applovinVar.billing();
        }
        C8339l.smaato("object implicit - explicit expected.");
        return null;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        return this.f824l.billing().hashCode() ^ (((this.f822l * 7919) ^ this.f821l) ^ (m187throws() ? 15 : 240));
    }

    @Override // defpackage.Ccase
    public Ccase isVip() {
        return new C9320l(this.f823l, this.f822l, this.f821l, this.f824l);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public abstract Cclass mo186package(Ccase ccase);

    public final Ccase premium(int i) {
        ad adVar;
        switch (i) {
            case 1:
                adVar = signatures.f36566l;
                break;
            case 2:
                adVar = Cstrictfp.f36571l;
                break;
            case 3:
                adVar = advert.f9l;
                break;
            case 4:
                adVar = Cthrow.f36592l;
                break;
            case 5:
                adVar = Cvolatile.f36859l;
                break;
            case 6:
                adVar = Cfor.f829l;
                break;
            case 7:
                adVar = Cprivate.f36537l;
                break;
            case 8:
                adVar = C4848l.f9892l;
                break;
            case 9:
            case 11:
            case 14:
            case 15:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            default:
                adVar = null;
                break;
            case 10:
                adVar = inmobi.f835l;
                break;
            case 12:
                adVar = C17283l.f33535l;
                break;
            case 13:
                adVar = Cswitch.f36580l;
                break;
            case 16:
                adVar = Cclass.f503l;
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                adVar = Cinterface.f840l;
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                adVar = C7793l.f16315l;
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                adVar = C5876l.f12375l;
                break;
            case 20:
                adVar = C6057l.f12827l;
                break;
            case 21:
                adVar = C1929l.f4392l;
                break;
            case 22:
                adVar = C10604l.f21524l;
                break;
            case 23:
                adVar = Cnew.f36533l;
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                adVar = Cpackage.f36535l;
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                adVar = C3569l.f7497l;
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                adVar = C10336l.f21053l;
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                adVar = C15324l.f29949l;
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                adVar = C2761l.f5998l;
                break;
            case 30:
                adVar = C11172l.f22460l;
                break;
        }
        if (adVar != null) {
            return applovin(true, adVar);
        }
        C8339l.metrica(AbstractC0653l.vip(i, "unsupported UNIVERSAL tag number: "));
        return null;
    }

    @Override // defpackage.Ccase
    public Ccase signatures() {
        return new C7332l(this.f823l, this.f822l, this.f821l, this.f824l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m187throws() {
        int i = this.f823l;
        return i == 1 || i == 3;
    }

    public final String toString() {
        return AbstractC9027l.crashlytics(this.f822l, this.f821l) + this.f824l;
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (!(ccase instanceof Cfinal)) {
            return false;
        }
        Cfinal cfinal = (Cfinal) ccase;
        if (this.f821l != cfinal.f821l || this.f822l != cfinal.f822l) {
            return false;
        }
        if (this.f823l != cfinal.f823l && m187throws() != cfinal.m187throws()) {
            return false;
        }
        Ccase ccaseBilling = this.f824l.billing();
        Ccase ccaseBilling2 = cfinal.f824l.billing();
        if (ccaseBilling == ccaseBilling2) {
            return true;
        }
        if (m187throws()) {
            return ccaseBilling.vip(ccaseBilling2);
        }
        try {
            return Arrays.equals(getEncoded(), cfinal.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC12254l
    public final Ccase smaato() {
        return this;
    }

    public Cfinal(boolean z, int i, applovin applovinVar) {
        this(z ? 1 : 2, 128, i, applovinVar);
    }
}
