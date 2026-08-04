package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٌؘٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5699l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f12083l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f12084l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12085l;

    public /* synthetic */ C5699l(Function0 function0, boolean z) {
        this.f12085l = 0;
        this.f12084l = z;
        this.f12083l = function0;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C6956l c6956l;
        C1864l c1864l;
        List list;
        C13386l c13386l;
        C1864l c1864l2;
        C1864l c1864l3;
        int i = this.f12085l;
        final int i2 = 4;
        final int i3 = 3;
        final int i4 = 2;
        C13863l c13863l = C1867l.yandex;
        Object obj5 = this.f12083l;
        final int i5 = 0;
        final int i6 = 1;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6956l c6956l2 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                if (zBooleanValue) {
                    c6956l2.m2123default(-671413388);
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 40.0f);
                    C14855l c14855l = C18450l.f36026l;
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
                    long j = c6956l2.f14595continue;
                    int i7 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lIsPro);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i7);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                    InterfaceC17242l interfaceC17242lYandex = C16170l.yandex.yandex(AbstractC0080l.isPro(c4346l, 28.0f), C18450l.f36043l);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l, false);
                    long j2 = c6956l2.f14595continue;
                    int i8 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lYandex);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i8, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    AbstractC12491l.yandex(null, ((C9735l) c6956l2.isPro(AbstractC12502l.yandex)).yandex, 2.0f, 28.0f, c6956l2, 3456);
                    AbstractC12900l.ads(c6956l2, true, true, false);
                } else {
                    c6956l2.m2123default(-670983666);
                    boolean zBilling = c6956l2.billing(function0);
                    Object objM2132native = c6956l2.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        objM2132native = new C6199l(8, function0);
                        c6956l2.m2147try(objM2132native);
                    }
                    boolean z = this.f12084l;
                    AbstractC17824l.yandex(z, (Function1) objM2132native, null, AbstractC14566l.amazon(-568715036, new C4584l(z, 7), c6956l2), c6956l2, 3072, 4);
                    c6956l2.startapp(false);
                }
                return Unit.INSTANCE;
            case 1:
                final C8884l c8884l = (C8884l) obj5;
                EnumC8514l enumC8514l = c8884l.f18253l;
                C10086l c10086l = c8884l.f18250l;
                C10086l c10086l2 = c8884l.f18256l;
                C17584l c17584l = c8884l.f18255l;
                C6956l c6956l3 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                int iOrdinal = ((EnumC13824l) obj2).ordinal();
                String str = null;
                str = null;
                String str2 = null;
                str = null;
                if (iOrdinal == 0) {
                    c6956l3.m2123default(-918793612);
                    if (enumC8514l == null) {
                        c6956l3.m2123default(-918710997);
                        boolean zBilling2 = c6956l3.billing(c17584l);
                        Object objM2132native2 = c6956l3.m2132native();
                        if (zBilling2 || objM2132native2 == c13863l) {
                            objM2132native2 = (c17584l == null || (c1864l = c17584l.f34228l) == null || (list = c1864l.f4281l) == null || (c13386l = (C13386l) AbstractC16901l.m4231native(list)) == null) ? null : Integer.valueOf(c13386l.f26284l);
                            c6956l3.m2147try(objM2132native2);
                        }
                        Integer num = (Integer) objM2132native2;
                        C4964l c4964l = (C4964l) c10086l.getValue();
                        C0247l c0247l = (C0247l) c10086l2.getValue();
                        if (c17584l != null && (c1864l2 = c17584l.f34228l) != null) {
                            str = c1864l2.f4280l;
                        }
                        String str3 = str == null ? "" : str;
                        int iIntValue = num != null ? num.intValue() : 0;
                        boolean zAdmob = c6956l3.admob(c8884l);
                        Object objM2132native3 = c6956l3.m2132native();
                        if (zAdmob || objM2132native3 == c13863l) {
                            objM2132native3 = new Function0() { // from class: lؕۦۛ
                                /* JADX WARN: Code duplicated, block: B:25:0x007a  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String str4;
                                    String str5;
                                    int i9 = i3;
                                    EnumC13824l enumC13824l = EnumC13824l.f26964l;
                                    C8884l c8884l2 = c8884l;
                                    switch (i9) {
                                        case 0:
                                            c8884l2.f18250l.setValue(((C5185l) ((InterfaceC10807l) c8884l2.f18254l.getValue())).yandex);
                                            c8884l2.ad(enumC13824l);
                                            C1008l c1008l = c8884l2.f18252l;
                                            c1008l.getClass();
                                            c1008l.remoteconfig(null, "");
                                            break;
                                        case 1:
                                            Activity activity = c8884l2.f5081l;
                                            C17584l c17584l2 = c8884l2.f18255l;
                                            if (c17584l2 == null || (str5 = c17584l2.f34232l) == null) {
                                                str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                            } else {
                                                str4 = AbstractC12024l.m3315catch(str5) ? null : str5;
                                                if (str4 == null) {
                                                    str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                                }
                                            }
                                            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                                            break;
                                        case 2:
                                            c8884l2.purchase();
                                            break;
                                        case 3:
                                            c8884l2.ad(EnumC13824l.f26963l);
                                            break;
                                        case 4:
                                            c8884l2.ad(EnumC13824l.f26962l);
                                            break;
                                        case 5:
                                            AbstractC9033l.crashlytics((AppActivity) c8884l2.f5081l, new C4019l(c8884l2, null, 0));
                                            c8884l2.ad(EnumC13824l.f26966l);
                                            break;
                                        default:
                                            C1008l c1008l2 = c8884l2.f18252l;
                                            c1008l2.getClass();
                                            c1008l2.remoteconfig(null, "");
                                            C16287l.yandex.getClass();
                                            long jCrashlytics = C16287l.crashlytics();
                                            String strAmazon = C16287l.amazon();
                                            C7644l c7644l = VKXApplication.f36633l;
                                            c8884l2.f18250l.setValue(new C4964l(jCrashlytics, ((C4645l) (c7644l != null ? c7644l : null).f15735l).isPro, strAmazon));
                                            c8884l2.ad(enumC13824l);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l3.m2147try(objM2132native3);
                        }
                        Function0 function1 = (Function0) objM2132native3;
                        boolean zAdmob2 = c6956l3.admob(c8884l);
                        Object objM2132native4 = c6956l3.m2132native();
                        if (zAdmob2 || objM2132native4 == c13863l) {
                            objM2132native4 = new Function0() { // from class: lؕۦۛ
                                /* JADX WARN: Code duplicated, block: B:25:0x007a  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String str4;
                                    String str5;
                                    int i9 = i2;
                                    EnumC13824l enumC13824l = EnumC13824l.f26964l;
                                    C8884l c8884l2 = c8884l;
                                    switch (i9) {
                                        case 0:
                                            c8884l2.f18250l.setValue(((C5185l) ((InterfaceC10807l) c8884l2.f18254l.getValue())).yandex);
                                            c8884l2.ad(enumC13824l);
                                            C1008l c1008l = c8884l2.f18252l;
                                            c1008l.getClass();
                                            c1008l.remoteconfig(null, "");
                                            break;
                                        case 1:
                                            Activity activity = c8884l2.f5081l;
                                            C17584l c17584l2 = c8884l2.f18255l;
                                            if (c17584l2 == null || (str5 = c17584l2.f34232l) == null) {
                                                str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                            } else {
                                                str4 = AbstractC12024l.m3315catch(str5) ? null : str5;
                                                if (str4 == null) {
                                                    str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                                }
                                            }
                                            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                                            break;
                                        case 2:
                                            c8884l2.purchase();
                                            break;
                                        case 3:
                                            c8884l2.ad(EnumC13824l.f26963l);
                                            break;
                                        case 4:
                                            c8884l2.ad(EnumC13824l.f26962l);
                                            break;
                                        case 5:
                                            AbstractC9033l.crashlytics((AppActivity) c8884l2.f5081l, new C4019l(c8884l2, null, 0));
                                            c8884l2.ad(EnumC13824l.f26966l);
                                            break;
                                        default:
                                            C1008l c1008l2 = c8884l2.f18252l;
                                            c1008l2.getClass();
                                            c1008l2.remoteconfig(null, "");
                                            C16287l.yandex.getClass();
                                            long jCrashlytics = C16287l.crashlytics();
                                            String strAmazon = C16287l.amazon();
                                            C7644l c7644l = VKXApplication.f36633l;
                                            c8884l2.f18250l.setValue(new C4964l(jCrashlytics, ((C4645l) (c7644l != null ? c7644l : null).f15735l).isPro, strAmazon));
                                            c8884l2.ad(enumC13824l);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l3.m2147try(objM2132native4);
                        }
                        Function0 function2 = (Function0) objM2132native4;
                        boolean zAdmob3 = c6956l3.admob(c8884l);
                        Object objM2132native5 = c6956l3.m2132native();
                        if (zAdmob3 || objM2132native5 == c13863l) {
                            final int i9 = 5;
                            objM2132native5 = new Function0() { // from class: lؕۦۛ
                                /* JADX WARN: Code duplicated, block: B:25:0x007a  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String str4;
                                    String str5;
                                    int i10 = i9;
                                    EnumC13824l enumC13824l = EnumC13824l.f26964l;
                                    C8884l c8884l2 = c8884l;
                                    switch (i10) {
                                        case 0:
                                            c8884l2.f18250l.setValue(((C5185l) ((InterfaceC10807l) c8884l2.f18254l.getValue())).yandex);
                                            c8884l2.ad(enumC13824l);
                                            C1008l c1008l = c8884l2.f18252l;
                                            c1008l.getClass();
                                            c1008l.remoteconfig(null, "");
                                            break;
                                        case 1:
                                            Activity activity = c8884l2.f5081l;
                                            C17584l c17584l2 = c8884l2.f18255l;
                                            if (c17584l2 == null || (str5 = c17584l2.f34232l) == null) {
                                                str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                            } else {
                                                str4 = AbstractC12024l.m3315catch(str5) ? null : str5;
                                                if (str4 == null) {
                                                    str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                                }
                                            }
                                            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                                            break;
                                        case 2:
                                            c8884l2.purchase();
                                            break;
                                        case 3:
                                            c8884l2.ad(EnumC13824l.f26963l);
                                            break;
                                        case 4:
                                            c8884l2.ad(EnumC13824l.f26962l);
                                            break;
                                        case 5:
                                            AbstractC9033l.crashlytics((AppActivity) c8884l2.f5081l, new C4019l(c8884l2, null, 0));
                                            c8884l2.ad(EnumC13824l.f26966l);
                                            break;
                                        default:
                                            C1008l c1008l2 = c8884l2.f18252l;
                                            c1008l2.getClass();
                                            c1008l2.remoteconfig(null, "");
                                            C16287l.yandex.getClass();
                                            long jCrashlytics = C16287l.crashlytics();
                                            String strAmazon = C16287l.amazon();
                                            C7644l c7644l = VKXApplication.f36633l;
                                            c8884l2.f18250l.setValue(new C4964l(jCrashlytics, ((C4645l) (c7644l != null ? c7644l : null).f15735l).isPro, strAmazon));
                                            c8884l2.ad(enumC13824l);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l3.m2147try(objM2132native5);
                        }
                        AbstractC15918l.billing(c4964l, function1, function2, (Function0) objM2132native5, c0247l, str3, iIntValue, this.f12084l, c6956l3, 0);
                        c6956l = c6956l3;
                        c6956l.startapp(false);
                    } else {
                        c6956l = c6956l3;
                        c6956l.m2123default(-917526828);
                        boolean zAdmob4 = c6956l.admob(c8884l);
                        Object objM2132native6 = c6956l.m2132native();
                        if (zAdmob4 || objM2132native6 == c13863l) {
                            C10832l c10832l = new C10832l(0, c8884l, C8884l.class, "dismiss", "dismiss()V", 0, 0, 26);
                            c6956l.m2147try(c10832l);
                            objM2132native6 = c10832l;
                        }
                        AbstractC17860l.yandex((Function0) ((InterfaceC5059l) objM2132native6), enumC8514l, c6956l, 0);
                        c6956l.startapp(false);
                    }
                    c6956l.startapp(false);
                } else if (iOrdinal == 1) {
                    c6956l3.m2123default(-917141653);
                    List list2 = c17584l != null ? c17584l.f34229l : null;
                    if (list2 == null) {
                        c6956l3.m2123default(-917091527);
                        c6956l3.startapp(false);
                    } else {
                        c6956l3.m2123default(-917091526);
                        C0247l c0247l2 = (C0247l) c10086l2.getValue();
                        boolean zAdmob5 = c6956l3.admob(c8884l);
                        Object objM2132native7 = c6956l3.m2132native();
                        if (zAdmob5 || objM2132native7 == c13863l) {
                            objM2132native7 = new Function1() { // from class: lؙؒ٘
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    int i10 = i5;
                                    C8884l c8884l2 = c8884l;
                                    switch (i10) {
                                        case 0:
                                            c8884l2.f18256l.setValue((C0247l) obj6);
                                            c8884l2.ad(EnumC13824l.f26964l);
                                            break;
                                        default:
                                            C1008l c1008l = c8884l2.f18252l;
                                            c1008l.getClass();
                                            c1008l.remoteconfig(null, (String) obj6);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l3.m2147try(objM2132native7);
                        }
                        AbstractC8265l.yandex(c0247l2, list2, (Function1) objM2132native7, c6956l3, 0);
                        c6956l3.startapp(false);
                        Unit unit = Unit.INSTANCE;
                    }
                    c6956l3.startapp(false);
                } else if (iOrdinal == 2) {
                    c6956l3.m2123default(-916485321);
                    C4964l c4964l2 = (C4964l) c10086l.getValue();
                    InterfaceC10807l interfaceC10807l = (InterfaceC10807l) c8884l.f18254l.getValue();
                    boolean zAdmob6 = c6956l3.admob(c8884l);
                    Object objM2132native8 = c6956l3.m2132native();
                    if (zAdmob6 || objM2132native8 == c13863l) {
                        final int i10 = 6;
                        objM2132native8 = new Function0() { // from class: lؕۦۛ
                            /* JADX WARN: Code duplicated, block: B:25:0x007a  */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str4;
                                String str5;
                                int i11 = i10;
                                EnumC13824l enumC13824l = EnumC13824l.f26964l;
                                C8884l c8884l2 = c8884l;
                                switch (i11) {
                                    case 0:
                                        c8884l2.f18250l.setValue(((C5185l) ((InterfaceC10807l) c8884l2.f18254l.getValue())).yandex);
                                        c8884l2.ad(enumC13824l);
                                        C1008l c1008l = c8884l2.f18252l;
                                        c1008l.getClass();
                                        c1008l.remoteconfig(null, "");
                                        break;
                                    case 1:
                                        Activity activity = c8884l2.f5081l;
                                        C17584l c17584l2 = c8884l2.f18255l;
                                        if (c17584l2 == null || (str5 = c17584l2.f34232l) == null) {
                                            str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                        } else {
                                            str4 = AbstractC12024l.m3315catch(str5) ? null : str5;
                                            if (str4 == null) {
                                                str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                            }
                                        }
                                        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                                        break;
                                    case 2:
                                        c8884l2.purchase();
                                        break;
                                    case 3:
                                        c8884l2.ad(EnumC13824l.f26963l);
                                        break;
                                    case 4:
                                        c8884l2.ad(EnumC13824l.f26962l);
                                        break;
                                    case 5:
                                        AbstractC9033l.crashlytics((AppActivity) c8884l2.f5081l, new C4019l(c8884l2, null, 0));
                                        c8884l2.ad(EnumC13824l.f26966l);
                                        break;
                                    default:
                                        C1008l c1008l2 = c8884l2.f18252l;
                                        c1008l2.getClass();
                                        c1008l2.remoteconfig(null, "");
                                        C16287l.yandex.getClass();
                                        long jCrashlytics = C16287l.crashlytics();
                                        String strAmazon = C16287l.amazon();
                                        C7644l c7644l = VKXApplication.f36633l;
                                        c8884l2.f18250l.setValue(new C4964l(jCrashlytics, ((C4645l) (c7644l != null ? c7644l : null).f15735l).isPro, strAmazon));
                                        c8884l2.ad(enumC13824l);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native8);
                    }
                    Function0 function3 = (Function0) objM2132native8;
                    C1008l c1008l = c8884l.f18252l;
                    boolean zAdmob7 = c6956l3.admob(c8884l);
                    Object objM2132native9 = c6956l3.m2132native();
                    if (zAdmob7 || objM2132native9 == c13863l) {
                        objM2132native9 = new Function1() { // from class: lؙؒ٘
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i11 = i6;
                                C8884l c8884l2 = c8884l;
                                switch (i11) {
                                    case 0:
                                        c8884l2.f18256l.setValue((C0247l) obj6);
                                        c8884l2.ad(EnumC13824l.f26964l);
                                        break;
                                    default:
                                        C1008l c1008l2 = c8884l2.f18252l;
                                        c1008l2.getClass();
                                        c1008l2.remoteconfig(null, (String) obj6);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native9);
                    }
                    Function1 function4 = (Function1) objM2132native9;
                    boolean zAdmob8 = c6956l3.admob(c8884l);
                    Object objM2132native10 = c6956l3.m2132native();
                    if (zAdmob8 || objM2132native10 == c13863l) {
                        objM2132native10 = new Function0() { // from class: lؕۦۛ
                            /* JADX WARN: Code duplicated, block: B:25:0x007a  */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str4;
                                String str5;
                                int i11 = i5;
                                EnumC13824l enumC13824l = EnumC13824l.f26964l;
                                C8884l c8884l2 = c8884l;
                                switch (i11) {
                                    case 0:
                                        c8884l2.f18250l.setValue(((C5185l) ((InterfaceC10807l) c8884l2.f18254l.getValue())).yandex);
                                        c8884l2.ad(enumC13824l);
                                        C1008l c1008l2 = c8884l2.f18252l;
                                        c1008l2.getClass();
                                        c1008l2.remoteconfig(null, "");
                                        break;
                                    case 1:
                                        Activity activity = c8884l2.f5081l;
                                        C17584l c17584l2 = c8884l2.f18255l;
                                        if (c17584l2 == null || (str5 = c17584l2.f34232l) == null) {
                                            str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                        } else {
                                            str4 = AbstractC12024l.m3315catch(str5) ? null : str5;
                                            if (str4 == null) {
                                                str4 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                            }
                                        }
                                        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                                        break;
                                    case 2:
                                        c8884l2.purchase();
                                        break;
                                    case 3:
                                        c8884l2.ad(EnumC13824l.f26963l);
                                        break;
                                    case 4:
                                        c8884l2.ad(EnumC13824l.f26962l);
                                        break;
                                    case 5:
                                        AbstractC9033l.crashlytics((AppActivity) c8884l2.f5081l, new C4019l(c8884l2, null, 0));
                                        c8884l2.ad(EnumC13824l.f26966l);
                                        break;
                                    default:
                                        C1008l c1008l3 = c8884l2.f18252l;
                                        c1008l3.getClass();
                                        c1008l3.remoteconfig(null, "");
                                        C16287l.yandex.getClass();
                                        long jCrashlytics = C16287l.crashlytics();
                                        String strAmazon = C16287l.amazon();
                                        C7644l c7644l = VKXApplication.f36633l;
                                        c8884l2.f18250l.setValue(new C4964l(jCrashlytics, ((C4645l) (c7644l != null ? c7644l : null).f15735l).isPro, strAmazon));
                                        c8884l2.ad(enumC13824l);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native10);
                    }
                    AbstractC14205l.yandex(c4964l2, interfaceC10807l, function3, c1008l, function4, (Function0) objM2132native10, c6956l3, 0);
                    c6956l3.startapp(false);
                } else {
                    if (iOrdinal != 3) {
                        throw AbstractC12900l.billing(1771477558, c6956l3, false);
                    }
                    c6956l3.m2123default(-915485571);
                    if (c17584l != null && (c1864l3 = c17584l.f34228l) != null) {
                        str2 = c1864l3.f4280l;
                    }
                    String str4 = str2 != null ? str2 : "";
                    boolean z2 = ((C0247l) c10086l2.getValue()).f1240l;
                    boolean zAdmob9 = c6956l3.admob(c8884l);
                    Object objM2132native11 = c6956l3.m2132native();
                    if (zAdmob9 || objM2132native11 == c13863l) {
                        objM2132native11 = new Function0() { // from class: lؕۦۛ
                            /* JADX WARN: Code duplicated, block: B:25:0x007a  */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str5;
                                String str6;
                                int i11 = i6;
                                EnumC13824l enumC13824l = EnumC13824l.f26964l;
                                C8884l c8884l2 = c8884l;
                                switch (i11) {
                                    case 0:
                                        c8884l2.f18250l.setValue(((C5185l) ((InterfaceC10807l) c8884l2.f18254l.getValue())).yandex);
                                        c8884l2.ad(enumC13824l);
                                        C1008l c1008l2 = c8884l2.f18252l;
                                        c1008l2.getClass();
                                        c1008l2.remoteconfig(null, "");
                                        break;
                                    case 1:
                                        Activity activity = c8884l2.f5081l;
                                        C17584l c17584l2 = c8884l2.f18255l;
                                        if (c17584l2 == null || (str6 = c17584l2.f34232l) == null) {
                                            str5 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                        } else {
                                            str5 = AbstractC12024l.m3315catch(str6) ? null : str6;
                                            if (str5 == null) {
                                                str5 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                            }
                                        }
                                        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str5)));
                                        break;
                                    case 2:
                                        c8884l2.purchase();
                                        break;
                                    case 3:
                                        c8884l2.ad(EnumC13824l.f26963l);
                                        break;
                                    case 4:
                                        c8884l2.ad(EnumC13824l.f26962l);
                                        break;
                                    case 5:
                                        AbstractC9033l.crashlytics((AppActivity) c8884l2.f5081l, new C4019l(c8884l2, null, 0));
                                        c8884l2.ad(EnumC13824l.f26966l);
                                        break;
                                    default:
                                        C1008l c1008l3 = c8884l2.f18252l;
                                        c1008l3.getClass();
                                        c1008l3.remoteconfig(null, "");
                                        C16287l.yandex.getClass();
                                        long jCrashlytics = C16287l.crashlytics();
                                        String strAmazon = C16287l.amazon();
                                        C7644l c7644l = VKXApplication.f36633l;
                                        c8884l2.f18250l.setValue(new C4964l(jCrashlytics, ((C4645l) (c7644l != null ? c7644l : null).f15735l).isPro, strAmazon));
                                        c8884l2.ad(enumC13824l);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native11);
                    }
                    Function0 function5 = (Function0) objM2132native11;
                    boolean zAdmob10 = c6956l3.admob(c8884l);
                    Object objM2132native12 = c6956l3.m2132native();
                    if (zAdmob10 || objM2132native12 == c13863l) {
                        objM2132native12 = new Function0() { // from class: lؕۦۛ
                            /* JADX WARN: Code duplicated, block: B:25:0x007a  */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str5;
                                String str6;
                                int i11 = i4;
                                EnumC13824l enumC13824l = EnumC13824l.f26964l;
                                C8884l c8884l2 = c8884l;
                                switch (i11) {
                                    case 0:
                                        c8884l2.f18250l.setValue(((C5185l) ((InterfaceC10807l) c8884l2.f18254l.getValue())).yandex);
                                        c8884l2.ad(enumC13824l);
                                        C1008l c1008l2 = c8884l2.f18252l;
                                        c1008l2.getClass();
                                        c1008l2.remoteconfig(null, "");
                                        break;
                                    case 1:
                                        Activity activity = c8884l2.f5081l;
                                        C17584l c17584l2 = c8884l2.f18255l;
                                        if (c17584l2 == null || (str6 = c17584l2.f34232l) == null) {
                                            str5 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                        } else {
                                            str5 = AbstractC12024l.m3315catch(str6) ? null : str6;
                                            if (str5 == null) {
                                                str5 = new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset());
                                            }
                                        }
                                        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str5)));
                                        break;
                                    case 2:
                                        c8884l2.purchase();
                                        break;
                                    case 3:
                                        c8884l2.ad(EnumC13824l.f26963l);
                                        break;
                                    case 4:
                                        c8884l2.ad(EnumC13824l.f26962l);
                                        break;
                                    case 5:
                                        AbstractC9033l.crashlytics((AppActivity) c8884l2.f5081l, new C4019l(c8884l2, null, 0));
                                        c8884l2.ad(EnumC13824l.f26966l);
                                        break;
                                    default:
                                        C1008l c1008l3 = c8884l2.f18252l;
                                        c1008l3.getClass();
                                        c1008l3.remoteconfig(null, "");
                                        C16287l.yandex.getClass();
                                        long jCrashlytics = C16287l.crashlytics();
                                        String strAmazon = C16287l.amazon();
                                        C7644l c7644l = VKXApplication.f36633l;
                                        c8884l2.f18250l.setValue(new C4964l(jCrashlytics, ((C4645l) (c7644l != null ? c7644l : null).f15735l).isPro, strAmazon));
                                        c8884l2.ad(enumC13824l);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l3.m2147try(objM2132native12);
                    }
                    AbstractC16670l.yandex(str4, z2, function5, (Function0) objM2132native12, c6956l3, 0);
                    c6956l3.startapp(false);
                }
                return Unit.INSTANCE;
            default:
                C9135l c9135l = (C9135l) obj5;
                C6956l c6956l4 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                int iOrdinal2 = ((EnumC18546l) obj2).ordinal();
                if (iOrdinal2 != 0) {
                    boolean z3 = this.f12084l;
                    if (iOrdinal2 == 1) {
                        c6956l4.m2123default(-502886570);
                        C12097l c12097l = (C12097l) c9135l.f18783l.getValue();
                        boolean zAdmob11 = c6956l4.admob(c9135l);
                        Object objM2132native13 = c6956l4.m2132native();
                        if (zAdmob11 || objM2132native13 == c13863l) {
                            C5834l c5834l = new C5834l(0, c9135l, C9135l.class, "dismiss", "dismiss()V", 0, 0, 5);
                            c6956l4.m2147try(c5834l);
                            objM2132native13 = c5834l;
                        }
                        AbstractC12953l.isPro(c12097l, z3, (Function0) ((InterfaceC5059l) objM2132native13), c6956l4, 0);
                        c6956l4.startapp(false);
                    } else if (iOrdinal2 == 2) {
                        c6956l4.m2123default(-502590985);
                        boolean zAdmob12 = c6956l4.admob(c9135l);
                        Object objM2132native14 = c6956l4.m2132native();
                        if (zAdmob12 || objM2132native14 == c13863l) {
                            C5834l c5834l2 = new C5834l(0, c9135l, C9135l.class, "dispatchPermissionRequest", "dispatchPermissionRequest()V", 0, 0, 6);
                            c6956l4.m2147try(c5834l2);
                            objM2132native14 = c5834l2;
                        }
                        InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native14;
                        boolean zAdmob13 = c6956l4.admob(c9135l);
                        Object objM2132native15 = c6956l4.m2132native();
                        if (zAdmob13 || objM2132native15 == c13863l) {
                            C5834l c5834l3 = new C5834l(0, c9135l, C9135l.class, "dispatchInstall", "dispatchInstall()V", 0, 0, 7);
                            c6956l4.m2147try(c5834l3);
                            objM2132native15 = c5834l3;
                        }
                        AbstractC7370l.purchase(z3, (Function0) ((InterfaceC5059l) objM2132native15), (Function0) interfaceC5059l, c6956l4, 0);
                        c6956l4.startapp(false);
                    } else if (iOrdinal2 == 3) {
                        c6956l4.m2123default(-502276149);
                        AbstractC0136l.yandex(c6956l4, 0);
                        c6956l4.startapp(false);
                    } else {
                        if (iOrdinal2 != 4) {
                            throw AbstractC12900l.billing(-570421797, c6956l4, false);
                        }
                        c6956l4.m2123default(-502149018);
                        C8311l c8311l = (C8311l) c9135l.f18782l.getValue();
                        boolean z4 = !c9135l.f18785l.crashlytics;
                        boolean zAdmob14 = c6956l4.admob(c9135l);
                        Object objM2132native16 = c6956l4.m2132native();
                        if (zAdmob14 || objM2132native16 == c13863l) {
                            C5834l c5834l4 = new C5834l(0, c9135l, C9135l.class, "dispatchErrorRetry", "dispatchErrorRetry()V", 0, 0, 8);
                            c6956l4.m2147try(c5834l4);
                            objM2132native16 = c5834l4;
                        }
                        InterfaceC5059l interfaceC5059l2 = (InterfaceC5059l) objM2132native16;
                        boolean zAdmob15 = c6956l4.admob(c9135l);
                        Object objM2132native17 = c6956l4.m2132native();
                        if (zAdmob15 || objM2132native17 == c13863l) {
                            C5834l c5834l5 = new C5834l(0, c9135l, C9135l.class, "dismiss", "dismiss()V", 0, 0, 9);
                            c6956l4.m2147try(c5834l5);
                            objM2132native17 = c5834l5;
                        }
                        InterfaceC5059l interfaceC5059l3 = (InterfaceC5059l) objM2132native17;
                        boolean zAdmob16 = c6956l4.admob(c9135l);
                        Object objM2132native18 = c6956l4.m2132native();
                        if (zAdmob16 || objM2132native18 == c13863l) {
                            objM2132native18 = new C5834l(0, c9135l, C9135l.class, "openDirectLink", "openDirectLink()V", 0, 0, 10);
                            c6956l4.m2147try(objM2132native18);
                        }
                        InterfaceC5059l interfaceC5059l4 = (InterfaceC5059l) objM2132native18;
                        boolean zAdmob17 = c6956l4.admob(c9135l);
                        Object objM2132native19 = c6956l4.m2132native();
                        if (zAdmob17 || objM2132native19 == c13863l) {
                            C5834l c5834l6 = new C5834l(0, c9135l, C9135l.class, "copyErrorData", "copyErrorData()V", 0, 0, 2);
                            c6956l4.m2147try(c5834l6);
                            objM2132native19 = c5834l6;
                        }
                        AbstractC9843l.purchase(c8311l, z3, z4, (Function0) ((InterfaceC5059l) objM2132native19), (Function0) interfaceC5059l2, (Function0) interfaceC5059l3, (Function0) interfaceC5059l4, c6956l4, 0);
                        c6956l4.startapp(false);
                    }
                } else {
                    c6956l4.m2123default(-503181101);
                    C0059l c0059l = new C0059l(0, 14, C9135l.class, c9135l, "data", "getData()Lbruhcollective/itaysonlab/spark/objects/updates/SparkAppUpdate;");
                    boolean zAdmob18 = c6956l4.admob(c9135l);
                    Object objM2132native20 = c6956l4.m2132native();
                    if (zAdmob18 || objM2132native20 == c13863l) {
                        C5834l c5834l7 = new C5834l(0, c9135l, C9135l.class, "dismiss", "dismiss()V", 0, 0, 3);
                        c6956l4.m2147try(c5834l7);
                        objM2132native20 = c5834l7;
                    }
                    Function0 function6 = (Function0) ((InterfaceC5059l) objM2132native20);
                    boolean zAdmob19 = c6956l4.admob(c9135l);
                    Object objM2132native21 = c6956l4.m2132native();
                    if (zAdmob19 || objM2132native21 == c13863l) {
                        C5834l c5834l8 = new C5834l(0, c9135l, C9135l.class, "dispatchDownload", "dispatchDownload()V", 0, 0, 4);
                        c6956l4.m2147try(c5834l8);
                        objM2132native21 = c5834l8;
                    }
                    AbstractC18296l.mopub(c0059l, function6, (Function0) ((InterfaceC5059l) objM2132native21), c6956l4, 0);
                    c6956l4.startapp(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C5699l(AbstractC5097l abstractC5097l, boolean z, int i) {
        this.f12085l = i;
        this.f12083l = abstractC5097l;
        this.f12084l = z;
    }
}
