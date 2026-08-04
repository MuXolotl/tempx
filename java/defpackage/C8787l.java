package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٌٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8787l {
    public int admob;
    public int amazon;
    public int billing;
    public final StringBuilder crashlytics;
    public final ArrayList loadAd;
    public int mopub;
    public int purchase;
    public final ArrayList yandex;

    public C8787l(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.yandex = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.loadAd = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.crashlytics = sb;
        this.mopub = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.amazon = 15;
        this.purchase = 0;
        this.billing = 0;
        this.admob = i2;
    }

    public final SpannableString amazon() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.crashlytics);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.yandex;
            if (i5 >= arrayList.size()) {
                break;
            }
            C18258l c18258l = (C18258l) arrayList.get(i5);
            boolean z2 = c18258l.loadAd;
            int i7 = c18258l.yandex;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = C5916l.premium[i7];
                }
                z = z3;
            }
            int i8 = c18258l.crashlytics;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((C18258l) arrayList.get(i5)).crashlytics : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final C17456l crashlytics(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.loadAd;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) amazon());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.purchase + this.billing;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            if (this.mopub != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                i5 = (this.mopub != 2 || i4 <= 0) ? 0 : 2;
            } else {
                i5 = 1;
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.amazon;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.mopub == 1) {
            i6 -= this.admob - 1;
        }
        return new C17456l(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, RecyclerView.UNDEFINED_DURATION, f, i5, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
    }

    public final void loadAd() {
        StringBuilder sb = this.crashlytics;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.yandex;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C18258l c18258l = (C18258l) arrayList.get(size);
                int i = c18258l.crashlytics;
                if (i != length) {
                    return;
                }
                c18258l.crashlytics = i - 1;
            }
        }
    }

    public final boolean purchase() {
        return this.yandex.isEmpty() && this.loadAd.isEmpty() && this.crashlytics.length() == 0;
    }

    public final void yandex(char c) {
        StringBuilder sb = this.crashlytics;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }
}
