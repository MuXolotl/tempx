package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ٗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17971l extends AbstractC9601l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f35139l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35140l;

    public /* synthetic */ C17971l(int i, Object obj) {
        this.f35140l = i;
        this.f35139l = obj;
    }

    @Override // defpackage.AbstractC9601l
    public final InterfaceC18212l amazon() {
        int i = this.f35140l;
        Object obj = this.f35139l;
        switch (i) {
            case 0:
                AbstractC11754l abstractC11754l = (AbstractC11754l) obj;
                InterfaceC18212l interfaceC18212lMo1003while = abstractC11754l.f23549l ? null : abstractC11754l.mo1003while();
                if (interfaceC18212lMo1003while == null) {
                    abstractC11754l.mo1002return().f7667l.loadAd();
                }
                return interfaceC18212lMo1003while;
            default:
                return (AbstractC18026l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) obj).getRoot().f7703l.purchase;
        }
    }

    @Override // defpackage.AbstractC9601l
    public final int billing() {
        int i = this.f35140l;
        Object obj = this.f35139l;
        switch (i) {
            case 0:
                return ((AbstractC11754l) obj).mo1466switch();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC13840l) obj).getRoot().f7667l.startapp.f20592l;
        }
    }

    @Override // defpackage.AbstractC9601l
    public float crashlytics(C3384l c3384l) {
        Function1 function1;
        int iM2398catch;
        C5227l snapshotObserver;
        int iM2398catch2;
        switch (this.f35140l) {
            case 0:
                Function2 function2 = c3384l.yandex;
                if (function2 != null) {
                    return ((Number) function2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC11754l abstractC11754l = (AbstractC11754l) this.f35139l;
                if (abstractC11754l.f23549l) {
                    return Float.NaN;
                }
                C10700l c10700l = new C10700l();
                c10700l.f21708l = abstractC11754l;
                while (true) {
                    C1080l c1080l = ((AbstractC11754l) c10700l.f21708l).f23547l;
                    float f = (c1080l == null || (iM2398catch2 = AbstractC8669l.m2398catch(c3384l, (C3384l[]) c1080l.f2970l)) < 0) ? Float.NaN : ((float[]) c1080l.f2975l)[iM2398catch2];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = c10700l.f21708l;
                    if (!zIsNaN) {
                        ((AbstractC11754l) obj).m3244goto(abstractC11754l.mo1002return(), c3384l);
                        return c3384l.yandex(f, ((AbstractC11754l) c10700l.f21708l).mo1003while(), abstractC11754l.mo1003while());
                    }
                    AbstractC11754l abstractC11754l2 = (AbstractC11754l) obj;
                    Function2 function3 = abstractC11754l2.f23545l;
                    if (function3 != null && (function1 = abstractC11754l2.f23551l) != null && ((Boolean) function1.invoke(c3384l)).booleanValue()) {
                        AbstractC11754l abstractC11754l3 = (AbstractC11754l) c10700l.f21708l;
                        C13660l c13660l = abstractC11754l3.f23553l;
                        if (c13660l == null) {
                            long[] jArr = AbstractC12154l.yandex;
                            c13660l = new C13660l();
                            abstractC11754l3.f23553l = c13660l;
                        }
                        Object objMopub = c13660l.mopub(c3384l);
                        if (objMopub == null) {
                            objMopub = new C17446l(abstractC11754l3.mo1000l(), abstractC11754l3, c3384l);
                            c13660l.vip(c3384l, objMopub);
                        }
                        C17446l c17446l = (C17446l) objMopub;
                        c17446l.f33994l = abstractC11754l3.mo1000l();
                        InterfaceC11218l interfaceC11218l = abstractC11754l.mo1002return().f7680l;
                        if (interfaceC11218l != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l).getSnapshotObserver()) != null) {
                            snapshotObserver.yandex.crashlytics(c17446l, C16274l.f31854l, new C0115l(function3, c10700l, c3384l, 0));
                        }
                        ((AbstractC11754l) c10700l.f21708l).m3244goto(abstractC11754l.mo1002return(), c3384l);
                        C1080l c1080l2 = ((AbstractC11754l) c10700l.f21708l).f23547l;
                        float f2 = (c1080l2 == null || (iM2398catch = AbstractC8669l.m2398catch(c3384l, (C3384l[]) c1080l2.f2970l)) < 0) ? Float.NaN : ((float[]) c1080l2.f2975l)[iM2398catch];
                        if (!Float.isNaN(f2)) {
                            return c3384l.yandex(f2, ((AbstractC11754l) c10700l.f21708l).mo1003while(), abstractC11754l.mo1003while());
                        }
                    }
                    AbstractC11754l abstractC11754lMo996l = ((AbstractC11754l) c10700l.f21708l).mo996l();
                    if (abstractC11754lMo996l == null) {
                        ((AbstractC11754l) c10700l.f21708l).m3244goto(abstractC11754l.mo1002return(), c3384l);
                        return Float.NaN;
                    }
                    c10700l.f21708l = abstractC11754lMo996l;
                }
                break;
            default:
                return super.crashlytics(c3384l);
        }
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        int i = this.f35140l;
        Object obj = this.f35139l;
        switch (i) {
            case 0:
                return ((AbstractC11754l) obj).loadAd();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC13840l) obj).getDensity().loadAd();
        }
    }

    @Override // defpackage.AbstractC9601l
    public final EnumC9931l purchase() {
        int i = this.f35140l;
        Object obj = this.f35139l;
        switch (i) {
            case 0:
                return ((AbstractC11754l) obj).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC13840l) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        int i = this.f35140l;
        Object obj = this.f35139l;
        switch (i) {
            case 0:
                return ((AbstractC11754l) obj).mo873super();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC13840l) obj).getDensity().mo873super();
        }
    }
}
