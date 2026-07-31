package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: renamed from: lّٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12906l implements InputFilter {
    public RunnableC11487l loadAd;
    public final TextView yandex;

    public C12906l(TextView textView) {
        this.yandex = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.yandex
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            lًّؑ r1 = defpackage.C12304l.yandex()
            int r1 = r1.crashlytics()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            lًّؑ r3 = defpackage.C12304l.yandex()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.mopub(r6, r5, r6, r4)
            return r3
        L48:
            return r4
        L49:
            lًّؑ r5 = defpackage.C12304l.yandex()
            lُۥۨ r6 = r3.loadAd
            if (r6 != 0) goto L58
            lُۥۨ r6 = new lُۥۨ
            r6.<init>(r0, r3)
            r3.loadAd = r6
        L58:
            lُۥۨ r3 = r3.loadAd
            r5.admob(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12906l.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
