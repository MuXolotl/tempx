package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: loaded from: classes3.dex */
public final class ad extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f2l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad(int i, Class cls) {
        super(0, cls);
        this.f2l = i;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public Ccase mo9l(C11327l c11327l) {
        switch (this.f2l) {
            case 0:
                return new C11172l(c11327l.f36593l);
            case 1:
                return advert.premium(c11327l.f36593l);
            case 2:
                return signatures.premium(c11327l.f36593l);
            case 3:
                return inmobi.premium(false, c11327l.f36593l);
            case 4:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            default:
                return super.mo9l(c11327l);
            case 5:
                return new C15324l(c11327l.f36593l);
            case 6:
                return new Cpackage(c11327l.f36593l);
            case 7:
                return new C3569l(c11327l.f36593l);
            case 8:
                return new C10604l(c11327l.f36593l);
            case 9:
                return new Cstrictfp(c11327l.f36593l);
            case 10:
                if (c11327l.f36593l.length == 0) {
                    return C14998l.f29509l;
                }
                C8339l.smaato("malformed NULL encoding encountered");
                return null;
            case 11:
                return new C7793l(c11327l.f36593l);
            case 12:
                return new Cprivate(new C3569l(c11327l.f36593l));
            case 13:
                return Cfor.appmetrica(false, c11327l.f36593l);
            case 14:
                return c11327l;
            case 15:
                return new C5876l(c11327l.f36593l);
            case 16:
                return Cswitch.premium(false, c11327l.f36593l);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C6057l(c11327l.f36593l);
            case 20:
                return new Cnew(c11327l.f36593l);
            case 21:
                return new C17283l(c11327l.f36593l);
            case 22:
                return new C2761l(c11327l.f36593l);
            case 23:
                return new C1929l(c11327l.f36593l);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C10336l(c11327l.f36593l);
        }
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lُٔۨ, reason: contains not printable characters */
    public Ccase mo10l(Cclass cclass) {
        switch (this.f2l) {
            case 1:
                return cclass.mo172synchronized();
            case 4:
                return cclass.mo171strictfp();
            case 12:
                throw new IllegalStateException("unexpected implicit constructed encoding");
            case 14:
                return cclass.mo174volatile();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return cclass;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return cclass.mo169native();
            default:
                return super.mo10l(cclass);
        }
    }
}
