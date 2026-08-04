package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lَؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2613l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5677l;

    public /* synthetic */ C2613l(int i, C1644l c1644l) {
        this.f5677l = 24;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = null;
        boolean z = false;
        switch (this.f5677l) {
            case 0:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 1:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 2:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 3:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 4:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                C15478l.purchase.getClass();
                AbstractC0532l.loadAd(new C9810l(obj2, (AudioTrack) obj, 18), null);
                return Unit.INSTANCE;
            case 6:
                C8195l c8195l = (C8195l) obj;
                C15478l c15478l = C15478l.purchase;
                C17685l c17685l = new C17685l((AudioPlaylist) c8195l.f17098l, (List) c8195l.f17097l, "");
                c15478l.getClass();
                C15478l.loadAd(null, c17685l);
                return Unit.INSTANCE;
            case 7:
                C8195l c8195l2 = (C8195l) obj;
                C10244l.purchase.loadAd(new C17685l((AudioPlaylist) c8195l2.f17098l, (List) c8195l2.f17097l, ""));
                return Unit.INSTANCE;
            case 8:
                return new C14956l();
            case 9:
                return new C14956l();
            case 10:
                return new C14956l();
            case 11:
                return new C14956l();
            case 12:
                C14416l c14416l = (C14416l) obj;
                c14416l.yandex(new C12062l(new C1990l(2)), "JsonPrimitive");
                c14416l.yandex(new C12062l(new C1990l(3)), "JsonNull");
                c14416l.yandex(new C12062l(new C1990l(4)), "JsonLiteral");
                c14416l.yandex(new C12062l(new C1990l(5)), "JsonObject");
                c14416l.yandex(new C12062l(new C1990l(6)), "JsonArray");
                return Unit.INSTANCE;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                AbstractC9914l abstractC9914l = (AbstractC9914l) entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC4216l.yandex(str, sb);
                sb.append(':');
                sb.append(abstractC9914l);
                return sb.toString();
            case 14:
                C4105l c4105l = (C4105l) obj;
                c4105l.yandex = true;
                c4105l.crashlytics = true;
                c4105l.purchase = true;
                c4105l.billing = true;
                return Unit.INSTANCE;
            case 15:
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                InterfaceC6348l.yandex.getClass();
                AbstractC3668l.admob(interfaceC17593l, C2056l.loadAd);
                AbstractC3668l.billing(interfaceC17593l, C11485l.f23085l);
                return Unit.INSTANCE;
            case 16:
                InterfaceC17593l interfaceC17593l2 = (InterfaceC17593l) obj;
                InterfaceC6348l.yandex.getClass();
                AbstractC3668l.admob(interfaceC17593l2, C2056l.crashlytics);
                AbstractC3668l.billing(interfaceC17593l2, C11485l.f23085l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return Boolean.valueOf(!(((InterfaceC0084l) obj) instanceof C8479l));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list = (List) obj;
                return new C8232l(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 20:
                ((Integer) obj).getClass();
                C13217l c13217l = AbstractC18088l.yandex;
                return C2580l.f5619l;
            case 21:
                ((Integer) obj).getClass();
                C13217l c13217l2 = AbstractC18088l.yandex;
                return -1;
            case 22:
                return Unit.INSTANCE;
            case 23:
                List list2 = (List) obj;
                return new C5866l(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj).getClass();
                return null;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                List list3 = (List) obj;
                return new C7583l((int[]) list3.get(0), (int[]) list3.get(1));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2613l(int i) {
        this.f5677l = i;
    }
}
