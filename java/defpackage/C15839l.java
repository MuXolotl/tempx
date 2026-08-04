package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٕٞٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15839l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C4020l f31089l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31090l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15839l(C4020l c4020l, int i) {
        super(0);
        this.f31090l = i;
        this.f31089l = c4020l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC1668l abstractC1668lMo2645l;
        int i = this.f31090l;
        C12463l c12463l = null;
        placementScope = null;
        placementScope = null;
        AbstractC9601l placementScope = null;
        C4020l c4020l = this.f31089l;
        switch (i) {
            case 0:
                C14070l c14070l = c4020l.f8282l;
                c14070l.admob = 0;
                C17893l c17893lSignatures = c14070l.yandex.signatures();
                Object[] objArr = c17893lSignatures.f34848l;
                int i2 = c17893lSignatures.f34846l;
                for (int i3 = 0; i3 < i2; i3++) {
                    C4020l c4020l2 = ((C3654l) objArr[i3]).f7667l.adcel;
                    c4020l2.f8269l = c4020l2.f8281l;
                    c4020l2.f8281l = Alert.DURATION_SHOW_INDEFINITELY;
                    if (c4020l2.f8276l == 2) {
                        c4020l2.f8276l = 3;
                    }
                }
                C3654l c3654l = c14070l.yandex;
                C3654l c3654l2 = c14070l.yandex;
                C17893l c17893lSignatures2 = c3654l.signatures();
                Object[] objArr2 = c17893lSignatures2.f34848l;
                int i4 = c17893lSignatures2.f34846l;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((C3654l) objArr2[i5]).f7667l.adcel.f8272l.amazon = false;
                    Unit unit = Unit.INSTANCE;
                }
                C16857l c16857l = c4020l.purchase().f22308l;
                if (c16857l == null) {
                    C8339l.smaato("Expected lookahead delegate");
                    return null;
                }
                C4588l c4588l = (C4588l) c3654l2.metrica();
                int i6 = ((C17893l) c4588l.f9321l).f34846l;
                for (int i7 = 0; i7 < i6; i7++) {
                    C3654l c3654l3 = (C3654l) c4588l.get(i7);
                    AbstractC1668l abstractC1668lMo2645l2 = ((AbstractC18026l) c3654l3.f7703l.purchase).mo2645l();
                    if (abstractC1668lMo2645l2 != null) {
                        if (abstractC1668lMo2645l2.f23549l) {
                            if (c12463l == null) {
                                c12463l = new C12463l();
                            }
                            c12463l.yandex(c3654l3);
                        }
                        abstractC1668lMo2645l2.f23549l = c16857l.f23549l;
                    }
                }
                c16857l.mo1000l().crashlytics();
                C4588l c4588l2 = (C4588l) c3654l2.metrica();
                int i8 = ((C17893l) c4588l2.f9321l).f34846l;
                int i9 = 0;
                while (true) {
                    if (i9 >= i8) {
                        C17893l c17893lSignatures3 = c3654l2.signatures();
                        Object[] objArr3 = c17893lSignatures3.f34848l;
                        int i10 = c17893lSignatures3.f34846l;
                        for (int i11 = 0; i11 < i10; i11++) {
                            C4020l c4020l3 = ((C3654l) objArr3[i11]).f7667l.adcel;
                            int i12 = c4020l3.f8269l;
                            int i13 = c4020l3.f8281l;
                            if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                                c4020l3.m1464public(true);
                            }
                        }
                        C17893l c17893lSignatures4 = c3654l2.signatures();
                        Object[] objArr4 = c17893lSignatures4.f34848l;
                        int i14 = c17893lSignatures4.f34846l;
                        for (int i15 = 0; i15 < i14; i15++) {
                            C7074l c7074l = ((C3654l) objArr4[i15]).f7667l.adcel.f8272l;
                            c7074l.purchase = c7074l.amazon;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    C3654l c3654l4 = (C3654l) c4588l2.get(i9);
                    boolean z = c12463l != null && c12463l.subs(c3654l4) >= 0;
                    AbstractC1668l abstractC1668lMo2645l3 = ((AbstractC18026l) c3654l4.f7703l.purchase).mo2645l();
                    if (abstractC1668lMo2645l3 != null) {
                        abstractC1668lMo2645l3.f23549l = z;
                    }
                    i9++;
                }
                break;
            case 1:
                C14070l c14070l2 = c4020l.f8282l;
                if (AbstractC13082l.loadAd(c14070l2.yandex) || c14070l2.crashlytics) {
                    AbstractC18026l abstractC18026l = c14070l2.yandex().f35294l;
                    if (abstractC18026l != null) {
                        placementScope = abstractC18026l.f23546l;
                    }
                } else {
                    AbstractC18026l abstractC18026l2 = c14070l2.yandex().f35294l;
                    if (abstractC18026l2 != null && (abstractC1668lMo2645l = abstractC18026l2.mo2645l()) != null) {
                        placementScope = abstractC1668lMo2645l.f23546l;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c14070l2.yandex)).getPlacementScope();
                }
                AbstractC9601l.isPro(placementScope, c14070l2.yandex().mo2645l(), c4020l.f8277l);
                return Unit.INSTANCE;
            default:
                c4020l.f8282l.yandex().mo2645l().adcel(c4020l.f8279l);
                return Unit.INSTANCE;
        }
    }
}
