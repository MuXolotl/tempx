package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٕٝۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15832l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11675l f31085l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f31086l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31087l;

    public RunnableC15832l(C11675l c11675l, AtomicReference atomicReference, int i) {
        this.f31087l = i;
        switch (i) {
            case 1:
                this.f31086l = atomicReference;
                Objects.requireNonNull(c11675l);
                this.f31085l = c11675l;
                break;
            case 2:
                this.f31086l = atomicReference;
                Objects.requireNonNull(c11675l);
                this.f31085l = c11675l;
                break;
            case 3:
                this.f31086l = atomicReference;
                Objects.requireNonNull(c11675l);
                this.f31085l = c11675l;
                break;
            case 4:
                this.f31086l = atomicReference;
                Objects.requireNonNull(c11675l);
                this.f31085l = c11675l;
                break;
            default:
                this.f31086l = atomicReference;
                Objects.requireNonNull(c11675l);
                this.f31085l = c11675l;
                break;
        }
    }

    private final void amazon() {
        AtomicReference atomicReference = this.f31086l;
        synchronized (atomicReference) {
            try {
                try {
                    C17417l c17417l = (C17417l) this.f31085l.f833l;
                    atomicReference.set(Double.valueOf(c17417l.f33945l.m1679l(c17417l.remoteconfig().m2821l(), AbstractC5981l.f12699public)));
                    this.f31086l.notify();
                } catch (Throwable th) {
                    this.f31086l.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void crashlytics() {
        AtomicReference atomicReference = this.f31086l;
        synchronized (atomicReference) {
            try {
                try {
                    C17417l c17417l = (C17417l) this.f31085l.f833l;
                    atomicReference.set(Integer.valueOf(c17417l.f33945l.m1683l(c17417l.remoteconfig().m2821l(), AbstractC5981l.f12645instanceof)));
                    this.f31086l.notify();
                } catch (Throwable th) {
                    this.f31086l.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void loadAd() {
        AtomicReference atomicReference = this.f31086l;
        synchronized (atomicReference) {
            try {
                try {
                    C17417l c17417l = (C17417l) this.f31085l.f833l;
                    atomicReference.set(Long.valueOf(c17417l.f33945l.m1674l(c17417l.remoteconfig().m2821l(), AbstractC5981l.f12629abstract)));
                    this.f31086l.notify();
                } catch (Throwable th) {
                    this.f31086l.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void yandex() {
        AtomicReference atomicReference = this.f31086l;
        synchronized (atomicReference) {
            try {
                try {
                    C17417l c17417l = (C17417l) this.f31085l.f833l;
                    atomicReference.set(c17417l.f33945l.m1681l(c17417l.remoteconfig().m2821l(), AbstractC5981l.f12644import));
                    this.f31086l.notify();
                } catch (Throwable th) {
                    this.f31086l.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31087l) {
            case 0:
                AtomicReference atomicReference = this.f31086l;
                synchronized (atomicReference) {
                    try {
                        try {
                            C17417l c17417l = (C17417l) this.f31085l.f833l;
                            atomicReference.set(Boolean.valueOf(c17417l.f33945l.m1682l(c17417l.remoteconfig().m2821l(), AbstractC5981l.f12703super)));
                            this.f31086l.notify();
                        } catch (Throwable th) {
                            this.f31086l.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                yandex();
                return;
            case 2:
                loadAd();
                return;
            case 3:
                crashlytics();
                return;
            case 4:
                amazon();
                return;
            case 5:
                C11675l c11675l = this.f31085l;
                C16386l c16386l = ((C17417l) c11675l.f833l).f33944l;
                C17417l.billing(c16386l);
                Bundle bundleAmazon = c16386l.f32052l.amazon();
                C11860l c11860lFirebase = ((C17417l) c11675l.f833l).firebase();
                AtomicReference atomicReference2 = this.f31086l;
                c11860lFirebase.mo211l();
                c11860lFirebase.m2935l();
                c11860lFirebase.m3267l(new RunnableC16843l(13, c11860lFirebase, atomicReference2, c11860lFirebase.m3269l(false), bundleAmazon, false));
                return;
            default:
                C11860l c11860lFirebase2 = ((C17417l) this.f31085l.f833l).firebase();
                C18032l c18032lBilling = C18032l.billing(EnumC5250l.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.f31086l;
                c11860lFirebase2.mo211l();
                c11860lFirebase2.m2935l();
                c11860lFirebase2.m3267l(new RunnableC16843l(14, c11860lFirebase2, atomicReference3, c11860lFirebase2.m3269l(false), c18032lBilling, false));
                return;
        }
    }

    public /* synthetic */ RunnableC15832l(C11675l c11675l, AtomicReference atomicReference, int i, boolean z) {
        this.f31087l = i;
        this.f31085l = c11675l;
        this.f31086l = atomicReference;
    }
}
