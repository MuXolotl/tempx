package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: renamed from: lُ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17621l implements InterfaceC1465l, InterfaceC16497l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C17621l f34290l = new C17621l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C17621l f34289l = new C17621l();

    @Override // defpackage.InterfaceC16497l
    public C9742l amazon(Context context, InterfaceC1465l interfaceC1465l) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        return new C9742l(windowManager.getCurrentWindowMetrics().getBounds(), windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.InterfaceC16497l
    public C9742l crashlytics(Activity activity, InterfaceC1465l interfaceC1465l) {
        InterfaceC3990l.loadAd.getClass();
        return new C9742l(new C10067l(C18496l.yandex().billing(activity)), interfaceC1465l.purchase(activity));
    }

    @Override // defpackage.InterfaceC1465l
    public float purchase(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
