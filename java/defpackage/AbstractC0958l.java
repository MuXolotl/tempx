package defpackage;

import android.util.Log;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lََؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0958l {
    public static final boolean firebase;
    public static final AtomicInteger remoteconfig;
    public static final AtomicInteger smaato;
    public final Size admob;
    public C5807l amazon;
    public C5807l billing;
    public Class isPro;
    public final C16565l mopub;
    public final C16565l purchase;
    public final int subs;
    public final Object yandex = new Object();
    public int loadAd = 0;
    public boolean crashlytics = false;

    static {
        new Size(0, 0);
        firebase = AbstractC5088l.firebase("DeferrableSurface");
        smaato = new AtomicInteger(0);
        remoteconfig = new AtomicInteger(0);
    }

    public AbstractC0958l(int i, Size size) {
        final int i2 = 0;
        this.admob = size;
        this.subs = i;
        C16565l c16565lPurchase = AbstractC11064l.purchase(new InterfaceC7456l(this) { // from class: lْْٕ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC0958l f26290l;

            {
                this.f26290l = this;
            }

            private final Object yandex(C5807l c5807l) {
                AbstractC0958l abstractC0958l = this.f26290l;
                synchronized (abstractC0958l.yandex) {
                    abstractC0958l.amazon = c5807l;
                }
                return "DeferrableSurface-termination(" + abstractC0958l + ")";
            }

            @Override // defpackage.InterfaceC7456l
            /* JADX INFO: renamed from: default */
            public final Object mo672default(C5807l c5807l) {
                switch (i2) {
                    case 0:
                        return yandex(c5807l);
                    default:
                        AbstractC0958l abstractC0958l = this.f26290l;
                        synchronized (abstractC0958l.yandex) {
                            abstractC0958l.billing = c5807l;
                            break;
                        }
                        return "DeferrableSurface-close(" + abstractC0958l + ")";
                }
            }
        });
        this.purchase = c16565lPurchase;
        final int i3 = 1;
        this.mopub = AbstractC11064l.purchase(new InterfaceC7456l(this) { // from class: lْْٕ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC0958l f26290l;

            {
                this.f26290l = this;
            }

            private final Object yandex(C5807l c5807l) {
                AbstractC0958l abstractC0958l = this.f26290l;
                synchronized (abstractC0958l.yandex) {
                    abstractC0958l.amazon = c5807l;
                }
                return "DeferrableSurface-termination(" + abstractC0958l + ")";
            }

            @Override // defpackage.InterfaceC7456l
            /* JADX INFO: renamed from: default */
            public final Object mo672default(C5807l c5807l) {
                switch (i3) {
                    case 0:
                        return yandex(c5807l);
                    default:
                        AbstractC0958l abstractC0958l = this.f26290l;
                        synchronized (abstractC0958l.yandex) {
                            abstractC0958l.billing = c5807l;
                            break;
                        }
                        return "DeferrableSurface-close(" + abstractC0958l + ")";
                }
            }
        });
        if (AbstractC5088l.firebase("DeferrableSurface")) {
            purchase(remoteconfig.incrementAndGet(), smaato.get(), "Surface created");
            c16565lPurchase.f32512l.yandex(new RunnableC0336l(this, Log.getStackTraceString(new Exception()), 8), AbstractC12272l.yandex());
        }
    }

    public final void amazon() {
        synchronized (this.yandex) {
            try {
                int i = this.loadAd;
                if (i == 0 && this.crashlytics) {
                    throw new C4201l("Cannot begin use on a closed surface.", this);
                }
                this.loadAd = i + 1;
                if (AbstractC5088l.firebase("DeferrableSurface")) {
                    if (this.loadAd == 1) {
                        purchase(remoteconfig.get(), smaato.incrementAndGet(), "New surface in use");
                    }
                    AbstractC5088l.yandex("DeferrableSurface", "use count+1, useCount=" + this.loadAd + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ListenableFuture billing();

    public final ListenableFuture crashlytics() {
        synchronized (this.yandex) {
            try {
                if (this.crashlytics) {
                    return new C11077l(1, new C4201l("DeferrableSurface already closed.", this));
                }
                return billing();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void loadAd() {
        C5807l c5807l;
        synchronized (this.yandex) {
            try {
                int i = this.loadAd;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.loadAd = i2;
                if (i2 == 0 && this.crashlytics) {
                    c5807l = this.amazon;
                    this.amazon = null;
                } else {
                    c5807l = null;
                }
                if (AbstractC5088l.firebase("DeferrableSurface")) {
                    AbstractC5088l.yandex("DeferrableSurface", "use count-1,  useCount=" + this.loadAd + " closed=" + this.crashlytics + " " + this);
                    if (this.loadAd == 0) {
                        purchase(remoteconfig.get(), smaato.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5807l != null) {
            c5807l.loadAd(null);
        }
    }

    public final void purchase(int i, int i2, String str) {
        if (!firebase && AbstractC5088l.firebase("DeferrableSurface")) {
            AbstractC5088l.yandex("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC5088l.yandex("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public void yandex() {
        C5807l c5807l;
        synchronized (this.yandex) {
            try {
                if (this.crashlytics) {
                    c5807l = null;
                } else {
                    this.crashlytics = true;
                    this.billing.loadAd(null);
                    if (this.loadAd == 0) {
                        c5807l = this.amazon;
                        this.amazon = null;
                    } else {
                        c5807l = null;
                    }
                    if (AbstractC5088l.firebase("DeferrableSurface")) {
                        AbstractC5088l.yandex("DeferrableSurface", "surface closed,  useCount=" + this.loadAd + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5807l != null) {
            c5807l.loadAd(null);
        }
    }
}
