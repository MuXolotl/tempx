package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: lٌٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16645l extends C2399l {
    @Override // defpackage.AbstractC3468l
    public boolean loadAd(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // defpackage.C2399l, defpackage.AbstractC3468l
    public void yandex(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
