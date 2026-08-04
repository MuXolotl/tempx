package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: lؓٙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1931l implements InterfaceC14881l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ScrollFeedbackProvider f4402l;

    public C1931l(NestedScrollView nestedScrollView) {
        this.f4402l = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.InterfaceC14881l
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f4402l.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.InterfaceC14881l
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f4402l.onScrollProgress(i, i2, i3, i4);
    }
}
