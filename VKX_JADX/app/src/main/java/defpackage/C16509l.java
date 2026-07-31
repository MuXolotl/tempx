package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: lٖٝؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16509l extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f32276l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC17404l f32277l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10086l f32275l = AbstractC8020l.smaato(new C14174l(9205357640488583168L));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8610l f32278l = AbstractC8020l.mopub(new C5767l(9, this));

    public C16509l(AbstractC17404l abstractC17404l, float f) {
        this.f32277l = abstractC17404l;
        this.f32276l = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC11048l.crashlytics(textPaint, this.f32276l);
        textPaint.setShader((Shader) this.f32278l.getValue());
    }
}
