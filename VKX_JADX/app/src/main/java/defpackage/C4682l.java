package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;

/* JADX INFO: renamed from: lؗؗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4682l extends AbstractC14971l implements InterfaceC16537l, InterfaceC3703l, InterfaceC16036l, InterfaceC7150l, InterfaceC11189l, InterfaceC8605l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C3956l f9517l = new C3956l(1, this);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C3006l f9518l = new C3006l(1, this);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C5112l f9519l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC13840l f9520l;

    public C4682l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        this.f9520l = viewTreeObserverOnGlobalLayoutListenerC13840l;
    }

    @Override // defpackage.InterfaceC11189l
    public final Object adcel() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        int i = abstractC10113lAdcel.f20592l;
        int i2 = abstractC10113lAdcel.f20591l;
        C16441l c16441l = new C16441l(abstractC10113lAdcel, 0);
        return interfaceC7448l.mo1115private(i, i2, this.f9518l, this.f9517l, C14054l.f27396l, c16441l);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC16537l
    /* JADX INFO: renamed from: extends */
    public final Object mo857extends(AbstractC18026l abstractC18026l, C4307l c4307l, AbstractC0283l abstractC0283l) {
        long jMo2591strictfp = abstractC18026l.mo2591strictfp(0L);
        C8896l c8896l = (C8896l) c4307l.invoke();
        C8896l c8896lVip = c8896l != null ? c8896l.vip(jMo2591strictfp) : null;
        if (c8896lVip != null) {
            this.f9520l.requestRectangleOnScreen(new Rect((int) c8896lVip.yandex, (int) c8896lVip.loadAd, (int) c8896lVip.crashlytics, (int) c8896lVip.amazon), false);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC16036l
    /* JADX INFO: renamed from: strictfp */
    public final boolean mo1515strictfp(KeyEvent keyEvent) {
        C3475l c3475l;
        int[] iArr = AbstractC17194l.yandex;
        long jAmazon = AbstractC16422l.amazon(keyEvent);
        if (AbstractC5072l.yandex(jAmazon, AbstractC5072l.loadAd)) {
            c3475l = new C3475l(2);
        } else if (AbstractC5072l.yandex(jAmazon, AbstractC5072l.crashlytics)) {
            c3475l = new C3475l(1);
        } else if (AbstractC5072l.yandex(jAmazon, AbstractC5072l.startapp)) {
            c3475l = new C3475l(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (AbstractC5072l.yandex(jAmazon, AbstractC5072l.mopub)) {
            c3475l = new C3475l(4);
        } else if (AbstractC5072l.yandex(jAmazon, AbstractC5072l.billing)) {
            c3475l = new C3475l(3);
        } else if (AbstractC5072l.yandex(jAmazon, AbstractC5072l.amazon) || AbstractC5072l.yandex(jAmazon, AbstractC5072l.applovin)) {
            c3475l = new C3475l(5);
        } else if (AbstractC5072l.yandex(jAmazon, AbstractC5072l.purchase) || AbstractC5072l.yandex(jAmazon, AbstractC5072l.appmetrica)) {
            c3475l = new C3475l(6);
        } else if (AbstractC5072l.yandex(jAmazon, AbstractC5072l.admob) || AbstractC5072l.yandex(jAmazon, AbstractC5072l.ads) || AbstractC5072l.yandex(jAmazon, AbstractC5072l.inmobi)) {
            c3475l = new C3475l(7);
        } else {
            c3475l = (AbstractC5072l.yandex(jAmazon, AbstractC5072l.yandex) || AbstractC5072l.yandex(jAmazon, AbstractC5072l.Signature)) ? new C3475l(8) : null;
        }
        if (c3475l != null) {
            int i = c3475l.yandex;
            if (AbstractC16422l.purchase(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f9520l;
                C6543l c6543lBilling = ((C15552l) viewTreeObserverOnGlobalLayoutListenerC13840l.getFocusOwner()).billing();
                if (c6543lBilling != null && c6543lBilling.f13659l && viewTreeObserverOnGlobalLayoutListenerC13840l.license(i)) {
                    viewTreeObserverOnGlobalLayoutListenerC13840l.getPlayNavigationSoundEffect$ui().invoke(c3475l, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                Boolean boolPurchase = ((C15552l) viewTreeObserverOnGlobalLayoutListenerC13840l.getFocusOwner()).purchase(i, viewTreeObserverOnGlobalLayoutListenerC13840l.getEmbeddedViewFocusRect(), new C3006l(2, c3475l));
                if (boolPurchase == null) {
                    return true;
                }
                if (boolPurchase.booleanValue()) {
                    viewTreeObserverOnGlobalLayoutListenerC13840l.getPlayNavigationSoundEffect$ui().invoke(c3475l, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numCrashlytics = AbstractC17194l.crashlytics(i);
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC13840l.getRootView(), viewTreeObserverOnGlobalLayoutListenerC13840l.getView(), numCrashlytics != null ? numCrashlytics.intValue() : 2);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC13840l)) {
                    return ((C15552l) viewTreeObserverOnGlobalLayoutListenerC13840l.getFocusOwner()).admob(i);
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC16036l
    public final boolean vip(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
    }
}
