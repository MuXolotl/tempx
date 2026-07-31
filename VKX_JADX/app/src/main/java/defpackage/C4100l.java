package defpackage;

import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4100l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8438l;

    public /* synthetic */ C4100l(int i) {
        this.f8438l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double dTapsense;
        InterfaceC0980l interfaceC0980l;
        float fFloatValue;
        int i = this.f8438l;
        int i2 = 0;
        C9714l c9714l = AbstractC18296l.yandex;
        int i3 = 3;
        InterfaceC14029l interfaceC14029l = null;
        int i4 = 1;
        switch (i) {
            case 0:
                C0187l c0187l = (C0187l) obj;
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return c9714l.inmobi();
            case 1:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(3.0d) : C15718l.amazon(4.5d);
            case 2:
                return ((C0187l) obj).mopub;
            case 3:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(4.5d) : C15718l.amazon(7.0d);
            case 4:
                C0187l c0187l2 = (C0187l) obj;
                C8723l c8723l = c0187l2.mopub;
                boolean z = c0187l2.crashlytics;
                int i5 = c0187l2.isPro;
                int i6 = c0187l2.loadAd;
                if (i5 == 2) {
                    dTapsense = i6 == 3 ? C15718l.tapsense(c8723l, 0.0d, 90.0d) : C15718l.tapsense(c8723l, 0.0d, 100.0d);
                } else if (i6 == 2) {
                    dTapsense = z ? C15718l.tapsense(c8723l, 0.0d, 93.0d) : C15718l.tapsense(c8723l, 0.0d, 96.0d);
                } else {
                    int i7 = 100;
                    if (i6 == 3) {
                        dTapsense = C15718l.tapsense(c8723l, 0.0d, z ? 93 : 100);
                    } else if (i6 == 5) {
                        if (c8723l.crashlytics.yandex()) {
                            i7 = 88;
                        } else if (z) {
                            i7 = 93;
                        }
                        dTapsense = C15718l.tapsense(c8723l, 75.0d, i7);
                    } else {
                        dTapsense = z ? C15718l.tapsense(c8723l, 0.0d, 93.0d) : C15718l.tapsense(c8723l, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(dTapsense);
            case 5:
                C0187l c0187l3 = (C0187l) obj;
                if (c0187l3.isPro != 1 || c0187l3.amazon <= 0.0d) {
                    return null;
                }
                return C15718l.amazon(1.5d);
            case 6:
                return ((C0187l) obj).mopub;
            case 7:
                return ((C0187l) obj).isPro == 1 ? c9714l.ad() : c9714l.m2723package();
            case 8:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(6.0d) : C15718l.amazon(7.0d);
            case 9:
                return ((C0187l) obj).purchase;
            case 10:
                return c9714l.metrica();
            case 11:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(6.0d) : C15718l.amazon(7.0d);
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC11999l.purchase, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC11999l.billing, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC11999l.mopub, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC11999l.admob, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC11999l.subs, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC11999l.isPro, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC11999l.firebase, 3);
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                View view = ((C6816l) ((InterfaceC4191l) obj).mo539this(AbstractC10527l.yandex)).yandex;
                while (view != null) {
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    if (tag != null) {
                        return tag;
                    }
                    Object objBilling = AbstractC6710l.billing(view);
                    view = objBilling instanceof View ? (View) objBilling : null;
                }
                return null;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Integer.valueOf(((String) ((C8195l) obj).f17098l).length());
            case 22:
                C12825l c12825l = (C12825l) obj;
                C6375l c6375l = (C6375l) c12825l.loadAd;
                C11349l c11349l = c6375l.yandex;
                C11349l c11349l2 = c6375l.loadAd;
                StringBuilder sb = new StringBuilder();
                Iterator it = ((C4764l) c11349l.values()).iterator();
                while (true) {
                    C2921l c2921l = (C2921l) it;
                    if (!c2921l.hasNext()) {
                        c12825l.yandex(C13863l.f27119l, new C1569l(sb.toString(), interfaceC14029l, i2));
                        c12825l.yandex(C15617l.f30498l, new C13749l(c12825l, c11349l, (InterfaceC14029l) null));
                        c12825l.yandex(C7472l.f15459l, new C13624l(c11349l, interfaceC14029l, 13));
                        return Unit.INSTANCE;
                    }
                    interfaceC0980l = (InterfaceC0980l) c2921l.next();
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append(interfaceC0980l.getName());
                    Float f = (Float) c11349l2.get(interfaceC0980l.getName());
                    if (f != null) {
                        fFloatValue = f.floatValue();
                        double d = fFloatValue;
                        if (0.0d <= d && d <= 1.0d) {
                            sb.append(";q=".concat(AbstractC12024l.m3332l(5, String.valueOf(fFloatValue))));
                        }
                    }
                }
                throw new IllegalStateException(("Invalid quality value: " + fFloatValue + " for encoder: " + interfaceC0980l).toString());
            case 23:
                C9970l c9970l = (C9970l) obj;
                c9970l.loadAd(c9970l.crashlytics, C8403l.f17397l, "onCallReceive", C17480l.f34046l, new C3469l(new C12337l(new C7306l(i3, interfaceC14029l, 6), interfaceC14029l, i4), interfaceC14029l, i2));
                int i8 = AbstractC7138l.yandex;
                c9970l.loadAd(c9970l.amazon, C8403l.f17395l, "onCallRespond", C17846l.f34777l, new C12337l(4, interfaceC14029l));
                C17535l c17535l = c9970l.mopub.f21511l;
                C11911l c11911l = AbstractC16821l.yandex;
                ArrayList arrayList = ((C9452l) c9970l.subs).yandex;
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C4312l) it2.next()).yandex);
                }
                c17535l.mopub(c11911l, AbstractC16901l.m4245throws(arrayList2));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C12825l c12825l2 = (C12825l) obj;
                C6116l c6116l = (C6116l) c12825l2.loadAd;
                ArrayList arrayList3 = c6116l.loadAd;
                Set set = c6116l.yandex;
                c12825l2.yandex(C11140l.f22373l, new C14892l(c12825l2, null, arrayList3, set));
                c12825l2.yandex(C15617l.f30500l, new C0144l(c12825l2, null, arrayList3, set));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C3531l) obj).yandex.toString();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C6388l) obj).yandex;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Boolean.valueOf(AbstractC4654l.purchase(((Character) obj).charValue()));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Boolean.valueOf(AbstractC4654l.mopub(((Character) obj).charValue()));
            default:
                return Boolean.valueOf(AbstractC4654l.purchase(((Character) obj).charValue()));
        }
    }
}
