package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.ArtistInfo;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lؔؗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2414l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f5175l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5176l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5177l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f5178l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f5179l;

    public C2414l(List list, Function0 function0, Context context, List list2) {
        this.f5177l = 0;
        this.f5176l = list;
        this.f5179l = function0;
        this.f5178l = context;
        this.f5175l = list2;
    }

    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        int i2;
        ?? r3;
        int i3;
        int i4;
        int i5;
        int i6;
        C8206l c8206l;
        int i7;
        int i8 = this.f5177l;
        int i9 = 5;
        int i10 = 3;
        int i11 = 14;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj6 = this.f5178l;
        Object obj7 = this.f5179l;
        Object obj8 = this.f5175l;
        Object obj9 = this.f5176l;
        int i12 = 0;
        switch (i8) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                List list = (List) obj8;
                Context context = (Context) obj6;
                Function0 function0 = (Function0) obj7;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                    ArtistInfo.Chip chip = (ArtistInfo.Chip) ((List) obj9).get(iIntValue);
                    c6956l.m2123default(-1234925505);
                    boolean zBilling = c6956l.billing(function0) | c6956l.admob(context) | c6956l.billing(chip) | c6956l.admob(list);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        obj5 = objM2132native;
                        C3914l c3914l = new C3914l(function0, context, chip, list);
                        c6956l.m2147try(c3914l);
                        obj5 = c3914l;
                    }
                    C17253l c17253l = C12719l.yandex;
                    C15521l c15521lAdmob = C12719l.admob(c6956l);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC17457l.amazon((Function0) obj5, c15521lAdmob, null, false, C12719l.mopub(C9735l.loadAd(0.15f, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 12), AbstractC2576l.yandex(1.0f, C9735l.loadAd(0.3f, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel)), null, AbstractC14566l.amazon(-264316312, new C5905l(chip), c6956l), c6956l, 805306368);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                C9991l c9991l = (C9991l) obj8;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    MainArtist mainArtist = (MainArtist) ((List) obj9).get(iIntValue3);
                    c6956l2.m2123default(1882687356);
                    C15578l c15578lAmazon = AbstractC14566l.amazon(-858464594, new C0976l(2, mainArtist), c6956l2);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob = c6956l2.admob(c9991l) | c6956l2.admob(mainArtist);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        r3 = 0;
                        objM2132native2 = new C0340l(c9991l, mainArtist, false ? 1 : 0, i9);
                        c6956l2.m2147try(objM2132native2);
                    } else {
                        r3 = 0;
                    }
                    AbstractC13319l.yandex(c15578lAmazon, AbstractC9151l.loadAd(interfaceC17242lAmazon, r3, null, (Function0) objM2132native2, 15), null, null, null, AbstractC14566l.amazon(766802953, new C12204l(mainArtist, (InterfaceC8714l) obj7, (InterfaceC8714l) obj6, r3), c6956l2), null, c6956l2, 196614, 476);
                    AbstractC0555l.yandex(null, 0.0f, 0L, c6956l2, 0, 7);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C18297l c18297l = (C18297l) obj;
                ((Boolean) obj2).getClass();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                C0228l c0228l = (C0228l) obj8;
                AudioTrack audioTrack = (AudioTrack) obj9;
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l3.billing(c18297l) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue5 & 1, (iIntValue5 & 131) != 130)) {
                    AbstractC0133l.amazon(AbstractC14566l.amazon(-340573141, new C13147l(audioTrack, c0228l, 2), c6956l3), AbstractC14566l.amazon(-76552276, new C17208l(i10, audioTrack), c6956l3), AbstractC3605l.remoteconfig(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 6.0f), AbstractC14566l.amazon(451489454, new C11261l(c0228l, (String) obj7, c18297l, (InterfaceC1234l) obj6), c6956l3), c6956l3, 3510, 0);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C7091l c7091l3 = (C7091l) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                C6956l c6956l4 = (C6956l) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                C0228l c0228l2 = (C0228l) obj8;
                if ((iIntValue7 & 6) == 0) {
                    i3 = (c6956l4.billing(c7091l3) ? 4 : 2) | iIntValue7;
                } else {
                    i3 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i3 |= c6956l4.amazon(iIntValue6) ? 32 : 16;
                }
                if (c6956l4.m2127for(i3 & 1, (i3 & 147) != 146)) {
                    AudioTrack audioTrack2 = (AudioTrack) ((InterfaceC13238l) obj9).get(iIntValue6);
                    c6956l4.m2123default(1398971702);
                    audioTrack2.getClass();
                    String strMopub = AbstractC16676l.mopub(audioTrack2);
                    AbstractC12953l.admob(c7091l3, (C5056l) obj7, strMopub, AbstractC15788l.yandex(c4346l, c0228l2.f1205l.get(strMopub) == EnumC11199l.f22550l ? 0.75f : 1.0f), false, null, AbstractC14566l.amazon(23205881, new C2414l(audioTrack2, c0228l2, strMopub, (InterfaceC1234l) obj6, 2), c6956l4), c6956l4, (i3 & 14) | 1572864, 24);
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C7091l c7091l4 = (C7091l) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                C6956l c6956l5 = (C6956l) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj8;
                EnumC12999l enumC12999l = (EnumC12999l) obj9;
                if ((iIntValue9 & 6) == 0) {
                    i4 = iIntValue9 | (c6956l5.billing(c7091l4) ? 4 : 2);
                } else {
                    i4 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i4 |= c6956l5.amazon(iIntValue8) ? 32 : 16;
                }
                if (c6956l5.m2127for(i4 & 1, (i4 & 147) != 146)) {
                    EnumC12999l enumC12999l2 = (EnumC12999l) EnumC12999l.f25472l.get(iIntValue8);
                    c6956l5.m2123default(912207512);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l5, 0);
                    long j = c6956l5.f14595continue;
                    int i13 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i13), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, C3438l.amazon);
                    boolean z = enumC12999l == enumC12999l2;
                    enumC12999l2.getClass();
                    boolean z2 = (enumC12999l2 == EnumC12999l.f25471l || enumC12999l2 == EnumC12999l.f25470l || ((Boolean) ((InterfaceC12244l) obj7).getValue()).booleanValue()) ? false : true;
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean z3 = enumC12999l != enumC12999l2;
                    boolean zBilling2 = c6956l5.billing(function1) | c6956l5.amazon(enumC12999l2.ordinal());
                    Object objM2132native3 = c6956l5.m2132native();
                    if (zBilling2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C17749l(function1, enumC12999l2, (InterfaceC8714l) obj6, 7);
                        c6956l5.m2147try(objM2132native3);
                    }
                    AbstractC8007l.loadAd(enumC12999l2, z, z2, AbstractC9151l.loadAd(interfaceC17242lAmazon2, z3, null, (Function0) objM2132native3, 14), c6956l5, 0);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l5, 0, 7);
                    c6956l5.startapp(true);
                    c6956l5.startapp(false);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                int i14 = 1;
                C7091l c7091l5 = (C7091l) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                C6956l c6956l6 = (C6956l) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj8;
                if ((iIntValue11 & 6) == 0) {
                    i5 = iIntValue11 | (c6956l6.billing(c7091l5) ? 4 : 2);
                } else {
                    i5 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i5 |= c6956l6.amazon(iIntValue10) ? 32 : 16;
                }
                if (c6956l6.m2127for(i5 & 1, (i5 & 147) != 146)) {
                    C1682l c1682l = (C1682l) ((List) obj9).get(iIntValue10);
                    c6956l6.m2123default(-595266308);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l6, 0);
                    long j2 = c6956l6.f14595continue;
                    int i15 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l6.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l6, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(c16395l2);
                    } else {
                        c6956l6.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l6, c1853lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l6, Integer.valueOf(i15), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l6, C3438l.firebase);
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling2, C3438l.amazon);
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob2 = c6956l6.admob(interfaceC2262l) | c6956l6.admob(c1682l);
                    Object objM2132native4 = c6956l6.m2132native();
                    Object obj10 = objM2132native4;
                    if (zAdmob2 || objM2132native4 == c13863l) {
                        C6975l c6975l = new C6975l(interfaceC2262l, c1682l, i12);
                        c6956l6.m2147try(c6975l);
                        obj10 = c6975l;
                    }
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) obj10, 15);
                    int i16 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC14566l.amazon(1200771035, new C0976l(8, c1682l), c6956l6), interfaceC17242lLoadAd, null, null, AbstractC14566l.amazon(-1346951593, new C12204l(c1682l, interfaceC2262l, (InterfaceC12244l) obj7, i14), c6956l6), AbstractC14566l.amazon(1237343222, new C6640l((C9197l) obj6, c1682l, i11), c6956l6), AbstractC15548l.yandex(0L, 0L, ((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).yandex.yandex, 0L, c6956l6, 507), c6956l6, 221190, 396);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l6, 0, 7);
                    c6956l6.startapp(true);
                    c6956l6.startapp(false);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C7091l c7091l6 = (C7091l) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                C6956l c6956l7 = (C6956l) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                Function1 function2 = (Function1) obj6;
                Function1 function3 = (Function1) obj7;
                if ((iIntValue13 & 6) == 0) {
                    i6 = iIntValue13 | (c6956l7.billing(c7091l6) ? 4 : 2);
                } else {
                    i6 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i6 |= c6956l7.amazon(iIntValue12) ? 32 : 16;
                }
                if (c6956l7.m2127for(i6 & 1, (i6 & 147) != 146)) {
                    C7933l c7933l = (C7933l) ((InterfaceC13238l) obj9).get(iIntValue12);
                    c6956l7.m2123default(2013871923);
                    C2757l c2757l = c7933l.loadAd;
                    C12787l c12787l = c2757l.adcel;
                    String str = (c12787l == null || (c8206l = c12787l.purchase) == null) ? null : c8206l.billing;
                    String str2 = c2757l.amazon;
                    String str3 = c2757l.yandex;
                    boolean zBooleanValue = ((Boolean) ((Function1) obj8).invoke(c7933l.yandex)).booleanValue();
                    boolean zBilling3 = c6956l7.billing(function3) | c6956l7.admob(c7933l);
                    Object objM2132native5 = c6956l7.m2132native();
                    Object obj11 = objM2132native5;
                    if (zBilling3 || objM2132native5 == c13863l) {
                        C16056l c16056l = new C16056l(function3, c7933l, 3);
                        c6956l7.m2147try(c16056l);
                        obj11 = c16056l;
                    }
                    Function0 function4 = (Function0) obj11;
                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                    InterfaceC2186l interfaceC2186l = (InterfaceC2186l) c6956l7.isPro(AbstractC14631l.yandex);
                    boolean zBilling4 = c6956l7.billing(function2) | c6956l7.admob(c7933l);
                    Object objM2132native6 = c6956l7.m2132native();
                    Object obj12 = objM2132native6;
                    if (zBilling4 || objM2132native6 == c13863l) {
                        C16056l c16056l2 = new C16056l(function2, c7933l, 4);
                        c6956l7.m2147try(c16056l2);
                        obj12 = c16056l2;
                    }
                    Function0 function5 = (Function0) obj12;
                    boolean zBilling5 = c6956l7.billing(function3) | c6956l7.admob(c7933l);
                    Object objM2132native7 = c6956l7.m2132native();
                    Object obj13 = objM2132native7;
                    if (zBilling5 || objM2132native7 == c13863l) {
                        C16056l c16056l3 = new C16056l(function3, c7933l, 5);
                        c6956l7.m2147try(c16056l3);
                        obj13 = c16056l3;
                    }
                    AbstractC10704l.loadAd(0, c6956l7, AbstractC9151l.crashlytics(interfaceC17242lAmazon4, null, interfaceC2186l, false, function5, (Function0) obj13, 444), str, str2, str3, function4, zBooleanValue);
                    c6956l7.startapp(false);
                } else {
                    c6956l7.m2124else();
                }
                break;
            default:
                C7091l c7091l7 = (C7091l) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                C6956l c6956l8 = (C6956l) obj3;
                int iIntValue15 = ((Number) obj4).intValue();
                if ((iIntValue15 & 6) == 0) {
                    i7 = (c6956l8.billing(c7091l7) ? 4 : 2) | iIntValue15;
                } else {
                    i7 = iIntValue15;
                }
                if ((iIntValue15 & 48) == 0) {
                    i7 |= c6956l8.amazon(iIntValue14) ? 32 : 16;
                }
                if (c6956l8.m2127for(i7 & 1, (i7 & 147) != 146)) {
                    CachedPlaylist cachedPlaylist = ((C0913l) ((InterfaceC13238l) obj9).get(iIntValue14)).yandex;
                    c6956l8.m2123default(265177713);
                    AbstractC12953l.admob(c7091l7, (C5056l) obj8, cachedPlaylist.m4618throws(), null, false, null, AbstractC14566l.amazon(-1067072541, new C3127l((C17003l) obj7, cachedPlaylist, (InterfaceC1234l) obj6, 9), c6956l8), c6956l8, (i7 & 14) | 1572864, 28);
                    c6956l8.startapp(false);
                } else {
                    c6956l8.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2414l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f5177l = i;
        this.f5176l = obj;
        this.f5175l = obj2;
        this.f5179l = obj3;
        this.f5178l = obj4;
    }
}
