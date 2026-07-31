package defpackage;

import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؙۚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6736l extends C16280l {
    @Override // defpackage.AbstractC0593l
    public final void amazon(boolean z) {
        if (!z) {
            admob(16);
            return;
        }
        Window window = this.loadAd;
        window.clearFlags(134217728);
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        mopub(16);
    }
}
