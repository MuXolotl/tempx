package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؓۘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2062l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4595l;

    public /* synthetic */ C2062l(int i) {
        this.f4595l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EnumC6092l enumC6092l;
        Object objYandex;
        C15812l c15812l;
        int i;
        C15812l c15812l2;
        C15812l c15812l3;
        C15812l c15812l4;
        int i2;
        C15812l c15812l5;
        C15812l c15812l6;
        switch (this.f4595l) {
            case 0:
                return Integer.valueOf(((C10258l) obj2).yandex);
            case 1:
                return Integer.valueOf(((C16546l) obj2).yandex);
            case 2:
                return Integer.valueOf(((C0106l) obj2).yandex);
            case 3:
                return Integer.valueOf(((C11617l) obj2).yandex);
            case 4:
                return Integer.valueOf(((C8689l) obj2).yandex);
            case 5:
                C1794l c1794l = (C1794l) obj2;
                return c1794l == null ? false : C1794l.yandex(c1794l.yandex, C1794l.crashlytics) ? Boolean.FALSE : AbstractC14055l.crashlytics(Float.valueOf(C1794l.crashlytics(c1794l.yandex)), AbstractC2896l.yandex(new C12735l(C1794l.loadAd(c1794l.yandex)), AbstractC2896l.ad, (C15543l) obj));
            case 6:
                C7409l c7409l = (C7409l) obj2;
                return AbstractC14055l.crashlytics(c7409l.yandex, AbstractC2896l.yandex(c7409l.loadAd, AbstractC2896l.isPro, (C15543l) obj));
            case 7:
                long j = ((C12735l) obj2).yandex;
                if (C12735l.yandex(j, 8589934592L)) {
                    return 0;
                }
                if (C12735l.yandex(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 8:
                C1187l c1187l = (C1187l) obj2;
                return c1187l == null ? false : C1187l.loadAd(c1187l.yandex, 9205357640488583168L) ? Boolean.FALSE : AbstractC14055l.crashlytics(Float.valueOf(Float.intBitsToFloat((int) (c1187l.yandex >> 32))), Float.valueOf(Float.intBitsToFloat((int) (c1187l.yandex & 4294967295L))));
            case 9:
                C15543l c15543l = (C15543l) obj;
                C15012l c15012l = (C15012l) obj2;
                Object obj3 = c15012l.yandex;
                if (obj3 instanceof C9077l) {
                    enumC6092l = EnumC6092l.f12872l;
                } else if (obj3 instanceof C14264l) {
                    enumC6092l = EnumC6092l.f12871l;
                } else if (obj3 instanceof C3938l) {
                    enumC6092l = EnumC6092l.f12868l;
                } else if (obj3 instanceof C18005l) {
                    enumC6092l = EnumC6092l.f12874l;
                } else if (obj3 instanceof C14754l) {
                    enumC6092l = EnumC6092l.f12873l;
                } else if (obj3 instanceof C7409l) {
                    enumC6092l = EnumC6092l.f12875l;
                } else {
                    if (!(obj3 instanceof C9891l)) {
                        C3010l.mopub();
                        return null;
                    }
                    enumC6092l = EnumC6092l.f12869l;
                }
                switch (enumC6092l.ordinal()) {
                    case 0:
                        objYandex = AbstractC2896l.yandex((C9077l) obj3, AbstractC2896l.admob, c15543l);
                        break;
                    case 1:
                        objYandex = AbstractC2896l.yandex((C14264l) obj3, AbstractC2896l.subs, c15543l);
                        break;
                    case 2:
                        objYandex = AbstractC2896l.yandex((C3938l) obj3, AbstractC2896l.amazon, c15543l);
                        break;
                    case 3:
                        objYandex = AbstractC2896l.yandex((C18005l) obj3, AbstractC2896l.purchase, c15543l);
                        break;
                    case 4:
                        objYandex = AbstractC2896l.yandex((C14754l) obj3, AbstractC2896l.billing, c15543l);
                        break;
                    case 5:
                        objYandex = AbstractC2896l.yandex((C7409l) obj3, AbstractC2896l.mopub, c15543l);
                        break;
                    case 6:
                        objYandex = ((C9891l) obj3).yandex;
                        break;
                    default:
                        C18725l.billing();
                        return null;
                }
                return AbstractC14055l.crashlytics(enumC6092l, objYandex, Integer.valueOf(c15012l.loadAd), Integer.valueOf(c15012l.crashlytics), c15012l.amazon);
            case 10:
                C15543l c15543l2 = (C15543l) obj;
                List list = ((C10537l) obj2).f21449l;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(AbstractC2896l.yandex((C9293l) list.get(i3), AbstractC2896l.signatures, c15543l2));
                }
                return arrayList;
            case 11:
                return ((C9293l) obj2).yandex.toLanguageTag();
            case 12:
                C15543l c15543l3 = (C15543l) obj;
                C3183l c3183l = (C3183l) obj2;
                return AbstractC14055l.crashlytics(AbstractC2896l.yandex(new C15248l(c3183l.yandex), AbstractC2896l.applovin, c15543l3), AbstractC2896l.yandex(new C4872l(c3183l.loadAd), AbstractC2896l.appmetrica, c15543l3), AbstractC2896l.yandex(new C4894l(c3183l.crashlytics), AbstractC2896l.inmobi, c15543l3));
            case 13:
                return Float.valueOf(((C15248l) obj2).yandex);
            case 14:
                return Integer.valueOf(((C4872l) obj2).yandex);
            case 15:
                return Integer.valueOf(((C4894l) obj2).yandex);
            case 16:
                return ((C3938l) obj2).yandex;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C15543l c15543l4 = (C15543l) obj;
                C9077l c9077l = (C9077l) obj2;
                Object objYandex2 = AbstractC2896l.yandex(new C10258l(c9077l.yandex), AbstractC2896l.ads, c15543l4);
                Object objYandex3 = AbstractC2896l.yandex(new C16546l(c9077l.loadAd), AbstractC2896l.subscription, c15543l4);
                Object objYandex4 = AbstractC2896l.yandex(new C1794l(c9077l.crashlytics), AbstractC2896l.pro, c15543l4);
                C13299l c13299l = c9077l.amazon;
                C13299l c13299l2 = C13299l.crashlytics;
                Object objYandex5 = AbstractC2896l.yandex(c13299l, AbstractC2896l.remoteconfig, c15543l4);
                Object objYandex6 = AbstractC2896l.yandex(c9077l.purchase, AbstractC7840l.yandex, c15543l4);
                C3183l c3183l2 = c9077l.billing;
                C3183l c3183l3 = C3183l.amazon;
                return AbstractC14055l.crashlytics(objYandex2, objYandex3, objYandex4, objYandex5, objYandex6, AbstractC2896l.yandex(c3183l2, AbstractC2896l.premium, c15543l4), AbstractC2896l.yandex(new C17427l(c9077l.mopub), AbstractC7840l.crashlytics, c15543l4), AbstractC2896l.yandex(new C0106l(c9077l.admob), AbstractC2896l.tapsense, c15543l4), AbstractC2896l.yandex(c9077l.subs, AbstractC7840l.amazon, c15543l4));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C18005l) obj2).yandex;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C15543l c15543l5 = (C15543l) obj;
                C14264l c14264l = (C14264l) obj2;
                C9735l c9735l = new C9735l(c14264l.yandex.loadAd());
                C11165l c11165l = AbstractC2896l.adcel;
                Object objYandex7 = AbstractC2896l.yandex(c9735l, c11165l, c15543l5);
                C1794l c1794l2 = new C1794l(c14264l.loadAd);
                C11165l c11165l2 = AbstractC2896l.pro;
                Object objYandex8 = AbstractC2896l.yandex(c1794l2, c11165l2, c15543l5);
                C6886l c6886l = c14264l.crashlytics;
                C6886l c6886l2 = C6886l.f14421l;
                Object objYandex9 = AbstractC2896l.yandex(c6886l, AbstractC2896l.vip, c15543l5);
                Object objYandex10 = AbstractC2896l.yandex(c14264l.amazon, AbstractC2896l.Signature, c15543l5);
                Object objYandex11 = AbstractC2896l.yandex(c14264l.purchase, AbstractC2896l.license, c15543l5);
                String str = c14264l.mopub;
                Object objYandex12 = AbstractC2896l.yandex(new C1794l(c14264l.admob), c11165l2, c15543l5);
                Object objYandex13 = AbstractC2896l.yandex(c14264l.subs, AbstractC2896l.metrica, c15543l5);
                Object objYandex14 = AbstractC2896l.yandex(c14264l.isPro, AbstractC2896l.smaato, c15543l5);
                C10537l c10537l = c14264l.firebase;
                C10537l c10537l2 = C10537l.f21447l;
                Object objYandex15 = AbstractC2896l.yandex(c10537l, AbstractC2896l.isVip, c15543l5);
                Object objYandex16 = AbstractC2896l.yandex(new C9735l(c14264l.smaato), c11165l, c15543l5);
                Object objYandex17 = AbstractC2896l.yandex(c14264l.remoteconfig, AbstractC2896l.firebase, c15543l5);
                C0387l c0387l = c14264l.vip;
                C0387l c0387l2 = C0387l.amazon;
                return AbstractC14055l.crashlytics(objYandex7, objYandex8, objYandex9, objYandex10, objYandex11, -1, str, objYandex12, objYandex13, objYandex14, objYandex15, objYandex16, objYandex17, AbstractC2896l.yandex(c0387l, AbstractC2896l.startapp, c15543l5));
            case 20:
                C15543l c15543l6 = (C15543l) obj;
                C11244l c11244l = (C11244l) obj2;
                C14264l c14264l2 = c11244l.yandex;
                C13645l c13645l = AbstractC2896l.subs;
                return AbstractC14055l.crashlytics(AbstractC2896l.yandex(c14264l2, c13645l, c15543l6), AbstractC2896l.yandex(c11244l.loadAd, c13645l, c15543l6), AbstractC2896l.yandex(c11244l.crashlytics, c13645l, c15543l6), AbstractC2896l.yandex(c11244l.amazon, c13645l, c15543l6));
            case 21:
                C4361l c4361l = (C4361l) obj2;
                Boolean boolValueOf = Boolean.valueOf(c4361l.yandex);
                C13645l c13645l2 = AbstractC2896l.yandex;
                return AbstractC14055l.crashlytics(boolValueOf, AbstractC2896l.yandex(new C8405l(c4361l.loadAd), AbstractC7840l.loadAd, (C15543l) obj));
            case 22:
                return Integer.valueOf(((C8405l) obj2).yandex);
            case 23:
                return Integer.valueOf(((C17427l) obj2).yandex);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C10068l c10068l = (C10068l) obj2;
                return AbstractC14055l.crashlytics(AbstractC2896l.yandex(new C11771l(c10068l.yandex), AbstractC7840l.purchase, (C15543l) obj), Boolean.valueOf(c10068l.loadAd));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Integer.valueOf(((C11771l) obj2).yandex);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Integer.valueOf(((C11194l) obj2).yandex.admob());
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C3242l c3242lAmazon = ((C18329l) obj).amazon();
                if (c3242lAmazon != null) {
                    return zBooleanValue ? new C3242l(c3242lAmazon.loadAd, c3242lAmazon.yandex, true) : c3242lAmazon;
                }
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Long.valueOf(((C11611l) obj2).amazon.get());
            default:
                C15543l c15543l7 = (C15543l) obj;
                C17594l c17594l = (C17594l) obj2;
                List list2 = (List) c17594l.crashlytics.getValue();
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList2.add(((Function2) C3625l.f7561l.f26671l).invoke(c15543l7, (C3625l) list2.get(i4)));
                }
                C3242l c3242lYandex = c17594l.yandex();
                Integer numValueOf = (c3242lYandex == null || (c15812l6 = c3242lYandex.yandex) == null) ? null : Integer.valueOf(c15812l6.loadAd);
                C3242l c3242lYandex2 = c17594l.yandex();
                Long lValueOf = (c3242lYandex2 == null || (c15812l5 = c3242lYandex2.yandex) == null) ? null : Long.valueOf(c15812l5.crashlytics);
                C3242l c3242lYandex3 = c17594l.yandex();
                String strM1531native = (c3242lYandex3 == null || (c15812l4 = c3242lYandex3.yandex) == null || (i2 = c15812l4.yandex) == 0) ? null : AbstractC4338l.m1531native(i2);
                C3242l c3242lYandex4 = c17594l.yandex();
                Integer numValueOf2 = (c3242lYandex4 == null || (c15812l3 = c3242lYandex4.loadAd) == null) ? null : Integer.valueOf(c15812l3.loadAd);
                C3242l c3242lYandex5 = c17594l.yandex();
                Long lValueOf2 = (c3242lYandex5 == null || (c15812l2 = c3242lYandex5.loadAd) == null) ? null : Long.valueOf(c15812l2.crashlytics);
                C3242l c3242lYandex6 = c17594l.yandex();
                String strM1531native2 = (c3242lYandex6 == null || (c15812l = c3242lYandex6.loadAd) == null || (i = c15812l.yandex) == 0) ? null : AbstractC4338l.m1531native(i);
                C3242l c3242lYandex7 = c17594l.yandex();
                return AbstractC14055l.remoteconfig(arrayList2, numValueOf, lValueOf, strM1531native, numValueOf2, lValueOf2, strM1531native2, c3242lYandex7 != null ? Boolean.valueOf(c3242lYandex7.crashlytics) : null);
        }
    }
}
