package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِۡؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12176l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24191l;

    public /* synthetic */ C12176l(C4795l c4795l) {
        this.f24191l = 1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = null;
        int i = 1;
        switch (this.f24191l) {
            case 0:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 1:
                C0861l c0861l = (C0861l) obj;
                int i2 = c0861l.yandex;
                if (i2 == 0) {
                    return "*";
                }
                InterfaceC13012l interfaceC13012l = c0861l.loadAd;
                C4795l c4795l = interfaceC13012l instanceof C4795l ? (C4795l) interfaceC13012l : null;
                String strSubs = c4795l != null ? c4795l.subs(true) : String.valueOf(interfaceC13012l);
                int iInmobi = AbstractC5020l.inmobi(i2);
                if (iInmobi == 0) {
                    return strSubs;
                }
                if (iInmobi == 1) {
                    return "in ".concat(strSubs);
                }
                if (iInmobi == 2) {
                    return "out ".concat(strSubs);
                }
                C18725l.billing();
                return null;
            case 2:
                C8195l c8195l = (C8195l) obj;
                String str = (String) c8195l.f17098l;
                Object obj2 = c8195l.f17097l;
                return obj2 == null ? str : AbstractC11043l.admob('=', str, String.valueOf(obj2));
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + " = " + ((String) entry.getValue());
            case 4:
                Map.Entry entry2 = (Map.Entry) obj;
                return ((String) entry2.getKey()) + " = " + ((String) entry2.getValue());
            case 5:
                ((C4105l) obj).loadAd = true;
                return Unit.INSTANCE;
            case 6:
                return ((RadioInfo) obj).billing.loadAd;
            case 7:
                return ((RadioInfo) obj).mopub.yandex;
            case 8:
                return ((AbstractC6896l) obj).admob;
            case 9:
                C12825l c12825l = (C12825l) obj;
                c12825l.yandex(C13863l.f27119l, new C1569l(((C0422l) c12825l.loadAd).yandex, interfaceC14029l, i));
                return Unit.INSTANCE;
            case 10:
                AbstractC5020l.amazon((C13815l) obj, "z");
                return Unit.INSTANCE;
            case 11:
                AbstractC2991l.vip((C13815l) obj, "Z", new C12176l(14));
                return Unit.INSTANCE;
            case 12:
                AbstractC5020l.amazon((C13815l) obj, "z");
                return Unit.INSTANCE;
            case 13:
                AbstractC2991l.vip((C13815l) obj, "Z", new C12176l(15));
                return Unit.INSTANCE;
            case 14:
                C13815l c13815l = (C13815l) obj;
                AbstractC9361l.inmobi(c13815l);
                AbstractC2991l.admob(c13815l, ':');
                AbstractC9361l.m2639throws(c13815l);
                AbstractC2991l.vip(c13815l, "", new C12176l(17));
                return Unit.INSTANCE;
            case 15:
                C13815l c13815l2 = (C13815l) obj;
                AbstractC9361l.inmobi(c13815l2);
                AbstractC2991l.vip(c13815l2, "", new C12176l(16));
                return Unit.INSTANCE;
            case 16:
                C13815l c13815l3 = (C13815l) obj;
                AbstractC9361l.m2639throws(c13815l3);
                AbstractC2991l.vip(c13815l3, "", new C12176l(18));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C13815l c13815l4 = (C13815l) obj;
                AbstractC2991l.admob(c13815l4, ':');
                AbstractC9361l.m2636package(c13815l4);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC9361l.m2636package((C13815l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C4105l) obj).billing = true;
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return new C11951l(((Float) obj).floatValue());
            case 22:
                return new C11951l(((Integer) obj).intValue());
            case 23:
                return Integer.valueOf((int) ((C11951l) obj).yandex);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C11951l(((C14467l) obj).f28331l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C14467l(((C11951l) obj).yandex);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C17821l c17821l = (C17821l) obj;
                return new C15709l(C17821l.yandex(c17821l.yandex), C17821l.loadAd(c17821l.yandex));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C15709l c15709l = (C15709l) obj;
                return new C17821l((((long) Float.floatToRawIntBits(c15709l.loadAd)) & 4294967295L) | (((long) Float.floatToRawIntBits(c15709l.yandex)) << 32));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C14174l c14174l = (C14174l) obj;
                return new C15709l(Float.intBitsToFloat((int) (c14174l.yandex >> 32)), Float.intBitsToFloat((int) (c14174l.yandex & 4294967295L)));
            default:
                C15709l c15709l2 = (C15709l) obj;
                return new C14174l((((long) Float.floatToRawIntBits(c15709l2.loadAd)) & 4294967295L) | (((long) Float.floatToRawIntBits(c15709l2.yandex)) << 32));
        }
    }

    public /* synthetic */ C12176l(int i) {
        this.f24191l = i;
    }
}
