package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13488l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC13840l f26483l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26484l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13488l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, int i) {
        super(1);
        this.f26484l = i;
        this.f26483l = viewTreeObserverOnGlobalLayoutListenerC13840l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f26484l;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f26483l;
        switch (i) {
            case 0:
                ((C15552l) viewTreeObserverOnGlobalLayoutListenerC13840l.getFocusOwner()).mopub(((C3475l) obj).yandex, false);
                return Unit.INSTANCE;
            case 1:
                Function0 function0 = (Function0) obj;
                viewTreeObserverOnGlobalLayoutListenerC13840l.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC13840l.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC13840l.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0037l(1, function0));
                    }
                }
                return Unit.INSTANCE;
            case 2:
                return new C12095l(viewTreeObserverOnGlobalLayoutListenerC13840l, viewTreeObserverOnGlobalLayoutListenerC13840l.getTextInputService(), (InterfaceC2262l) obj);
            case 3:
                return viewTreeObserverOnGlobalLayoutListenerC13840l.m3781getInputModeManager();
            case 4:
                return viewTreeObserverOnGlobalLayoutListenerC13840l.getTextInputService();
            case 5:
                return viewTreeObserverOnGlobalLayoutListenerC13840l.getSoftwareKeyboardController();
            case 6:
                return viewTreeObserverOnGlobalLayoutListenerC13840l.getTextToolbar();
            default:
                return viewTreeObserverOnGlobalLayoutListenerC13840l.getPointerIconService();
        }
    }
}
