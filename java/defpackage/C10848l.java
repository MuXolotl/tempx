package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10848l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f21909l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21910l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21911l;

    public /* synthetic */ C10848l(ArrayList arrayList, C6659l c6659l, C6659l c6659l2) {
        this.f21911l = 6;
        this.f21910l = arrayList;
        this.f21909l = c6659l2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        InterfaceC8714l interfaceC8714l;
        InterfaceC8714l interfaceC8714l2;
        C6956l c6956l;
        boolean z;
        C6956l c6956l2;
        C6956l c6956l3;
        int i = this.f21911l;
        C13863l c13863l = C1867l.yandex;
        String str = null;
        C9946l c9946l = AbstractC16837l.yandex;
        C4346l c4346l = C4346l.f8873l;
        int i2 = 3;
        int i3 = 1;
        Object obj4 = this.f21909l;
        Object obj5 = this.f21910l;
        switch (i) {
            case 0:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj5;
                C9365l c9365l = (C9365l) obj4;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC15011l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l4.isPro(c10707l)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(471757084, new C0634l(c9365l, i3), c6956l4), null, null, 0.0f, 0.0f, ((C15700l) c6956l4.isPro(AbstractC18678l.yandex)).purchase(c6956l4), AbstractC0831l.amazon(((C14370l) c6956l4.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l4.isPro(c10707l)).yandex.ads, 0L, c6956l4, 28), interfaceC3102l, c6956l4, 3078, 244);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C15184l c15184l = (C15184l) obj5;
                C3312l c3312l = (C3312l) obj4;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c6956l5.m2125final(-534706435);
                    Object objIsPro = c6956l5.isPro(AbstractC9404l.crashlytics);
                    if (objIsPro == null) {
                        C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.libvkx.proto.appwidget.VkxSmallPlayerWidgetState");
                        return null;
                    }
                    C3259l c3259l = (C3259l) objIsPro;
                    String str2 = c3259l.f6980l;
                    c6956l5.startapp(false);
                    Context context = (Context) c6956l5.isPro(AbstractC9404l.loadAd);
                    boolean zBilling = c6956l5.billing(str2);
                    Object objM2132native = c6956l5.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        obj3 = objM2132native;
                        C10086l c10086lSmaato = AbstractC8020l.smaato(null);
                        c6956l5.m2147try(c10086lSmaato);
                        obj3 = c10086lSmaato;
                    }
                    InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) obj3;
                    boolean zBilling2 = c6956l5.billing(str2);
                    Object objM2132native2 = c6956l5.m2132native();
                    Object obj6 = objM2132native2;
                    if (zBilling2 || objM2132native2 == c13863l) {
                        C10086l c10086lSmaato2 = AbstractC8020l.smaato(null);
                        c6956l5.m2147try(c10086lSmaato2);
                        obj6 = c10086lSmaato2;
                    }
                    InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) obj6;
                    boolean zBilling3 = c6956l5.billing(str2);
                    Object objM2132native3 = c6956l5.m2132native();
                    Object obj7 = objM2132native3;
                    if (zBilling3 || objM2132native3 == c13863l) {
                        C10086l c10086lSmaato3 = AbstractC8020l.smaato(new C9735l(C9735l.loadAd));
                        c6956l5.m2147try(c10086lSmaato3);
                        obj7 = c10086lSmaato3;
                    }
                    InterfaceC8714l interfaceC8714l5 = (InterfaceC8714l) obj7;
                    boolean zBilling4 = c6956l5.billing(str2);
                    Object objM2132native4 = c6956l5.m2132native();
                    Object obj8 = objM2132native4;
                    if (zBilling4 || objM2132native4 == c13863l) {
                        C10086l c10086lSmaato4 = AbstractC8020l.smaato(new C9735l(C9735l.purchase));
                        c6956l5.m2147try(c10086lSmaato4);
                        obj8 = c10086lSmaato4;
                    }
                    InterfaceC8714l interfaceC8714l6 = (InterfaceC8714l) obj8;
                    boolean zAdmob = c6956l5.admob(c3259l) | c6956l5.admob(context) | c6956l5.billing(interfaceC8714l3) | c6956l5.billing(interfaceC8714l4);
                    Object objM2132native5 = c6956l5.m2132native();
                    if (zAdmob || objM2132native5 == c13863l) {
                        C1914l c1914l = new C1914l(c3259l, context, interfaceC8714l3, interfaceC8714l4, (InterfaceC14029l) null, 8);
                        interfaceC8714l = interfaceC8714l3;
                        c6956l5.m2147try(c1914l);
                        objM2132native5 = c1914l;
                    } else {
                        interfaceC8714l = interfaceC8714l3;
                    }
                    AbstractC12311l.amazon(c6956l5, str2, (Function2) objM2132native5);
                    Bitmap bitmap = (Bitmap) interfaceC8714l4.getValue();
                    EnumC3503l enumC3503l = c3259l.f6983l;
                    boolean zBilling5 = c6956l5.billing(interfaceC8714l6) | c6956l5.admob(c3259l) | c6956l5.billing(interfaceC8714l4) | c6956l5.billing(interfaceC8714l5);
                    Object objM2132native6 = c6956l5.m2132native();
                    if (zBilling5 || objM2132native6 == c13863l) {
                        interfaceC8714l2 = interfaceC8714l6;
                        C0469l c0469l = new C0469l(c3259l, interfaceC8714l2, interfaceC8714l4, interfaceC8714l5, null, 13);
                        interfaceC8714l4 = interfaceC8714l4;
                        c6956l5.m2147try(c0469l);
                        objM2132native6 = c0469l;
                    } else {
                        interfaceC8714l2 = interfaceC8714l6;
                    }
                    AbstractC12311l.purchase(bitmap, enumC3503l, (Function2) objM2132native6, c6956l5);
                    AbstractC16759l.yandex(null, AbstractC14566l.amazon(-618975018, new C12596l(c3259l, c15184l, c3312l, interfaceC8714l, interfaceC8714l5, interfaceC8714l4, interfaceC8714l2, 0), c6956l5), c6956l5, 48);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((C0471l) obj5).m565import((String) obj4, (C6956l) obj, AbstractC0545l.purchase(7));
                return Unit.INSTANCE;
            case 3:
                C10530l c10530l = (C10530l) obj5;
                C15050l c15050l = (C15050l) obj4;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if ((c10530l.f21424l instanceof C11538l) && c10530l.f21425l == c15050l.yandex) {
                        c6956l6.m2123default(1409446971);
                        z = false;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check_circle_16, 0, c6956l6), null, null, 0L, c6956l6, 56, 12);
                        c6956l = c6956l6;
                    } else {
                        c6956l = c6956l6;
                        z = false;
                        c6956l.m2123default(1401721864);
                    }
                    c6956l.startapp(z);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj5;
                C9455l c9455l = (C9455l) obj4;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C17253l c17253l2 = AbstractC0831l.yandex;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC4447l.crashlytics, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l7.isPro(c10707l2)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-775501753, new C4293l(c9455l, i2, false ? (byte) 1 : (byte) 0), c6956l7), null, null, 0.0f, 0.0f, null, AbstractC0831l.amazon(((C14370l) c6956l7.isPro(c10707l2)).yandex.startapp, ((C14370l) c6956l7.isPro(c10707l2)).yandex.ads, 0L, c6956l7, 28), interfaceC3102l2, c6956l7, 3078, 500);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC16358l.yandex((C1812l) obj5, (Function1) obj4, (C6956l) obj, AbstractC0545l.purchase(9));
                return Unit.INSTANCE;
            case 6:
                ArrayList arrayList = (ArrayList) obj5;
                C6659l c6659l = (C6659l) obj4;
                InterfaceC11343l interfaceC11343l = (InterfaceC11343l) obj;
                DynamicMutableRealmObject dynamicMutableRealmObject = (DynamicMutableRealmObject) obj2;
                C2336l c2336l = AbstractC18202l.yandex;
                if (((Boolean) interfaceC11343l.smaato(c2336l.loadAd(Boolean.class), "isPlaylist")).booleanValue()) {
                    arrayList.add(interfaceC11343l);
                    if (dynamicMutableRealmObject != null) {
                        AbstractC15960l.crashlytics(dynamicMutableRealmObject).amazon();
                    }
                } else {
                    if (dynamicMutableRealmObject != null) {
                        long jLongValue = ((Number) interfaceC11343l.smaato(c2336l.loadAd(Long.class), "id")).longValue();
                        long jLongValue2 = ((Number) interfaceC11343l.smaato(c2336l.loadAd(Long.class), "ownerId")).longValue();
                        String str3 = (String) interfaceC11343l.tapsense(c2336l.loadAd(String.class), "title");
                        if (str3 == null) {
                            str3 = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(jLongValue2);
                        sb.append('_');
                        sb.append(jLongValue);
                        String string = sb.toString();
                        dynamicMutableRealmObject.admob(string, "uid");
                        dynamicMutableRealmObject.admob(Long.valueOf(jLongValue), "id");
                        dynamicMutableRealmObject.admob(Long.valueOf(jLongValue2), "ownerId");
                        dynamicMutableRealmObject.admob(interfaceC11343l.tapsense(c2336l.loadAd(String.class), "accessKey"), "accessKey");
                        dynamicMutableRealmObject.admob(str3, "title");
                        dynamicMutableRealmObject.admob(str3.toLowerCase(Locale.ROOT), "localizedSearchTitle");
                        dynamicMutableRealmObject.admob(C7085l.yandex(interfaceC11343l), "thumb");
                        str = string;
                    }
                    if (c6659l.m2063l("CachedAlbum", "uid == $0", str).purchase().yandex() != null && dynamicMutableRealmObject != null) {
                        AbstractC15960l.crashlytics(dynamicMutableRealmObject).amazon();
                    }
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC3102l interfaceC3102l3 = (InterfaceC3102l) obj5;
                C1253l c1253l = (C1253l) obj4;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l8, 0);
                    long j = c6956l8.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l8.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l8, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l8.m2140super();
                    if (c6956l8.f14603switch) {
                        c6956l8.firebase(c16395l);
                    } else {
                        c6956l8.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l8, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l8, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l8, C3438l.firebase);
                    AbstractC8182l.billing(c6956l8, interfaceC17242lBilling, C3438l.amazon);
                    C17253l c17253l3 = AbstractC0831l.yandex;
                    AbstractC18079l.loadAd(AbstractC15235l.yandex, AbstractC4927l.amazon(c4346l, AbstractC13106l.purchase(c6956l8).startapp, c9946l), AbstractC15235l.loadAd, AbstractC14566l.amazon(-893026331, new C12856l(c1253l), c6956l8), null, null, 0.0f, 0.0f, ((C15700l) c6956l8.isPro(AbstractC18678l.yandex)).purchase(c6956l8), AbstractC0831l.amazon(AbstractC13106l.purchase(c6956l8).startapp, AbstractC13106l.purchase(c6956l8).ads, 0L, c6956l8, 28), interfaceC3102l3, c6956l8, 3462, 240);
                    InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon(c1253l.f3284l, c6956l8, 0);
                    long j2 = AbstractC13106l.purchase(c6956l8).startapp;
                    long j3 = AbstractC13106l.purchase(c6956l8).ads;
                    C6763l c6763l = AbstractC5341l.crashlytics;
                    long jRemoteconfig = AbstractC12953l.remoteconfig(j2, j3, c6763l.yandex(interfaceC3102l3.yandex().yandex()));
                    long jRemoteconfig2 = AbstractC12953l.remoteconfig(AbstractC13106l.purchase(c6956l8).ads, AbstractC13106l.purchase(c6956l8).startapp, c6763l.yandex(interfaceC3102l3.yandex().yandex()));
                    String str4 = (String) interfaceC8714lAmazon.getValue();
                    boolean zAdmob2 = c6956l8.admob(c1253l);
                    Object objM2132native7 = c6956l8.m2132native();
                    if (zAdmob2 || objM2132native7 == c13863l) {
                        objM2132native7 = new C7776l(c1253l, i3);
                        c6956l8.m2147try(objM2132native7);
                    }
                    AbstractC10704l.purchase(str4, (Function1) objM2132native7, null, AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC0080l.amazon(AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC4927l.amazon(c4346l, jRemoteconfig, c9946l), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), AbstractC13106l.billing(c6956l8).crashlytics), jRemoteconfig2, c9946l), null, AbstractC15235l.amazon, AbstractC15235l.purchase, AbstractC14566l.amazon(1681394188, new C10848l(c1253l, interfaceC8714lAmazon, 8), c6956l8), null, null, c6956l8, 14352384, 788);
                    c6956l8.startapp(true);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C1253l c1253l2 = (C1253l) obj5;
                InterfaceC8714l interfaceC8714l7 = (InterfaceC8714l) obj4;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    if (((String) interfaceC8714l7.getValue()).length() > 0) {
                        c6956l9.m2123default(-1789258181);
                        AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_cancel_outline_28, 0, c6956l9);
                        InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 20.0f);
                        boolean zAdmob3 = c6956l9.admob(c1253l2);
                        Object objM2132native8 = c6956l9.m2132native();
                        if (zAdmob3 || objM2132native8 == c13863l) {
                            objM2132native8 = new C10740l(24, c1253l2);
                            c6956l9.m2147try(objM2132native8);
                        }
                        AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC9151l.loadAd(interfaceC17242lIsPro, false, null, (Function0) objM2132native8, 15), 0L, c6956l9, 56, 8);
                        c6956l2 = c6956l9;
                    } else {
                        c6956l2 = c6956l9;
                        c6956l2.m2123default(-1800255338);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC3102l interfaceC3102l4 = (InterfaceC3102l) obj5;
                C0939l c0939l = (C0939l) obj4;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    C17253l c17253l4 = AbstractC0831l.yandex;
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC5518l.admob, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l10.isPro(c10707l3)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(1982740300, new C15328l(c0939l, i3, false ? (byte) 1 : (byte) 0), c6956l10), null, null, 0.0f, 0.0f, null, AbstractC0831l.amazon(((C14370l) c6956l10.isPro(c10707l3)).yandex.startapp, ((C14370l) c6956l10.isPro(c10707l3)).yandex.ads, 0L, c6956l10, 28), interfaceC3102l4, c6956l10, 3078, 500);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C15578l c15578l = (C15578l) obj5;
                C3518l c3518l = (C3518l) obj4;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c15578l.invoke(c3518l, c6956l11, 6);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((C7883l) obj5).pro((C3416l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((C7883l) obj5).signatures((InterfaceC0038l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((C7883l) obj5).premium((C12282l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ((C7883l) obj5).advert((C16464l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((C7883l) obj5).ad((C18578l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 16:
                C13250l c13250l = (C13250l) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = c13250l.f26029l;
                c13250l.f26029l = ((InterfaceC1555l) obj4).yandex(fFloatValue - f) + f;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Integer) obj2).getClass();
                ((C11446l) obj5).firebase((EnumC10474l) obj4, (C6956l) obj, AbstractC0545l.purchase(49));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC3102l interfaceC3102l5 = (InterfaceC3102l) obj5;
                C12457l c12457l = (C12457l) obj4;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    C17253l c17253l5 = AbstractC0831l.yandex;
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC13359l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l12.isPro(c10707l4)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(895315652, new C16577l(c12457l), c6956l12), null, null, 0.0f, 0.0f, ((C15700l) c6956l12.isPro(AbstractC18678l.yandex)).purchase(c6956l12), AbstractC0831l.amazon(((C14370l) c6956l12.isPro(c10707l4)).yandex.startapp, ((C14370l) c6956l12.isPro(c10707l4)).yandex.ads, 0L, c6956l12, 28), interfaceC3102l5, c6956l12, 3078, 244);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((Integer) obj2).getClass();
                ((C0956l) obj5).yandex((InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(7));
                return Unit.INSTANCE;
            case 20:
                InterfaceC3102l interfaceC3102l6 = (InterfaceC3102l) obj5;
                C9169l c9169l = (C9169l) obj4;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    C17253l c17253l6 = AbstractC0831l.yandex;
                    C10707l c10707l5 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC7822l.f16346l, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l13.isPro(c10707l5)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(1497649910, new C10132l(c9169l), c6956l13), null, null, 0.0f, 0.0f, ((C15700l) c6956l13.isPro(AbstractC18678l.yandex)).purchase(c6956l13), AbstractC0831l.amazon(((C14370l) c6956l13.isPro(c10707l5)).yandex.startapp, ((C14370l) c6956l13.isPro(c10707l5)).yandex.ads, 0L, c6956l13, 28), interfaceC3102l6, c6956l13, 3078, 244);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 21:
                C0130l c0130l = (C0130l) obj5;
                C9894l c9894l = (C9894l) obj4;
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!c6956l14.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    c6956l14.m2124else();
                } else if (c0130l.f1033l) {
                    c6956l14.m2123default(-1754444169);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l14, R.string.themes_category_monet), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 0, 0, 262142);
                    c6956l14.startapp(false);
                } else {
                    if (c9894l != null) {
                        c6956l14.m2123default(-1754273173);
                        AbstractC13010l.loadAd(c9894l.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l14, 0, 0, 262142);
                    } else {
                        c6956l14.m2123default(-1759451909);
                    }
                    c6956l14.startapp(false);
                }
                return Unit.INSTANCE;
            case 22:
                C17310l c17310l = (C17310l) obj5;
                String str5 = (String) obj4;
                C6956l c6956l15 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c6956l15.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    if (AbstractC8576l.yandex((String) c17310l.crashlytics.getValue(), str5)) {
                        c6956l15.m2123default(-1727718709);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l15), null, null, 0L, c6956l15, 56, 12);
                        c6956l3 = c6956l15;
                    } else {
                        c6956l3 = c6956l15;
                        c6956l3.m2123default(-1732241857);
                    }
                    c6956l3.startapp(false);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC3102l interfaceC3102l7 = (InterfaceC3102l) obj5;
                AbstractC14968l abstractC14968l = (AbstractC14968l) obj4;
                C6956l c6956l16 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l16.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    C17253l c17253l7 = AbstractC0831l.yandex;
                    C10707l c10707l6 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC14566l.amazon(-182351473, new C16683l(abstractC14968l, false ? 1 : 0), c6956l16), AbstractC4927l.amazon(c4346l, ((C14370l) c6956l16.isPro(c10707l6)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(1001266092, new C16683l(abstractC14968l, i3), c6956l16), null, null, 0.0f, 0.0f, ((C15700l) c6956l16.isPro(AbstractC18678l.yandex)).purchase(c6956l16), AbstractC0831l.amazon(((C14370l) c6956l16.isPro(c10707l6)).yandex.startapp, ((C14370l) c6956l16.isPro(c10707l6)).yandex.ads, 0L, c6956l16, 28), interfaceC3102l7, c6956l16, 3078, 244);
                } else {
                    c6956l16.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C14718l c14718l = (C14718l) obj5;
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj4;
                C6956l c6956l17 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c6956l17.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC13010l.loadAd(c14718l.amazon, interfaceC17242l, 0L, 0L, null, null, null, 0L, new C10258l(3), 0L, 2, false, 1, 0, null, c6956l17, 0, 24960, 240636);
                } else {
                    c6956l17.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj2).getClass();
                ((C9583l) obj5).ad((C6922l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                AbstractC8882l.yandex((InterfaceC17242l) obj5, (Function2) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6111l c6111l = (C6111l) obj5;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj4;
                C6956l c6956l18 = (C6956l) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c6956l18.m2127for(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    c6111l.m1952this(AbstractC11999l.purchase(c6956l18, R.string.fake_catalog_playlists), ((AbstractC7095l) ((InterfaceC13238l) interfaceC12244l.getValue())).pro(), null, null, c6956l18, 0);
                } else {
                    c6956l18.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((C6111l) obj5).m1940const((CachedTrack) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C6111l) obj5).m1948l((Function0) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C10848l(Object obj, Object obj2, int i, int i2) {
        this.f21911l = i2;
        this.f21910l = obj;
        this.f21909l = obj2;
    }

    public /* synthetic */ C10848l(Object obj, Object obj2, int i) {
        this.f21911l = i;
        this.f21910l = obj;
        this.f21909l = obj2;
    }
}
