package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15625l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC4973l f30544l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30545l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15625l(ViewTreeObserverOnGlobalFocusChangeListenerC4973l viewTreeObserverOnGlobalFocusChangeListenerC4973l, int i) {
        super(1);
        this.f30545l = i;
        this.f30544l = viewTreeObserverOnGlobalFocusChangeListenerC4973l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f30545l;
        ViewTreeObserverOnGlobalFocusChangeListenerC4973l viewTreeObserverOnGlobalFocusChangeListenerC4973l = this.f30544l;
        switch (i) {
            case 0:
                C4398l c4398l = (C4398l) obj;
                View viewYandex = AbstractC12396l.yandex(viewTreeObserverOnGlobalFocusChangeListenerC4973l);
                if (!viewYandex.isFocused() && !viewYandex.hasFocus()) {
                    InterfaceC6497l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(viewTreeObserverOnGlobalFocusChangeListenerC4973l)).getFocusOwner();
                    View viewBilling = AbstractC1068l.billing(viewTreeObserverOnGlobalFocusChangeListenerC4973l);
                    Integer numCrashlytics = AbstractC17194l.crashlytics(c4398l.yandex);
                    int[] iArr = new int[2];
                    viewBilling.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewYandex.getLocationOnScreen(iArr2);
                    C6543l c6543lLoadAd = AbstractC11156l.loadAd(((C15552l) focusOwner).crashlytics);
                    Rect rect = null;
                    C8896l c8896lCrashlytics = c6543lLoadAd != null ? AbstractC11156l.crashlytics(c6543lLoadAd) : null;
                    if (c8896lCrashlytics != null) {
                        int i2 = (int) c8896lCrashlytics.yandex;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) c8896lCrashlytics.loadAd;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) c8896lCrashlytics.crashlytics) + i3) - i4, (((int) c8896lCrashlytics.amazon) + i6) - i7);
                    }
                    if (!AbstractC17194l.loadAd(viewYandex, numCrashlytics, rect)) {
                        c4398l.loadAd = true;
                    }
                }
                break;
            default:
                AbstractC12396l.yandex(viewTreeObserverOnGlobalFocusChangeListenerC4973l);
                break;
        }
        return Unit.INSTANCE;
    }
}
