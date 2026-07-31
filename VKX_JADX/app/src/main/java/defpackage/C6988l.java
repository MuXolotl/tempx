package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؚْؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6988l extends SpannableStringBuilder {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f14656l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Class f14657l;

    public C6988l(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f14656l = new ArrayList();
        AbstractC5641l.amazon(cls, "watcherClass cannot be null");
        this.f14657l = cls;
    }

    public final boolean amazon(Object obj) {
        if (obj != null) {
            return this.f14657l == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final C9770l crashlytics(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14656l;
            if (i >= arrayList.size()) {
                return null;
            }
            C9770l c9770l = (C9770l) arrayList.get(i);
            if (c9770l.f19910l == obj) {
                return c9770l;
            }
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C9770l c9770lCrashlytics;
        if (amazon(obj) && (c9770lCrashlytics = crashlytics(obj)) != null) {
            obj = c9770lCrashlytics;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C9770l c9770lCrashlytics;
        if (amazon(obj) && (c9770lCrashlytics = crashlytics(obj)) != null) {
            obj = c9770lCrashlytics;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C9770l c9770lCrashlytics;
        if (amazon(obj) && (c9770lCrashlytics = crashlytics(obj)) != null) {
            obj = c9770lCrashlytics;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f14657l != cls) {
            return super.getSpans(i, i2, cls);
        }
        C9770l[] c9770lArr = (C9770l[]) super.getSpans(i, i2, C9770l.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c9770lArr.length);
        for (int i3 = 0; i3 < c9770lArr.length; i3++) {
            objArr[i3] = c9770lArr[i3].f19910l;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final void loadAd() {
        purchase();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14656l;
            if (i >= arrayList.size()) {
                return;
            }
            ((C9770l) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f14657l == cls) {
            cls = C9770l.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void purchase() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14656l;
            if (i >= arrayList.size()) {
                return;
            }
            ((C9770l) arrayList.get(i)).f19909l.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C9770l c9770lCrashlytics;
        if (amazon(obj)) {
            c9770lCrashlytics = crashlytics(obj);
            if (c9770lCrashlytics != null) {
                obj = c9770lCrashlytics;
            }
        } else {
            c9770lCrashlytics = null;
        }
        super.removeSpan(obj);
        if (c9770lCrashlytics != null) {
            this.f14656l.remove(c9770lCrashlytics);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        yandex();
        super.replace(i, i2, charSequence);
        purchase();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (amazon(obj)) {
            C9770l c9770l = new C9770l(obj);
            this.f14656l.add(c9770l);
            obj = c9770l;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C6988l(this.f14657l, this, i, i2);
    }

    public final void yandex() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14656l;
            if (i >= arrayList.size()) {
                return;
            }
            ((C9770l) arrayList.get(i)).f19909l.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        yandex();
        super.replace(i, i2, charSequence, i3, i4);
        purchase();
        return this;
    }

    public C6988l(Class cls, C6988l c6988l, int i, int i2) {
        super(c6988l, i, i2);
        this.f14656l = new ArrayList();
        AbstractC5641l.amazon(cls, "watcherClass cannot be null");
        this.f14657l = cls;
    }
}
