package defpackage;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import kotlin.Unit;

/* JADX INFO: renamed from: lِٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC15875l implements Runnable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31141l;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31141l) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.yandex;
                return;
            case 1:
                C12463l c12463l = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26990l;
                synchronized (c12463l) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = c12463l.yandex;
                        int i3 = c12463l.loadAd;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) objArr[i4];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC13840l.getShowLayoutBounds();
                                C15718l c15718l = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26995l;
                                viewTreeObserverOnGlobalLayoutListenerC13840l.setShowLayoutBounds(C15718l.adcel());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC13840l.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC13840l.post(new RunnableC12322l(viewTreeObserverOnGlobalLayoutListenerC13840l, 2));
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l2 = (ViewTreeObserverOnGlobalLayoutListenerC13840l) objArr[i4];
                                viewTreeObserverOnGlobalLayoutListenerC13840l2.post(new RunnableC12322l(viewTreeObserverOnGlobalLayoutListenerC13840l2, 3));
                                i4++;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            default:
                AbstractC5088l.yandex("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                return;
        }
    }

    private final void amazon() {
    }

    private final void crashlytics() {
    }

    private final void loadAd() {
    }

    private final void yandex() {
    }
}
