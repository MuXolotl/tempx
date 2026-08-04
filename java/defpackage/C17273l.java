package defpackage;

import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17273l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C18474l f33506l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33507l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Surface f33508l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C12292l f33509l;

    public C17273l(C12292l c12292l, Surface surface) {
        this.f33509l = c12292l;
        this.f33508l = surface;
        C11879l c11879l = C12292l.amazon;
        c11879l.getClass();
        this.f33507l = C11879l.loadAd.incrementAndGet(c11879l);
        this.f33506l = AbstractC1805l.yandex(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List listM4213const;
        if (this.f33506l.yandex()) {
            C12292l c12292l = this.f33509l;
            synchronized (c12292l.yandex) {
                try {
                    surface = this.f33508l;
                    Integer num = (Integer) c12292l.loadAd.get(surface);
                    if (num == null) {
                        throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                    }
                    int iIntValue = num.intValue() - 1;
                    c12292l.loadAd.put(surface, Integer.valueOf(iIntValue));
                    if (iIntValue == 0) {
                        listM4213const = AbstractC16901l.m4213const(c12292l.crashlytics);
                        c12292l.loadAd.remove(surface);
                    } else {
                        listM4213const = null;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (listM4213const != null) {
                Iterator it = listM4213const.iterator();
                while (it.hasNext()) {
                    ((C4271l) it.next()).purchase(surface);
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.f33507l;
    }
}
