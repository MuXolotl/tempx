package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٗٞۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17297l extends ClickableSpan {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f33570l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33571l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f33572l;

    public C17297l(String str) {
        int iYandex = AbstractC13209l.yandex(R.attr.global_accent);
        this.f33571l = AbstractC14093l.subs(iYandex, 40);
        AbstractC14093l.subs(iYandex, 60);
        this.f33570l = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C8183l.crashlytics(C8183l.yandex, Uri.parse(this.f33570l), false, 2);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = this.f33572l ? this.f33571l : 0;
    }
}
