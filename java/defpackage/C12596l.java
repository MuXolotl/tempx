package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّٓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12596l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15184l f24806l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f24807l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f24808l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3259l f24809l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24810l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f24811l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C3312l f24812l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f24813l;

    public /* synthetic */ C12596l(C3259l c3259l, C15184l c15184l, C3312l c3312l, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, InterfaceC8714l interfaceC8714l3, InterfaceC8714l interfaceC8714l4, int i) {
        this.f24810l = i;
        this.f24809l = c3259l;
        this.f24806l = c15184l;
        this.f24812l = c3312l;
        this.f24811l = interfaceC8714l;
        this.f24813l = interfaceC8714l2;
        this.f24807l = interfaceC8714l3;
        this.f24808l = interfaceC8714l4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24810l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C3259l c3259l = this.f24809l;
                    boolean z = c3259l.f6982l;
                    C15184l c15184l = this.f24806l;
                    if (z) {
                        c6956l.m2123default(-1590028440);
                        AbstractC1889l.yandex(null, null, AbstractC14566l.amazon(1424877327, new C12596l(c3259l, c15184l, this.f24812l, this.f24811l, this.f24813l, this.f24807l, this.f24808l, 1), c6956l), c6956l, 384, 3);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(-1587372081);
                        AbstractC1889l.yandex(null, C9224l.billing, AbstractC14566l.amazon(-759565864, new C4951l(23, c15184l), c6956l), c6956l, 384, 1);
                        c6956l.startapp(false);
                    }
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C3259l c3259l2 = this.f24809l;
                    EnumC3503l enumC3503l = c3259l2.f6983l;
                    EnumC3503l enumC3503l2 = EnumC3503l.BLUR_ARTWORK;
                    C15184l c15184l2 = this.f24806l;
                    C9885l c9885l = C9885l.yandex;
                    if (enumC3503l == enumC3503l2 && AbstractC13542l.yandex) {
                        c6956l2.m2123default(1358819554);
                        InterfaceC8714l interfaceC8714l = this.f24811l;
                        Bitmap bitmap = (Bitmap) interfaceC8714l.getValue();
                        C8479l c8479l = C8479l.yandex;
                        if (bitmap != null) {
                            c6956l2.m2123default(1358868534);
                            Bitmap bitmap2 = (Bitmap) interfaceC8714l.getValue();
                            if (bitmap2 == null) {
                                c6956l2.m2123default(1358923341);
                                c6956l2.startapp(false);
                            } else {
                                c6956l2.m2123default(1358923342);
                                C10053l.yandex(new C12826l(bitmap2), null, AbstractC1789l.crashlytics(AbstractC13542l.yandex(AbstractC5573l.purchase(c9885l).billing(c8479l), c6956l2), c15184l2), 0, null, c6956l2, 48, 16);
                                c6956l2.startapp(false);
                                Unit unit = Unit.INSTANCE;
                            }
                            c6956l2.startapp(false);
                        } else {
                            c6956l2.m2123default(1359530849);
                            AbstractC1889l.yandex(AbstractC1789l.crashlytics(AbstractC13542l.yandex(AbstractC5573l.purchase(c9885l).billing(new C9768l(((C16592l) c6956l2.isPro(AbstractC9404l.purchase)).signatures)).billing(c8479l), c6956l2), c15184l2), null, AbstractC8441l.yandex, c6956l2, 384, 2);
                            c6956l2 = c6956l2;
                            c6956l2.startapp(false);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(1359996810);
                        C10053l.yandex(new C7552l(R.drawable.widget_background_round), null, AbstractC1789l.crashlytics(AbstractC5573l.purchase(c9885l), c15184l2), 0, new C2607l(new C12922l(new C6293l(((C9735l) this.f24813l.getValue()).yandex))), c6956l2, 32816, 0);
                        c6956l2.startapp(false);
                    }
                    long j = ((C2261l) c6956l2.isPro(AbstractC9404l.yandex)).yandex;
                    long j2 = C3312l.tapsense;
                    C3312l c3312l = this.f24812l;
                    InterfaceC8714l interfaceC8714l2 = this.f24807l;
                    InterfaceC8714l interfaceC8714l3 = this.f24808l;
                    if (j == j2) {
                        c6956l2.m2123default(1360610703);
                        c3312l.firebase((Bitmap) interfaceC8714l2.getValue(), ((C9735l) interfaceC8714l3.getValue()).yandex, c3259l2, c6956l2, 4096);
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(1360747599);
                        c3312l.smaato((Bitmap) interfaceC8714l2.getValue(), ((C9735l) interfaceC8714l3.getValue()).yandex, c3259l2, c6956l2, 4096);
                        c6956l2.startapp(false);
                    }
                    AbstractC3324l.yandex(new C6293l(C9735l.loadAd(0.75f, ((C9735l) interfaceC8714l3.getValue()).yandex)), c6956l2, 0, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
