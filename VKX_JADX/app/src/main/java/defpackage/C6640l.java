package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* JADX INFO: renamed from: lؙٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6640l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f13896l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f13897l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13898l;

    public /* synthetic */ C6640l(Object obj, Object obj2, int i) {
        this.f13898l = i;
        this.f13897l = obj;
        this.f13896l = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l;
        C6956l c6956l2;
        C6956l c6956l3;
        int i;
        C6956l c6956l4;
        C6956l c6956l5;
        int i2 = this.f13898l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        Object obj3 = this.f13896l;
        Object obj4 = this.f13897l;
        boolean z = false;
        switch (i2) {
            case 0:
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l6.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C12752l c12752l = (C12752l) obj4;
                    EnumC0442l enumC0442l = (EnumC0442l) obj3;
                    Object objM2132native = c6956l6.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = AbstractC13273l.loadAd(c12752l.isVip(), enumC0442l.f1619l);
                        c6956l6.m2147try(objM2132native);
                    }
                    C12371l.yandex(AbstractC7041l.yandex((Drawable) objM2132native, c6956l6), AbstractC3605l.vip(AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex(8.0f)), 52.0f), 0.0f, 8.0f, 1), null, null, 0.0f, c6956l6, 56, 120);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C8195l c8195l = (C8195l) obj3;
                C12221l c12221l = (C12221l) obj4;
                if (c6956l7.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Map map = C12221l.f24278l;
                    boolean zYandex = AbstractC8576l.yandex((String) c12221l.f24279l.getValue(), c8195l.f17098l);
                    boolean zAdmob = c6956l7.admob(c12221l) | c6956l7.billing(c8195l);
                    Object objM2132native2 = c6956l7.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C1965l(c12221l, c8195l, 1);
                        c6956l7.m2147try(objM2132native2);
                    }
                    AbstractC0676l.yandex(zYandex, (Function0) objM2132native2, null, false, null, c6956l7, 0);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l8 = (C6956l) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6956l8.isVip()) {
                    c6956l8.m2124else();
                } else {
                    ((C15578l) obj4).invoke((C18625l) obj3, c6956l8, 0);
                }
                return Unit.INSTANCE;
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                AbstractC7317l abstractC7317l = (AbstractC7317l) obj4;
                if (abstractC7317l instanceof C9808l) {
                    abstractC7317l.yandex().loadAd = iIntValue3;
                    abstractC7317l.yandex().yandex = iIntValue4;
                    ((DedicatedCacheService) obj3).mopub().subs();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC11661l interfaceC11661l = (InterfaceC11661l) obj3;
                InterfaceC8371l interfaceC8371l = (InterfaceC8371l) obj2;
                if (AbstractC8576l.yandex((InterfaceC8371l) obj, (InterfaceC11661l) obj4) && AbstractC8576l.yandex(interfaceC8371l, interfaceC11661l)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                int iIntValue5 = ((Number) obj).intValue();
                int iIntValue6 = ((Number) obj2).intValue();
                AbstractC7317l abstractC7317l2 = (AbstractC7317l) obj4;
                if (abstractC7317l2 instanceof C9808l) {
                    abstractC7317l2.yandex().loadAd = iIntValue5;
                    abstractC7317l2.yandex().yandex = iIntValue6;
                    ((DownloaderService) obj3).mopub().subs();
                }
                return Unit.INSTANCE;
            case 6:
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C11359l c11359l = (C11359l) obj3;
                C17136l c17136l = (C17136l) obj4;
                if (c6956l9.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zAdmob2 = c6956l9.admob(c17136l) | c6956l9.admob(c11359l);
                    Object objM2132native3 = c6956l9.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C0340l(c17136l, c11359l, z, 17);
                        c6956l9.m2147try(objM2132native3);
                    }
                    AbstractC7470l.billing((Function0) objM2132native3, AbstractC3605l.vip(c4346l, 8.0f, 0.0f, 2), false, null, null, null, AbstractC5103l.crashlytics, c6956l9, 1572912, 60);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (c6956l10.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (((EnumC3503l) ((InterfaceC8714l) obj3).getValue()) == ((EnumC3503l) obj4)) {
                        c6956l10.m2123default(1278050485);
                        c6956l = c6956l10;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l10), null, null, 0L, c6956l, 56, 12);
                    } else {
                        c6956l = c6956l10;
                        c6956l.m2123default(1272165321);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                C15050l c15050l = (C15050l) obj4;
                if (c6956l11.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zAdmob3 = c6956l11.admob(c15050l);
                    InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj3;
                    Object objM2132native4 = c6956l11.m2132native();
                    if (zAdmob3 || objM2132native4 == c13863l) {
                        objM2132native4 = new C0340l(c15050l, interfaceC8714l, z, 24);
                        c6956l11.m2147try(objM2132native4);
                    }
                    AbstractC7470l.billing((Function0) objM2132native4, null, false, null, null, null, AbstractC4959l.vip, c6956l11, 1572864, 62);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (c6956l12.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    List crashlytics = ((Catalog2Block) obj4).getCrashlytics();
                    Catalog2Button catalog2Button = crashlytics != null ? (Catalog2Button) AbstractC16901l.m4217extends(crashlytics) : null;
                    if (catalog2Button == null) {
                        c6956l12.m2123default(-1750027135);
                    } else {
                        c6956l12.m2123default(-1750027134);
                        AbstractC9694l abstractC9694l = (AbstractC9694l) obj3;
                        List list = catalog2Button.subs;
                        if (list == null) {
                            list = C2580l.f5619l;
                        }
                        boolean zAdmob4 = c6956l12.admob(abstractC9694l);
                        Object objM2132native5 = c6956l12.m2132native();
                        if (zAdmob4 || objM2132native5 == c13863l) {
                            objM2132native5 = new C6238l(25, abstractC9694l);
                            c6956l12.m2147try(objM2132native5);
                        }
                        AbstractC17834l.yandex(list, (Function1) objM2132native5, c6956l12, 0);
                    }
                    c6956l12.startapp(false);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                C8195l c8195l2 = (C8195l) obj3;
                C13695l c13695l = (C13695l) obj4;
                if (c6956l13.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean z2 = c13695l.m3663abstract() == c8195l2.f17098l;
                    boolean zAdmob5 = c6956l13.admob(c13695l) | c6956l13.billing(c8195l2);
                    Object objM2132native6 = c6956l13.m2132native();
                    if (zAdmob5 || objM2132native6 == c13863l) {
                        objM2132native6 = new C7990l(c13695l, c8195l2, 1);
                        c6956l13.m2147try(objM2132native6);
                    }
                    AbstractC0676l.yandex(z2, (Function0) objM2132native6, null, false, null, c6956l13, 0);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                View view = (View) obj3;
                if (c6956l14.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    C18297l c18297l = (C18297l) obj4;
                    boolean zAdmob6 = c6956l14.admob(view);
                    Object objM2132native7 = c6956l14.m2132native();
                    if (zAdmob6 || objM2132native7 == c13863l) {
                        objM2132native7 = new C6238l(27, view);
                        c6956l14.m2147try(objM2132native7);
                    }
                    Function1 function1 = (Function1) objM2132native7;
                    boolean zAdmob7 = c6956l14.admob(view);
                    Object objM2132native8 = c6956l14.m2132native();
                    if (zAdmob7 || objM2132native8 == c13863l) {
                        objM2132native8 = new C8467l(6, view);
                        c6956l14.m2147try(objM2132native8);
                    }
                    InterfaceC17242l interfaceC17242lSubs = AbstractC14055l.subs(c18297l, null, function1, (Function0) objM2132native8, 19);
                    Object objM2132native9 = c6956l14.m2132native();
                    if (objM2132native9 == c13863l) {
                        objM2132native9 = C15152l.f29720l;
                        c6956l14.m2147try(objM2132native9);
                    }
                    AbstractC7470l.billing((Function0) objM2132native9, interfaceC17242lSubs, false, null, null, null, AbstractC7236l.crashlytics, c6956l14, 1572870, 60);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                C6956l c6956l15 = (C6956l) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (c6956l15.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    if (((C18554l) ((InterfaceC12244l) obj3).getValue()).f36227l == ((EnumC10468l) obj4)) {
                        c6956l15.m2123default(-1452769183);
                        c6956l2 = c6956l15;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                    } else {
                        c6956l2 = c6956l15;
                        c6956l2.m2123default(-1466659570);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                C6956l c6956l16 = (C6956l) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (c6956l16.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    if (((C18554l) obj4).f36229l == ((EnumC0972l) obj3)) {
                        c6956l16.m2123default(-797527721);
                        c6956l3 = c6956l16;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l3), null, null, 0L, c6956l3, 56, 12);
                    } else {
                        c6956l3 = c6956l16;
                        c6956l3.m2123default(-807263984);
                    }
                    c6956l3.startapp(false);
                } else {
                    c6956l16.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                C6956l c6956l17 = (C6956l) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                if (c6956l17.m2127for(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    C9197l c9197l = (C9197l) obj4;
                    C1682l c1682l = (C1682l) obj3;
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l17, 0);
                    long j = c6956l17.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l17.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l17, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l17.m2140super();
                    if (c6956l17.f14603switch) {
                        c6956l17.firebase(c16395l);
                    } else {
                        c6956l17.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l17, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l17, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l17, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l17, C3438l.firebase);
                    AbstractC8182l.billing(c6956l17, interfaceC17242lBilling, C3438l.amazon);
                    boolean zAdmob8 = c6956l17.admob(c9197l) | c6956l17.admob(c1682l);
                    Object objM2132native10 = c6956l17.m2132native();
                    if (zAdmob8 || objM2132native10 == c13863l) {
                        objM2132native10 = new C14888l(c9197l, c1682l, 0);
                        c6956l17.m2147try(objM2132native10);
                    }
                    AbstractC7470l.billing((Function0) objM2132native10, null, false, null, null, null, AbstractC11141l.mopub, c6956l17, 1572864, 62);
                    boolean zAdmob9 = c6956l17.admob(c9197l) | c6956l17.admob(c1682l);
                    Object objM2132native11 = c6956l17.m2132native();
                    if (zAdmob9 || objM2132native11 == c13863l) {
                        objM2132native11 = new C14888l(c9197l, c1682l, 1);
                        c6956l17.m2147try(objM2132native11);
                    }
                    AbstractC7470l.billing((Function0) objM2132native11, null, false, null, null, null, AbstractC11141l.admob, c6956l17, 1572864, 62);
                    c6956l17.startapp(true);
                } else {
                    c6956l17.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                C6956l c6956l18 = (C6956l) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                if (c6956l18.m2127for(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    C17284l c17284l = (C17284l) obj4;
                    C8643l c8643l = (C8643l) obj3;
                    String str = c8643l.loadAd;
                    InterfaceC18059l interfaceC18059l = c8643l.purchase;
                    if (interfaceC18059l instanceof C4574l) {
                        i = R.drawable.placeholder_album;
                    } else {
                        if (!(interfaceC18059l instanceof C1733l)) {
                            C18725l.billing();
                            return null;
                        }
                        i = R.drawable.placeholder_playlist;
                    }
                    c17284l.m4295instanceof(str, i, c6956l18, 0);
                } else {
                    c6956l18.m2124else();
                }
                return Unit.INSTANCE;
            case 16:
                C6956l c6956l19 = (C6956l) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                InterfaceC1234l interfaceC1234l = (InterfaceC1234l) obj3;
                if (c6956l19.m2127for(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    C18297l c18297l2 = (C18297l) obj4;
                    boolean zAdmob10 = c6956l19.admob(interfaceC1234l);
                    Object objM2132native12 = c6956l19.m2132native();
                    if (zAdmob10 || objM2132native12 == c13863l) {
                        objM2132native12 = new C7991l(interfaceC1234l, 1);
                        c6956l19.m2147try(objM2132native12);
                    }
                    Function1 function2 = (Function1) objM2132native12;
                    boolean zAdmob11 = c6956l19.admob(interfaceC1234l);
                    Object objM2132native13 = c6956l19.m2132native();
                    if (zAdmob11 || objM2132native13 == c13863l) {
                        objM2132native13 = new C11985l(interfaceC1234l, 1);
                        c6956l19.m2147try(objM2132native13);
                    }
                    InterfaceC17242l interfaceC17242lSubs2 = AbstractC14055l.subs(c18297l2, null, function2, (Function0) objM2132native13, 19);
                    Object objM2132native14 = c6956l19.m2132native();
                    if (objM2132native14 == c13863l) {
                        objM2132native14 = C15152l.f29737l;
                        c6956l19.m2147try(objM2132native14);
                    }
                    AbstractC7470l.billing((Function0) objM2132native14, interfaceC17242lSubs2, false, null, null, null, AbstractC3058l.crashlytics, c6956l19, 1572870, 60);
                } else {
                    c6956l19.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6956l c6956l20 = (C6956l) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (c6956l20.m2127for(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    if (((C8188l) obj4).f17085l >= ((C13888l) obj3).f27158l.admob()) {
                        c6956l20.m2123default(-1228314472);
                        AbstractC3274l.yandex(AbstractC0080l.isPro(c4346l, 8.0f), AbstractC7497l.yandex, ((C14370l) c6956l20.isPro(AbstractC16964l.yandex)).yandex.yandex, 0L, 0.0f, 0.0f, null, AbstractC17653l.amazon, c6956l20, 12582918, 120);
                        c6956l4 = c6956l20;
                    } else {
                        c6956l4 = c6956l20;
                        c6956l4.m2123default(-1234599753);
                    }
                    c6956l4.startapp(false);
                } else {
                    c6956l20.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6956l c6956l21 = (C6956l) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                EnumC14530l enumC14530l = (EnumC14530l) obj4;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj3;
                if (c6956l21.m2127for(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC8714l2.getValue()).booleanValue();
                    boolean zAmazon = c6956l21.amazon(enumC14530l.ordinal());
                    Object objM2132native15 = c6956l21.m2132native();
                    if (zAmazon || objM2132native15 == c13863l) {
                        objM2132native15 = new C15003l(enumC14530l, interfaceC8714l2);
                        c6956l21.m2147try(objM2132native15);
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) ((InterfaceC5059l) objM2132native15), null, false, null, c6956l21, 0, 124);
                } else {
                    c6956l21.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6956l c6956l22 = (C6956l) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (c6956l22.m2127for(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    if (((EnumC12334l) ((C5124l) obj4).f11156l.getValue()) == ((EnumC12334l) obj3)) {
                        c6956l22.m2123default(1742502094);
                        c6956l5 = c6956l22;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l5), null, null, 0L, c6956l5, 56, 12);
                    } else {
                        c6956l5 = c6956l22;
                        c6956l5.m2123default(1724690951);
                    }
                    c6956l5.startapp(false);
                } else {
                    c6956l22.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l23 = (C6956l) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (c6956l23.m2127for(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    AbstractC14165l abstractC14165l = (AbstractC14165l) obj3;
                    AbstractC7741l.purchase(((UmaArtist) obj4).amazon.crashlytics, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 48.0f), AbstractC7497l.yandex), abstractC14165l, abstractC14165l, C4176l.yandex, c6956l23, 36912, 6, 31712);
                } else {
                    c6956l23.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
