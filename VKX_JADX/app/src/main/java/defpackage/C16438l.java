package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: lٖ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16438l extends ClickableSpan {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f32138l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C15685l f32139l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32140l;

    public C16438l(int i, C15685l c15685l, int i2) {
        this.f32140l = i;
        this.f32139l = c15685l;
        this.f32138l = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f32140l);
        this.f32139l.yandex.performAction(this.f32138l, bundle);
    }
}
