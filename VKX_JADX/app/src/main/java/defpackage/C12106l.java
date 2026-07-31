package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lِۚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12106l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f24066l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f24067l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24068l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f24069l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f24070l;

    public /* synthetic */ C12106l(int i, C18306l c18306l, AudioTrack audioTrack, boolean z) {
        this.f24067l = z;
        this.f24070l = c18306l;
        this.f24069l = audioTrack;
        this.f24066l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.f24068l;
        int i2 = 2;
        int i3 = this.f24066l;
        Object obj4 = this.f24069l;
        Object obj5 = this.f24070l;
        switch (i) {
            case 0:
                C2391l c2391l = (C2391l) obj5;
                C13849l c13849l = (C13849l) obj4;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
                    long j = c6956l.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C17253l c17253l = new C17253l(16.0f, 8.0f, 16.0f, 8.0f);
                    C17253l c17253l2 = C12719l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    C13412l c13412lYandex = C12719l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l.isPro(c10707l)).yandex.license, 0L, 0L, c6956l, 12);
                    C6839l c6839lYandex = AbstractC7497l.yandex(8.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    C9247l c9247l = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean zAdmob = c6956l.admob(c2391l) | c6956l.admob(c13849l);
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C4722l(c2391l, c13849l);
                        c6956l.m2147try(objM2132native);
                    }
                    float f = 1.0f;
                    AbstractC17457l.loadAd((Function0) objM2132native, c9247l, this.f24067l, c6839lYandex, c13412lYandex, null, null, c17253l, AbstractC15918l.purchase, c6956l, 817889280, 352);
                    C17253l c17253l3 = new C17253l(16.0f, 8.0f, 16.0f, 8.0f);
                    C13412l c13412lYandex2 = C12719l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l.isPro(c10707l)).yandex.license, 0L, 0L, c6956l, 12);
                    C6839l c6839lYandex2 = AbstractC7497l.yandex(8.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    int i5 = 1;
                    C9247l c9247l2 = new C9247l(f, true);
                    boolean zAdmob2 = c6956l.admob(c13849l) | c6956l.admob(c2391l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C4722l(c13849l, c2391l, i5);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native2, c9247l2, false, c6839lYandex2, c13412lYandex2, null, null, c17253l3, AbstractC14566l.amazon(-246159382, new C1866l(c13849l, i3, i5), c6956l), c6956l, 817889280, 356);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C18306l c18306l = (C18306l) obj5;
                AudioTrack audioTrack = (AudioTrack) obj4;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z2 = this.f24067l;
                    EnumC11447l enumC11447l = EnumC11447l.f23032l;
                    if (z2) {
                        c6956l2.m2123default(522544223);
                        z = c18306l.m2931abstract() == enumC11447l;
                        AbstractC18643l abstractC18643lM2933instanceof = c18306l.m2933instanceof();
                        C2287l.crashlytics(i3, 0, c6956l2, z, AbstractC8576l.yandex(abstractC18643lM2933instanceof != null ? abstractC18643lM2933instanceof.startapp() : null, AbstractC16676l.mopub(audioTrack)));
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(522864825);
                        z = c18306l.m2931abstract() == enumC11447l;
                        AbstractC18643l abstractC18643lM2933instanceof2 = c18306l.m2933instanceof();
                        C2287l.loadAd(z, AbstractC8576l.yandex(abstractC18643lM2933instanceof2 != null ? abstractC18643lM2933instanceof2.startapp() : null, AbstractC16676l.mopub(audioTrack)), AbstractC14566l.amazon(-541952423, new C16712l(audioTrack, i2), c6956l2), c6956l2, 384);
                        c6956l2.startapp(false);
                    }
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12106l(C2391l c2391l, C13849l c13849l, boolean z, int i) {
        this.f24070l = c2391l;
        this.f24069l = c13849l;
        this.f24067l = z;
        this.f24066l = i;
    }
}
