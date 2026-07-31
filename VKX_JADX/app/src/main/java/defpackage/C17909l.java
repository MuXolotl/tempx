package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l٘ٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17909l {
    public CharSequence admob;
    public BoringLayout.Metrics billing;
    public final int crashlytics;
    public final TextPaint loadAd;
    public boolean mopub;
    public final CharSequence yandex;
    public float amazon = Float.NaN;
    public float purchase = Float.NaN;

    public C17909l(CharSequence charSequence, TextPaint textPaint, int i) {
        this.yandex = charSequence;
        this.loadAd = textPaint;
        this.crashlytics = i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final float crashlytics() {
        if (!Float.isNaN(this.amazon)) {
            return this.amazon;
        }
        BoringLayout.Metrics metricsYandex = yandex();
        float fCeil = metricsYandex != null ? metricsYandex.width : -1;
        TextPaint textPaint = this.loadAd;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(loadAd(), 0, loadAd().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.yandex;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC6616l.crashlytics(spanned, C4145l.class) || AbstractC6616l.crashlytics(spanned, C6458l.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.amazon = fCeil;
        return fCeil;
    }

    public final CharSequence loadAd() {
        CharSequence charSequence = this.admob;
        if (charSequence == null) {
            charSequence = this.yandex;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC6616l.crashlytics(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.admob = charSequence;
        }
        return charSequence;
    }

    public final BoringLayout.Metrics yandex() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.mopub) {
            TextDirectionHeuristic textDirectionHeuristicLoadAd = AbstractC6290l.loadAd(this.crashlytics);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.yandex;
            TextPaint textPaint = this.loadAd;
            if (i >= 33) {
                metricsIsBoring = AbstractC2847l.subscription(charSequence, textPaint, textDirectionHeuristicLoadAd);
            } else {
                metricsIsBoring = !textDirectionHeuristicLoadAd.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.billing = metricsIsBoring;
            this.mopub = true;
        }
        return this.billing;
    }
}
