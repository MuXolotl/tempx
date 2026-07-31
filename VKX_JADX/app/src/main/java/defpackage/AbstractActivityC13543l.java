package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;

/* JADX INFO: renamed from: lْٞؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC13543l extends AbstractActivityC2569l {

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public boolean f26557l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public int f26558l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public boolean f26559l;

    public static void signatures(AbstractActivityC13543l abstractActivityC13543l, WindowInsets windowInsets) {
        boolean z = abstractActivityC13543l.f26559l;
        abstractActivityC13543l.f5599l.amazon(windowInsets.getSystemWindowInsetTop());
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && z) {
            int i2 = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()).bottom;
            if (abstractActivityC13543l.f26558l == 0 && i2 > 0) {
                abstractActivityC13543l.f26558l = i2;
                abstractActivityC13543l.f5599l.crashlytics(i2);
                abstractActivityC13543l.f5599l.setPadding(0, 0, 0, i2);
            }
        }
        if (i < 30 || !z || !abstractActivityC13543l.f26557l) {
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            abstractActivityC13543l.f5599l.crashlytics(systemWindowInsetBottom);
            abstractActivityC13543l.f5599l.setPadding(0, 0, 0, systemWindowInsetBottom);
        }
        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
        int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        C9967l c9967l = abstractActivityC13543l.f5599l;
        c9967l.setPadding(systemWindowInsetLeft, c9967l.getPaddingTop(), systemWindowInsetRight, c9967l.getPaddingBottom());
        if (i >= 28) {
            windowInsets.getDisplayCutout();
        }
    }

    @Override // defpackage.AbstractActivityC2569l, defpackage.AbstractActivityC16046l, defpackage.AbstractActivityC14666l, defpackage.AbstractActivityC11746l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            window.setNavigationBarColor(0);
            this.f5599l.setWindowInsetsAnimationCallback(new C1992l(this));
        }
        this.f5599l.setSystemUiVisibility(1024);
        this.f5599l.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l٘ۤٔ
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                AbstractActivityC13543l.signatures(this.yandex, windowInsets);
                return windowInsets;
            }
        });
        window.setStatusBarColor(0);
    }
}
