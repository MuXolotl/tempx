package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒٛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1170l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f3153l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f3154l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3155l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3156l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f3157l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f3158l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f3159l;

    public /* synthetic */ C1170l(C17812l c17812l, boolean z, InterfaceC2229l interfaceC2229l, C16173l c16173l, C0639l c0639l, InterfaceC4005l interfaceC4005l) {
        this.f3153l = c17812l;
        this.f3155l = z;
        this.f3158l = interfaceC2229l;
        this.f3157l = c16173l;
        this.f3159l = c0639l;
        this.f3154l = interfaceC4005l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C12983l c12983l;
        InterfaceC18212l interfaceC18212l;
        InterfaceC18212l interfaceC18212l2;
        int i = this.f3156l;
        int i2 = 0;
        Object obj2 = this.f3154l;
        Object obj3 = this.f3159l;
        Object obj4 = this.f3157l;
        Object obj5 = this.f3158l;
        boolean z = this.f3155l;
        Object obj6 = this.f3153l;
        int i3 = 1;
        switch (i) {
            case 0:
                C13939l c13939l = (C13939l) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                Function0 function2 = (Function0) obj3;
                Function0 function3 = (Function0) obj2;
                C1336l c1336l = (C1336l) obj;
                if (c13939l.f27228l == null) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(651646618, true, new C9680l(i2, function0)), 3);
                }
                if (c13939l.f27229l == null) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1561977155, true, new C9680l(i3, function1)), 3);
                }
                if (c13939l.f27230l == null) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(169043746, true, new C0613l(z, function2, i3)), 3);
                }
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1491524267, true, new C0613l(z, function3, 2)), 3);
                break;
            default:
                C17812l c17812l = (C17812l) obj6;
                C10086l c10086l = c17812l.metrica;
                InterfaceC2229l interfaceC2229l = (InterfaceC2229l) obj5;
                C16173l c16173l = (C16173l) obj4;
                C0639l c0639l = (C0639l) obj3;
                InterfaceC4005l interfaceC4005l = (InterfaceC4005l) obj2;
                InterfaceC18212l interfaceC18212l3 = (InterfaceC18212l) obj;
                c17812l.admob = interfaceC18212l3;
                C11224l c11224lAmazon = c17812l.amazon();
                if (c11224lAmazon != null) {
                    c11224lAmazon.loadAd = interfaceC18212l3;
                }
                if (z) {
                    if (c17812l.yandex() == EnumC7170l.f15003l) {
                        if (((Boolean) c17812l.smaato.getValue()).booleanValue() && ((C12771l) interfaceC2229l).loadAd()) {
                            c16173l.ads();
                        } else {
                            c16173l.metrica();
                        }
                        c17812l.remoteconfig.setValue(Boolean.valueOf(AbstractC9033l.mopub(c16173l, true)));
                        c17812l.vip.setValue(Boolean.valueOf(AbstractC9033l.mopub(c16173l, false)));
                        c10086l.setValue(Boolean.valueOf(C12814l.amazon(c0639l.loadAd)));
                    } else if (c17812l.yandex() == EnumC7170l.f15002l) {
                        c10086l.setValue(Boolean.valueOf(AbstractC9033l.mopub(c16173l, true)));
                    }
                    AbstractC16817l.firebase(c17812l, c0639l, interfaceC4005l);
                    C11224l c11224lAmazon2 = c17812l.amazon();
                    if (c11224lAmazon2 != null && (c12983l = c17812l.purchase) != null && c17812l.loadAd() && (interfaceC18212l = c11224lAmazon2.loadAd) != null && interfaceC18212l.mopub() && (interfaceC18212l2 = c11224lAmazon2.crashlytics) != null) {
                        C0327l c0327l = c11224lAmazon2.yandex;
                        C17330l c17330l = new C17330l(10, interfaceC18212l);
                        C8896l c8896lAdmob = AbstractC2044l.admob(interfaceC18212l);
                        C8896l c8896lMo2592synchronized = interfaceC18212l.mo2592synchronized(interfaceC18212l2, false);
                        if (AbstractC8576l.yandex((C12983l) c12983l.yandex.loadAd.get(), c12983l)) {
                            c12983l.loadAd.billing(c0639l, interfaceC4005l, c0327l, c17330l, c8896lAdmob, c8896lMo2592synchronized);
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1170l(C13939l c13939l, Function0 function0, Function0 function1, boolean z, Function0 function2, Function0 function3) {
        this.f3153l = c13939l;
        this.f3158l = function0;
        this.f3157l = function1;
        this.f3155l = z;
        this.f3159l = function2;
        this.f3154l = function3;
    }
}
