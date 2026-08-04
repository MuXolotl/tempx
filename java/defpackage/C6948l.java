package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: lؚؐۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6948l implements InterfaceC13342l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C8688l f14573l = new C8688l(new C8241l(20));

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractActivityC14666l f14574l;

    public C6948l(AbstractActivityC14666l abstractActivityC14666l) {
        this.f14574l = abstractActivityC14666l;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        InputMethodManager inputMethodManager;
        AbstractC3398l abstractC3398l;
        Object objLoadAd;
        if (enumC14812l == EnumC14812l.ON_DESTROY && (objLoadAd = (abstractC3398l = (AbstractC3398l) f14573l.getValue()).loadAd((inputMethodManager = (InputMethodManager) this.f14574l.getSystemService("input_method")))) != null) {
            synchronized (objLoadAd) {
                View viewCrashlytics = abstractC3398l.crashlytics(inputMethodManager);
                if (viewCrashlytics == null) {
                    return;
                }
                if (viewCrashlytics.isAttachedToWindow()) {
                    return;
                }
                boolean zYandex = abstractC3398l.yandex(inputMethodManager);
                if (zYandex) {
                    inputMethodManager.isActive();
                }
            }
        }
    }
}
