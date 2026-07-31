package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: renamed from: lًؚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7340l implements Function4 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f15239l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15240l;

    public /* synthetic */ C7340l(int i, List list) {
        this.f15240l = i;
        this.f15239l = list;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        C6956l c6956l;
        int i5 = this.f15240l;
        C4346l c4346l = C4346l.f8873l;
        List list = this.f15239l;
        int i6 = 2;
        int i7 = 0;
        int i8 = 1;
        switch (i5) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l2.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l2.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l2.m2127for(i & 1, (i & 147) != 146)) {
                    C17386l c17386l = (C17386l) list.get(iIntValue);
                    c6956l2.m2123default(-703999060);
                    c17386l.getClass();
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(AbstractC0080l.amazon(c4346l, 1.0f), false, null, c17386l.purchase, 15);
                    int i9 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC14566l.amazon(-395968261, new C5330l(c17386l, i7), c6956l2), interfaceC17242lLoadAd, null, AbstractC14566l.amazon(306685528, new C5330l(c17386l, i8), c6956l2), AbstractC14566l.amazon(1972559223, new C5330l(c17386l, i6), c6956l2), null, AbstractC15548l.yandex(C9735l.isPro, 0L, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, c6956l2, 506), c6956l2, 27654, 388);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l3.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l3.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l3.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    AlbumThumb albumThumb = (AlbumThumb) list.get(iIntValue3);
                    c6956l3.m2123default(-715590445);
                    InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex(8.0f)), 64.0f);
                    C10707l c10707l = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(interfaceC17242lIsPro, ((C14370l) c6956l3.isPro(c10707l)).yandex.ads, AbstractC16837l.yandex);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j = c6956l3.f14595continue;
                    int i10 = (int) ((j >>> 32) ^ j);
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i10), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC7741l.purchase(albumThumb.crashlytics, null, AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex(8.0f)), 56.0f), new C18627l(((C14370l) c6956l3.isPro(c10707l)).yandex.signatures), null, null, c6956l3, 4144, 0, 32752);
                    c6956l3.startapp(true);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C7091l c7091l3 = (C7091l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C6956l c6956l4 = (C6956l) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (c6956l4.billing(c7091l3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= c6956l4.amazon(iIntValue5) ? 32 : 16;
                }
                if (c6956l4.m2127for(i3 & 1, (i3 & 147) != 146)) {
                    C11967l c11967l = (C11967l) list.get(iIntValue5);
                    c6956l4.m2123default(2118676982);
                    c11967l.yandex(c6956l4, 0);
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C7091l c7091l4 = (C7091l) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C6956l c6956l5 = (C6956l) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (c6956l5.billing(c7091l4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= c6956l5.amazon(iIntValue7) ? 32 : 16;
                }
                if (c6956l5.m2127for(i4 & 1, (i4 & 147) != 146)) {
                    InterfaceC9265l interfaceC9265l = (InterfaceC9265l) list.get(iIntValue7);
                    c6956l5.m2123default(-1767083960);
                    if (interfaceC9265l instanceof C6331l) {
                        c6956l5.m2123default(-1767022767);
                        c6956l5.startapp(false);
                        c6956l = c6956l5;
                    } else {
                        if (!(interfaceC9265l instanceof C11054l)) {
                            throw AbstractC12900l.billing(-611192037, c6956l5, false);
                        }
                        c6956l5.m2123default(-1766918266);
                        String str = ((C11054l) interfaceC9265l).crashlytics;
                        C10707l c10707l2 = AbstractC16964l.yandex;
                        AbstractC13010l.loadAd(str, AbstractC0080l.amazon(AbstractC3605l.remoteconfig(AbstractC0019l.crashlytics(c4346l, ((C14370l) c6956l5.isPro(c10707l2)).crashlytics.crashlytics), 16.0f, 8.0f), 1.0f), ((C14370l) c6956l5.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l5.isPro(c10707l2)).loadAd.billing, c6956l5, 0, 0, 131064);
                        c6956l = c6956l5;
                        c6956l.startapp(false);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
