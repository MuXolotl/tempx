package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lَُؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10946l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5613l f22074l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f22075l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7976l f22076l;

    public C10946l(C5613l c5613l, C7976l c7976l) {
        this.f22074l = c5613l;
        this.f22076l = c7976l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f22075l) {
            return;
        }
        this.f22075l = true;
        C5613l c5613l = this.f22074l;
        synchronized (c5613l.f11920l) {
            try {
                C7976l c7976l = this.f22076l;
                int i = c7976l.admob - 1;
                c7976l.admob = i;
                if (i == 0 && c7976l.billing) {
                    c5613l.inmobi(c7976l);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
