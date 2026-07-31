package defpackage;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؖۖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4307l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f8835l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8836l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f8837l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4307l(Object obj, Object obj2, int i) {
        super(0);
        this.f8836l = i;
        this.f8835l = obj;
        this.f8837l = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r3v32 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C18666l c18666l;
        C3654l c3654l;
        C8896l c8896l;
        int i = this.f8836l;
        int i2 = 1;
        Object obj = this.f8837l;
        Object obj2 = this.f8835l;
        switch (i) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = (ViewOnAttachStateChangeListenerC9659l) obj;
                C8764l c8764l = (C8764l) obj2;
                C11601l c11601l = c8764l.f18048l;
                C11601l c11601l2 = c8764l.f18050l;
                Float f = c8764l.f18045l;
                Float f2 = c8764l.f18049l;
                float fFloatValue = (c11601l == null || f == null) ? 0.0f : ((Number) c11601l.yandex.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (c11601l2 == null || f2 == null) ? 0.0f : ((Number) c11601l2.yandex.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iIsVip = viewOnAttachStateChangeListenerC9659l.isVip(c8764l.f18047l);
                    C13874l c13874l = (C13874l) viewOnAttachStateChangeListenerC9659l.ads().loadAd(viewOnAttachStateChangeListenerC9659l.f19736l);
                    if (c13874l != null) {
                        try {
                            C15685l c15685l = viewOnAttachStateChangeListenerC9659l.f19708l;
                            if (c15685l != null) {
                                c15685l.yandex.setBoundsInScreen(viewOnAttachStateChangeListenerC9659l.firebase(c13874l));
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    C13874l c13874l2 = (C13874l) viewOnAttachStateChangeListenerC9659l.ads().loadAd(viewOnAttachStateChangeListenerC9659l.f19732l);
                    if (c13874l2 != null) {
                        try {
                            C15685l c15685l2 = viewOnAttachStateChangeListenerC9659l.f19738l;
                            if (c15685l2 != null) {
                                c15685l2.yandex.setBoundsInScreen(viewOnAttachStateChangeListenerC9659l.firebase(c13874l2));
                                Unit unit3 = Unit.INSTANCE;
                            }
                        } catch (IllegalStateException unused2) {
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                    viewOnAttachStateChangeListenerC9659l.f19728l.invalidate();
                    C13874l c13874l3 = (C13874l) viewOnAttachStateChangeListenerC9659l.ads().loadAd(iIsVip);
                    if (c13874l3 != null && (c18666l = c13874l3.yandex) != null && (c3654l = c18666l.crashlytics) != null) {
                        if (c11601l != null) {
                            viewOnAttachStateChangeListenerC9659l.f19715l.subs(iIsVip, c11601l);
                        }
                        if (c11601l2 != null) {
                            viewOnAttachStateChangeListenerC9659l.f19720l.subs(iIsVip, c11601l2);
                        }
                        viewOnAttachStateChangeListenerC9659l.license(c3654l);
                    }
                    break;
                }
                if (c11601l != null) {
                    c8764l.f18045l = (Float) c11601l.yandex.invoke();
                }
                if (c11601l2 != null) {
                    c8764l.f18049l = (Float) c11601l2.yandex.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                Function0 function0 = (Function0) obj2;
                if (function0 != null && (c8896l = (C8896l) function0.invoke()) != null) {
                    return c8896l;
                }
                AbstractC18026l abstractC18026l = (AbstractC18026l) obj;
                if (!abstractC18026l.mo2643l().f29462l) {
                    abstractC18026l = null;
                }
                if (abstractC18026l != null) {
                    return AbstractC7470l.isPro(0L, AbstractC14707l.mopub(abstractC18026l.f20590l));
                }
                return null;
            case 3:
                ((C15155l) obj2).f29741l.invoke((C3366l) obj);
                return Unit.INSTANCE;
            case 4:
                ((C10700l) obj2).f21708l = AbstractC13402l.loadAd((C10789l) obj, AbstractC1629l.yandex);
                return Unit.INSTANCE;
            case 5:
                ((C10700l) obj2).f21708l = ((C6543l) obj).m2024l();
                return Unit.INSTANCE;
            case 6:
                ((C2703l) obj2).amazon((AbstractC14971l) obj);
                return Unit.INSTANCE;
            case 7:
                C18289l c18289l = ((C3654l) obj2).f7703l;
                C10700l c10700l = (C10700l) obj;
                if ((((AbstractC14971l) c18289l.mopub).f29457l & 8) != 0) {
                    for (AbstractC14971l abstractC14971l = (C13924l) c18289l.billing; abstractC14971l != null; abstractC14971l = abstractC14971l.f29456l) {
                        if ((abstractC14971l.f29450l & 8) != 0) {
                            ?? LoadAd = abstractC14971l;
                            ?? c17893l = 0;
                            while (LoadAd != 0) {
                                if (LoadAd instanceof InterfaceC3703l) {
                                    InterfaceC3703l interfaceC3703l = (InterfaceC3703l) LoadAd;
                                    if (interfaceC3703l.mo490catch()) {
                                        C6264l c6264l = new C6264l();
                                        c10700l.f21708l = c6264l;
                                        c6264l.f13226l = true;
                                    }
                                    if (interfaceC3703l.mo491l()) {
                                        ((C6264l) c10700l.f21708l).f13223l = true;
                                    }
                                    interfaceC3703l.isPro((InterfaceC17593l) c10700l.f21708l);
                                } else if ((LoadAd.f29450l & 8) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                    AbstractC14971l abstractC14971l2 = ((AbstractC11340l) LoadAd).f22875l;
                                    int i3 = 0;
                                    while (abstractC14971l2 != null) {
                                        if ((abstractC14971l2.f29450l & 8) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                LoadAd = LoadAd;
                                                c17893l = c17893l;
                                                c17893l = c17893l;
                                                LoadAd = abstractC14971l2;
                                            } else {
                                                if (c17893l == 0) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (LoadAd != 0) {
                                                    c17893l.crashlytics(LoadAd);
                                                    LoadAd = 0;
                                                }
                                                c17893l.crashlytics(abstractC14971l2);
                                            }
                                        } else {
                                            LoadAd = LoadAd;
                                            c17893l = c17893l;
                                        }
                                        abstractC14971l2 = abstractC14971l2.f29460l;
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                    if (i3 == 1) {
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    } else {
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                }
                                LoadAd = AbstractC5573l.loadAd(c17893l);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 8:
                C6148l c6148l = AbstractC18026l.f35263l;
                ((Function1) obj2).invoke(c6148l);
                AbstractC18026l abstractC18026l2 = (AbstractC18026l) obj;
                boolean zYandex = AbstractC8576l.yandex(abstractC18026l2.f35286l, c6148l.f12950l);
                boolean z = abstractC18026l2.f35290l;
                boolean z2 = c6148l.f12943l;
                boolean z3 = z != z2;
                if (!zYandex || z3) {
                    abstractC18026l2.f35286l = c6148l.f12950l;
                    abstractC18026l2.f35290l = z2;
                    if (abstractC18026l2.f35276l && (z3 || (z2 && !zYandex))) {
                        abstractC18026l2.f35281l.m1393strictfp();
                    }
                }
                abstractC18026l2.f35276l = true;
                c6148l.f12944l = c6148l.f12950l.yandex(c6148l.f12958l, c6148l.f12940l, c6148l.f12941l);
                return Unit.INSTANCE;
            case 9:
                C5056l c5056l = ((C18297l) obj2).yandex;
                C5371l c5371lAmazon = c5056l.amazon();
                C10086l c10086l = c5056l.firebase;
                InterfaceC14029l interfaceC14029l = null;
                C5177l c5177l = c5371lAmazon != null ? new C5177l(c5371lAmazon.loadAd()) : null;
                C5371l c5371lAmazon2 = c5056l.amazon();
                if ((c5371lAmazon2 != null ? Integer.valueOf(c5371lAmazon2.yandex()) : null) != null) {
                    c5056l.subscription.setValue(c10086l.getValue());
                    AbstractC10999l.mopub(c5056l.loadAd, null, 0, new C17400l(c5056l, c5056l.purchase(), interfaceC14029l, 2), 3);
                }
                c5056l.remoteconfig.setValue(new C1187l(0L));
                c10086l.setValue(null);
                c5056l.vip.setValue(new C5177l(c5177l != null ? c5177l.yandex : 0L));
                C1316l c1316l = c5056l.billing;
                AbstractC10999l.mopub(c1316l.loadAd, null, 0, new C5629l(c1316l, interfaceC14029l, i2), 3);
                c5056l.metrica.setValue(null);
                c5056l.startapp.setValue(null);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 10:
                return Boolean.valueOf(AbstractC8576l.yandex(obj2, ((C5056l) obj).firebase.getValue()));
            case 11:
                return Float.valueOf(((Number) ((Function0) ((InterfaceC8714l) obj2).getValue()).invoke()).floatValue() / (((Number) ((InterfaceC8714l) obj).getValue()).floatValue() / 1000.0f));
            case 12:
                ((AbstractC15391l) obj2).removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC15229l) obj);
                return Unit.INSTANCE;
            default:
                ((AbstractC6475l) obj2).loadAd((C15356l) obj);
                return Unit.INSTANCE;
        }
    }
}
