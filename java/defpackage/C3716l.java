package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٌؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3716l {
    public int admob;
    public final Rect amazon;
    public final int billing;
    public final boolean crashlytics;
    public C15691l firebase;
    public final Matrix loadAd;
    public final C5464l mopub;
    public final boolean purchase;
    public C10500l smaato;
    public int subs;
    public final int yandex;
    public boolean isPro = false;
    public final HashSet remoteconfig = new HashSet();
    public boolean vip = false;
    public final ArrayList metrica = new ArrayList();

    public C3716l(int i, int i2, C5464l c5464l, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.billing = i;
        this.yandex = i2;
        this.mopub = c5464l;
        this.loadAd = matrix;
        this.crashlytics = z;
        this.amazon = rect;
        this.subs = i3;
        this.admob = i4;
        this.purchase = z2;
        this.smaato = new C10500l(i2, c5464l.yandex);
    }

    public final C15691l amazon(InterfaceC18690l interfaceC18690l, boolean z) {
        AbstractC12225l.crashlytics();
        loadAd();
        C5464l c5464l = this.mopub;
        Size size = c5464l.yandex;
        C15421l c15421l = c5464l.crashlytics;
        int i = c5464l.amazon;
        Range range = c5464l.purchase;
        int i2 = 0;
        C15691l c15691l = new C15691l(size, interfaceC18690l, z, c15421l, i, range, new RunnableC2289l(this, i2));
        try {
            C5571l c5571l = c15691l.remoteconfig;
            C10500l c10500l = this.smaato;
            Objects.requireNonNull(c10500l);
            if (c10500l.mopub(c5571l, new RunnableC8594l(c10500l, i2))) {
                AbstractC11356l.admob(c10500l.purchase).yandex(new RunnableC8523l(c5571l, 0), AbstractC12272l.yandex());
            }
            this.firebase = c15691l;
            billing();
            return c15691l;
        } catch (RuntimeException e) {
            c15691l.crashlytics();
            throw e;
        } catch (C4201l e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        }
    }

    public final void billing() {
        InterfaceC2792l interfaceC2792l;
        Executor executor;
        AbstractC12225l.crashlytics();
        C13808l c13808l = new C13808l(this.amazon, this.subs, this.admob, this.crashlytics, this.loadAd, this.purchase);
        C15691l c15691l = this.firebase;
        if (c15691l != null) {
            synchronized (c15691l.yandex) {
                c15691l.vip = c13808l;
                interfaceC2792l = c15691l.metrica;
                executor = c15691l.startapp;
            }
            if (interfaceC2792l != null && executor != null) {
                executor.execute(new RunnableC0354l(interfaceC2792l, c13808l, 0));
            }
        }
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            ((InterfaceC13241l) it.next()).accept(c13808l);
        }
    }

    public final void crashlytics() {
        AbstractC12225l.crashlytics();
        this.smaato.yandex();
        this.vip = true;
        this.metrica.clear();
        this.remoteconfig.clear();
    }

    public final void loadAd() {
        AbstractC5641l.purchase("Edge is already closed.", !this.vip);
    }

    public final void purchase() {
        boolean z;
        AbstractC12225l.crashlytics();
        loadAd();
        C10500l c10500l = this.smaato;
        c10500l.getClass();
        AbstractC12225l.crashlytics();
        if (c10500l.startapp == null) {
            synchronized (c10500l.yandex) {
                z = c10500l.crashlytics;
            }
            if (!z) {
                return;
            }
        }
        this.isPro = false;
        this.smaato.yandex();
        this.smaato = new C10500l(this.yandex, this.mopub.yandex);
        Iterator it = this.remoteconfig.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.billing);
        sb.append(", format=");
        sb.append(this.yandex);
        sb.append(", resolution=");
        sb.append(this.mopub.yandex);
        sb.append(", cropRect=");
        sb.append(this.amazon);
        sb.append(", rotationDegrees=");
        sb.append(this.subs);
        sb.append(", mirroring=");
        sb.append(this.purchase);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.loadAd;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(AbstractC18611l.loadAd(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(AbstractC18611l.purchase(matrix));
        sb.append(", isClosed=");
        return AbstractC0653l.tapsense(sb, this.vip, '}');
    }

    public final void yandex(Runnable runnable) {
        AbstractC12225l.crashlytics();
        loadAd();
        this.remoteconfig.add(runnable);
    }
}
