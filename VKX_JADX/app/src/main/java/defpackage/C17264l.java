package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٜٗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17264l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f33495l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33496l;

    public /* synthetic */ C17264l(String str, int i) {
        this.f33496l = i;
        this.f33495l = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f33496l;
        String str = this.f33495l;
        C5695l c5695l = (C5695l) obj;
        switch (i) {
            case 0:
                C9217l c9217l = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l, c9217l);
                break;
            case 1:
                c5695l.yandex(str, AbstractC14490l.loadAd);
                break;
            case 2:
                c5695l.yandex(str, AbstractC14490l.loadAd);
                break;
            case 3:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
            case 4:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
            case 5:
                c5695l.yandex(str, AbstractC14490l.loadAd);
                break;
            case 6:
                c5695l.yandex(str, AbstractC14490l.loadAd);
                break;
            case 7:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
            case 8:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
            case 9:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
            case 10:
                c5695l.loadAd(str, AbstractC14490l.loadAd);
                break;
            case 11:
                C9217l c9217l2 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l2, c9217l2, c9217l2);
                break;
            case 12:
                C9217l c9217l3 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l3);
                c5695l.yandex(str, c9217l3);
                c5695l.loadAd(str, AbstractC14490l.yandex);
                break;
            case 13:
                C9217l c9217l4 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l4);
                c5695l.yandex(str, c9217l4);
                c5695l.loadAd(str, AbstractC14490l.yandex);
                break;
            case 14:
                C9217l c9217l5 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l5);
                c5695l.yandex(str, c9217l5);
                c5695l.yandex(str, c9217l5);
                c5695l.crashlytics = new C8195l(EnumC17708l.BOOLEAN.f34520l, null);
                break;
            case 15:
                C9217l c9217l6 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l6, c9217l6, c9217l6, c9217l6);
                break;
            case 16:
                C9217l c9217l7 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l7);
                c5695l.yandex(str, c9217l7);
                c5695l.loadAd(str, AbstractC14490l.yandex);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C9217l c9217l8 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l8, c9217l8);
                c5695l.crashlytics = new C8195l(EnumC17708l.BOOLEAN.f34520l, null);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C9217l c9217l9 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l9);
                c5695l.yandex(str, c9217l9);
                c5695l.loadAd(str, AbstractC14490l.yandex);
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                c5695l.loadAd(str, AbstractC14490l.loadAd, AbstractC14490l.crashlytics);
                break;
            case 20:
                c5695l.loadAd(str, AbstractC14490l.crashlytics);
                break;
            case 21:
                c5695l.yandex(str, AbstractC14490l.loadAd, AbstractC14490l.crashlytics);
                break;
            case 22:
                c5695l.loadAd(str, AbstractC14490l.yandex);
                break;
            case 23:
                c5695l.yandex(str, AbstractC14490l.loadAd);
                c5695l.crashlytics = new C8195l(EnumC17708l.BOOLEAN.f34520l, null);
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C9217l c9217l10 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l10);
                c5695l.yandex(str, c9217l10);
                c5695l.crashlytics = new C8195l(EnumC17708l.BOOLEAN.f34520l, null);
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                c5695l.yandex(str, AbstractC14490l.loadAd);
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C9217l c9217l11 = AbstractC14490l.loadAd;
                c5695l.loadAd(str, c9217l11, c9217l11);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C9217l c9217l12 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l12);
                c5695l.yandex(str, c9217l12);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C9217l c9217l13 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l13);
                c5695l.loadAd(str, c9217l13);
                break;
            default:
                C9217l c9217l14 = AbstractC14490l.loadAd;
                c5695l.yandex(str, c9217l14);
                c5695l.yandex(str, c9217l14);
                c5695l.loadAd(str, c9217l14);
                break;
        }
        return Unit.INSTANCE;
    }
}
