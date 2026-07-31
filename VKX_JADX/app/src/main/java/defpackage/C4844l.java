package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lّؗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4844l extends AbstractC2148l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final WeakReference f9889l;

    public C4844l(SwitchCompat switchCompat) {
        this.f9889l = new WeakReference(switchCompat);
    }

    @Override // defpackage.AbstractC2148l
    public final void loadAd() {
        SwitchCompat switchCompat = (SwitchCompat) this.f9889l.get();
        if (switchCompat != null) {
            switchCompat.crashlytics();
        }
    }

    @Override // defpackage.AbstractC2148l
    public final void yandex() {
        SwitchCompat switchCompat = (SwitchCompat) this.f9889l.get();
        if (switchCompat != null) {
            switchCompat.crashlytics();
        }
    }
}
