package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: renamed from: lّۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Llّۙ;", "Landroid/app/Fragment;", "<init>", "()V", "yandex", "lٗۥٗ", "lifecycle-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FragmentC12812l extends Fragment {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f25188l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C14965l f25189l;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        yandex(EnumC14812l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        yandex(EnumC14812l.ON_DESTROY);
        this.f25189l = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        yandex(EnumC14812l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C14965l c14965l = this.f25189l;
        if (c14965l != null) {
            ((C10854l) c14965l.f29441l).crashlytics();
        }
        yandex(EnumC14812l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C14965l c14965l = this.f25189l;
        if (c14965l != null) {
            C10854l c10854l = (C10854l) c14965l.f29441l;
            int i = c10854l.f21943l + 1;
            c10854l.f21943l = i;
            if (i == 1 && c10854l.f21945l) {
                c10854l.f21946l.purchase(EnumC14812l.ON_START);
                c10854l.f21945l = false;
            }
        }
        yandex(EnumC14812l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        yandex(EnumC14812l.ON_STOP);
    }

    public final void yandex(EnumC14812l enumC14812l) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC17537l.yandex(getActivity(), enumC14812l);
        }
    }

    /* JADX INFO: renamed from: lّۙ$yandex */
    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static final class yandex implements Application.ActivityLifecycleCallbacks {
        public static final C9930l Companion = new C9930l();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            C9930l.yandex(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = FragmentC12812l.f25188l;
            AbstractC17537l.yandex(activity, EnumC14812l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = FragmentC12812l.f25188l;
            AbstractC17537l.yandex(activity, EnumC14812l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = FragmentC12812l.f25188l;
            AbstractC17537l.yandex(activity, EnumC14812l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = FragmentC12812l.f25188l;
            AbstractC17537l.yandex(activity, EnumC14812l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = FragmentC12812l.f25188l;
            AbstractC17537l.yandex(activity, EnumC14812l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = FragmentC12812l.f25188l;
            AbstractC17537l.yandex(activity, EnumC14812l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
