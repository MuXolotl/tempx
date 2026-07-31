package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15488l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C14903l f30288l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30289l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15488l(C14903l c14903l, int i) {
        super(0);
        this.f30289l = i;
        this.f30288l = c14903l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC9601l placementScope;
        int i = this.f30289l;
        C14903l c14903l = this.f30288l;
        switch (i) {
            case 0:
                C14070l c14070l = c14903l.f29342l;
                c14070l.subs = 0;
                C17893l c17893lSignatures = c14070l.yandex.signatures();
                Object[] objArr = c17893lSignatures.f34848l;
                int i2 = c17893lSignatures.f34846l;
                for (int i3 = 0; i3 < i2; i3++) {
                    C14903l c14903l2 = ((C3654l) objArr[i3]).f7667l.startapp;
                    c14903l2.f29323l = c14903l2.f29341l;
                    c14903l2.f29341l = Alert.DURATION_SHOW_INDEFINITELY;
                    c14903l2.f29322l = false;
                    if (c14903l2.f29317l == 2) {
                        c14903l2.f29317l = 3;
                    }
                }
                C3654l c3654l = c14070l.yandex;
                C3654l c3654l2 = c14070l.yandex;
                C17893l c17893lSignatures2 = c3654l.signatures();
                Object[] objArr2 = c17893lSignatures2.f34848l;
                int i4 = c17893lSignatures2.f34846l;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((C3654l) objArr2[i5]).f7667l.startapp.f29327l.amazon = false;
                    Unit unit = Unit.INSTANCE;
                }
                if (c14903l.purchase().f23549l) {
                    C4588l c4588l = (C4588l) c3654l2.metrica();
                    int i6 = ((C17893l) c4588l.f9321l).f34846l;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((AbstractC18026l) ((C3654l) c4588l.get(i7)).f7703l.purchase).f23549l = true;
                    }
                }
                c14903l.purchase().mo1000l().crashlytics();
                if (c14903l.purchase().f23549l) {
                    C4588l c4588l2 = (C4588l) c3654l2.metrica();
                    int i8 = ((C17893l) c4588l2.f9321l).f34846l;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((AbstractC18026l) ((C3654l) c4588l2.get(i9)).f7703l.purchase).f23549l = false;
                    }
                }
                C17893l c17893lSignatures3 = c3654l2.signatures();
                Object[] objArr3 = c17893lSignatures3.f34848l;
                int i10 = c17893lSignatures3.f34846l;
                for (int i11 = 0; i11 < i10; i11++) {
                    C3654l c3654l3 = (C3654l) objArr3[i11];
                    C14070l c14070l2 = c3654l3.f7667l;
                    if (c14070l2.startapp.f29323l != c3654l3.pro()) {
                        c3654l2.m1375case();
                        c3654l2.inmobi();
                        if (c3654l3.pro() == Integer.MAX_VALUE) {
                            if (c14070l2.crashlytics || AbstractC13082l.loadAd(c3654l3)) {
                                c14070l2.adcel.m1464public(false);
                            }
                            c14070l2.startapp.m3908this();
                        }
                    }
                }
                C17893l c17893lSignatures4 = c3654l2.signatures();
                Object[] objArr4 = c17893lSignatures4.f34848l;
                int i12 = c17893lSignatures4.f34846l;
                for (int i13 = 0; i13 < i12; i13++) {
                    C7074l c7074l = ((C3654l) objArr4[i13]).f7667l.startapp.f29327l;
                    c7074l.purchase = c7074l.amazon;
                    Unit unit2 = Unit.INSTANCE;
                }
                break;
            case 1:
                c14903l.f29342l.yandex().adcel(c14903l.f29331l);
                break;
            default:
                C14070l c14070l3 = c14903l.f29342l;
                AbstractC18026l abstractC18026l = c14070l3.yandex().f35294l;
                if (abstractC18026l == null || (placementScope = abstractC18026l.f23546l) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c14070l3.yandex)).getPlacementScope();
                }
                Function1 function1 = c14903l.f29315l;
                C11925l c11925l = c14903l.f29344l;
                if (c11925l != null) {
                    AbstractC18026l abstractC18026lYandex = c14070l3.yandex();
                    long j = c14903l.f29326l;
                    float f = c14903l.f29334l;
                    placementScope.getClass();
                    AbstractC9601l.yandex(placementScope, abstractC18026lYandex);
                    abstractC18026lYandex.mo1459class(C5177l.amazon(j, abstractC18026lYandex.f20593l), f, c11925l);
                } else if (function1 == null) {
                    AbstractC18026l abstractC18026lYandex2 = c14070l3.yandex();
                    long j2 = c14903l.f29326l;
                    float f2 = c14903l.f29334l;
                    placementScope.getClass();
                    AbstractC9601l.yandex(placementScope, abstractC18026lYandex2);
                    abstractC18026lYandex2.mo883interface(C5177l.amazon(j2, abstractC18026lYandex2.f20593l), f2, null);
                } else {
                    AbstractC18026l abstractC18026lYandex3 = c14070l3.yandex();
                    long j3 = c14903l.f29326l;
                    float f3 = c14903l.f29334l;
                    placementScope.getClass();
                    AbstractC9601l.yandex(placementScope, abstractC18026lYandex3);
                    abstractC18026lYandex3.mo883interface(C5177l.amazon(j3, abstractC18026lYandex3.f20593l), f3, function1);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
