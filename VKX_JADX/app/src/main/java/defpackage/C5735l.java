package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؘِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5735l extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12113l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5735l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f12113l = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f12113l;
        C7635l c7635l = C7635l.yandex;
        int i2 = 1;
        InterfaceC14029l interfaceC14029l = null;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                C13695l c13695l = (C13695l) obj;
                if (!((Boolean) c13695l.f26739l.getValue()).booleanValue() && c13695l.m3663abstract() != EnumC7331l.UNKNOWN && c13695l.m3663abstract() != EnumC7331l.SOME) {
                    AbstractC10999l.mopub(c13695l, null, 0, new C16720l(c13695l, interfaceC14029l, i2), 3);
                }
                break;
            case 1:
                ((C14084l) obj).mo1143default();
                break;
            case 2:
                AbstractC6139l abstractC6139l = (AbstractC6139l) ((C5653l) obj).yandex.get();
                if (abstractC6139l != null) {
                    abstractC6139l.mo1103l();
                }
                break;
            case 3:
                AppActivity appActivity = (AppActivity) ((C12467l) obj).isVip();
                appActivity.onBackPressed();
                appActivity.f36637l.amazon(C11538l.f23209l);
                C2491l.yandex.getClass();
                C2491l.billing.advert(C2491l.loadAd[1], Boolean.FALSE);
                break;
            case 4:
                AppActivity appActivity2 = (AppActivity) ((C12467l) obj).isVip();
                appActivity2.onBackPressed();
                VKXApplication.f36625l.postDelayed(new RunnableC11443l(appActivity2, i2), 500L);
                break;
            case 5:
                AppActivity appActivity3 = (AppActivity) ((C12467l) obj).isVip();
                AbstractC2338l abstractC2338l = (AbstractC2338l) AbstractC16901l.m4217extends(appActivity3.f36639l);
                if (abstractC2338l != null) {
                    abstractC2338l.purchase();
                }
                VKXApplication.f36625l.postDelayed(new RunnableC11443l(appActivity3, 2), 500L);
                break;
            case 6:
                ((C5636l) obj).mo1143default();
                break;
            case 7:
                ((C2169l) obj).mo1143default();
                break;
            case 8:
                ((C16042l) obj).mo1143default();
                break;
            case 9:
                C11655l c11655l = (C11655l) obj;
                c11655l.f23371l.setValue(Boolean.FALSE);
                C7206l c7206l = C7206l.yandex;
                C7206l.amazon(EnumC10788l.f21803l);
                new C17986l(c7635l, null).Signature(c11655l.isVip());
                break;
            case 10:
                ((C11655l) obj).f23371l.setValue(Boolean.FALSE);
                C7206l c7206l2 = C7206l.yandex;
                C7206l.amazon(EnumC10788l.f21803l);
                break;
            case 11:
                ((C11655l) obj).mo1143default();
                break;
            case 12:
                ((C11655l) obj).m3183transient(true);
                break;
            case 13:
                ((C11655l) obj).m3183transient(false);
                break;
            case 14:
                C11655l c11655l2 = (C11655l) obj;
                c11655l2.m3183transient(false);
                new C17986l(c7635l, null).Signature(c11655l2.isVip());
                break;
            case 15:
                C11655l c11655l3 = (C11655l) obj;
                c11655l3.m3183transient(false);
                c11655l3.f23369l.setValue(Boolean.TRUE);
                break;
            case 16:
                C11655l c11655l4 = (C11655l) obj;
                c11655l4.getClass();
                C11655l.m3179break(c11655l4, null, true, 1);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C7217l) obj).purchase();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C7217l c7217l = (C7217l) obj;
                Activity activity = c7217l.f5081l;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", c7217l.f5081l.getPackageName(), null));
                activity.startActivity(intent);
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C1463l) obj).mo1143default();
                break;
            case 20:
                ((C17408l) obj).mo1143default();
                break;
            case 21:
                ((C11749l) obj).purchase();
                break;
            case 22:
                ((C9197l) obj).mo1143default();
                break;
            case 23:
                C17284l c17284l = (C17284l) obj;
                c17284l.getClass();
                c17284l.m4125private(new C9430l());
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C17284l c17284l2 = (C17284l) obj;
                c17284l2.getClass();
                c17284l2.m4125private(new C11655l());
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C17284l c17284l3 = (C17284l) obj;
                c17284l3.getClass();
                c17284l3.m4125private(new C15068l(C18450l.f36028l));
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C17284l c17284l4 = (C17284l) obj;
                c17284l4.getClass();
                c17284l4.m4125private(new C15068l(C14823l.f28996l));
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C17284l c17284l5 = (C17284l) obj;
                c17284l5.getClass();
                int i3 = AbstractC7890l.yandex;
                AbstractC7890l.yandex(c17284l5.isVip(), AbstractC11990l.firebase(c17284l5), true, new C7306l(c17284l5, interfaceC14029l, 5));
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C18306l) obj).mo1143default();
                break;
            default:
                C18306l c18306l = (C18306l) obj;
                c18306l.m4513l(false);
                InterfaceC3687l interfaceC3687lM4515l = c18306l.m4515l();
                C12708l c12708l = interfaceC3687lM4515l instanceof C12708l ? (C12708l) interfaceC3687lM4515l : null;
                if (c12708l != null) {
                    AbstractC9033l.crashlytics((AppActivity) c18306l.isVip(), new C1914l(c12708l.yandex, c18306l, interfaceC14029l, 7));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
