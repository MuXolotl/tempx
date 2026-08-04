package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: renamed from: lٕۨٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16097l implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final DisplayManager f31553l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Choreographer f31554l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile long f31552l = -9223372036854775807L;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public volatile long f31555l = -9223372036854775807L;

    public AbstractC16097l(Choreographer choreographer, DisplayManager displayManager) {
        this.f31554l = choreographer;
        this.f31553l = displayManager;
    }

    public abstract void loadAd();

    public abstract void yandex();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
