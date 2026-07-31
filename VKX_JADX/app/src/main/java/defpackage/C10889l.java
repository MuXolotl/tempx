package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؙٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10889l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10113l f22011l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22012l;

    public /* synthetic */ C10889l(AbstractC10113l abstractC10113l, int i) {
        this.f22012l = i;
        this.f22011l = abstractC10113l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f22012l;
        AbstractC10113l abstractC10113l = this.f22011l;
        switch (i) {
            case 0:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
            case 1:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
            case 2:
                ((AbstractC9601l) obj).mopub(abstractC10113l, 0, 0, 0.0f);
                break;
            case 3:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
            case 4:
                ((AbstractC9601l) obj).mopub(abstractC10113l, 0, 0, 0.0f);
                break;
            case 5:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
            case 6:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
            case 7:
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                if (abstractC9601l.purchase() == EnumC9931l.f20223l || abstractC9601l.billing() == 0) {
                    AbstractC9601l.yandex(abstractC9601l, abstractC10113l);
                    abstractC10113l.mo883interface(C5177l.amazon(0L, abstractC10113l.f20593l), 0.0f, null);
                } else {
                    long jBilling = ((long) (abstractC9601l.billing() - abstractC10113l.f20592l)) << 32;
                    AbstractC9601l.yandex(abstractC9601l, abstractC10113l);
                    abstractC10113l.mo883interface(C5177l.amazon(jBilling, abstractC10113l.f20593l), 0.0f, null);
                }
                break;
            case 8:
                ((AbstractC9601l) obj).mopub(abstractC10113l, 0, 0, 0.0f);
                break;
            case 9:
                AbstractC9601l.startapp((AbstractC9601l) obj, this.f22011l, 0, 0, null, 12);
                break;
            case 10:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
            case 11:
                ((AbstractC9601l) obj).mopub(abstractC10113l, 0, 0, 0.0f);
                break;
            case 12:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
            case 13:
                ((AbstractC9601l) obj).mopub(abstractC10113l, 0, 0, 0.0f);
                break;
            case 14:
                ((AbstractC9601l) obj).mopub(abstractC10113l, 0, 0, 0.0f);
                break;
            case 15:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
            case 16:
                ((AbstractC9601l) obj).mopub(abstractC10113l, 0, 0, 0.0f);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((AbstractC9601l) obj).mopub(abstractC10113l, 0, 0, 0.0f);
                break;
            default:
                AbstractC9601l.smaato((AbstractC9601l) obj, abstractC10113l, 0, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
