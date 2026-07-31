package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕۗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15881l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f31142l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f31143l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31144l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f31145l;

    public /* synthetic */ C15881l(Object obj, Object obj2, Object obj3, int i) {
        this.f31144l = i;
        this.f31143l = obj;
        this.f31142l = obj2;
        this.f31145l = obj3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Function0 function0;
        Object obj5;
        C6956l c6956l;
        boolean z;
        boolean z2;
        C6956l c6956l2;
        boolean z3;
        int i2 = this.f31144l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj6 = this.f31145l;
        Object obj7 = this.f31142l;
        Object obj8 = this.f31143l;
        switch (i2) {
            case 0:
                C14267l c14267l = (C14267l) obj8;
                C0483l c0483l = (C0483l) obj7;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj6;
                C6956l c6956l3 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                c0483l.amazon(c14267l.yandex, AbstractC14566l.amazon(209498476, new C16270l(c0483l, c14267l, 2), c6956l3), AbstractC14566l.amazon(-1198712275, new C6271l(c14267l, c0483l, interfaceC8714l, 1), c6956l3), AbstractC14566l.amazon(1688044270, new C16270l(c14267l, c0483l, 3), c6956l3), AbstractC14566l.amazon(425799238, new C11223l(c0483l, (C14632l) obj, (InterfaceC9085l) obj2, interfaceC8714l, 2), c6956l3), AbstractC14566l.amazon(-1128377232, new C6271l(c14267l, c0483l, interfaceC8714l, 0), c6956l3), AbstractC14566l.amazon(1758379313, new C6271l(c14267l, interfaceC8714l, c0483l), c6956l3), c6956l3, 1797552);
                return Unit.INSTANCE;
            case 1:
                final Function2 function2 = (Function2) obj7;
                final Function2 function3 = (Function2) obj6;
                int iIntValue = ((Integer) obj2).intValue();
                C6956l c6956l4 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                final AudioStreamMix audioStreamMix = (AudioStreamMix) ((AbstractC18082l) obj8).get(iIntValue);
                boolean zBilling = c6956l4.billing(function2) | c6956l4.billing(audioStreamMix);
                Object objM2132native = c6956l4.m2132native();
                Object obj9 = objM2132native;
                if (zBilling || objM2132native == c13863l) {
                    final int i3 = 0;
                    Function0 function1 = new Function0() { // from class: lُٞۗ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str;
                            String str2;
                            int i4 = i3;
                            AudioStreamMix audioStreamMix2 = audioStreamMix;
                            Function2 function4 = function2;
                            switch (i4) {
                                case 0:
                                    AudioStreamMix.Link link = audioStreamMix2.amazon;
                                    if (link == null || (str = link.yandex) == null) {
                                        str = audioStreamMix2.yandex;
                                    }
                                    function4.invoke(str, audioStreamMix2);
                                    break;
                                default:
                                    AudioStreamMix.Link link2 = audioStreamMix2.amazon;
                                    if (link2 == null || (str2 = link2.yandex) == null) {
                                        str2 = audioStreamMix2.yandex;
                                    }
                                    function4.invoke(str2, audioStreamMix2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l4.m2147try(function1);
                    obj9 = function1;
                }
                Function0 function4 = (Function0) obj9;
                if (AbstractC8576l.yandex(audioStreamMix.purchase, Boolean.TRUE)) {
                    c6956l4.m2123default(-468514450);
                    boolean zBilling2 = c6956l4.billing(function3) | c6956l4.billing(audioStreamMix);
                    Object objM2132native2 = c6956l4.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        obj5 = objM2132native2;
                        final int i4 = 1;
                        Function0 function5 = new Function0() { // from class: lُٞۗ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str;
                                String str2;
                                int i5 = i4;
                                AudioStreamMix audioStreamMix2 = audioStreamMix;
                                Function2 function6 = function3;
                                switch (i5) {
                                    case 0:
                                        AudioStreamMix.Link link = audioStreamMix2.amazon;
                                        if (link == null || (str = link.yandex) == null) {
                                            str = audioStreamMix2.yandex;
                                        }
                                        function6.invoke(str, audioStreamMix2);
                                        break;
                                    default:
                                        AudioStreamMix.Link link2 = audioStreamMix2.amazon;
                                        if (link2 == null || (str2 = link2.yandex) == null) {
                                            str2 = audioStreamMix2.yandex;
                                        }
                                        function6.invoke(str2, audioStreamMix2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l4.m2147try(function5);
                        obj5 = function5;
                    }
                    function0 = (Function0) obj5;
                    i = 0;
                    c6956l4.startapp(false);
                } else {
                    i = 0;
                    c6956l4.m2123default(-468322902);
                    c6956l4.startapp(false);
                    function0 = null;
                }
                AbstractC5781l.yandex(audioStreamMix, function4, function0, c6956l4, i);
                return Unit.INSTANCE;
            case 2:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj8;
                final C13640l c13640l = (C13640l) obj7;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj6;
                InterfaceC3393l interfaceC3393l = (InterfaceC3393l) obj2;
                C6956l c6956l5 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                C14855l c14855l = C18450l.f36042l;
                C15089l c15089l = C18450l.f36034l;
                C14855l c14855l2 = C18450l.f36043l;
                if (interfaceC3393l.equals(C1946l.yandex)) {
                    c6956l5.m2123default(-1934299233);
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l2, false);
                    long j = c6956l5.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, interfaceC17242lFirebase);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i5);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l5, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l5, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, c6415l4);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l5, 54);
                    long j2 = c6956l5.f14595continue;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l5, c4346l);
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i6, c6956l5, c6415l3, c6956l5, c11192l);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling2, c6415l4);
                    AbstractC4332l.yandex(null, 0L, 0.0f, 0L, 0, 0.0f, c6956l5, 0, 63);
                    String strPurchase = AbstractC11999l.purchase(c6956l5, R.string.spark_splash_loading);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l5.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l5.isPro(c10707l)).loadAd.firebase, c6956l5, 0, 0, 131066);
                    AbstractC12900l.ads(c6956l5, true, true, false);
                } else {
                    boolean z4 = interfaceC3393l instanceof C5549l;
                    C16170l c16170l = C16170l.yandex;
                    if (z4) {
                        c6956l5.m2123default(-1933147180);
                        int i7 = ((C5549l) interfaceC3393l).yandex;
                        if (i7 == 2) {
                            c6956l5.m2123default(-1933156046);
                            InterfaceC17242l interfaceC17242lFirebase2 = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l);
                            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l2, false);
                            long j3 = c6956l5.f14595continue;
                            int i8 = (int) (j3 ^ (j3 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato3 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l5, interfaceC17242lFirebase2);
                            InterfaceC8801l.firebase.getClass();
                            C16395l c16395l2 = C3438l.loadAd;
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l2);
                            } else {
                                c6956l5.m2136protected();
                            }
                            C6415l c6415l5 = C3438l.mopub;
                            AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon2, c6415l5);
                            C6415l c6415l6 = C3438l.billing;
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato3, c6415l6);
                            Integer numValueOf2 = Integer.valueOf(i8);
                            C6415l c6415l7 = C3438l.isPro;
                            AbstractC8182l.billing(c6956l5, numValueOf2, c6415l7);
                            C11192l c11192l2 = C3438l.firebase;
                            AbstractC8182l.purchase(c6956l5, c11192l2);
                            C6415l c6415l8 = C3438l.amazon;
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling3, c6415l8);
                            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l5, 54);
                            long j4 = c6956l5.f14595continue;
                            int i9 = (int) (j4 ^ (j4 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato4 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l5, c4346l);
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l2);
                            } else {
                                c6956l5.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l5, c1853lYandex2, c6415l5);
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato4, c6415l6);
                            AbstractC11043l.isPro(i9, c6956l5, c6415l7, c6956l5, c11192l2);
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling4, c6415l8);
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_globe_outline_28, 0, c6956l5), null, null, AbstractC13106l.purchase(c6956l5).subscription, c6956l5, 56, 4);
                            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.spark_splash_network), AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l5).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l5).firebase, c6956l5, 48, 0, 130040);
                            c6956l5.startapp(true);
                            InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(AbstractC0080l.amazon(AbstractC3605l.smaato(c4346l, 16.0f), 1.0f), c14855l);
                            C17253l c17253l = C12719l.yandex;
                            C13412l c13412lYandex = C12719l.yandex(AbstractC13106l.purchase(c6956l5).adcel, AbstractC13106l.purchase(c6956l5).license, 0L, 0L, c6956l5, 12);
                            C17253l c17253l2 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                            C6839l c6839l = AbstractC13106l.billing(c6956l5).crashlytics;
                            boolean zAdmob = c6956l5.admob(c13640l);
                            Object objM2132native3 = c6956l5.m2132native();
                            if (zAdmob || objM2132native3 == c13863l) {
                                final int i10 = 0;
                                objM2132native3 = new Function0() { // from class: lٔۦِ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i11 = i10;
                                        C13640l c13640l2 = c13640l;
                                        switch (i11) {
                                            case 0:
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        c13640l2.isVip().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                                                    } else {
                                                        c13640l2.isVip().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                    break;
                                                } catch (Throwable unused) {
                                                }
                                                break;
                                            case 1:
                                                c13640l2.f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                break;
                                            case 2:
                                                c13640l2.f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                break;
                                            default:
                                                c13640l2.m4125private(new C7679l());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                c6956l5.m2147try(objM2132native3);
                            }
                            AbstractC17457l.loadAd((Function0) objM2132native3, interfaceC17242lYandex, false, c6839l, c13412lYandex, null, null, c17253l2, AbstractC15852l.yandex, c6956l5, 817889280, 356);
                            c6956l2 = c6956l5;
                            c6956l2.startapp(true);
                            c6956l2.startapp(false);
                            z3 = false;
                        } else {
                            c6956l5.m2123default(-1930303302);
                            InterfaceC17242l interfaceC17242lFirebase3 = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l);
                            InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(c14855l2, false);
                            long j5 = c6956l5.f14595continue;
                            int i11 = (int) (j5 ^ (j5 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato5 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l5, interfaceC17242lFirebase3);
                            InterfaceC8801l.firebase.getClass();
                            C16395l c16395l3 = C3438l.loadAd;
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l3);
                            } else {
                                c6956l5.m2136protected();
                            }
                            C6415l c6415l9 = C3438l.mopub;
                            AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon3, c6415l9);
                            C6415l c6415l10 = C3438l.billing;
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato5, c6415l10);
                            Integer numValueOf3 = Integer.valueOf(i11);
                            C6415l c6415l11 = C3438l.isPro;
                            AbstractC8182l.billing(c6956l5, numValueOf3, c6415l11);
                            C11192l c11192l3 = C3438l.firebase;
                            AbstractC8182l.purchase(c6956l5, c11192l3);
                            C6415l c6415l12 = C3438l.amazon;
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling5, c6415l12);
                            C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l5, 54);
                            long j6 = c6956l5.f14595continue;
                            int i12 = (int) (j6 ^ (j6 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato6 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l5, c4346l);
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l3);
                            } else {
                                c6956l5.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l5, c1853lYandex3, c6415l9);
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato6, c6415l10);
                            AbstractC11043l.isPro(i12, c6956l5, c6415l11, c6956l5, c11192l3);
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling6, c6415l12);
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_error_outline_28, 0, c6956l5), null, null, AbstractC13106l.purchase(c6956l5).subscription, c6956l5, 56, 4);
                            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.spark_splash_error), AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l5).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l5).firebase, c6956l5, 48, 0, 130040);
                            c6956l5.startapp(true);
                            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                            InterfaceC17242l interfaceC17242lYandex2 = c16170l.yandex(c4346l, c14855l);
                            C1853l c1853lYandex4 = AbstractC1001l.yandex(c7537l, c15089l, c6956l5, 54);
                            long j7 = c6956l5.f14595continue;
                            int i13 = (int) (j7 ^ (j7 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato7 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l5, interfaceC17242lYandex2);
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l3);
                            } else {
                                c6956l5.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l5, c1853lYandex4, c6415l9);
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato7, c6415l10);
                            AbstractC11043l.isPro(i13, c6956l5, c6415l11, c6956l5, c11192l3);
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling7, c6415l12);
                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.spark_splash_error_code, new Object[]{Integer.valueOf(i7)}, c6956l5), AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l5).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l5).vip, c6956l5, 48, 0, 130040);
                            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.smaato(c4346l, 16.0f), 1.0f);
                            C17253l c17253l3 = C12719l.yandex;
                            C13412l c13412lYandex2 = C12719l.yandex(AbstractC13106l.purchase(c6956l5).adcel, AbstractC13106l.purchase(c6956l5).license, 0L, 0L, c6956l5, 12);
                            C17253l c17253l4 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                            C6839l c6839l2 = AbstractC13106l.billing(c6956l5).crashlytics;
                            boolean zAdmob2 = c6956l5.admob(c13640l);
                            Object objM2132native4 = c6956l5.m2132native();
                            if (zAdmob2 || objM2132native4 == c13863l) {
                                z2 = true;
                                final boolean z5 = true ? 1 : 0;
                                objM2132native4 = new Function0() { // from class: lٔۦِ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = z5;
                                        C13640l c13640l2 = c13640l;
                                        switch (i14) {
                                            case 0:
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        c13640l2.isVip().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                                                    } else {
                                                        c13640l2.isVip().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                    break;
                                                } catch (Throwable unused) {
                                                }
                                                break;
                                            case 1:
                                                c13640l2.f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                break;
                                            case 2:
                                                c13640l2.f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                break;
                                            default:
                                                c13640l2.m4125private(new C7679l());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                c6956l5.m2147try(objM2132native4);
                            } else {
                                z2 = true;
                            }
                            AbstractC17457l.loadAd((Function0) objM2132native4, interfaceC17242lAmazon, false, c6839l2, c13412lYandex2, null, null, c17253l4, AbstractC15852l.loadAd, c6956l5, 817889328, 356);
                            c6956l2 = c6956l5;
                            z3 = false;
                            AbstractC12900l.ads(c6956l2, z2, z2, false);
                        }
                        c6956l2.startapp(z3);
                    } else {
                        if (!interfaceC3393l.equals(C2675l.yandex)) {
                            throw AbstractC12900l.billing(491801413, c6956l5, false);
                        }
                        c6956l5.m2123default(-1926515722);
                        if (((Boolean) interfaceC12244l.getValue()).booleanValue()) {
                            c6956l5.m2123default(-1926603142);
                            InterfaceC17242l interfaceC17242lFirebase4 = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l);
                            InterfaceC10835l interfaceC10835lAmazon4 = AbstractC9383l.amazon(c14855l2, false);
                            long j8 = c6956l5.f14595continue;
                            int i14 = (int) (j8 ^ (j8 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato8 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l5, interfaceC17242lFirebase4);
                            InterfaceC8801l.firebase.getClass();
                            C16395l c16395l4 = C3438l.loadAd;
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l4);
                            } else {
                                c6956l5.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon4, C3438l.mopub);
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato8, C3438l.billing);
                            AbstractC8182l.billing(c6956l5, Integer.valueOf(i14), C3438l.isPro);
                            AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling8, C3438l.amazon);
                            AbstractC4332l.yandex(null, 0L, 0.0f, 0L, 0, 0.0f, c6956l5, 0, 63);
                            c6956l = c6956l5;
                            c6956l.startapp(true);
                            z = false;
                            c6956l.startapp(false);
                        } else {
                            c6956l5.m2123default(-1926142575);
                            Object objM2132native5 = c6956l5.m2132native();
                            if (objM2132native5 == c13863l) {
                                C8688l c8688l = C2490l.subs;
                                objM2132native5 = AbstractC12832l.crashlytics().amazon.ads();
                                c6956l5.m2147try(objM2132native5);
                            }
                            String str = (String) objM2132native5;
                            Object objM2132native6 = c6956l5.m2132native();
                            if (objM2132native6 == c13863l) {
                                C8688l c8688l2 = C2490l.subs;
                                objM2132native6 = AbstractC12024l.m3338public(AbstractC12832l.crashlytics().purchase.ads(), new String[]{":"}, 6);
                                c6956l5.m2147try(objM2132native6);
                            }
                            final List list = (List) objM2132native6;
                            InterfaceC17242l interfaceC17242lFirebase5 = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l);
                            InterfaceC10835l interfaceC10835lAmazon5 = AbstractC9383l.amazon(c14855l2, false);
                            long j9 = c6956l5.f14595continue;
                            int i15 = (int) (j9 ^ (j9 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato9 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling9 = AbstractC17541l.billing(c6956l5, interfaceC17242lFirebase5);
                            InterfaceC8801l.firebase.getClass();
                            C16395l c16395l5 = C3438l.loadAd;
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l5);
                            } else {
                                c6956l5.m2136protected();
                            }
                            C6415l c6415l13 = C3438l.mopub;
                            AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon5, c6415l13);
                            C6415l c6415l14 = C3438l.billing;
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato9, c6415l14);
                            Integer numValueOf4 = Integer.valueOf(i15);
                            C6415l c6415l15 = C3438l.isPro;
                            AbstractC8182l.billing(c6956l5, numValueOf4, c6415l15);
                            C11192l c11192l4 = C3438l.firebase;
                            AbstractC8182l.purchase(c6956l5, c11192l4);
                            C6415l c6415l16 = C3438l.amazon;
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling9, c6415l16);
                            C1853l c1853lYandex5 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l5, 54);
                            long j10 = c6956l5.f14595continue;
                            int i16 = (int) (j10 ^ (j10 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato10 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling10 = AbstractC17541l.billing(c6956l5, c4346l);
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l5);
                            } else {
                                c6956l5.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l5, c1853lYandex5, c6415l13);
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato10, c6415l14);
                            AbstractC11043l.isPro(i16, c6956l5, c6415l15, c6956l5, c11192l4);
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling10, c6415l16);
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_add_square_outline_28, 0, c6956l5), null, null, AbstractC13106l.purchase(c6956l5).subscription, c6956l5, 56, 4);
                            AbstractC13010l.loadAd(str, AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l5).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l5).firebase, c6956l5, 54, 0, 130040);
                            c6956l5.startapp(true);
                            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c16170l.yandex(c4346l, c14855l), 16.0f);
                            C1853l c1853lYandex6 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l5, 54);
                            long j11 = c6956l5.f14595continue;
                            int i17 = (int) (j11 ^ (j11 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato11 = c6956l5.smaato();
                            InterfaceC17242l interfaceC17242lBilling11 = AbstractC17541l.billing(c6956l5, interfaceC17242lSmaato);
                            c6956l5.m2140super();
                            if (c6956l5.f14603switch) {
                                c6956l5.firebase(c16395l5);
                            } else {
                                c6956l5.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l5, c1853lYandex6, c6415l13);
                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato11, c6415l14);
                            AbstractC11043l.isPro(i17, c6956l5, c6415l15, c6956l5, c11192l4);
                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling11, c6415l16);
                            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                            C17253l c17253l5 = C12719l.yandex;
                            C13412l c13412lYandex3 = C12719l.yandex(AbstractC13106l.purchase(c6956l5).ads, AbstractC13106l.purchase(c6956l5).adcel, 0L, 0L, c6956l5, 12);
                            C17253l c17253l6 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                            C6839l c6839l3 = AbstractC13106l.billing(c6956l5).crashlytics;
                            boolean zAdmob3 = c6956l5.admob(c13640l);
                            Object objM2132native7 = c6956l5.m2132native();
                            if (zAdmob3 || objM2132native7 == c13863l) {
                                final int i18 = 2;
                                objM2132native7 = new Function0() { // from class: lٔۦِ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i19 = i18;
                                        C13640l c13640l2 = c13640l;
                                        switch (i19) {
                                            case 0:
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        c13640l2.isVip().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                                                    } else {
                                                        c13640l2.isVip().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                    break;
                                                } catch (Throwable unused) {
                                                }
                                                break;
                                            case 1:
                                                c13640l2.f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                break;
                                            case 2:
                                                c13640l2.f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                break;
                                            default:
                                                c13640l2.m4125private(new C7679l());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                c6956l5.m2147try(objM2132native7);
                            }
                            final int i19 = 0;
                            AbstractC17457l.loadAd((Function0) objM2132native7, interfaceC17242lAmazon2, false, c6839l3, c13412lYandex3, null, null, c17253l6, AbstractC14566l.amazon(1602145998, new Function3() { // from class: lؖٓۜ
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                    int i20 = i19;
                                    List list2 = list;
                                    switch (i20) {
                                        case 0:
                                            C6956l c6956l6 = (C6956l) obj11;
                                            int iIntValue2 = ((Integer) obj12).intValue();
                                            if (c6956l6.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                AbstractC13010l.loadAd((String) list2.get(1), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                                            } else {
                                                c6956l6.m2124else();
                                            }
                                            break;
                                        default:
                                            C6956l c6956l7 = (C6956l) obj11;
                                            int iIntValue3 = ((Integer) obj12).intValue();
                                            if (c6956l7.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                                AbstractC13010l.loadAd((String) list2.get(0), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l7, 0, 0, 262142);
                                            } else {
                                                c6956l7.m2124else();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, c6956l5), c6956l5, 817889328, 356);
                            InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                            C13412l c13412lYandex4 = C12719l.yandex(AbstractC13106l.purchase(c6956l5).adcel, AbstractC13106l.purchase(c6956l5).license, 0L, 0L, c6956l5, 12);
                            C17253l c17253l7 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                            C6839l c6839l4 = AbstractC13106l.billing(c6956l5).crashlytics;
                            boolean zAdmob4 = c6956l5.admob(c13640l);
                            Object objM2132native8 = c6956l5.m2132native();
                            if (zAdmob4 || objM2132native8 == c13863l) {
                                final int i20 = 3;
                                objM2132native8 = new Function0() { // from class: lٔۦِ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i110 = i20;
                                        C13640l c13640l2 = c13640l;
                                        switch (i110) {
                                            case 0:
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        c13640l2.isVip().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                                                    } else {
                                                        c13640l2.isVip().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                    break;
                                                } catch (Throwable unused) {
                                                }
                                                break;
                                            case 1:
                                                c13640l2.f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                break;
                                            case 2:
                                                c13640l2.f34617l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                break;
                                            default:
                                                c13640l2.m4125private(new C7679l());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                c6956l5.m2147try(objM2132native8);
                            }
                            final int i21 = 1;
                            AbstractC17457l.loadAd((Function0) objM2132native8, interfaceC17242lAmazon3, false, c6839l4, c13412lYandex4, null, null, c17253l7, AbstractC14566l.amazon(-248181513, new Function3() { // from class: lؖٓۜ
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                    int i22 = i21;
                                    List list2 = list;
                                    switch (i22) {
                                        case 0:
                                            C6956l c6956l6 = (C6956l) obj11;
                                            int iIntValue2 = ((Integer) obj12).intValue();
                                            if (c6956l6.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                AbstractC13010l.loadAd((String) list2.get(1), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                                            } else {
                                                c6956l6.m2124else();
                                            }
                                            break;
                                        default:
                                            C6956l c6956l7 = (C6956l) obj11;
                                            int iIntValue3 = ((Integer) obj12).intValue();
                                            if (c6956l7.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                                AbstractC13010l.loadAd((String) list2.get(0), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l7, 0, 0, 262142);
                                            } else {
                                                c6956l7.m2124else();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, c6956l5), c6956l5, 817889328, 356);
                            c6956l = c6956l5;
                            z = false;
                            AbstractC12900l.ads(c6956l, true, true, false);
                        }
                        c6956l.startapp(z);
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC13264l abstractC13264l = (AbstractC13264l) obj7;
                C11749l c11749l = (C11749l) obj6;
                int iIntValue2 = ((Integer) obj2).intValue();
                C6956l c6956l6 = (C6956l) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                c11749l.applovin((C6001l) ((C9424l) obj8).yandex.get(iIntValue2), iIntValue2 == ((C15308l) abstractC13264l.amazon.f32506l).admob(), iIntValue2, abstractC13264l.smaato(), AbstractC0019l.crashlytics(AbstractC0080l.crashlytics(c4346l, 1.0f), ((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).crashlytics.amazon), c6956l6, (iIntValue3 << 3) & 896);
                return Unit.INSTANCE;
        }
    }
}
