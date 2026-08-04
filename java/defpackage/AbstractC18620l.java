package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l۠ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18620l {
    public int amazon;
    public boolean crashlytics;
    public long loadAd;
    public C8739l yandex;

    public AbstractC18620l(long j, C8739l c8739l) {
        int iYandex;
        int iNumberOfTrailingZeros;
        this.yandex = c8739l;
        this.loadAd = j;
        C1698l c1698l = AbstractC9620l.yandex;
        if (j != 0) {
            C8739l c8739lAmazon = amazon();
            long j2 = c8739lAmazon.f17991l;
            long[] jArr = c8739lAmazon.f17994l;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = c8739lAmazon.f17992l;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = c8739lAmazon.f17993l;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (AbstractC9620l.crashlytics) {
                iYandex = AbstractC9620l.billing.yandex(j);
            }
        } else {
            iYandex = -1;
        }
        this.amazon = iYandex;
    }

    public static void adcel(AbstractC18620l abstractC18620l) {
        AbstractC9620l.loadAd.firebase(abstractC18620l);
    }

    public abstract AbstractC18620l Signature(Function1 function1);

    public int admob() {
        return 0;
    }

    public void ads(C8739l c8739l) {
        this.yandex = c8739l;
    }

    public C8739l amazon() {
        return this.yandex;
    }

    public abstract boolean billing();

    public void crashlytics() {
        this.crashlytics = true;
        synchronized (AbstractC9620l.crashlytics) {
            metrica();
            Unit unit = Unit.INSTANCE;
        }
    }

    public abstract void firebase();

    public final AbstractC18620l isPro() {
        C4816l c4816l = AbstractC9620l.loadAd;
        AbstractC18620l abstractC18620l = (AbstractC18620l) c4816l.get();
        c4816l.firebase(this);
        return abstractC18620l;
    }

    public void loadAd() {
        AbstractC9620l.amazon = AbstractC9620l.amazon.billing(mopub());
    }

    public final void metrica() {
        int i = this.amazon;
        if (i >= 0) {
            AbstractC9620l.license(i);
            this.amazon = -1;
        }
    }

    public long mopub() {
        return this.loadAd;
    }

    public abstract Function1 purchase();

    public abstract void remoteconfig();

    public abstract void smaato();

    public void startapp() {
        metrica();
    }

    public abstract Function1 subs();

    public void subscription(long j) {
        this.loadAd = j;
    }

    public void tapsense(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract void vip(InterfaceC2763l interfaceC2763l);

    public final void yandex() {
        synchronized (AbstractC9620l.crashlytics) {
            loadAd();
            startapp();
            Unit unit = Unit.INSTANCE;
        }
    }
}
