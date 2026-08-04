package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؖؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC3838l implements ViewTranslationCallback {
    public static final ViewTranslationCallbackC3838l yandex = new ViewTranslationCallbackC3838l();

    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[LOOP:0: B:5:0x0018->B:27:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[EDGE_INSN: B:30:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:5:0x0018->B:27:0x0078], SYNTHETIC] */
    public final boolean onClearTranslation(View view) {
        Function0 function0;
        ViewOnAttachStateChangeListenerC0348l contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f1412l = 1;
        AbstractC14183l abstractC14183lLoadAd = contentCaptureManager$ui.loadAd();
        Object[] objArr = abstractC14183lLoadAd.crashlytics;
        long[] jArr = abstractC14183lLoadAd.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C13660l c13660l = ((C13874l) objArr[(i << 3) + i3]).yandex.amazon.f13225l;
                            Object objMopub = c13660l.mopub(AbstractC0424l.inmobi);
                            if (objMopub == null) {
                                objMopub = null;
                            }
                            if (objMopub != null) {
                                Object objMopub2 = c13660l.mopub(AbstractC16601l.vip);
                                C7629l c7629l = (C7629l) (objMopub2 != null ? objMopub2 : null);
                                if (c7629l != null && (function0 = (Function0) c7629l.loadAd) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[LOOP:0: B:5:0x0018->B:28:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0083 A[EDGE_INSN: B:31:0x0083->B:29:0x0083 BREAK  A[LOOP:0: B:5:0x0018->B:28:0x0080], SYNTHETIC] */
    public final boolean onHideTranslation(View view) {
        Function1 function1;
        ViewOnAttachStateChangeListenerC0348l contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f1412l = 1;
        AbstractC14183l abstractC14183lLoadAd = contentCaptureManager$ui.loadAd();
        Object[] objArr = abstractC14183lLoadAd.crashlytics;
        long[] jArr = abstractC14183lLoadAd.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C13660l c13660l = ((C13874l) objArr[(i << 3) + i3]).yandex.amazon.f13225l;
                            Object objMopub = c13660l.mopub(AbstractC0424l.inmobi);
                            if (objMopub == null) {
                                objMopub = null;
                            }
                            if (AbstractC8576l.yandex(objMopub, Boolean.TRUE)) {
                                Object objMopub2 = c13660l.mopub(AbstractC16601l.remoteconfig);
                                C7629l c7629l = (C7629l) (objMopub2 != null ? objMopub2 : null);
                                if (c7629l != null && (function1 = (Function1) c7629l.loadAd) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        ViewOnAttachStateChangeListenerC0348l contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f1412l = 2;
        AbstractC14183l abstractC14183lLoadAd = contentCaptureManager$ui.loadAd();
        Object[] objArr = abstractC14183lLoadAd.crashlytics;
        long[] jArr = abstractC14183lLoadAd.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C13660l c13660l = ((C13874l) objArr[(i << 3) + i3]).yandex.amazon.f13225l;
                        Object objMopub = c13660l.mopub(AbstractC0424l.inmobi);
                        if (objMopub == null) {
                            objMopub = null;
                        }
                        if (AbstractC8576l.yandex(objMopub, Boolean.FALSE)) {
                            Object objMopub2 = c13660l.mopub(AbstractC16601l.remoteconfig);
                            C7629l c7629l = (C7629l) (objMopub2 != null ? objMopub2 : null);
                            if (c7629l != null && (function1 = (Function1) c7629l.loadAd) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
