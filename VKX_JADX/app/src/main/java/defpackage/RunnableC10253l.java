package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lَّۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC10253l implements Runnable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20878l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ RunnableC10253l f20876l = new RunnableC10253l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ RunnableC10253l f20875l = new RunnableC10253l(5);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ RunnableC10253l f20877l = new RunnableC10253l(6);

    public /* synthetic */ RunnableC10253l(int i) {
        this.f20878l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20878l) {
            case 0:
                try {
                    Method method = AbstractC14366l.loadAd;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C12304l.amazon()) {
                        C12304l.yandex().purchase();
                        break;
                    }
                    return;
                } finally {
                    Method method2 = AbstractC14366l.loadAd;
                    Trace.endSection();
                }
            case 1:
                return;
            case 2:
                AbstractC13209l.loadAd(AbstractC8733l.yandex(), new float[]{0.0f, 0.0f}, true);
                return;
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            default:
                return;
        }
    }

    private final /* synthetic */ void amazon() {
    }

    private final void crashlytics() {
    }

    private final /* synthetic */ void loadAd() {
    }

    private final void purchase() {
    }

    private final void yandex() {
    }
}
