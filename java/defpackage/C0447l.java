package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًٜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0447l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f1625l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17408l f1626l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1627l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f1628l;

    public /* synthetic */ C0447l(C17408l c17408l, InterfaceC2262l interfaceC2262l, InterfaceC12244l interfaceC12244l, int i) {
        this.f1627l = i;
        this.f1626l = c17408l;
        this.f1625l = interfaceC2262l;
        this.f1628l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f1627l;
        int i2 = 16;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        InterfaceC12244l interfaceC12244l = this.f1628l;
        InterfaceC2262l interfaceC2262l = this.f1625l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.settings_now_playing_background_theme);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    C17408l c17408l = this.f1626l;
                    boolean zAdmob = c6956l.admob(c17408l) | c6956l.admob(interfaceC2262l) | c6956l.billing(interfaceC12244l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C1060l(c17408l, interfaceC2262l, interfaceC12244l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 511);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(c7091l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean z = ((C18554l) interfaceC12244l.getValue()).f36220l;
                    boolean zAdmob2 = c6956l2.admob(interfaceC2262l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C15299l(interfaceC2262l, 5);
                        c6956l2.m2147try(objM2132native2);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_lyrics_hide_controls, z, (Function1) objM2132native2, AbstractC5020l.smaato(c7091l, c4346l), null, false, c6956l2, 0, 48);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C7091l c7091l2 = (C7091l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l3.billing(c7091l2) ? 4 : 2;
                }
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean z2 = ((C18554l) interfaceC12244l.getValue()).f36224l;
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC5020l.smaato(c7091l2, c4346l);
                    boolean zAdmob3 = c6956l3.admob(interfaceC2262l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C15299l(interfaceC2262l, 10);
                        c6956l3.m2147try(objM2132native3);
                    }
                    this.f1626l.m4327public(R.string.np_swipe, z2, (Function1) objM2132native3, interfaceC17242lSmaato, Integer.valueOf(R.string.np_swipe_desc), false, c6956l3, 0, 32);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C7091l c7091l3 = (C7091l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l4.billing(c7091l3) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean z3 = ((C18554l) interfaceC12244l.getValue()).f36219l;
                    boolean zAdmob4 = c6956l4.admob(interfaceC2262l);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C15299l(interfaceC2262l, 12);
                        c6956l4.m2147try(objM2132native4);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_disable_vibration, z3, (Function1) objM2132native4, AbstractC5020l.smaato(c7091l3, c4346l), null, false, c6956l4, 0, 48);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                C7091l c7091l4 = (C7091l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l5.billing(c7091l4) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    boolean z4 = ((C18554l) interfaceC12244l.getValue()).f36230l;
                    InterfaceC17242l interfaceC17242lSmaato2 = AbstractC5020l.smaato(c7091l4, c4346l);
                    boolean zAdmob5 = c6956l5.admob(interfaceC2262l);
                    Object objM2132native5 = c6956l5.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        objM2132native5 = new C15299l(interfaceC2262l, 15);
                        c6956l5.m2147try(objM2132native5);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_screen_lock, z4, (Function1) objM2132native5, interfaceC17242lSmaato2, Integer.valueOf(R.string.settings_now_playing_systembars_desc), false, c6956l5, 0, 32);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C7091l c7091l5 = (C7091l) obj;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c6956l6.billing(c7091l5) ? 4 : 2;
                }
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    boolean z5 = ((C18554l) interfaceC12244l.getValue()).f36215l;
                    InterfaceC17242l interfaceC17242lSmaato3 = AbstractC5020l.smaato(c7091l5, c4346l);
                    boolean zAdmob6 = c6956l6.admob(interfaceC2262l);
                    Object objM2132native6 = c6956l6.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        objM2132native6 = new C15299l(interfaceC2262l, 7);
                        c6956l6.m2147try(objM2132native6);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_systembars, z5, (Function1) objM2132native6, interfaceC17242lSmaato3, Integer.valueOf(R.string.settings_now_playing_systembars_desc), false, c6956l6, 0, 32);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 6:
                C7091l c7091l6 = (C7091l) obj;
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c6956l7.billing(c7091l6) ? 4 : 2;
                }
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    boolean z6 = ((C18554l) interfaceC12244l.getValue()).f36218l;
                    InterfaceC17242l interfaceC17242lSmaato4 = AbstractC5020l.smaato(c7091l6, c4346l);
                    boolean zAdmob7 = c6956l7.admob(interfaceC2262l);
                    Object objM2132native7 = c6956l7.m2132native();
                    if (zAdmob7 || objM2132native7 == c13863l) {
                        objM2132native7 = new C15299l(interfaceC2262l, 9);
                        c6956l7.m2147try(objM2132native7);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_hearts, z6, (Function1) objM2132native7, interfaceC17242lSmaato4, Integer.valueOf(R.string.settings_now_playing_hearts_desc), false, c6956l7, 0, 32);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 7:
                C7091l c7091l7 = (C7091l) obj;
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c6956l8.billing(c7091l7) ? 4 : 2;
                }
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    boolean z7 = ((C18554l) interfaceC12244l.getValue()).f36228l;
                    boolean zAdmob8 = c6956l8.admob(interfaceC2262l);
                    Object objM2132native8 = c6956l8.m2132native();
                    if (zAdmob8 || objM2132native8 == c13863l) {
                        objM2132native8 = new C15299l(interfaceC2262l, i2);
                        c6956l8.m2147try(objM2132native8);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_color_tining, z7, (Function1) objM2132native8, AbstractC5020l.smaato(c7091l7, c4346l), null, false, c6956l8, 0, 48);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case 8:
                C7091l c7091l8 = (C7091l) obj;
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c6956l9.billing(c7091l8) ? 4 : 2;
                }
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    boolean z8 = ((C18554l) interfaceC12244l.getValue()).f36225l;
                    boolean zAdmob9 = c6956l9.admob(interfaceC2262l);
                    Object objM2132native9 = c6956l9.m2132native();
                    if (zAdmob9 || objM2132native9 == c13863l) {
                        objM2132native9 = new C15299l(interfaceC2262l, 11);
                        c6956l9.m2147try(objM2132native9);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_full_screen_artwork, z8, (Function1) objM2132native9, AbstractC5020l.smaato(c7091l8, c4346l), null, false, c6956l9, 0, 48);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case 9:
                C7091l c7091l9 = (C7091l) obj;
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= c6956l10.billing(c7091l9) ? 4 : 2;
                }
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    boolean z9 = ((C18554l) interfaceC12244l.getValue()).f36226l;
                    boolean z10 = !((C18554l) interfaceC12244l.getValue()).f36225l;
                    InterfaceC17242l interfaceC17242lSmaato5 = AbstractC5020l.smaato(c7091l9, c4346l);
                    boolean zAdmob10 = c6956l10.admob(interfaceC2262l);
                    Object objM2132native10 = c6956l10.m2132native();
                    if (zAdmob10 || objM2132native10 == c13863l) {
                        objM2132native10 = new C15299l(interfaceC2262l, 13);
                        c6956l10.m2147try(objM2132native10);
                    }
                    this.f1626l.m4327public(R.string.st_np_round, z9, (Function1) objM2132native10, interfaceC17242lSmaato5, null, z10, c6956l10, 0, 16);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 10:
                C7091l c7091l10 = (C7091l) obj;
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= c6956l11.billing(c7091l10) ? 4 : 2;
                }
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    boolean z11 = ((C18554l) interfaceC12244l.getValue()).f36217l;
                    boolean z12 = !((C18554l) interfaceC12244l.getValue()).f36225l;
                    InterfaceC17242l interfaceC17242lSmaato6 = AbstractC5020l.smaato(c7091l10, c4346l);
                    boolean zAdmob11 = c6956l11.admob(interfaceC2262l);
                    Object objM2132native11 = c6956l11.m2132native();
                    if (zAdmob11 || objM2132native11 == c13863l) {
                        objM2132native11 = new C15299l(interfaceC2262l, 6);
                        c6956l11.m2147try(objM2132native11);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_artwork_hide_border, z11, (Function1) objM2132native11, interfaceC17242lSmaato6, null, z12, c6956l11, 0, 16);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 11:
                C7091l c7091l11 = (C7091l) obj;
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= c6956l12.billing(c7091l11) ? 4 : 2;
                }
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    boolean z13 = ((C18554l) interfaceC12244l.getValue()).f36223l;
                    boolean zAdmob12 = c6956l12.admob(interfaceC2262l);
                    Object objM2132native12 = c6956l12.m2132native();
                    if (zAdmob12 || objM2132native12 == c13863l) {
                        objM2132native12 = new C15299l(interfaceC2262l, 8);
                        c6956l12.m2147try(objM2132native12);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_hide_dislikes, z13, (Function1) objM2132native12, AbstractC5020l.smaato(c7091l11, c4346l), null, false, c6956l12, 0, 48);
                } else {
                    c6956l12.m2124else();
                }
                break;
            default:
                C7091l c7091l12 = (C7091l) obj;
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= c6956l13.billing(c7091l12) ? 4 : 2;
                }
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    boolean z14 = ((C18554l) interfaceC12244l.getValue()).f36221l;
                    boolean zAdmob13 = c6956l13.admob(interfaceC2262l);
                    Object objM2132native13 = c6956l13.m2132native();
                    if (zAdmob13 || objM2132native13 == c13863l) {
                        objM2132native13 = new C15299l(interfaceC2262l, 14);
                        c6956l13.m2147try(objM2132native13);
                    }
                    this.f1626l.m4327public(R.string.settings_now_playing_volume_bar, z14, (Function1) objM2132native13, AbstractC5020l.smaato(c7091l12, c4346l), null, false, c6956l13, 0, 48);
                } else {
                    c6956l13.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
