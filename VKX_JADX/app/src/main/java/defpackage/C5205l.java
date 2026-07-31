package defpackage;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗ۠ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5205l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8464l f11281l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11282l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5205l(C8464l c8464l, int i) {
        super(1);
        this.f11282l = i;
        this.f11281l = c8464l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.f11282l;
        C8464l c8464l = this.f11281l;
        switch (i) {
            case 0:
                InterfaceC11218l interfaceC11218l = (InterfaceC11218l) obj;
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = interfaceC11218l instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l ? (ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l : null;
                if (viewTreeObserverOnGlobalLayoutListenerC13840l != null) {
                    C8697l c8697l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27002l;
                    if (c8697l == null) {
                        c8697l = new C8697l(viewTreeObserverOnGlobalLayoutListenerC13840l.getContext());
                        viewTreeObserverOnGlobalLayoutListenerC13840l.addView(c8697l, -1);
                        viewTreeObserverOnGlobalLayoutListenerC13840l.requestLayout();
                        viewTreeObserverOnGlobalLayoutListenerC13840l.f27002l = c8697l;
                    }
                    c8697l.removeViewInLayout(c8464l);
                    AbstractC9464l.loadAd(c8697l.getLayoutNodeToHolder()).remove(c8697l.getHolderToLayoutNode().remove(c8464l));
                    c8464l.setImportantForAccessibility(0);
                }
                c8464l.removeAllViewsInLayout();
                return Unit.INSTANCE;
            case 1:
                c8464l.f1321l = (Function1) obj;
                return Unit.INSTANCE;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = c8464l.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = c8464l.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
