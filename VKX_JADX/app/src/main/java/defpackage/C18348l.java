package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l٘ۦؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18348l implements Spannable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Spannable f35861l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f35862l = false;

    public C18348l(Spannable spannable) {
        this.f35861l = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f35861l.charAt(i);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return j$.util.stream.IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return j$.util.stream.IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f35861l.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f35861l.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f35861l.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f35861l.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f35861l.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f35861l.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        yandex();
        this.f35861l.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        yandex();
        this.f35861l.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f35861l.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f35861l.toString();
    }

    public final void yandex() {
        Spannable spannable = this.f35861l;
        if (!this.f35862l) {
            if ((Build.VERSION.SDK_INT < 28 ? new C6162l(13) : new C4665l(13)).subscription(spannable)) {
                this.f35861l = new SpannableString(spannable);
            }
        }
        this.f35862l = true;
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return AbstractC11965l.purchase(this.f35861l);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return AbstractC11965l.billing(this.f35861l);
    }
}
