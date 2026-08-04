package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: lًؒٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1164l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f3148l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3149l;

    public /* synthetic */ C1164l(int i, Object obj) {
        this.f3149l = i;
        this.f3148l = obj;
    }

    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        switch (this.f3149l) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC1666l interfaceC1666l = (InterfaceC1666l) this.f3148l;
                interfaceC1666l.getClass();
                entry.getClass();
                return new C6925l(entry, interfaceC1666l);
            case 1:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((C10316l) this.f3148l).crashlytics)), (Throwable) obj);
                return null;
            case 2:
                C14728l c14728l = (C14728l) obj;
                C1004l c1004l = AbstractC15628l.yandex;
                String str = (String) this.f3148l;
                C8200l c8200l = (C8200l) c14728l.tapsense(str, C15915l.Signature()).firebase();
                if (!DesugarCollections.unmodifiableList(((C15915l) c8200l.f20498l).tapsense()).contains("")) {
                    c8200l.loadAd();
                    ((C15915l) c8200l.f20498l).license("");
                }
                C14827l c14827l = (C14827l) c14728l.firebase();
                c8200l.loadAd();
                ((C15915l) c8200l.f20498l).pro("");
                C15915l c15915l = (C15915l) c8200l.amazon();
                c14827l.loadAd();
                ((C14728l) c14827l.f20498l).license().put(str, c15915l);
                return (C14728l) c14827l.amazon();
            default:
                C2079l c2079l = (C2079l) this.f3148l;
                C0701l c0701l = (C0701l) obj;
                C5633l c5633l = new C5633l(13);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (C2079l.isPro) {
                            C2830l c2830l = (C2830l) c2079l.amazon.get();
                            Uri uri = c2079l.mopub;
                            C17516l c17516l = new C17516l(c0701l.tapsense());
                            c17516l.f34133l = new C5633l[]{c5633l};
                            c2830l.yandex(uri, c17516l);
                            c2079l.admob = c0701l.tapsense();
                            break;
                        }
                        synchronized (C2079l.firebase) {
                            C2830l c2830l2 = (C2830l) c2079l.amazon.get();
                            Uri uri2 = c2079l.subs;
                            C17516l c17516l2 = new C17516l(c0701l.Signature());
                            c17516l2.f34133l = new C5633l[]{c5633l};
                            c2830l2.yandex(uri2, c17516l2);
                            c0701l.Signature();
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
        }
    }
}
