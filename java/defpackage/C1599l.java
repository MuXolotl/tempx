package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lؚؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1599l extends C10303l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C12418l f3923l;

    public C1599l(C12418l c12418l) {
        this.f3923l = c12418l;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.C10303l, defpackage.InterfaceC2167l
    public final InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        C12418l c12418l = this.f3923l;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    AbstractC13831l.purchase(0, "getEventName", arrayList);
                    return new C13997l(((C17235l) c12418l.f24518l).yandex);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    AbstractC13831l.purchase(0, "getTimestamp", arrayList);
                    return new C14259l(Double.valueOf(((C17235l) c12418l.f24518l).loadAd));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    AbstractC13831l.purchase(1, "getParamValue", arrayList);
                    String strMopub = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).mopub();
                    HashMap map = ((C17235l) c12418l.f24518l).crashlytics;
                    return AbstractC0135l.mopub(map.containsKey(strMopub) ? map.get(strMopub) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    AbstractC13831l.purchase(0, "getParams", arrayList);
                    HashMap map2 = ((C17235l) c12418l.f24518l).crashlytics;
                    C10303l c10303l = new C10303l();
                    for (String str2 : map2.keySet()) {
                        c10303l.firebase(str2, AbstractC0135l.mopub(map2.get(str2)));
                    }
                    return c10303l;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    AbstractC13831l.purchase(2, "setParamValue", arrayList);
                    String strMopub2 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).mopub();
                    InterfaceC2167l interfaceC2167lPurchase = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                    C17235l c17235l = (C17235l) c12418l.f24518l;
                    Object objRemoteconfig = AbstractC13831l.remoteconfig(interfaceC2167lPurchase);
                    HashMap map3 = c17235l.crashlytics;
                    if (objRemoteconfig == null) {
                        map3.remove(strMopub2);
                        return interfaceC2167lPurchase;
                    }
                    map3.put(strMopub2, C17235l.loadAd(map3.get(strMopub2), objRemoteconfig, strMopub2));
                    return interfaceC2167lPurchase;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    AbstractC13831l.purchase(1, "setEventName", arrayList);
                    InterfaceC2167l interfaceC2167lPurchase2 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                    if (InterfaceC2167l.f4805l.equals(interfaceC2167lPurchase2) || InterfaceC2167l.f4800l.equals(interfaceC2167lPurchase2)) {
                        C8339l.metrica("Illegal event name");
                        return null;
                    }
                    ((C17235l) c12418l.f24518l).yandex = interfaceC2167lPurchase2.mopub();
                    return new C13997l(interfaceC2167lPurchase2.mopub());
                }
                break;
        }
        return super.smaato(str, c7502l, arrayList);
    }
}
