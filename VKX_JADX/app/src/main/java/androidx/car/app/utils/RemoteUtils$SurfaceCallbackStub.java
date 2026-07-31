package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import defpackage.AbstractC6475l;
import defpackage.AbstractC9859l;
import defpackage.C15858l;
import defpackage.InterfaceC11652l;
import defpackage.InterfaceC7587l;
import defpackage.RunnableC15278l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final AbstractC6475l mLifecycle;
    private InterfaceC7587l mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(AbstractC6475l abstractC6475l, InterfaceC7587l interfaceC7587l) {
        this.mLifecycle = abstractC6475l;
        abstractC6475l.yandex(new purchase(this));
    }

    public static /* synthetic */ InterfaceC7587l access$002(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, InterfaceC7587l interfaceC7587l) {
        remoteUtils$SurfaceCallbackStub.getClass();
        return interfaceC7587l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onClick$7(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onFling$5(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScale$6(float f, float f2, float f3) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScroll$4(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceAvailable$0(C15858l c15858l) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceDestroyed$3(C15858l c15858l) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        return null;
    }

    /* JADX WARN: Method inline analysis failed
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList.removeIf(Unknown Source)
     */
    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public static /* synthetic */ Object m22l(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2) {
        return remoteUtils$SurfaceCallbackStub.lambda$onScroll$4(f, f2);
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(float f, float f2) {
        AbstractC9859l.loadAd(new RunnableC15278l(this.mLifecycle, new loadAd(this, f, f2, 0), "onClick", 4));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f, float f2) {
        AbstractC9859l.loadAd(new RunnableC15278l(this.mLifecycle, new loadAd(this, f, f2, 2), "onFling", 4));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        AbstractC9859l.loadAd(new RunnableC15278l(this.mLifecycle, new InterfaceC11652l() { // from class: androidx.car.app.utils.amazon
            @Override // defpackage.InterfaceC11652l
            public final Object yandex() {
                return this.f323l.lambda$onScale$6(f, f2, f3);
            }
        }, "onScale", 4));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f, float f2) {
        AbstractC9859l.loadAd(new RunnableC15278l(this.mLifecycle, new loadAd(this, f, f2, 1), "onScroll", 4));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        billing.loadAd(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new crashlytics(this, rect, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(C15858l c15858l, IOnDoneCallback iOnDoneCallback) {
        billing.loadAd(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new yandex(this, c15858l, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(C15858l c15858l, IOnDoneCallback iOnDoneCallback) {
        billing.loadAd(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new yandex(this, c15858l, 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        billing.loadAd(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new crashlytics(this, rect, 0));
    }
}
