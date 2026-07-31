package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC12322l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC13840l f24406l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24407l;

    public /* synthetic */ RunnableC12322l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, int i) {
        this.f24407l = i;
        this.f24406l = viewTreeObserverOnGlobalLayoutListenerC13840l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24407l;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f24406l;
        switch (i) {
            case 0:
                C11315l c11315l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27013l;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c11315l.isEmpty()) {
                    try {
                        ((Function0) c11315l.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC13840l.f27058l = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC13840l.f27000l;
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC13840l.m3777volatile(motionEvent);
                    return;
                } else {
                    C8339l.smaato("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC13840l.firebase(viewTreeObserverOnGlobalLayoutListenerC13840l.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC13840l.firebase(viewTreeObserverOnGlobalLayoutListenerC13840l.getRoot());
                return;
        }
    }
}
