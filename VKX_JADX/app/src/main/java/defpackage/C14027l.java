package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14027l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27332l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27333l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27334l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f27335l;

    public /* synthetic */ C14027l(boolean z, boolean z2, Function0 function0) {
        this.f27334l = 1;
        this.f27333l = z;
        this.f27332l = z2;
        this.f27335l = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f27334l;
        boolean z = this.f27332l;
        boolean z2 = this.f27333l;
        Object obj2 = this.f27335l;
        switch (i) {
            case 0:
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                long jYandex = ((InterfaceC7316l) obj2).yandex();
                interfaceC17593l.amazon(AbstractC1848l.yandex, new C13620l(z2 ? EnumC1826l.f4234l : EnumC1826l.f4233l, jYandex, z ? 1 : 3, (9223372034707292159L & jYandex) != 9205357640488583168L));
                break;
            case 1:
                InterfaceC17593l interfaceC17593l2 = (InterfaceC17593l) obj;
                AbstractC3668l.vip(interfaceC17593l2, z2);
                AbstractC3668l.crashlytics(interfaceC17593l2, new C5583l(11, (Function0) obj2));
                interfaceC17593l2.amazon(AbstractC16601l.crashlytics, new C7629l(null, new C1712l(0)));
                if (!z) {
                    AbstractC3668l.yandex(interfaceC17593l2);
                }
                break;
            default:
                C0143l c0143l = (C0143l) obj;
                float f = (int) (((C4999l) obj2).yandex >> 32);
                c0143l.yandex(EnumC16440l.f32143l, 0.0f);
                if (z2) {
                    c0143l.yandex(EnumC16440l.f32145l, f);
                }
                if (z) {
                    c0143l.yandex(EnumC16440l.f32144l, -f);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14027l(int i, Object obj, boolean z, boolean z2) {
        this.f27334l = i;
        this.f27335l = obj;
        this.f27333l = z;
        this.f27332l = z2;
    }
}
