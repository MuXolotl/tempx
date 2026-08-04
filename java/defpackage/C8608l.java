package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٌؙُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8608l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f17755l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17756l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17757l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f17758l;

    public /* synthetic */ C8608l(Object obj, int i, Object obj2, int i2) {
        this.f17757l = i2;
        this.f17755l = obj;
        this.f17756l = i;
        this.f17758l = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC12776l interfaceC12776l;
        int i;
        InterfaceC12776l interfaceC12776l2;
        int i2;
        int i3;
        int i4 = this.f17757l;
        final int i5 = 2;
        final int i6 = 3;
        final int i7 = 1;
        final int i8 = 0;
        int i9 = this.f17756l;
        Object obj2 = this.f17758l;
        Object obj3 = this.f17755l;
        switch (i4) {
            case 0:
                C1774l c1774l = (C1774l) obj3;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-834752793, true, new C1866l(c1774l, i9, 0)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1061560546, true, new C7442l((Object) c1774l, (InterfaceC12244l) obj2, i6)), 3);
                InterfaceC13238l interfaceC13238l = c1774l.f4195l;
                c1336l.firebase(((AbstractC7095l) interfaceC13238l).pro(), null, new Creturn(interfaceC13238l, 3, false), new C15578l(802480018, true, new C7340l(0, interfaceC13238l)));
                break;
            case 1:
                C14354l c14354l = (C14354l) obj;
                C6919l c6919lSignature = C16296l.Signature();
                String canonicalName = ((AbstractC12866l) obj3).getClass().getCanonicalName();
                c6919lSignature.crashlytics();
                C16296l.vip((C16296l) c6919lSignature.f16394l, canonicalName);
                c6919lSignature.crashlytics();
                C16296l.metrica((C16296l) c6919lSignature.f16394l, i9);
                c6919lSignature.crashlytics();
                C16296l.startapp((C16296l) c6919lSignature.f16394l, (String) obj2);
                C16296l c16296l = (C16296l) c6919lSignature.yandex();
                c14354l.crashlytics();
                C11208l.adcel((C11208l) c14354l.f16394l, c16296l);
                break;
            case 2:
                C14354l c14354l2 = (C14354l) obj;
                C6043l c6043lSignature = C12935l.Signature();
                String canonicalName2 = ((AbstractC12866l) obj3).getClass().getCanonicalName();
                c6043lSignature.crashlytics();
                C12935l.vip((C12935l) c6043lSignature.f16394l, canonicalName2);
                c6043lSignature.crashlytics();
                C12935l.metrica((C12935l) c6043lSignature.f16394l, i9);
                Parcel parcelObtain = Parcel.obtain();
                ((Bundle) obj2).writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                C15379l c15379lMopub = AbstractC16071l.mopub(0, bArrMarshall.length, bArrMarshall);
                c6043lSignature.crashlytics();
                C12935l.startapp((C12935l) c6043lSignature.f16394l, c15379lMopub);
                C12935l c12935l = (C12935l) c6043lSignature.yandex();
                c14354l2.crashlytics();
                C11208l.metrica((C11208l) c14354l2.f16394l, c12935l);
                break;
            case 3:
                String str = (String) obj3;
                List list = (List) obj2;
                C2566l c2566l = (C2566l) obj;
                C12814l c12814l = c2566l.f5578l;
                if (c12814l != null) {
                    long j = c12814l.yandex;
                    int i10 = (int) (j >> 32);
                    AbstractC12272l.billing(c2566l, i10, (int) (j & 4294967295L), str);
                    if (str.length() > 0) {
                        c2566l.purchase(i10, str.length() + i10, list);
                    }
                } else {
                    int iMopub = C12814l.mopub(c2566l.f5585l);
                    AbstractC12272l.billing(c2566l, iMopub, C12814l.billing(c2566l.f5585l), str);
                    if (str.length() > 0) {
                        c2566l.purchase(iMopub, str.length() + iMopub, list);
                    }
                }
                int iMopub2 = C12814l.mopub(c2566l.f5585l);
                int iPurchase = AbstractC8576l.purchase(i9 > 0 ? (iMopub2 + i9) - 1 : (iMopub2 + i9) - str.length(), 0, c2566l.f5577l.length());
                c2566l.mopub(AbstractC2296l.loadAd(iPurchase, iPurchase));
                break;
            case 4:
                C4224l c4224l = (C4224l) obj3;
                C7661l c7661l = (C7661l) obj2;
                InterfaceC12776l interfaceC12776l3 = (InterfaceC12776l) obj;
                if (c4224l.purchase == i9 && AbstractC8576l.yandex(c7661l, c4224l.billing) && (interfaceC12776l3 instanceof C6931l)) {
                    long[] jArr = c7661l.yandex;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j2 = jArr[i11];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8;
                                int i13 = 8 - ((~(i11 - length)) >>> 31);
                                int i14 = i8;
                                while (i14 < i13) {
                                    if ((255 & j2) < 128) {
                                        int i15 = (i11 << 3) + i14;
                                        Object obj4 = c7661l.loadAd[i15];
                                        i2 = i7;
                                        int i16 = c7661l.crashlytics[i15] != i9 ? i2 : i8;
                                        if (i16 != 0) {
                                            C6931l c6931l = (C6931l) interfaceC12776l3;
                                            i3 = i12;
                                            C13660l c13660l = c6931l.f14526l;
                                            AbstractC9831l.subs(c13660l, obj4, c4224l);
                                            interfaceC12776l2 = interfaceC12776l3;
                                            if (obj4 instanceof C8610l) {
                                                C8610l c8610l = (C8610l) obj4;
                                                if (!c13660l.crashlytics(c8610l)) {
                                                    AbstractC9831l.isPro(c6931l.f14536l, c8610l);
                                                }
                                                C13660l c13660l2 = c4224l.mopub;
                                                if (c13660l2 != null) {
                                                    c13660l2.smaato(obj4);
                                                }
                                            }
                                        } else {
                                            interfaceC12776l2 = interfaceC12776l3;
                                            i3 = i12;
                                        }
                                        if (i16 != 0) {
                                            c7661l.billing(i15);
                                        }
                                    } else {
                                        interfaceC12776l2 = interfaceC12776l3;
                                        i2 = i7;
                                        i3 = i12;
                                    }
                                    j2 >>= i3;
                                    i14++;
                                    i12 = i3;
                                    interfaceC12776l3 = interfaceC12776l2;
                                    i7 = i2;
                                    i8 = 0;
                                }
                                interfaceC12776l = interfaceC12776l3;
                                i = i7;
                                if (i13 == i12) {
                                }
                            } else {
                                interfaceC12776l = interfaceC12776l3;
                                i = i7;
                            }
                            if (i11 != length) {
                                i11++;
                                interfaceC12776l3 = interfaceC12776l;
                                i7 = i;
                                i8 = 0;
                            }
                        }
                    }
                }
                break;
            case 5:
                C14664l c14664l = (C14664l) obj3;
                AbstractC10113l abstractC10113l = (AbstractC10113l) obj2;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                int iAdmob = c14664l.f28675l.yandex.admob();
                if (iAdmob < 0) {
                    iAdmob = 0;
                }
                if (iAdmob <= i9) {
                    i9 = iAdmob;
                }
                int i17 = -i9;
                boolean z = c14664l.f28674l;
                int i18 = z ? 0 : i17;
                int i19 = z ? i17 : 0;
                abstractC9601l.f19562l = true;
                AbstractC9601l.remoteconfig(abstractC9601l, abstractC10113l, i18, i19, null, 12);
                Unit unit = Unit.INSTANCE;
                abstractC9601l.f19562l = false;
                break;
            case 6:
                final C0675l c0675l = (C0675l) obj3;
                C1336l c1336l2 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-365448633, true, new C1866l(c0675l, i9, 9)), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(853762416, true, new C3091l((InterfaceC12244l) obj2, c0675l, 15)), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.pro, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(1823036078, true, new Function3() { // from class: lٟؔٓ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i20 = i8;
                        C13863l c13863l = C1867l.yandex;
                        C4346l c4346l = C4346l.f8873l;
                        byte b = 0;
                        switch (i20) {
                            case 0:
                                C6956l c6956l = (C6956l) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l2 = c0675l;
                                    boolean zAdmob = c6956l.admob(c0675l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C6814l c6814l = new C6814l(0, c0675l2, C0675l.class, "requestLibraryCache", "requestLibraryCache()V", 0, 0, 1);
                                        c6956l.m2147try(c6814l);
                                        objM2132native = c6814l;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.ad, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l3 = c0675l;
                                    boolean zAdmob2 = c6956l2.admob(c0675l3);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        C6814l c6814l2 = new C6814l(0, c0675l3, C0675l.class, "requestLibraryDownload", "requestLibraryDownload()V", 0, 0, 2);
                                        c6956l2.m2147try(c6814l2);
                                        objM2132native2 = c6814l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.advert, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l4 = c0675l;
                                    boolean zAdmob3 = c6956l3.admob(c0675l4);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        C6814l c6814l3 = new C6814l(0, c0675l4, C0675l.class, "exportTracks", "exportTracks()V", 0, 0, 3);
                                        c6956l3.m2147try(c6814l3);
                                        objM2132native3 = c6814l3;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.appmetrica, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) ((InterfaceC5059l) objM2132native3), 15), null, AbstractC1383l.inmobi, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l4 = (C6956l) obj6;
                                int iIntValue4 = ((Integer) obj7).intValue();
                                if (c6956l4.m2127for(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l5 = c0675l;
                                    boolean zAdmob4 = c6956l4.admob(c0675l5);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C6814l c6814l4 = new C6814l(0, c0675l5, C0675l.class, "openDownloadPathSelection", "openDownloadPathSelection()V", 0, 0, 4);
                                        c6956l4.m2147try(c6814l4);
                                        objM2132native4 = c6814l4;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.f3539package, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC14566l.amazon(1953614254, new C3081l(c0675l5, 10, b), c6956l4), null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-1987294387, true, new Function3() { // from class: lٟؔٓ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i20 = i7;
                        C13863l c13863l = C1867l.yandex;
                        C4346l c4346l = C4346l.f8873l;
                        byte b = 0;
                        switch (i20) {
                            case 0:
                                C6956l c6956l = (C6956l) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l2 = c0675l;
                                    boolean zAdmob = c6956l.admob(c0675l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C6814l c6814l = new C6814l(0, c0675l2, C0675l.class, "requestLibraryCache", "requestLibraryCache()V", 0, 0, 1);
                                        c6956l.m2147try(c6814l);
                                        objM2132native = c6814l;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.ad, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l3 = c0675l;
                                    boolean zAdmob2 = c6956l2.admob(c0675l3);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        C6814l c6814l2 = new C6814l(0, c0675l3, C0675l.class, "requestLibraryDownload", "requestLibraryDownload()V", 0, 0, 2);
                                        c6956l2.m2147try(c6814l2);
                                        objM2132native2 = c6814l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.advert, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l4 = c0675l;
                                    boolean zAdmob3 = c6956l3.admob(c0675l4);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        C6814l c6814l3 = new C6814l(0, c0675l4, C0675l.class, "exportTracks", "exportTracks()V", 0, 0, 3);
                                        c6956l3.m2147try(c6814l3);
                                        objM2132native3 = c6814l3;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.appmetrica, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) ((InterfaceC5059l) objM2132native3), 15), null, AbstractC1383l.inmobi, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l4 = (C6956l) obj6;
                                int iIntValue4 = ((Integer) obj7).intValue();
                                if (c6956l4.m2127for(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l5 = c0675l;
                                    boolean zAdmob4 = c6956l4.admob(c0675l5);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C6814l c6814l4 = new C6814l(0, c0675l5, C0675l.class, "openDownloadPathSelection", "openDownloadPathSelection()V", 0, 0, 4);
                                        c6956l4.m2147try(c6814l4);
                                        objM2132native4 = c6814l4;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.f3539package, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC14566l.amazon(1953614254, new C3081l(c0675l5, 10, b), c6956l4), null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.isVip, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.signatures, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.premium, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.applovin, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(435889768, true, new Function3() { // from class: lٟؔٓ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i20 = i5;
                        C13863l c13863l = C1867l.yandex;
                        C4346l c4346l = C4346l.f8873l;
                        byte b = 0;
                        switch (i20) {
                            case 0:
                                C6956l c6956l = (C6956l) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l2 = c0675l;
                                    boolean zAdmob = c6956l.admob(c0675l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C6814l c6814l = new C6814l(0, c0675l2, C0675l.class, "requestLibraryCache", "requestLibraryCache()V", 0, 0, 1);
                                        c6956l.m2147try(c6814l);
                                        objM2132native = c6814l;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.ad, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l3 = c0675l;
                                    boolean zAdmob2 = c6956l2.admob(c0675l3);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        C6814l c6814l2 = new C6814l(0, c0675l3, C0675l.class, "requestLibraryDownload", "requestLibraryDownload()V", 0, 0, 2);
                                        c6956l2.m2147try(c6814l2);
                                        objM2132native2 = c6814l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.advert, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l4 = c0675l;
                                    boolean zAdmob3 = c6956l3.admob(c0675l4);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        C6814l c6814l3 = new C6814l(0, c0675l4, C0675l.class, "exportTracks", "exportTracks()V", 0, 0, 3);
                                        c6956l3.m2147try(c6814l3);
                                        objM2132native3 = c6814l3;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.appmetrica, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) ((InterfaceC5059l) objM2132native3), 15), null, AbstractC1383l.inmobi, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l4 = (C6956l) obj6;
                                int iIntValue4 = ((Integer) obj7).intValue();
                                if (c6956l4.m2127for(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l5 = c0675l;
                                    boolean zAdmob4 = c6956l4.admob(c0675l5);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C6814l c6814l4 = new C6814l(0, c0675l5, C0675l.class, "openDownloadPathSelection", "openDownloadPathSelection()V", 0, 0, 4);
                                        c6956l4.m2147try(c6814l4);
                                        objM2132native4 = c6814l4;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.f3539package, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC14566l.amazon(1953614254, new C3081l(c0675l5, 10, b), c6956l4), null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.f3544throws, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-1385406963, true, new Function3() { // from class: lٟؔٓ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i20 = i6;
                        C13863l c13863l = C1867l.yandex;
                        C4346l c4346l = C4346l.f8873l;
                        byte b = 0;
                        switch (i20) {
                            case 0:
                                C6956l c6956l = (C6956l) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l2 = c0675l;
                                    boolean zAdmob = c6956l.admob(c0675l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C6814l c6814l = new C6814l(0, c0675l2, C0675l.class, "requestLibraryCache", "requestLibraryCache()V", 0, 0, 1);
                                        c6956l.m2147try(c6814l);
                                        objM2132native = c6814l;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.ad, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l3 = c0675l;
                                    boolean zAdmob2 = c6956l2.admob(c0675l3);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        C6814l c6814l2 = new C6814l(0, c0675l3, C0675l.class, "requestLibraryDownload", "requestLibraryDownload()V", 0, 0, 2);
                                        c6956l2.m2147try(c6814l2);
                                        objM2132native2 = c6814l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.advert, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l4 = c0675l;
                                    boolean zAdmob3 = c6956l3.admob(c0675l4);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        C6814l c6814l3 = new C6814l(0, c0675l4, C0675l.class, "exportTracks", "exportTracks()V", 0, 0, 3);
                                        c6956l3.m2147try(c6814l3);
                                        objM2132native3 = c6814l3;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.appmetrica, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) ((InterfaceC5059l) objM2132native3), 15), null, AbstractC1383l.inmobi, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l4 = (C6956l) obj6;
                                int iIntValue4 = ((Integer) obj7).intValue();
                                if (c6956l4.m2127for(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C0675l c0675l5 = c0675l;
                                    boolean zAdmob4 = c6956l4.admob(c0675l5);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C6814l c6814l4 = new C6814l(0, c0675l5, C0675l.class, "openDownloadPathSelection", "openDownloadPathSelection()V", 0, 0, 4);
                                        c6956l4.m2147try(c6814l4);
                                        objM2132native4 = c6814l4;
                                    }
                                    AbstractC13319l.yandex(AbstractC1383l.f3539package, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC14566l.amazon(1953614254, new C3081l(c0675l5, 10, b), c6956l4), null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.f3542synchronized, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.f3541strictfp, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.f3545volatile, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.f3538native, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.f3540private, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1383l.f3536extends, 3);
                break;
            case 7:
                ((C18480l) obj3).ads((AudioTrack) obj, i9);
                ((Function0) obj2).invoke();
                break;
            default:
                C7970l c7970l = (C7970l) obj3;
                AbstractC10113l abstractC10113l2 = (AbstractC10113l) obj2;
                AbstractC9601l abstractC9601l2 = (AbstractC9601l) obj;
                int i20 = c7970l.f16627l;
                C15271l c15271l = c7970l.f16628l;
                C4991l c4991l = c7970l.f16626l;
                C11224l c11224l = (C11224l) c7970l.f16629l.invoke();
                c15271l.yandex(EnumC7283l.f15126l, AbstractC5578l.loadAd(abstractC9601l2, i20, c4991l, c11224l != null ? c11224l.yandex : null, false, abstractC10113l2.f20592l), i9, abstractC10113l2.f20591l);
                AbstractC9601l.smaato(abstractC9601l2, abstractC10113l2, 0, Math.round(-c15271l.yandex.admob()));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8608l(Object obj, Object obj2, int i, int i2) {
        this.f17757l = i2;
        this.f17755l = obj;
        this.f17758l = obj2;
        this.f17756l = i;
    }
}
