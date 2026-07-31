package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lٍْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9531l implements InterfaceC15189l {
    public volatile Set loadAd;
    public volatile Set yandex;

    @Override // defpackage.InterfaceC15189l
    public final Object get() {
        if (this.loadAd == null) {
            synchronized (this) {
                try {
                    if (this.loadAd == null) {
                        this.loadAd = Collections.newSetFromMap(new ConcurrentHashMap());
                        yandex();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.loadAd);
    }

    public final synchronized void yandex() {
        try {
            Iterator it = this.yandex.iterator();
            while (it.hasNext()) {
                this.loadAd.add(((InterfaceC15189l) it.next()).get());
            }
            this.yandex = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
