package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: lَؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10339l extends AbstractC8848l {
    final /* synthetic */ C10854l this$0;

    /* JADX INFO: renamed from: lَؚٗ$yandex */
    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static final class yandex extends AbstractC8848l {
        final /* synthetic */ C10854l this$0;

        public yandex(C10854l c10854l) {
            this.this$0 = c10854l;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.crashlytics();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C10854l c10854l = this.this$0;
            int i = c10854l.f21943l + 1;
            c10854l.f21943l = i;
            if (i == 1 && c10854l.f21945l) {
                c10854l.f21946l.purchase(EnumC14812l.ON_START);
                c10854l.f21945l = false;
            }
        }
    }

    public C10339l(C10854l c10854l) {
        this.this$0 = c10854l;
    }

    @Override // defpackage.AbstractC8848l, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC12812l.f25188l;
            ((FragmentC12812l) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f25189l = this.this$0.f21941l;
        }
    }

    @Override // defpackage.AbstractC8848l, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C10854l c10854l = this.this$0;
        int i = c10854l.f21942l - 1;
        c10854l.f21942l = i;
        if (i == 0) {
            c10854l.f21944l.postDelayed(c10854l.f21940l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC11880l.m3283synchronized(activity, new yandex(this.this$0));
    }

    @Override // defpackage.AbstractC8848l, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C10854l c10854l = this.this$0;
        int i = c10854l.f21943l - 1;
        c10854l.f21943l = i;
        if (i == 0 && c10854l.f21939l) {
            c10854l.f21946l.purchase(EnumC14812l.ON_STOP);
            c10854l.f21945l = true;
        }
    }
}
