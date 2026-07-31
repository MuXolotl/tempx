package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
import kotlin.Unit;

/* JADX INFO: renamed from: lؑؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0111l implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1016l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1017l;

    public /* synthetic */ C0111l(int i, Object obj) {
        this.f1017l = i;
        this.f1016l = obj;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.f1017l) {
            case 0:
                C13283l c13283l = (C13283l) this.f1016l;
                synchronized (c13283l.crashlytics) {
                    c13283l.amazon = null;
                    c13283l.billing = null;
                    Unit unit = Unit.INSTANCE;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.f1017l) {
            case 0:
                C13283l c13283l = (C13283l) this.f1016l;
                synchronized (c13283l.crashlytics) {
                    c13283l.amazon = null;
                    c13283l.billing = null;
                    Unit unit = Unit.INSTANCE;
                }
                return;
            default:
                C7591l c7591l = (C7591l) this.f1016l;
                Display defaultDisplay = c7591l.getDefaultDisplay();
                if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                    return;
                }
                c7591l.loadAd();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.f1017l) {
            case 0:
                C13283l c13283l = (C13283l) this.f1016l;
                synchronized (c13283l.crashlytics) {
                    c13283l.amazon = null;
                    c13283l.billing = null;
                    Unit unit = Unit.INSTANCE;
                }
                return;
            default:
                return;
        }
    }

    private final void loadAd(int i) {
    }

    private final void yandex(int i) {
    }
}
