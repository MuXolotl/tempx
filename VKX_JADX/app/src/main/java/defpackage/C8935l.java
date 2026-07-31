package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8935l implements InterfaceC9492l, InterfaceC12762l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f18404l = new CopyOnWriteArrayList();

    public final void amazon(C4418l c4418l) {
        this.f18404l.add(c4418l);
    }

    @Override // defpackage.InterfaceC12762l
    public final void crashlytics() {
        Iterator it = this.f18404l.iterator();
        while (it.hasNext()) {
            ((C4418l) it.next()).crashlytics();
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void inmobi(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        purchase(interfaceC10687l.mo2963super(), (C15331l) c9992l.f20389l);
    }

    @Override // defpackage.InterfaceC12762l
    public final void loadAd() {
        Iterator it = this.f18404l.iterator();
        while (it.hasNext()) {
            ((C4418l) it.next()).crashlytics();
        }
    }

    public final void purchase(long j, C15331l c15331l) {
        Integer num;
        for (C4418l c4418l : this.f18404l) {
            boolean z = true;
            if (!c4418l.f8995l.mo2155l() && !c4418l.f8995l.isCancelled()) {
                synchronized (c4418l) {
                    C7482l c7482l = c4418l.f8991l;
                    if (c7482l != null && j >= c7482l.yandex) {
                        Unit unit = Unit.INSTANCE;
                        Long l = (Long) c15331l.f29963l.get(CaptureResult.SENSOR_TIMESTAMP);
                        long frameNumber = c15331l.f29963l.getFrameNumber();
                        if (l != null && c4418l.f8996l == null) {
                            c4418l.f8996l = l;
                        }
                        Long l2 = c4418l.f8996l;
                        if (c4418l.f8990l == null || l2 == null || l == null || l.longValue() - l2.longValue() <= c4418l.f8990l.longValue()) {
                            if (c4418l.f8994l == null) {
                                c4418l.f8994l = new C1266l(frameNumber);
                            }
                            C1266l c1266l = c4418l.f8994l;
                            if (c1266l != null && (num = c4418l.f8992l) != null && frameNumber - c1266l.yandex > num.intValue()) {
                                c4418l.f8995l.m3885new(new C6346l(1, c15331l));
                            } else if (((Boolean) c4418l.f8993l.invoke(c15331l)).booleanValue()) {
                                c4418l.f8995l.m3885new(new C6346l(0, c15331l));
                            }
                        } else {
                            c4418l.f8995l.m3885new(new C6346l(2, c15331l));
                        }
                    }
                }
                z = false;
            }
            if (z) {
                this.f18404l.remove(c4418l);
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: synchronized */
    public final void mo1761synchronized(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
        purchase(interfaceC10687l.mo2963super(), c15331l);
    }

    @Override // defpackage.InterfaceC9492l
    public final void vip(InterfaceC10687l interfaceC10687l) {
        for (C4418l c4418l : this.f18404l) {
            long jMo2963super = interfaceC10687l.mo2963super();
            synchronized (c4418l) {
                try {
                    if (c4418l.f8991l == null) {
                        c4418l.f8991l = new C7482l(jMo2963super);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC12762l
    public final void yandex() {
        Iterator it = this.f18404l.iterator();
        while (it.hasNext()) {
            ((C4418l) it.next()).crashlytics();
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void ads(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo1758package(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ void mo1760switch(C15390l c15390l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void adcel(InterfaceC10687l interfaceC10687l, long j) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void signatures(InterfaceC10687l interfaceC10687l, int i) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void isVip(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void mopub(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: private */
    public final /* synthetic */ void mo1759private(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: throw */
    public final /* synthetic */ void mo1762throw(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void billing(InterfaceC10687l interfaceC10687l, long j, int i, int i2) {
    }
}
