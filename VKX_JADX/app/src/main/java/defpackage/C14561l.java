package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14561l implements InterfaceC11791l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f28508l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f28509l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8490l f28510l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2397l f28511l;

    public C14561l(C8490l c8490l, long j, Object obj, C2397l c2397l) {
        this.f28510l = c8490l;
        this.f28509l = j;
        this.f28508l = obj;
        this.f28511l = c2397l;
    }

    @Override // defpackage.InterfaceC11791l
    public final void yandex() {
        C8490l c8490l = this.f28510l;
        synchronized (c8490l) {
            try {
                if (this.f28509l >= c8490l.adcel()) {
                    Object[] objArr = c8490l.f17547l;
                    if (AbstractC3861l.crashlytics(objArr, this.f28509l) == this) {
                        AbstractC3861l.amazon(objArr, this.f28509l, AbstractC3861l.yandex);
                        c8490l.smaato();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
