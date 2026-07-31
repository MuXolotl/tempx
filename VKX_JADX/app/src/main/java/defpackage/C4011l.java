package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4011l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f8234l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8235l;

    public /* synthetic */ C4011l(C18656l c18656l, int i) {
        this.f8235l = i;
        this.f8234l = c18656l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8235l;
        C18656l c18656l = this.f8234l;
        switch (i) {
            case 0:
                return c18656l.amazon.getValue();
            case 1:
                return c18656l.billing();
            case 2:
                return c18656l.amazon.getValue();
            case 3:
                return c18656l.billing();
            case 4:
                return c18656l.amazon.getValue();
            case 5:
                return c18656l.billing();
            case 6:
                return c18656l.amazon.getValue();
            case 7:
                return c18656l.billing();
            case 8:
                return c18656l.amazon.getValue();
            case 9:
                return c18656l.billing();
            case 10:
                return c18656l.amazon.getValue();
            case 11:
                return c18656l.billing();
            case 12:
                return c18656l.amazon.getValue();
            case 13:
                return c18656l.billing();
            case 14:
                return c18656l.amazon.getValue();
            case 15:
                return c18656l.billing();
            case 16:
                return c18656l.amazon.getValue();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c18656l.billing();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c18656l.amazon.getValue();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c18656l.billing();
            case 20:
                return c18656l.amazon.getValue();
            case 21:
                return c18656l.billing();
            case 22:
                return c18656l.amazon.getValue();
            case 23:
                return c18656l.billing();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c18656l.amazon.getValue();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return c18656l.billing();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return c18656l.amazon.getValue();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return c18656l.billing();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return c18656l.amazon.getValue();
            default:
                return c18656l.billing();
        }
    }
}
