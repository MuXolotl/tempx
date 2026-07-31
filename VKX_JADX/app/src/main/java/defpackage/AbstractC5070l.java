package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: lٟؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5070l implements InterfaceC1127l {
    public C3875l amazon;
    public long billing;
    public final ArrayDeque crashlytics;
    public final ArrayDeque loadAd;
    public long mopub;
    public long purchase;
    public final ArrayDeque yandex = new ArrayDeque();

    public AbstractC5070l() {
        for (int i = 0; i < 10; i++) {
            this.yandex.add(new C3875l(1));
        }
        this.loadAd = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.loadAd;
            C2683l c2683l = new C2683l(14, this);
            C10563l c10563l = new C10563l();
            c10563l.f21475l = c2683l;
            arrayDeque.add(c10563l);
        }
        this.crashlytics = new ArrayDeque();
        this.mopub = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC12313l
    /* JADX INFO: renamed from: admob, reason: merged with bridge method [inline-methods] */
    public C10563l crashlytics() {
        ArrayDeque arrayDeque = this.loadAd;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.crashlytics;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C3875l c3875l = (C3875l) arrayDeque2.peek();
            String str = AbstractC15323l.yandex;
            if (c3875l.f8496l > this.purchase) {
                return null;
            }
            C3875l c3875l2 = (C3875l) arrayDeque2.poll();
            boolean zCrashlytics = c3875l2.crashlytics(4);
            ArrayDeque arrayDeque3 = this.yandex;
            if (zCrashlytics) {
                C10563l c10563l = (C10563l) arrayDeque.pollFirst();
                c10563l.yandex(4);
                c3875l2.remoteconfig();
                arrayDeque3.add(c3875l2);
                return c10563l;
            }
            mopub(c3875l2);
            if (subs()) {
                C8341l c8341lBilling = billing();
                C10563l c10563l2 = (C10563l) arrayDeque.pollFirst();
                long j = c3875l2.f8496l;
                c10563l2.f23515l = j;
                c10563l2.f21476l = c8341lBilling;
                c10563l2.f21477l = j;
                c3875l2.remoteconfig();
                arrayDeque3.add(c3875l2);
                return c10563l2;
            }
            c3875l2.remoteconfig();
            arrayDeque3.add(c3875l2);
        }
    }

    @Override // defpackage.InterfaceC12313l
    public final Object amazon() {
        AbstractC12442l.subscription(this.amazon == null);
        ArrayDeque arrayDeque = this.yandex;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C3875l c3875l = (C3875l) arrayDeque.pollFirst();
        this.amazon = c3875l;
        return c3875l;
    }

    public abstract C8341l billing();

    @Override // defpackage.InterfaceC12313l
    public void flush() {
        ArrayDeque arrayDeque;
        this.billing = 0L;
        this.purchase = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.crashlytics;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.yandex;
            if (zIsEmpty) {
                break;
            }
            C3875l c3875l = (C3875l) arrayDeque2.poll();
            String str = AbstractC15323l.yandex;
            c3875l.remoteconfig();
            arrayDeque.add(c3875l);
        }
        C3875l c3875l2 = this.amazon;
        if (c3875l2 != null) {
            c3875l2.remoteconfig();
            arrayDeque.add(c3875l2);
            this.amazon = null;
        }
    }

    @Override // defpackage.InterfaceC1127l
    public final void loadAd(long j) {
        this.purchase = j;
    }

    public abstract void mopub(C3875l c3875l);

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // defpackage.InterfaceC12313l
    public final void purchase(C1626l c1626l) {
        AbstractC12442l.admob(c1626l == this.amazon);
        C3875l c3875l = (C3875l) c1626l;
        if (c3875l.crashlytics(4)) {
            long j = this.billing;
            this.billing = 1 + j;
            c3875l.f8009l = j;
            this.crashlytics.add(c3875l);
        } else {
            long j2 = c3875l.f8496l;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.mopub;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.billing;
                    this.billing = 1 + j4;
                    c3875l.f8009l = j4;
                    this.crashlytics.add(c3875l);
                } else {
                    c3875l.remoteconfig();
                    this.yandex.add(c3875l);
                }
            } else {
                long j5 = this.billing;
                this.billing = 1 + j5;
                c3875l.f8009l = j5;
                this.crashlytics.add(c3875l);
            }
        }
        this.amazon = null;
    }

    public abstract boolean subs();

    @Override // defpackage.InterfaceC12313l
    public final void yandex(long j) {
        this.mopub = j;
    }

    @Override // defpackage.InterfaceC12313l
    public void release() {
    }
}
