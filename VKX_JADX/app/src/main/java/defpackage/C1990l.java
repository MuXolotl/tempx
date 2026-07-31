package defpackage;

import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓٝۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1990l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4499l;

    public /* synthetic */ C1990l(C15813l c15813l) {
        this.f4499l = 0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f4499l) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                List listM4213const = AbstractC16901l.m4213const(new C15353l());
                if (listM4213const.size() > 1) {
                    C17132l.metrica(listM4213const, "Multiple default JDK security providers found: ");
                    return null;
                }
                if (AbstractC16901l.m4236public(listM4213const) == null) {
                    return new C5920l();
                }
                C18725l.loadAd();
                return null;
            case 2:
                return C15314l.loadAd;
            case 3:
                return C16579l.loadAd;
            case 4:
                return C8465l.loadAd;
            case 5:
                return C14283l.loadAd;
            case 6:
                return C14417l.loadAd;
            case 7:
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 8:
                return new C8232l(0, 0);
            case 9:
                return new C7583l(new int[]{0}, new int[]{0});
            case 10:
                return new C6069l(i);
            case 11:
                return new C6069l(2);
            case 12:
                return Unit.INSTANCE;
            case 13:
                return new C8195l(EnumC12456l.f24585l, new C18334l(4));
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C8540l c8540l = AbstractC12504l.yandex;
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10707l c10707l = AbstractC15993l.yandex;
                return C7190l.yandex;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return C13204l.yandex;
            case 20:
                return new C18334l(8);
            case 21:
                C16198l c16198l = new C16198l(new C4384l(), i);
                c16198l.purchase();
                AbstractC2991l.admob(c16198l, '-');
                c16198l.billing();
                AbstractC2991l.admob(c16198l, '-');
                c16198l.loadAd();
                Unit unit = Unit.INSTANCE;
                return new C0279l(AbstractC5020l.crashlytics(c16198l));
            case 22:
                C16198l c16198l2 = new C16198l(new C4384l(), i);
                c16198l2.purchase();
                c16198l2.billing();
                c16198l2.loadAd();
                Unit unit2 = Unit.INSTANCE;
                return new C0279l(AbstractC5020l.crashlytics(c16198l2));
            case 23:
                C15773l c15773l = new C15773l(new C4384l());
                c15773l.vip(((C0279l) ((AbstractC17691l) AbstractC8258l.yandex.getValue())).yandex);
                AbstractC2991l.mopub(c15773l, new Function1[]{new C18334l(9)}, new C18334l(10));
                c15773l.metrica(((C5990l) AbstractC12412l.yandex.getValue()).yandex);
                Unit unit3 = Unit.INSTANCE;
                return new C3373l(AbstractC5020l.crashlytics(c15773l));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C8540l c8540l2 = AbstractC1627l.yandex;
                return null;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C18159l();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C9365l();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C7659l();
            default:
                C10707l c10707l2 = AbstractC2048l.yandex;
                return C11485l.f23076l;
        }
    }

    public /* synthetic */ C1990l(int i) {
        this.f4499l = i;
    }
}
