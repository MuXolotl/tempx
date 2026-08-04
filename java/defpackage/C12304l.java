package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: lًّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12304l {
    public static volatile C12304l firebase;
    public static final Object isPro = new Object();
    public final int admob;
    public final Handler amazon;
    public final InterfaceC17172l billing;
    public volatile int crashlytics;
    public final C10834l loadAd;
    public final C14529l mopub;
    public final C15546l purchase;
    public final C10201l subs;
    public final ReentrantReadWriteLock yandex;

    public C12304l(C9412l c9412l) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.yandex = reentrantReadWriteLock;
        this.crashlytics = 3;
        InterfaceC17172l interfaceC17172l = (InterfaceC17172l) c9412l.loadAd;
        this.billing = interfaceC17172l;
        int i = c9412l.yandex;
        this.admob = i;
        this.subs = (C10201l) c9412l.crashlytics;
        this.amazon = new Handler(Looper.getMainLooper());
        this.loadAd = new C10834l(0);
        this.mopub = new C14529l(0);
        C15546l c15546l = new C15546l(this);
        this.purchase = c15546l;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.crashlytics = 0;
            } catch (Throwable th) {
                this.yandex.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (crashlytics() == 0) {
            try {
                interfaceC17172l.amazon(new C10285l(c15546l));
            } catch (Throwable th2) {
                billing(th2);
            }
        }
    }

    public static boolean amazon() {
        return firebase != null;
    }

    public static C12304l yandex() {
        C12304l c12304l;
        synchronized (isPro) {
            c12304l = firebase;
            AbstractC5641l.purchase("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", c12304l != null);
        }
        return c12304l;
    }

    public final void admob(AbstractC2148l abstractC2148l) {
        AbstractC5641l.amazon(abstractC2148l, "initCallback cannot be null");
        this.yandex.writeLock().lock();
        try {
            if (this.crashlytics == 1 || this.crashlytics == 2) {
                this.amazon.post(new RunnableC16326l(Arrays.asList(abstractC2148l), this.crashlytics, (Throwable) null));
            } else {
                this.loadAd.add(abstractC2148l);
            }
        } finally {
            this.yandex.writeLock().unlock();
        }
    }

    public final void billing(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.yandex.writeLock().lock();
        try {
            this.crashlytics = 2;
            arrayList.addAll(this.loadAd);
            this.loadAd.clear();
            this.yandex.writeLock().unlock();
            this.amazon.post(new RunnableC16326l(arrayList, this.crashlytics, th));
        } catch (Throwable th2) {
            this.yandex.writeLock().unlock();
            throw th2;
        }
    }

    public final int crashlytics() {
        this.yandex.readLock().lock();
        try {
            return this.crashlytics;
        } finally {
            this.yandex.readLock().unlock();
        }
    }

    public final int loadAd(CharSequence charSequence, int i) {
        AbstractC5641l.purchase("Not initialized yet", crashlytics() == 1);
        AbstractC5641l.amazon(charSequence, "charSequence cannot be null");
        C18449l c18449l = (C18449l) this.purchase.loadAd;
        c18449l.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C2085l[] c2085lArr = (C2085l[]) spanned.getSpans(i, i + 1, C2085l.class);
            if (c2085lArr.length > 0) {
                return spanned.getSpanStart(c2085lArr[0]);
            }
        }
        return ((C6349l) c18449l.m4547interface(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new C6349l(i))).f13311l;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ab A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:35:0x0066, B:38:0x006b, B:40:0x006f, B:42:0x007c, B:49:0x009b, B:51:0x00a5, B:53:0x00a8, B:55:0x00ab, B:57:0x00bb, B:58:0x00be), top: B:94:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:35:0x0066, B:38:0x006b, B:40:0x006f, B:42:0x007c, B:49:0x009b, B:51:0x00a5, B:53:0x00a8, B:55:0x00ab, B:57:0x00bb, B:58:0x00be), top: B:94:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final CharSequence mopub(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        C2085l[] c2085lArr;
        int spanStart;
        AbstractC5641l.purchase("Not initialized yet", crashlytics() == 1);
        C18348l c18348l = null;
        if (i < 0) {
            C8339l.metrica("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            C8339l.metrica("end cannot be negative");
            return null;
        }
        AbstractC5641l.loadAd(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        AbstractC5641l.loadAd(i <= charSequence.length(), "start should be < than charSequence length");
        AbstractC5641l.loadAd(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        C18449l c18449l = (C18449l) this.purchase.loadAd;
        c18449l.getClass();
        boolean z2 = charSequence instanceof C6988l;
        if (z2) {
            ((C6988l) charSequence).yandex();
        }
        if (z2) {
            c18348l = new C18348l((Spannable) charSequence);
            if (c18348l != null) {
                for (C2085l c2085l : c2085lArr) {
                    spanStart = c18348l.f35861l.getSpanStart(c2085l);
                    int spanEnd = c18348l.f35861l.getSpanEnd(c2085l);
                    if (spanStart != i2) {
                        c18348l.removeSpan(c2085l);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((C6988l) charSequence2).loadAd();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    c18348l = new C18348l((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((C6988l) charSequence2).loadAd();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C2085l.class) <= i2) {
                c18348l = new C18348l();
                c18348l.f35862l = false;
                c18348l.f35861l = new SpannableString(charSequence);
            }
            if (c18348l != null && (c2085lArr = (C2085l[]) c18348l.f35861l.getSpans(i, i2, C2085l.class)) != null && c2085lArr.length > 0) {
                while (i < r2) {
                    spanStart = c18348l.f35861l.getSpanStart(c2085l);
                    int spanEnd2 = c18348l.f35861l.getSpanEnd(c2085l);
                    if (spanStart != i2) {
                        c18348l.removeSpan(c2085l);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    C18348l c18348l2 = (C18348l) c18449l.m4547interface(charSequence2, i4, i5, Alert.DURATION_SHOW_INDEFINITELY, z, new C0458l(c18348l, (C14529l) c18449l.f36010l, 19));
                    if (c18348l2 != null) {
                        Spannable spannable = c18348l2.f35861l;
                        if (z2) {
                            ((C6988l) charSequence2).loadAd();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((C6988l) charSequence2).loadAd();
                    throw th;
                }
            }
            ((C6988l) charSequence2).loadAd();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((C6988l) charSequence2).loadAd();
        throw th;
    }

    public final void purchase() {
        AbstractC5641l.purchase("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.admob == 1);
        if (crashlytics() == 1) {
            return;
        }
        this.yandex.writeLock().lock();
        try {
            if (this.crashlytics == 0) {
                this.yandex.writeLock().unlock();
                return;
            }
            this.crashlytics = 0;
            this.yandex.writeLock().unlock();
            C15546l c15546l = this.purchase;
            C12304l c12304l = (C12304l) c15546l.yandex;
            try {
                c12304l.billing.amazon(new C10285l(c15546l));
            } catch (Throwable th) {
                c12304l.billing(th);
            }
        } catch (Throwable th2) {
            this.yandex.writeLock().unlock();
            throw th2;
        }
    }

    public final void subs(EditorInfo editorInfo) {
        if (crashlytics() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C15546l c15546l = this.purchase;
        c15546l.getClass();
        Bundle bundle = editorInfo.extras;
        C3746l c3746l = (C3746l) ((C12014l) c15546l.crashlytics).f23941l;
        int iYandex = c3746l.yandex(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iYandex != 0 ? ((ByteBuffer) c3746l.f31320l).getInt(iYandex + c3746l.f31319l) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
