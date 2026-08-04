package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: lٌؖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8570l extends AbstractC10453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f17680l = 3;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f17681l;

    public C8570l(C18675l c18675l) {
        super("internal.logger");
        this.f17681l = c18675l;
        this.f21268l.put("log", new C15409l(this, false, true));
        this.f21268l.put("silent", new C7869l("silent", 1));
        ((AbstractC10453l) this.f21268l.get("silent")).firebase("log", new C15409l(this, true, true));
        this.f21268l.put("unmonitored", new C7869l("unmonitored", 2));
        ((AbstractC10453l) this.f21268l.get("unmonitored")).firebase("log", new C15409l(this, false, false));
    }

    @Override // defpackage.AbstractC10453l
    public final InterfaceC2167l yandex(C7502l c7502l, List list) {
        TreeMap treeMap;
        int i = this.f17680l;
        String str = this.f21269l;
        C10910l c10910l = InterfaceC2167l.f4805l;
        Object obj = this.f17681l;
        String str2 = null;
        switch (i) {
            case 0:
                AbstractC13831l.purchase(3, str, list);
                String strMopub = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(0)).mopub();
                InterfaceC2167l interfaceC2167l = (InterfaceC2167l) list.get(1);
                C17516l c17516l = (C17516l) c7502l.f15510l;
                long jSmaato = (long) AbstractC13831l.smaato(c17516l.purchase(c7502l, interfaceC2167l).remoteconfig().doubleValue());
                InterfaceC2167l interfaceC2167lPurchase = c17516l.purchase(c7502l, (InterfaceC2167l) list.get(2));
                HashMap mapVip = interfaceC2167lPurchase instanceof C10303l ? AbstractC13831l.vip((C10303l) interfaceC2167lPurchase) : new HashMap();
                C12418l c12418l = (C12418l) obj;
                c12418l.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapVip.keySet()) {
                    HashMap map2 = ((C17235l) c12418l.f24519l).crashlytics;
                    map.put(str3, C17235l.loadAd(map2.containsKey(str3) ? map2.get(str3) : null, mapVip.get(str3), str3));
                }
                ((ArrayList) c12418l.f24521l).add(new C17235l(strMopub, jSmaato, map));
                return c10910l;
            case 1:
                AbstractC13831l.purchase(2, "getValue", list);
                InterfaceC2167l interfaceC2167lPurchase2 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(0));
                InterfaceC2167l interfaceC2167lPurchase3 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(1));
                String strMopub2 = interfaceC2167lPurchase2.mopub();
                C5633l c5633l = (C5633l) obj;
                Map map3 = (Map) ((C8315l) c5633l.f11985l).f17211l.get((String) c5633l.f11986l);
                if (map3 != null && map3.containsKey(strMopub2)) {
                    str2 = (String) map3.get(strMopub2);
                }
                return str2 != null ? new C13997l(str2) : interfaceC2167lPurchase3;
            case 2:
                return c10910l;
            case 3:
                try {
                    return AbstractC0135l.mopub(((CallableC2196l) obj).call());
                } catch (Exception unused) {
                    return c10910l;
                }
            default:
                AbstractC13831l.purchase(3, str, list);
                ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(0)).mopub();
                InterfaceC2167l interfaceC2167l2 = (InterfaceC2167l) list.get(1);
                C17516l c17516l2 = (C17516l) c7502l.f15510l;
                InterfaceC2167l interfaceC2167lPurchase4 = c17516l2.purchase(c7502l, interfaceC2167l2);
                if (interfaceC2167lPurchase4 instanceof C2118l) {
                    InterfaceC2167l interfaceC2167lPurchase5 = c17516l2.purchase(c7502l, (InterfaceC2167l) list.get(2));
                    if (interfaceC2167lPurchase5 instanceof C10303l) {
                        C10303l c10303l = (C10303l) interfaceC2167lPurchase5;
                        HashMap map4 = c10303l.f20990l;
                        if (map4.containsKey("type")) {
                            String strMopub3 = c10303l.admob("type").mopub();
                            int iFirebase = map4.containsKey("priority") ? AbstractC13831l.firebase(c10303l.admob("priority").remoteconfig().doubleValue()) : 1000;
                            C7847l c7847l = (C7847l) obj;
                            C2118l c2118l = (C2118l) interfaceC2167lPurchase4;
                            c7847l.getClass();
                            if ("create".equals(strMopub3)) {
                                treeMap = (TreeMap) c7847l.f16369l;
                            } else if ("edit".equals(strMopub3)) {
                                treeMap = (TreeMap) c7847l.f16370l;
                            } else {
                                C8339l.smaato("Unknown callback type: ".concat(String.valueOf(strMopub3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iFirebase))) {
                                iFirebase = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iFirebase), c2118l);
                            return c10910l;
                        }
                        C8339l.metrica("Undefined rule type");
                    } else {
                        C8339l.metrica("Invalid callback params");
                    }
                } else {
                    C8339l.metrica("Invalid callback type");
                }
                return null;
        }
    }

    public C8570l(C12418l c12418l) {
        super("internal.eventLogger");
        this.f17681l = c12418l;
    }

    public C8570l(C7847l c7847l) {
        super("internal.registerCallback");
        this.f17681l = c7847l;
    }

    public C8570l(CallableC2196l callableC2196l) {
        super("internal.appMetadata");
        this.f17681l = callableC2196l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8570l(C7869l c7869l, C5633l c5633l) {
        super("getValue");
        this.f17681l = c5633l;
    }
}
