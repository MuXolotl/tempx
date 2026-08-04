package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓۨۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14588l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f28569l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f28571l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11315l f28570l = new C11315l();

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f28571l) {
            if (this.f28569l) {
                return;
            }
            this.f28569l = true;
            Unit unit = Unit.INSTANCE;
            Iterator<E> it = this.f28570l.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            this.f28570l.clear();
        }
    }

    public final void yandex() {
        synchronized (this.f28571l) {
            try {
                if (this.f28569l) {
                    return;
                }
                Iterator it = this.f28570l.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
