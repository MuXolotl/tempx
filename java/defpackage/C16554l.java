package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖۖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16554l {
    public final Object crashlytics = new Object();
    public final C14785l loadAd;
    public final C8043l yandex;

    public C16554l(C8043l c8043l, C14785l c14785l) {
        this.yandex = c8043l;
        this.loadAd = c14785l;
    }

    public final void amazon(C1791l c1791l) {
        synchronized (this.crashlytics) {
            C16528l c16528l = (C16528l) this.yandex.f16741l;
            Object objRemove = ((LinkedHashMap) c16528l.f32302l).remove(c1791l);
            if (objRemove != null) {
                c16528l.f32306l = c16528l.purchase() - c16528l.mopub(c1791l, objRemove);
                c16528l.loadAd(c1791l, objRemove, null);
            }
            if (objRemove != null) {
            }
            if (((LinkedHashMap) this.loadAd.f28907l).remove(c1791l) != null) {
            }
        }
    }

    public final void billing(long j) {
        synchronized (this.crashlytics) {
            ((C16528l) this.yandex.f16741l).admob(j);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final long crashlytics() {
        long jPurchase;
        synchronized (this.crashlytics) {
            jPurchase = ((C16528l) this.yandex.f16741l).purchase();
        }
        return jPurchase;
    }

    public final C13436l loadAd(C1791l c1791l) {
        C13436l c13436l;
        synchronized (this.crashlytics) {
            try {
                C9178l c9178l = (C9178l) ((LinkedHashMap) ((C16528l) this.yandex.f16741l).f32302l).get(c1791l);
                C13436l c13436l2 = null;
                c13436l = c9178l != null ? new C13436l(c9178l.yandex, c9178l.loadAd) : null;
                if (c13436l == null) {
                    C14785l c14785l = this.loadAd;
                    ArrayList arrayList = (ArrayList) ((LinkedHashMap) c14785l.f28907l).get(c1791l);
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            C15766l c15766l = (C15766l) arrayList.get(i);
                            InterfaceC1286l interfaceC1286l = (InterfaceC1286l) c15766l.yandex.get();
                            C13436l c13436l3 = interfaceC1286l != null ? new C13436l(interfaceC1286l, c15766l.loadAd) : null;
                            if (c13436l3 != null) {
                                c13436l2 = c13436l3;
                                break;
                            }
                        }
                        c14785l.admob();
                    }
                    c13436l = c13436l2;
                }
                if (c13436l != null && !c13436l.yandex.admob()) {
                    amazon(c1791l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c13436l;
    }

    public final void purchase(long j) {
        synchronized (this.crashlytics) {
            C16528l c16528l = (C16528l) this.yandex.f16741l;
            c16528l.f32303l = j;
            c16528l.admob(j);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void yandex() {
        synchronized (this.crashlytics) {
            ((C16528l) this.yandex.f16741l).admob(-1L);
            C14785l c14785l = this.loadAd;
            c14785l.f28908l = 0;
            ((LinkedHashMap) c14785l.f28907l).clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
