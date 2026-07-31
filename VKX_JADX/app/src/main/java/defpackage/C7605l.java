package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؚۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7605l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f15649l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15650l;

    public /* synthetic */ C7605l(InterfaceC8714l interfaceC8714l, int i) {
        this.f15650l = i;
        this.f15649l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15650l;
        C13863l c13863l = C1867l.yandex;
        InterfaceC8714l interfaceC8714l = this.f15649l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM2132native = c6956l.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = new C0289l(interfaceC8714l, 7);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC18219l.f35662l, c6956l, 805306374, 510);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    MainArtist mainArtist = (MainArtist) interfaceC8714l.getValue();
                    String str = mainArtist != null ? mainArtist.crashlytics : null;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.confirm_remove_from_blacklist, new Object[]{str}, c6956l2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objM2132native2 = c6956l3.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = new C0289l(interfaceC8714l, 10);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native2, null, false, null, null, null, AbstractC7985l.loadAd, c6956l3, 805306374, 510);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objM2132native3 = c6956l4.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = new C0289l(interfaceC8714l, 13);
                        c6956l4.m2147try(objM2132native3);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native3, null, false, null, null, null, AbstractC4959l.yandex, c6956l4, 805306374, 510);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objM2132native4 = c6956l5.m2132native();
                    if (objM2132native4 == c13863l) {
                        objM2132native4 = new C0289l(interfaceC8714l, 12);
                        c6956l5.m2147try(objM2132native4);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native4, null, false, null, null, null, AbstractC4959l.isPro, c6956l5, 805306374, 510);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objM2132native5 = c6956l6.m2132native();
                    if (objM2132native5 == c13863l) {
                        objM2132native5 = new C0289l(interfaceC8714l, 17);
                        c6956l6.m2147try(objM2132native5);
                    }
                    AbstractC7470l.billing((Function0) objM2132native5, null, false, null, null, null, AbstractC14566l.amazon(-2078413158, new C7605l(interfaceC8714l, 6), c6956l6), c6956l6, 1572870, 62);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c6956l7.m2124else();
                } else if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                    c6956l7.m2123default(-195249074);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.view_outline_28, 0, c6956l7), AbstractC11999l.purchase(c6956l7, R.string.hide_password), null, 0L, c6956l7, 8, 12);
                    c6956l7.startapp(false);
                } else {
                    c6956l7.m2123default(-195239922);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.hide_outline_28, 0, c6956l7), AbstractC11999l.purchase(c6956l7, R.string.show_password), null, 0L, c6956l7, 8, 12);
                    c6956l7.startapp(false);
                }
                break;
            case 7:
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Object objM2132native6 = c6956l8.m2132native();
                    if (objM2132native6 == c13863l) {
                        objM2132native6 = new C18334l(26);
                        c6956l8.m2147try(objM2132native6);
                    }
                    C15986l c15986l = new C15986l((Function1) objM2132native6, false);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l8.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l8, c15986l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(c16395l);
                    } else {
                        c6956l8.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l8, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l8, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l8, C3438l.firebase);
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling, C3438l.amazon);
                    ((Function2) interfaceC8714l.getValue()).invoke(c6956l8, 0);
                    c6956l8.startapp(true);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                boolean z = false;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if ((iIntValue9 & 3) != 2) {
                    z = true;
                }
                if (c6956l9.m2127for(iIntValue9 & 1, z)) {
                    int i3 = 5;
                    InterfaceC12244l interfaceC12244lYandex = AbstractC16245l.yandex(!((Boolean) interfaceC8714l.getValue()).booleanValue() ? 96.0f : 0.0f, AbstractC0532l.admob(0.0f, 1000.0f, null, 5), null, c6956l9, 48, 12);
                    C2322l c2322l = new C2322l(0.0f, 0.0f, 0.0f, 0.0f);
                    boolean zBilling = c6956l9.billing(interfaceC12244lYandex);
                    Object objM2132native7 = c6956l9.m2132native();
                    if (zBilling || objM2132native7 == c13863l) {
                        objM2132native7 = new C2116l(interfaceC12244lYandex, i3);
                        c6956l9.m2147try(objM2132native7);
                    }
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC4115l.purchase(C4346l.f8873l, (Function1) objM2132native7);
                    C10707l c10707l = AbstractC5992l.yandex;
                    long j2 = ((C18718l) c6956l9.isPro(c10707l)).crashlytics;
                    long j3 = ((C18718l) c6956l9.isPro(c10707l)).yandex;
                    Object objM2132native8 = c6956l9.m2132native();
                    if (objM2132native8 == c13863l) {
                        objM2132native8 = new C0289l(interfaceC8714l, 22);
                        c6956l9.m2147try(objM2132native8);
                    }
                    AbstractC11184l.yandex((Function0) objM2132native8, interfaceC17242lPurchase, null, j2, j3, c2322l, AbstractC11156l.mopub, c6956l9, 12582918, 68);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                boolean z2 = false;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if ((iIntValue10 & 3) != 2) {
                    z2 = true;
                }
                if (c6956l10.m2127for(iIntValue10 & 1, z2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                    Object objM2132native9 = c6956l10.m2132native();
                    if (objM2132native9 == c13863l) {
                        objM2132native9 = new C9922l(interfaceC8714l, 29);
                        c6956l10.m2147try(objM2132native9);
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) objM2132native9, null, false, null, c6956l10, 48, 124);
                } else {
                    c6956l10.m2124else();
                }
                break;
            default:
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Bitmap bitmap = (Bitmap) interfaceC8714l.getValue();
                    C10365l c10365l = C10365l.yandex;
                    if (bitmap != null) {
                        c6956l11.m2123default(-1283717814);
                        Bitmap bitmap2 = (Bitmap) interfaceC8714l.getValue();
                        if (bitmap2 == null) {
                            c6956l11.m2123default(-1283666851);
                            c6956l11.startapp(false);
                        } else {
                            c6956l11.m2123default(-1283666850);
                            C10053l.yandex(new C12826l(bitmap2), null, AbstractC17307l.firebase(AbstractC5573l.tapsense(new C4538l(c10365l)), 0.0f, 11), 1, null, c6956l11, 48, 16);
                            c6956l11.startapp(false);
                            Unit unit = Unit.INSTANCE;
                        }
                        c6956l11.startapp(false);
                    } else {
                        c6956l11.m2123default(-1283176740);
                        C10053l.yandex(new C7552l(R.drawable.rounded_card_dock), null, AbstractC17307l.firebase(AbstractC5573l.tapsense(new C4538l(c10365l)), 0.0f, 11), 1, null, c6956l11, 48, 16);
                        c6956l11.startapp(false);
                    }
                } else {
                    c6956l11.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
