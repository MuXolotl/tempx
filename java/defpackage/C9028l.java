package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌۚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9028l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C12292l f18586l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final LinkedHashMap f18587l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f18588l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC15897l f18589l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5664l f18590l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f18591l = new Object();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Map f18592l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f18593l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final LinkedHashMap f18594l;

    public C9028l(C5664l c5664l, C13161l c13161l, C12292l c12292l, Map map) {
        this.f18590l = c5664l;
        this.f18589l = c13161l;
        this.f18586l = c12292l;
        this.f18592l = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((AbstractC8698l) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.f18594l = linkedHashMap;
        this.f18587l = new LinkedHashMap();
        this.f18588l = true;
    }

    public final void billing() {
        synchronized (this.f18591l) {
            try {
                if (this.f18593l) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.f18594l.values()) {
                    this.f18587l.put(surface, this.f18586l.yandex(surface));
                }
                this.f18588l = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f18591l) {
            if (this.f18593l) {
                return;
            }
            this.f18593l = true;
            this.f18594l.clear();
            List<AutoCloseable> listM4213const = AbstractC16901l.m4213const(this.f18587l.values());
            this.f18587l.clear();
            for (AutoCloseable autoCloseable : listM4213const) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    AbstractC14238l.subscription((ExecutorService) autoCloseable);
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof ContentProviderClient)) {
                        C11983l.crashlytics();
                        return;
                    }
                    ((ContentProviderClient) autoCloseable).release();
                }
            }
        }
    }

    public final void mopub() throws Exception {
        List<AutoCloseable> listM4213const;
        synchronized (this.f18591l) {
            this.f18588l = false;
            listM4213const = AbstractC16901l.m4213const(this.f18587l.values());
            this.f18587l.clear();
        }
        for (AutoCloseable autoCloseable : listM4213const) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                AbstractC14238l.subscription((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    C11983l.crashlytics();
                    return;
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
    }

    public final void yandex() {
        Map linkedHashMap;
        synchronized (this.f18591l) {
            linkedHashMap = new LinkedHashMap();
            loop0: for (C11304l c11304l : this.f18590l.f12036l) {
                for (C9494l c9494l : c11304l.smaato) {
                    Surface surface = (Surface) this.f18594l.get(new C16755l(c9494l.yandex));
                    if (surface == null) {
                        if (!(c11304l.billing != null)) {
                            linkedHashMap = C14054l.f27396l;
                            break loop0;
                        }
                    } else {
                        linkedHashMap.put(new C16755l(c9494l.yandex), surface);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        ((C7276l) this.f18589l.get()).subs(linkedHashMap);
    }
}
