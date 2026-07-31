package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaTag;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lُؚٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11074l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f22282l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f22283l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22284l;

    public /* synthetic */ C11074l(List list, Object obj, int i) {
        this.f22284l = i;
        this.f22283l = list;
        this.f22282l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        ?? r5;
        int i5;
        int i6;
        InterfaceC6347l interfaceC6347lCrashlytics;
        int i7;
        int i8;
        int i9;
        int i10 = this.f22284l;
        int i11 = 3;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        List list = this.f22283l;
        Object obj5 = this.f22282l;
        boolean z = true;
        int i12 = 4;
        switch (i10) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                    CachedPlaylist cachedPlaylist = (CachedPlaylist) list.get(iIntValue);
                    c6956l.m2123default(-2019412327);
                    ((C8748l) obj5).m2426this(cachedPlaylist, c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C14089l c14089l = (C14089l) obj5;
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    C9024l c9024l = (C9024l) ((AbstractC18082l) list).get(iIntValue3);
                    c6956l2.m2123default(963476339);
                    C15968l c15968l = c9024l.f18585l;
                    C2729l c2729l = c9024l.f18584l;
                    if (c15968l != null) {
                        c6956l2.m2123default(963519831);
                        c14089l.m3833abstract(c9024l.f18585l, AbstractC3605l.vip(AbstractC5020l.smaato(c7091l2, c4346l), 16.0f, 0.0f, 2), c6956l2, 0);
                        c6956l2.startapp(false);
                    } else {
                        if (c2729l != null) {
                            c6956l2.m2123default(963944500);
                            c14089l.m3834import(c2729l, AbstractC3605l.vip(AbstractC5020l.smaato(c7091l2, c4346l), 16.0f, 0.0f, 2), c6956l2, 0);
                        } else {
                            c6956l2.m2123default(954976293);
                        }
                        c6956l2.startapp(false);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C7091l c7091l3 = (C7091l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                C13888l c13888l = (C13888l) obj5;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (c6956l3.billing(c7091l3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= c6956l3.amazon(iIntValue5) ? 32 : 16;
                }
                if (c6956l3.m2127for(i3 & 1, (i3 & 147) != 146)) {
                    C8188l c8188l = (C8188l) ((InterfaceC13238l) list).get(iIntValue5);
                    c6956l3.m2123default(-313365782);
                    boolean zAdmob = c6956l3.admob(c8188l) | c6956l3.admob(c13888l);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C11239l(c8188l, c13888l, 27);
                        c6956l3.m2147try(objM2132native);
                    }
                    AbstractC3383l.loadAd((Function0) objM2132native, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), false, null, null, null, null, AbstractC14566l.amazon(607563118, new C13147l(c8188l, c13888l, i11), c6956l3), c6956l3, 100663344, 252);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C7091l c7091l4 = (C7091l) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C6956l c6956l4 = (C6956l) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (c6956l4.billing(c7091l4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= c6956l4.amazon(iIntValue7) ? 32 : 16;
                }
                if (c6956l4.m2127for(i4 & 1, (i4 & 147) != 146)) {
                    C6555l c6555l = (C6555l) ((AbstractC18082l) list).get(iIntValue7);
                    c6956l4.m2123default(1082861752);
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l4, 0);
                    long j = c6956l4.f14595continue;
                    int i13 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l4, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l);
                    } else {
                        c6956l4.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l4, c1853lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i13);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l4, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l4, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling, c6415l4);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l4, 54);
                    long j2 = c6956l4.f14595continue;
                    int i14 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, c4346l);
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i14, c6956l4, c6415l3, c6956l4, c11192l);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, c6415l4);
                    AbstractC13010l.loadAd(c6555l.f13688l, null, AbstractC13106l.purchase(c6956l4).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l4).amazon, c6956l4, 0, 0, 131066);
                    if (c6555l.f13687l) {
                        c6956l4.m2123default(1889268186);
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(c4346l, C9735l.loadAd(0.25f, AbstractC13106l.purchase(c6956l4).yandex), AbstractC13106l.billing(c6956l4).crashlytics);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                        long j3 = c6956l4.f14595continue;
                        int i15 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, interfaceC17242lAmazon);
                        c6956l4.m2140super();
                        if (c6956l4.f14603switch) {
                            c6956l4.firebase(c16395l);
                        } else {
                            c6956l4.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon, c6415l);
                        AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, c6415l2);
                        AbstractC11043l.isPro(i15, c6956l4, c6415l3, c6956l4, c11192l);
                        AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, c6415l4);
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l4, R.string.ota_feed_card_beta), AbstractC3605l.remoteconfig(c4346l, 8.0f, 4.0f), AbstractC13106l.purchase(c6956l4).yandex, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l4).vip, c6956l4, 48, 0, 131064);
                        r5 = 1;
                        c6956l4.startapp(true);
                    } else {
                        r5 = 1;
                        c6956l4.m2123default(1884137252);
                    }
                    c6956l4.startapp(false);
                    c6956l4.startapp(r5);
                    String strValueOf = String.valueOf(c6555l.f13689l);
                    String strAmazon = AbstractC7076l.amazon(((C7650l) obj5).isVip(), c6555l.f13690l);
                    Object[] objArr = new Object[2];
                    objArr[0] = strValueOf;
                    objArr[r5] = strAmazon;
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.separator_strings, objArr, c6956l4), null, AbstractC13106l.purchase(c6956l4).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l4).admob, c6956l4, 0, 0, 131066);
                    AbstractC13010l.loadAd(c6555l.f13686l, null, AbstractC13106l.purchase(c6956l4).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l4).firebase, c6956l4, 0, 0, 131066);
                    c6956l4.startapp(true);
                    AbstractC9334l.yandex(c6956l4, AbstractC0080l.purchase(c4346l, 16.0f));
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l4, 0, 7);
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C14273l c14273l = (C14273l) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                C6956l c6956l5 = (C6956l) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (c6956l5.billing(c14273l) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= c6956l5.amazon(iIntValue9) ? 32 : 16;
                }
                if (c6956l5.m2127for(i5 & 1, (i5 & 147) != 146)) {
                    C14564l c14564l = (C14564l) list.get(iIntValue9);
                    c6956l5.m2123default(-351357940);
                    AbstractC3383l.yandex(null, null, null, null, null, AbstractC14566l.amazon(-878839716, new C13147l((C7679l) obj5, c14564l, i12), c6956l5), c6956l5, 196608, 31);
                    c6956l5.startapp(false);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C7091l c7091l5 = (C7091l) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                C6956l c6956l6 = (C6956l) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                C18534l c18534l = (C18534l) obj5;
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (c6956l6.billing(c7091l5) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= c6956l6.amazon(iIntValue11) ? 32 : 16;
                }
                if (c6956l6.m2127for(i6 & 1, (i6 & 147) != 146)) {
                    C11054l c11054l = (C11054l) list.get(iIntValue11);
                    c6956l6.m2123default(2096776270);
                    C11362l c11362l = c18534l.f36168l;
                    boolean zContains = c11362l.contains(Integer.valueOf(iIntValue11));
                    boolean zContains2 = c11362l.contains(Integer.valueOf(iIntValue11 - 1));
                    boolean zContains3 = c11362l.contains(Integer.valueOf(iIntValue11 + 1));
                    String str = c11054l.crashlytics;
                    if (zContains2 && zContains3) {
                        c6956l6.m2123default(1037482427);
                        c6956l6.startapp(false);
                        interfaceC6347lCrashlytics = AbstractC16837l.yandex;
                    } else if (zContains2) {
                        c6956l6.m2123default(1037485565);
                        interfaceC6347lCrashlytics = C6839l.crashlytics(((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics, new C8448l(0.0f), new C8448l(0.0f), null, null, 12);
                        c6956l6.startapp(false);
                    } else if (zContains3) {
                        c6956l6.m2123default(2097569311);
                        interfaceC6347lCrashlytics = C6839l.crashlytics(((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics, null, null, new C8448l(0.0f), new C8448l(0.0f), 3);
                        c6956l6.startapp(false);
                    } else {
                        c6956l6.m2123default(1037503507);
                        interfaceC6347lCrashlytics = ((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
                        c6956l6.startapp(false);
                    }
                    InterfaceC6347l interfaceC6347l = interfaceC6347lCrashlytics;
                    boolean zAdmob2 = c6956l6.admob(c18534l);
                    if ((((i6 & 112) ^ 48) <= 32 || !c6956l6.amazon(iIntValue11)) && (i6 & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zAdmob2 | z;
                    Object objM2132native2 = c6956l6.m2132native();
                    if (z2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C13998l(c18534l, iIntValue11, 4);
                        c6956l6.m2147try(objM2132native2);
                    }
                    c18534l.pro(zContains, str, interfaceC6347l, (Function0) objM2132native2, c6956l6, 24576);
                    c6956l6.startapp(false);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C7091l c7091l6 = (C7091l) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                C6956l c6956l7 = (C6956l) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (c6956l7.billing(c7091l6) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= c6956l7.amazon(iIntValue13) ? 32 : 16;
                }
                if (c6956l7.m2127for(i7 & 1, (i7 & 147) != 146)) {
                    C15545l c15545l = (C15545l) ((InterfaceC13238l) list).get(iIntValue13);
                    c6956l7.m2123default(-1595551678);
                    c15545l.loadAd.yandex(AbstractC9679l.billing(AbstractC5020l.smaato(c7091l6, c4346l), iIntValue13 == 0, AbstractC9966l.billing(c4346l, (C6523l) obj5)), c6956l7, 0);
                    c6956l7.startapp(false);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C7091l c7091l7 = (C7091l) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                C6956l c6956l8 = (C6956l) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                C6473l c6473l = (C6473l) obj5;
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (c6956l8.billing(c7091l7) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= c6956l8.amazon(iIntValue15) ? 32 : 16;
                }
                if (c6956l8.m2127for(i8 & 1, (i8 & 147) != 146)) {
                    UmaTag umaTag = (UmaTag) list.get(iIntValue15);
                    c6956l8.m2123default(109181908);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob3 = c6956l8.admob(c6473l) | c6956l8.admob(umaTag);
                    Object objM2132native3 = c6956l8.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C10558l(c6473l, umaTag, i11);
                        c6956l8.m2147try(objM2132native3);
                    }
                    AbstractC13319l.yandex(AbstractC14566l.amazon(1100022759, new C0976l(10, umaTag), c6956l8), AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native3, 15), null, null, AbstractC14566l.amazon(-115407381, new C0976l(11, c6473l), c6956l8), AbstractC3957l.crashlytics, null, c6956l8, 221190, 460);
                    c6956l8.startapp(false);
                } else {
                    c6956l8.m2124else();
                }
                break;
            default:
                C7091l c7091l8 = (C7091l) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                C6956l c6956l9 = (C6956l) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                C12842l c12842l = (C12842l) obj5;
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (c6956l9.billing(c7091l8) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= c6956l9.amazon(iIntValue17) ? 32 : 16;
                }
                if (c6956l9.m2127for(i9 & 1, (i9 & 147) != 146)) {
                    UmaTrack umaTrack = (UmaTrack) list.get(iIntValue17);
                    c6956l9.m2123default(668658399);
                    String str2 = umaTrack.yandex;
                    boolean zBilling = c6956l9.billing(umaTrack);
                    Object objM2132native4 = c6956l9.m2132native();
                    if (zBilling || objM2132native4 == c13863l) {
                        objM2132native4 = new C17330l(13, umaTrack);
                        c6956l9.m2147try(objM2132native4);
                    }
                    Function1 function1 = (Function1) objM2132native4;
                    boolean zAdmob4 = c6956l9.admob(c12842l) | c6956l9.billing(umaTrack);
                    Object objM2132native5 = c6956l9.m2132native();
                    if (zAdmob4 || objM2132native5 == c13863l) {
                        objM2132native5 = new C10558l(c12842l, umaTrack, i12);
                        c6956l9.m2147try(objM2132native5);
                    }
                    Function0 function0 = (Function0) objM2132native5;
                    AbstractC18643l abstractC18643lM2933instanceof = c12842l.m2933instanceof();
                    AbstractC7252l.loadAd(str2, function1, function0, AbstractC8576l.yandex(abstractC18643lM2933instanceof != null ? abstractC18643lM2933instanceof.startapp() : null, umaTrack.yandex), c12842l.m2931abstract() == EnumC11447l.f23032l, c6956l9, 0);
                    c6956l9.startapp(false);
                } else {
                    c6956l9.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
