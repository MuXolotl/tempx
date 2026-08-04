package defpackage;

import android.view.WindowInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔۧٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15329l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8464l f29959l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29960l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C3654l f29961l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15329l(C8464l c8464l, C3654l c3654l, int i) {
        super(1);
        this.f29960l = i;
        this.f29959l = c8464l;
        this.f29961l = c3654l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsMopub;
        int i = this.f29960l;
        C3654l c3654l = this.f29961l;
        C8464l c8464l = this.f29959l;
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
                    c8697l.getHolderToLayoutNode().put(c8464l, c3654l);
                    c8697l.addView(c8464l);
                    c8697l.getLayoutNodeToHolder().put(c3654l, c8464l);
                    c8464l.setImportantForAccessibility(1);
                    AbstractC15872l.vip(c8464l, new C1268l(viewTreeObserverOnGlobalLayoutListenerC13840l, c3654l, viewTreeObserverOnGlobalLayoutListenerC13840l, c8697l));
                }
                if (c8464l.getView().getParent() != c8464l) {
                    c8464l.addView(c8464l.getView());
                }
                break;
            case 1:
                AbstractC2697l.yandex(c8464l, c3654l);
                break;
            default:
                AbstractC2697l.yandex(c8464l, c3654l);
                ((ViewTreeObserverOnGlobalLayoutListenerC13840l) c8464l.f1311l).f27053l = true;
                int[] iArr = c8464l.f1332l;
                int i2 = iArr[0];
                int i3 = iArr[1];
                c8464l.getView().getLocationOnScreen(iArr);
                long j = c8464l.f1324l;
                long jSmaato = ((InterfaceC18212l) obj).smaato();
                c8464l.f1324l = jSmaato;
                C1473l c1473l = c8464l.f1316l;
                if (c1473l != null && ((i2 != iArr[0] || i3 != iArr[1] || !C4999l.loadAd(j, jSmaato)) && (windowInsetsMopub = c8464l.remoteconfig(c1473l).mopub()) != null)) {
                    c8464l.getView().dispatchApplyWindowInsets(windowInsetsMopub);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
