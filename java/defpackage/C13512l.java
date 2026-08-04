package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْْٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13512l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f26525l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26526l;

    public C13512l(int i, List list) {
        this.f26526l = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10724l c10724l = C10724l.f21732l;
                this.f26525l = list;
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                C10755l c10755l = C10755l.f21788l;
                this.f26525l = list;
                break;
            case 20:
                C0449l c0449l = C0449l.f1631l;
                this.f26525l = list;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f26526l;
        List list = this.f26525l;
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
                return C14594l.f28576l.get(list.get(((Number) obj).intValue()));
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
                return C10755l.f21788l.get(list.get(((Number) obj).intValue()));
            case 10:
                list.get(((Number) obj).intValue());
                return null;
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                return C15732l.f30905l.get(list.get(((Number) obj).intValue()));
            case 13:
                return C15921l.f31250l.get(list.get(((Number) obj).intValue()));
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
                return C10724l.f21732l.get(list.get(((Number) obj).intValue()));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return 0;
            case 20:
                return C0449l.f1631l.get(list.get(((Number) obj).intValue()));
            case 21:
                return 0;
            case 22:
                list.get(((Number) obj).intValue());
                return null;
            case 23:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                list.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                list.get(((Number) obj).intValue());
                return null;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }

    public C13512l(InterfaceC13238l interfaceC13238l, int i) {
        this.f26526l = i;
        switch (i) {
            case 13:
                C15921l c15921l = C15921l.f31250l;
                this.f26525l = interfaceC13238l;
                break;
            default:
                C15732l c15732l = C15732l.f30905l;
                this.f26525l = interfaceC13238l;
                break;
        }
    }

    public C13512l(C11362l c11362l) {
        this.f26526l = 3;
        C14594l c14594l = C14594l.f28576l;
        this.f26525l = c11362l;
    }

    public /* synthetic */ C13512l(List list, int i, boolean z) {
        this.f26526l = i;
        this.f26525l = list;
    }
}
