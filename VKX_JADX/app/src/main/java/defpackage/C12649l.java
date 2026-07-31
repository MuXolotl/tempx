package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12649l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16924l f24878l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24879l;

    public /* synthetic */ C12649l(C16924l c16924l, int i) {
        this.f24879l = i;
        this.f24878l = c16924l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C6561l c6561l;
        C18128l c18128lMopub;
        C18128l c18128lMopub2;
        int i = this.f24879l;
        Collection collectionAdcel = C2580l.f5619l;
        C16924l c16924l = this.f24878l;
        switch (i) {
            case 0:
                C3498l c3498l = (C3498l) obj;
                LinkedHashMap linkedHashMap = c16924l.yandex;
                C2630l c2630l = C14036l.f27355l;
                AbstractC2842l abstractC2842l = c16924l.subs;
                byte[] bArr = (byte[]) linkedHashMap.get(c3498l);
                if (bArr != null) {
                    C17749l c17749l = new C17749l(c2630l, new ByteArrayInputStream(bArr), abstractC2842l, 3);
                    collectionAdcel = AbstractC17587l.adcel(new C6714l(new C6479l(c17749l, new C6199l(14, c17749l), 0)));
                }
                ArrayList arrayList = new ArrayList(collectionAdcel.size());
                Iterator it = collectionAdcel.iterator();
                while (it.hasNext()) {
                    C4799l c4799lBilling = ((C8792l) abstractC2842l.loadAd.f15741l).billing((C14036l) it.next());
                    if (!abstractC2842l.ads(c4799lBilling)) {
                        c4799lBilling = null;
                    }
                    if (c4799lBilling != null) {
                        arrayList.add(c4799lBilling);
                    }
                }
                abstractC2842l.isPro(c3498l, arrayList);
                return AbstractC3324l.amazon(arrayList);
            case 1:
                C3498l c3498l2 = (C3498l) obj;
                LinkedHashMap linkedHashMap2 = c16924l.loadAd;
                C2630l c2630l2 = C13146l.f25712l;
                AbstractC2842l abstractC2842l2 = c16924l.subs;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c3498l2);
                if (bArr2 != null) {
                    C17749l c17749l2 = new C17749l(c2630l2, new ByteArrayInputStream(bArr2), abstractC2842l2, 3);
                    collectionAdcel = AbstractC17587l.adcel(new C6714l(new C6479l(c17749l2, new C6199l(14, c17749l2), 0)));
                }
                ArrayList arrayList2 = new ArrayList(collectionAdcel.size());
                Iterator it2 = collectionAdcel.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C8792l) abstractC2842l2.loadAd.f15741l).mopub((C13146l) it2.next(), false));
                }
                abstractC2842l2.firebase(c3498l2, arrayList2);
                return AbstractC3324l.amazon(arrayList2);
            default:
                C7644l c7644l = c16924l.subs.loadAd;
                byte[] bArr3 = (byte[]) c16924l.crashlytics.get((C3498l) obj);
                if (bArr3 == null) {
                    return null;
                }
                C1512l c1512l = (C1512l) C1512l.f3767l.loadAd(new ByteArrayInputStream(bArr3), (C3429l) ((C0511l) c7644l.f15738l).metrica);
                if (c1512l == null) {
                    return null;
                }
                C8792l c8792l = (C8792l) c7644l.f15741l;
                C7644l c7644l2 = c8792l.yandex;
                InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7644l2.f15737l;
                C14965l c14965l = (C14965l) c7644l2.f15740l;
                List list = c1512l.f3780l;
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(c8792l.loadAd.applovin((C7899l) it3.next(), interfaceC3588l));
                }
                InterfaceC3841l c2172l = arrayList3.isEmpty() ? C2782l.f6058l : new C2172l(0, arrayList3);
                EnumC3338l enumC3338l = (EnumC3338l) AbstractC1305l.amazon.purchase(c1512l.f3776l);
                switch (enumC3338l == null ? -1 : AbstractC1603l.loadAd[enumC3338l.ordinal()]) {
                    case 1:
                        c6561l = AbstractC6004l.amazon;
                        break;
                    case 2:
                        c6561l = AbstractC6004l.yandex;
                        break;
                    case 3:
                        c6561l = AbstractC6004l.loadAd;
                        break;
                    case 4:
                        c6561l = AbstractC6004l.crashlytics;
                        break;
                    case 5:
                        c6561l = AbstractC6004l.purchase;
                        break;
                    case 6:
                        c6561l = AbstractC6004l.billing;
                        break;
                    default:
                        c6561l = AbstractC6004l.yandex;
                        break;
                }
                C9522l c9522l = new C9522l((C16412l) ((C0511l) c7644l2.f15738l).yandex, (InterfaceC8371l) c7644l2.f15734l, c2172l, AbstractC18719l.firebase(interfaceC3588l, c1512l.f3775l), c6561l, c1512l, (InterfaceC3588l) c7644l2.f15737l, c14965l, (C5557l) c7644l2.f15739l, (InterfaceC8850l) c7644l2.f15735l);
                C15615l c15615l = (C15615l) c7644l2.loadAd(c9522l, c1512l.f3779l, (InterfaceC3588l) c7644l2.f15737l, (C14965l) c7644l2.f15740l, (C5557l) c7644l2.f15739l, (AbstractC12974l) c7644l2.f15742l).f15736l;
                List listVip = c15615l.vip();
                int i2 = c1512l.f3769l;
                if ((i2 & 4) == 4) {
                    c18128lMopub = c1512l.f3770l;
                } else {
                    if ((i2 & 8) != 8) {
                        C8339l.smaato("No underlyingType in ProtoBuf.TypeAlias");
                        return null;
                    }
                    c18128lMopub = c14965l.mopub(c1512l.f3771l);
                }
                AbstractC15211l abstractC15211lAdvert = c15615l.advert(c18128lMopub, false);
                int i3 = c1512l.f3769l;
                if ((i3 & 16) == 16) {
                    c18128lMopub2 = c1512l.f3778l;
                } else {
                    if ((i3 & 32) != 32) {
                        C8339l.smaato("No expandedType in ProtoBuf.TypeAlias");
                        return null;
                    }
                    c18128lMopub2 = c14965l.mopub(c1512l.f3773l);
                }
                c9522l.m2676l(listVip, abstractC15211lAdvert, c15615l.advert(c18128lMopub2, false));
                return c9522l;
        }
    }
}
