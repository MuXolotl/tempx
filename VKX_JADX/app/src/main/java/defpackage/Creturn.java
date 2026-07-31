package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: return, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class Creturn implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f36563l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36564l;

    public Creturn(int i, List list) {
        this.f36564l = i;
        switch (i) {
            case 23:
                C5348l c5348l = C5348l.f11490l;
                this.f36563l = list;
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                int i2 = C9233l.f18988l;
                this.f36563l = list;
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C13298l c13298l = C13298l.f26099l;
                this.f36563l = list;
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C9451l c9451l = C9451l.f19312l;
                this.f36563l = list;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f36564l;
        List list = this.f36563l;
        switch (i) {
            case 0:
                list.get(((Number) obj).intValue());
                return null;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                list.get(((Number) obj).intValue());
                return null;
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                list.get(((Number) obj).intValue());
                return null;
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                list.get(((Number) obj).intValue());
                return null;
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                list.get(((Number) obj).intValue());
                return null;
            case 9:
                list.get(((Number) obj).intValue());
                return null;
            case 10:
                list.get(((Number) obj).intValue());
                return null;
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                list.get(((Number) obj).intValue());
                return null;
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                list.get(((Number) obj).intValue());
                return null;
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                list.get(((Number) obj).intValue());
                return null;
            case 20:
                int iIntValue = ((Number) obj).intValue();
                int i2 = C9233l.f18988l;
                return ((InterfaceC12360l) list.get(iIntValue)).getItemId();
            case 21:
                list.get(((Number) obj).intValue());
                return null;
            case 22:
                list.get(((Number) obj).intValue());
                return null;
            case 23:
                return C5348l.f11490l.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return C13298l.f26099l.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return C9451l.f19312l.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                list.get(((Number) obj).intValue());
                return null;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ Creturn(List list, int i, boolean z) {
        this.f36564l = i;
        this.f36563l = list;
    }
}
