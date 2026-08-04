package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2565l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC9659l f5575l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f5576l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2565l(ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l, int i) {
        super(1);
        this.f5576l = i;
        this.f5575l = viewOnAttachStateChangeListenerC9659l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f5576l;
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = this.f5575l;
        switch (i) {
            case 0:
                View view = viewOnAttachStateChangeListenerC9659l.f19728l;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                C8764l c8764l = (C8764l) obj;
                if (c8764l.f18046l.contains(c8764l)) {
                    C5227l snapshotObserver = viewOnAttachStateChangeListenerC9659l.f19728l.getSnapshotObserver();
                    snapshotObserver.yandex.crashlytics(c8764l, viewOnAttachStateChangeListenerC9659l.f19716l, new C4307l(c8764l, viewOnAttachStateChangeListenerC9659l, 1));
                }
                return Unit.INSTANCE;
        }
    }
}
