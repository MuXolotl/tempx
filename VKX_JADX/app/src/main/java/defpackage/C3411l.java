package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٕؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3411l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f7269l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7270l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7271l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f7272l;

    public /* synthetic */ C3411l(Object obj, Object obj2, Object obj3, int i) {
        this.f7271l = i;
        this.f7270l = obj;
        this.f7269l = obj2;
        this.f7272l = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer numValueOf;
        int iYandex;
        int i = this.f7271l;
        C9946l c9946l = AbstractC16837l.yandex;
        int i2 = 25;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        int i3 = 2;
        int i4 = 1;
        Object obj3 = this.f7272l;
        Object obj4 = this.f7269l;
        Object obj5 = this.f7270l;
        switch (i) {
            case 0:
                C13250l c13250l = (C13250l) obj5;
                C4154l c4154l = (C4154l) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jSubs = c4154l.subs(c4154l.purchase(fFloatValue - c13250l.f26029l));
                C4154l c4154l2 = ((C15222l) obj3).yandex;
                c13250l.f26029l += c4154l.purchase(c4154l.admob(c4154l2.amazon(c4154l2.firebase, jSubs, 1)));
                return Unit.INSTANCE;
            case 1:
                Function2 function2 = (Function2) obj5;
                C15578l c15578l = (C15578l) obj4;
                InterfaceC17807l interfaceC17807l = (InterfaceC17807l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM2132native = c6956l.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = AbstractC12311l.isPro(c6956l);
                        c6956l.m2147try(objM2132native);
                    }
                    InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
                    Object objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = new C7234l(interfaceC2262l, interfaceC17807l);
                        c6956l.m2147try(objM2132native2);
                    }
                    C7234l c7234l = (C7234l) objM2132native2;
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC10409l.purchase(c4346l);
                    C15578l c15578lAmazon = AbstractC16164l.amazon(AbstractC14055l.remoteconfig(function2, c15578l));
                    Object objM2132native3 = c6956l.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = new C1855l(c7234l);
                        c6956l.m2147try(objM2132native3);
                    }
                    InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native3;
                    long j = c6956l.f14595continue;
                    int i5 = (int) ((j >>> 32) ^ j);
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPurchase);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC2812l.pro(0, c15578lAmazon, c6956l, true);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2991l.amazon((String) obj5, (String) obj4, (Function1) obj3, (C6956l) obj, AbstractC0545l.purchase(3127));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((C6111l) obj5).m1942implements((CachedPlaylist) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 4:
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj5;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj4;
                C6111l c6111l = (C6111l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.sort_horizontal_outline_28, 0, c6956l2);
                    String strPurchase = AbstractC11999l.purchase(c6956l2, ((EnumC17214l) interfaceC12244l.getValue()).f33417l);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, strPurchase, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, c6956l2, 8, 4);
                    boolean zBooleanValue = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                    Object objM2132native4 = c6956l2.m2132native();
                    if (objM2132native4 == c13863l) {
                        objM2132native4 = new C1528l(interfaceC8714l, 0);
                        c6956l2.m2147try(objM2132native4);
                    }
                    AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native4, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l2.isPro(c10707l)).yandex.ads, c9946l), 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(1328118206, new C15272l(c6111l, interfaceC8714l, interfaceC12244l, i4), c6956l2), c6956l2, 48, 2040);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                C10532l c10532l = (C10532l) obj5;
                Context context = (Context) obj4;
                C3445l c3445l = (C3445l) obj3;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c6956l3.m2125final(-534706435);
                    Object objIsPro = c6956l3.isPro(AbstractC9404l.crashlytics);
                    InterfaceC14029l interfaceC14029l = null;
                    if (objIsPro == null) {
                        C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.libvkx.proto.appwidget.VkxPlaylistsWidgetState");
                        return null;
                    }
                    C14690l c14690l = (C14690l) objIsPro;
                    c6956l3.startapp(false);
                    if (AbstractC13542l.yandex) {
                        c6956l3.m2123default(612289824);
                        C10707l c10707l2 = AbstractC9404l.loadAd;
                        if (((Context) c6956l3.isPro(c10707l2)).getResources().getResourceName(android.R.dimen.system_app_widget_inner_radius) != null) {
                            c6956l3.m2123default(612401982);
                            int dimensionPixelSize = ((Context) c6956l3.isPro(c10707l2)).getResources().getDimensionPixelSize(android.R.dimen.system_app_widget_inner_radius);
                            c6956l3.startapp(false);
                            numValueOf = Integer.valueOf(dimensionPixelSize);
                        } else {
                            c6956l3.m2123default(612527966);
                            c6956l3.startapp(false);
                            numValueOf = null;
                        }
                        c6956l3.startapp(false);
                    } else {
                        c6956l3.m2123default(612567398);
                        c6956l3.startapp(false);
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iYandex = numValueOf.intValue();
                    } else {
                        VKXApplication.Companion companion = VKXApplication.f36628l;
                        iYandex = VKXApplication.Companion.yandex(8.0f);
                    }
                    boolean zAdmob = c6956l3.admob(c10532l) | c6956l3.admob(context) | c6956l3.admob(c3445l);
                    Object objM2132native5 = c6956l3.m2132native();
                    if (zAdmob || objM2132native5 == c13863l) {
                        objM2132native5 = new C18605l(c10532l, context, c3445l, null);
                        c6956l3.m2147try(objM2132native5);
                    }
                    AbstractC12311l.amazon(c6956l3, c14690l, (Function2) objM2132native5);
                    C0884l c0884l = (C0884l) AbstractC16901l.m4217extends(c14690l.f28755l);
                    boolean zBilling = c6956l3.billing(c0884l != null ? c0884l.f2537l : null);
                    Object objM2132native6 = c6956l3.m2132native();
                    if (zBilling || objM2132native6 == c13863l) {
                        objM2132native6 = AbstractC8020l.smaato(null);
                        c6956l3.m2147try(objM2132native6);
                    }
                    InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native6;
                    boolean zBilling2 = c6956l3.billing(c0884l != null ? c0884l.f2537l : null);
                    Object objM2132native7 = c6956l3.m2132native();
                    if (zBilling2 || objM2132native7 == c13863l) {
                        objM2132native7 = AbstractC8020l.smaato(new C9735l(C9735l.loadAd));
                        c6956l3.m2147try(objM2132native7);
                    }
                    InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) objM2132native7;
                    Object c15184l = c0884l != null ? new C15184l(new Intent("android.intent.action.VIEW").setClass(context, AppActivity.class).setData(Uri.parse(c0884l.f2538l)).putExtra("vkx_autoplay", true), AbstractC1760l.loadAd((AbstractC1484l[]) Arrays.copyOf(new AbstractC1484l[0], 0))) : new C6154l(AbstractC1760l.loadAd((AbstractC1484l[]) Arrays.copyOf(new AbstractC1484l[0], 0)));
                    String str = c0884l != null ? c0884l.f2537l : null;
                    boolean zAdmob2 = c6956l3.admob(c0884l) | c6956l3.billing(interfaceC8714l2) | c6956l3.admob(context) | c6956l3.amazon(iYandex);
                    Object objM2132native8 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native8 == c13863l) {
                        C15417l c15417l = new C15417l(c0884l, context, iYandex, interfaceC8714l2, null, 5);
                        c6956l3.m2147try(c15417l);
                        objM2132native8 = c15417l;
                    }
                    AbstractC12311l.amazon(c6956l3, str, (Function2) objM2132native8);
                    Bitmap bitmap = (Bitmap) interfaceC8714l2.getValue();
                    boolean zBilling3 = c6956l3.billing(interfaceC8714l2) | c6956l3.billing(interfaceC8714l3);
                    Object objM2132native9 = c6956l3.m2132native();
                    if (zBilling3 || objM2132native9 == c13863l) {
                        objM2132native9 = new C17949l(interfaceC8714l2, interfaceC8714l3, interfaceC14029l, i2);
                        c6956l3.m2147try(objM2132native9);
                    }
                    AbstractC12311l.amazon(c6956l3, bitmap, (Function2) objM2132native9);
                    AbstractC16759l.yandex(null, AbstractC14566l.amazon(-1529875697, new C0843l(c15184l, interfaceC8714l3, interfaceC8714l2, c0884l, context, 6), c6956l3), c6956l3, 48);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) obj5;
                C0884l c0884l2 = (C0884l) obj4;
                Context context2 = (Context) obj3;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C14218l c14218lRemoteconfig = AbstractC17307l.remoteconfig(AbstractC13542l.loadAd);
                    AbstractC7370l.yandex(AbstractC5573l.billing(new C1491l(c14218lRemoteconfig, c14218lRemoteconfig, c14218lRemoteconfig, c14218lRemoteconfig)), AbstractC14566l.amazon(2139342007, new C15272l(interfaceC8714l4, c0884l2, context2, i3), c6956l4), c6956l4, 3072);
                    AbstractC3324l.yandex(new C6293l(C9735l.loadAd(0.75f, C9735l.purchase)), c6956l4, 0, 0);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC6363l.crashlytics((C15764l) obj5, (InterfaceC17242l) obj4, (C15578l) obj3, (C6956l) obj, AbstractC0545l.purchase(391));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ((C14089l) obj5).m3834import((C2729l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ((C14089l) obj5).m3833abstract((C15968l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC8265l.yandex((C0247l) obj5, (List) obj4, (Function1) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 11:
                Function4 function4 = (Function4) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                InterfaceC8714l interfaceC8714l5 = (InterfaceC8714l) obj3;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Boolean bool = (Boolean) interfaceC8714l5.getValue();
                    bool.booleanValue();
                    function4.invoke(arrayList, bool, c6956l5, 0);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                C17078l c17078l = (C17078l) obj5;
                C12217l c12217l = (C12217l) obj4;
                C15730l c15730l = (C15730l) obj;
                long jSubs2 = C1187l.subs(c17078l.f33243l, ((C1187l) obj2).yandex);
                c17078l.f33243l = jSubs2;
                c12217l.isVip(EnumC1826l.f4235l, C1187l.subs(((C17078l) obj3).f33243l, jSubs2));
                if (c12217l.Signature(c12217l.vip())) {
                    c15730l.yandex();
                    InterfaceC1234l interfaceC1234l = c12217l.firebase;
                    if (interfaceC1234l != null) {
                        ((C9421l) interfaceC1234l).yandex(9);
                    }
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC8714l interfaceC8714l6 = (InterfaceC8714l) obj5;
                InterfaceC8714l interfaceC8714l7 = (InterfaceC8714l) obj4;
                InterfaceC8714l interfaceC8714l8 = (InterfaceC8714l) obj3;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c6956l6.m2124else();
                } else if (((Boolean) interfaceC8714l7.getValue()).booleanValue()) {
                    c6956l6.m2123default(-914378048);
                    String str2 = (String) interfaceC8714l6.getValue();
                    boolean zBilling4 = c6956l6.billing(interfaceC8714l6);
                    Object objM2132native10 = c6956l6.m2132native();
                    if (zBilling4 || objM2132native10 == c13863l) {
                        objM2132native10 = new C17660l(interfaceC8714l6, 4);
                        c6956l6.m2147try(objM2132native10);
                    }
                    AbstractC2130l.amazon(str2, (Function1) objM2132native10, null, false, null, null, null, null, AbstractC11036l.admob, false, null, null, null, false, 0, 0, null, null, c6956l6, 0, 6, 8387580);
                    c6956l6.startapp(false);
                } else {
                    c6956l6.m2123default(-913940142);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l6, 6);
                    long j2 = c6956l6.f14595continue;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
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
                    AbstractC8182l.billing(c6956l6, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l6, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l6, C3438l.firebase);
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC9383l.yandex(AbstractC17551l.loadAd(AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l, 1.0f), 32.0f), c9946l), ((C12818l) interfaceC8714l8.getValue()).loadAd(), c9946l), 0.5f, C9735l.crashlytics, c9946l), c6956l6, 0);
                    C12818l c12818l = (C12818l) interfaceC8714l8.getValue();
                    InterfaceC17242l interfaceC17242lPurchase2 = AbstractC0080l.purchase(c4346l, 200.0f);
                    boolean zBilling5 = c6956l6.billing(interfaceC8714l8);
                    Object objM2132native11 = c6956l6.m2132native();
                    if (zBilling5 || objM2132native11 == c13863l) {
                        objM2132native11 = new C17660l(interfaceC8714l8, 5);
                        c6956l6.m2147try(objM2132native11);
                    }
                    C13645l c13645l = C12818l.purchase;
                    AbstractC14312l.yandex(interfaceC17242lPurchase2, c12818l, false, (Function1) objM2132native11, c6956l6, 390);
                    c6956l6.startapp(true);
                    c6956l6.startapp(false);
                }
                return Unit.INSTANCE;
            case 14:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) obj5;
                C0072l c0072l = (C0072l) obj4;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj3;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean z = ((C15343l) interfaceC12244l2.getValue()).f29989l;
                    boolean zAdmob3 = c6956l7.admob(interfaceC2262l2) | c6956l7.admob(c0072l);
                    Object objM2132native12 = c6956l7.m2132native();
                    if (zAdmob3 || objM2132native12 == c13863l) {
                        objM2132native12 = new C10207l(interfaceC2262l2, c0072l, i2);
                        c6956l7.m2147try(objM2132native12);
                    }
                    AbstractC2021l.yandex(z, (Function1) objM2132native12, null, false, null, c6956l7, 0, 124);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((C14823l) obj5).amazon((C6523l) obj4, (C15578l) obj3, (C6956l) obj, AbstractC0545l.purchase(433));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ((C5124l) obj5).m1693break((EnumC12334l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(49));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Function0 function0 = (Function0) obj5;
                C10178l c10178l = (C10178l) obj4;
                C10178l c10178l2 = (C10178l) obj3;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AbstractC17457l.mopub(function0, null, c10178l.loadAd().f12057l.length() > 0 && c10178l2.loadAd().f12057l.length() > 0, null, null, null, AbstractC4596l.yandex, c6956l8, 805306368, 506);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((Integer) obj2).getClass();
                AbstractC5781l.yandex((AudioStreamMix) obj5, (Function0) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC18296l.mopub((C0059l) obj5, (Function0) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C3411l(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f7271l = i2;
        this.f7270l = obj;
        this.f7269l = obj2;
        this.f7272l = obj3;
    }
}
