package defpackage;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُٗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17057l {
    public static final ArrayList crashlytics;
    public static final ThreadLocal loadAd;
    public static final C0132l yandex;

    static {
        C0132l c0132l = new C0132l();
        c0132l.f1038l = new ArrayList();
        c0132l.f1039l = false;
        c0132l.f1036l = 0;
        c0132l.f1040l = false;
        c0132l.m277extends(new C5671l(2));
        c0132l.m277extends(new C5593l());
        c0132l.m277extends(new C5671l(1));
        yandex = c0132l;
        loadAd = new ThreadLocal();
        crashlytics = new ArrayList();
    }

    public static C11154l loadAd() {
        C11154l c11154l;
        ThreadLocal threadLocal = loadAd;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c11154l = (C11154l) weakReference.get()) != null) {
            return c11154l;
        }
        C11154l c11154l2 = new C11154l(0);
        threadLocal.set(new WeakReference(c11154l2));
        return c11154l2;
    }

    public static void yandex(FrameLayout frameLayout, AbstractC1299l abstractC1299l) {
        ArrayList arrayList = crashlytics;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC1299l == null) {
            abstractC1299l = yandex;
        }
        AbstractC1299l abstractC1299lClone = abstractC1299l.clone();
        ArrayList arrayList2 = (ArrayList) loadAd().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC1299l) it.next()).advert(frameLayout);
            }
        }
        abstractC1299lClone.subs(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            C18725l.loadAd();
            return;
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC13547l viewTreeObserverOnPreDrawListenerC13547l = new ViewTreeObserverOnPreDrawListenerC13547l();
        viewTreeObserverOnPreDrawListenerC13547l.f26566l = abstractC1299lClone;
        viewTreeObserverOnPreDrawListenerC13547l.f26565l = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC13547l);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC13547l);
    }
}
