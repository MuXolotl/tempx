package defpackage;

import android.util.Log;

/* JADX INFO: renamed from: lٕٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15712l {
    public static final C13975l subs = new C13975l(9);
    public final C11969l admob;
    public final C3945l amazon;
    public final C14894l billing;
    public final C12014l crashlytics;
    public final C10393l loadAd;
    public final C9066l mopub;
    public final C10985l purchase;
    public final C14169l yandex;

    public C15712l(C14169l c14169l, C10393l c10393l, C12014l c12014l, C3945l c3945l, C10985l c10985l, C14894l c14894l, C9066l c9066l, C11969l c11969l) {
        this.yandex = c14169l;
        this.loadAd = c10393l;
        this.crashlytics = c12014l;
        this.amazon = c3945l;
        this.purchase = c10985l;
        this.billing = c14894l;
        this.mopub = c9066l;
        this.admob = c11969l;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0118  */
    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0043, B:34:0x0107, B:41:0x0122, B:44:0x012b, B:46:0x0154, B:48:0x016a, B:52:0x0178, B:55:0x0180, B:59:0x01fb, B:70:0x0229, B:62:0x0208, B:65:0x0215, B:83:0x027d, B:84:0x0280, B:22:0x006e, B:45:0x0148), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x012b A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0043, B:34:0x0107, B:41:0x0122, B:44:0x012b, B:46:0x0154, B:48:0x016a, B:52:0x0178, B:55:0x0180, B:59:0x01fb, B:70:0x0229, B:62:0x0208, B:65:0x0215, B:83:0x027d, B:84:0x0280, B:22:0x006e, B:45:0x0148), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x016a A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0043, B:34:0x0107, B:41:0x0122, B:44:0x012b, B:46:0x0154, B:48:0x016a, B:52:0x0178, B:55:0x0180, B:59:0x01fb, B:70:0x0229, B:62:0x0208, B:65:0x0215, B:83:0x027d, B:84:0x0280, B:22:0x006e, B:45:0x0148), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0173  */
    /* JADX WARN: Code duplicated, block: B:53:0x017d A[PHI: r18 r19
  0x017d: PHI (r18v2 lٍؗؐ) = (r18v3 lٍؗؐ), (r18v4 lٍؗؐ) binds: [B:52:0x0178, B:49:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x017d: PHI (r19v1 lؘؖۙ) = (r19v2 lؘؖۙ), (r19v3 lؘؖۙ) binds: [B:52:0x0178, B:49:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0180 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0043, B:34:0x0107, B:41:0x0122, B:44:0x012b, B:46:0x0154, B:48:0x016a, B:52:0x0178, B:55:0x0180, B:59:0x01fb, B:70:0x0229, B:62:0x0208, B:65:0x0215, B:83:0x027d, B:84:0x0280, B:22:0x006e, B:45:0x0148), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x0208 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0043, B:34:0x0107, B:41:0x0122, B:44:0x012b, B:46:0x0154, B:48:0x016a, B:52:0x0178, B:55:0x0180, B:59:0x01fb, B:70:0x0229, B:62:0x0208, B:65:0x0215, B:83:0x027d, B:84:0x0280, B:22:0x006e, B:45:0x0148), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0214  */
    /* JADX WARN: Code duplicated, block: B:65:0x0215 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x0043, B:34:0x0107, B:41:0x0122, B:44:0x012b, B:46:0x0154, B:48:0x016a, B:52:0x0178, B:55:0x0180, B:59:0x01fb, B:70:0x0229, B:62:0x0208, B:65:0x0215, B:83:0x027d, B:84:0x0280, B:22:0x006e, B:45:0x0148), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0221  */
    /* JADX WARN: Code duplicated, block: B:69:0x0226  */
    /* JADX WARN: Code duplicated, block: B:74:0x0245  */
    /* JADX WARN: Code duplicated, block: B:77:0x0251 A[Catch: all -> 0x026a, TRY_LEAVE, TryCatch #3 {all -> 0x026a, blocks: (B:75:0x0249, B:77:0x0251), top: B:96:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0245 -> B:16:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object loadAd(java.lang.String r35, defpackage.C9049l r36, kotlin.jvm.functions.Function1 r37, defpackage.AbstractC0283l r38) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15712l.loadAd(java.lang.String, lٌۛۜ, kotlin.jvm.functions.Function1, lّؑۧ):java.lang.Object");
    }

    public final C2844l yandex(String str, C9049l c9049l) {
        Log.d("CXCP", this + "#openAndAwaitCameraWithRetry(" + ((Object) C10160l.loadAd(str)) + ')');
        return (C2844l) AbstractC10999l.subs(this.admob.crashlytics, new C8036l(this, str, c9049l, null, 2));
    }
}
