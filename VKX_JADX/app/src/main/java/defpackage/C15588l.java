package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lَٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15588l {
    public static final C2351l crashlytics = new C2351l(3);
    public final int loadAd;
    public final C17456l yandex;

    public C15588l(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        this.yandex = new C17456l(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z, z ? i3 : -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
        this.loadAd = i4;
    }
}
