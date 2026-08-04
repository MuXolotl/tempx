package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: renamed from: lْٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C14676l implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f28719l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28720l;

    public /* synthetic */ ComponentCallbacks2C14676l(int i, Object obj) {
        this.f28720l = i;
        this.f28719l = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.f28720l) {
            case 0:
                return;
            default:
                C18480l c18480l = (C18480l) this.f28719l;
                synchronized (c18480l) {
                    if (((C13177l) ((WeakReference) c18480l.f36084l).get()) == null) {
                        c18480l.subscription();
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.f28720l) {
            case 0:
                break;
            default:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C16554l c16554lAmazon;
        switch (this.f28720l) {
            case 0:
                if (i >= 40) {
                    C1241l.amazon((C1241l) this.f28719l);
                    return;
                }
                return;
            default:
                C18480l c18480l = (C18480l) this.f28719l;
                synchronized (c18480l) {
                    try {
                        C13177l c13177l = (C13177l) ((WeakReference) c18480l.f36084l).get();
                        if (c13177l != null) {
                            C13615l c13615l = c13177l.yandex;
                            if (i >= 40) {
                                C16554l c16554lAmazon2 = c13177l.amazon();
                                if (c16554lAmazon2 != null) {
                                    c16554lAmazon2.yandex();
                                }
                            } else if (i >= 20) {
                                ((C18520l) c18480l.f36088l).yandex(c13615l.yandex);
                            } else if (i >= 10 && (c16554lAmazon = c13177l.amazon()) != null) {
                                c16554lAmazon.billing(c16554lAmazon.crashlytics() / 2);
                            }
                        } else {
                            c18480l.subscription();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    private final void loadAd() {
    }

    private final void yandex(Configuration configuration) {
    }
}
