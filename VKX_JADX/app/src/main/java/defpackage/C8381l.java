package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: lًۤٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C8381l {
    public static final /* synthetic */ AtomicIntegerFieldUpdater loadAd = AtomicIntegerFieldUpdater.newUpdater(C8381l.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public AbstractRunnableC7736l[] yandex;

    public final void amazon(int i, int i2) {
        AbstractRunnableC7736l[] abstractRunnableC7736lArr = this.yandex;
        AbstractRunnableC7736l abstractRunnableC7736l = abstractRunnableC7736lArr[i2];
        AbstractRunnableC7736l abstractRunnableC7736l2 = abstractRunnableC7736lArr[i];
        abstractRunnableC7736lArr[i] = abstractRunnableC7736l;
        abstractRunnableC7736lArr[i2] = abstractRunnableC7736l2;
        abstractRunnableC7736l.f16232l = i;
        abstractRunnableC7736l2.f16232l = i2;
    }

    public final AbstractRunnableC7736l crashlytics(int i) {
        AbstractRunnableC7736l[] abstractRunnableC7736lArr = this.yandex;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = loadAd;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            amazon(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || abstractRunnableC7736lArr[i].compareTo(abstractRunnableC7736lArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    AbstractRunnableC7736l[] abstractRunnableC7736lArr2 = this.yandex;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || abstractRunnableC7736lArr2[i5].compareTo(abstractRunnableC7736lArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (abstractRunnableC7736lArr2[i].compareTo(abstractRunnableC7736lArr2[i5]) <= 0) {
                        break;
                    }
                    amazon(i, i5);
                    i = i5;
                }
            } else {
                amazon(i, i2);
                while (i2 > 0) {
                    AbstractRunnableC7736l[] abstractRunnableC7736lArr3 = this.yandex;
                    int i6 = (i2 - 1) / 2;
                    if (abstractRunnableC7736lArr3[i6].compareTo(abstractRunnableC7736lArr3[i2]) <= 0) {
                        break;
                    }
                    amazon(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC7736l abstractRunnableC7736l = abstractRunnableC7736lArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC7736l.amazon(null);
        abstractRunnableC7736l.f16232l = -1;
        abstractRunnableC7736lArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC7736l;
    }

    public final void loadAd(AbstractRunnableC7736l abstractRunnableC7736l) {
        synchronized (this) {
            if (abstractRunnableC7736l.loadAd() != null) {
                crashlytics(abstractRunnableC7736l.f16232l);
            }
        }
    }

    public final void yandex(AbstractRunnableC7736l abstractRunnableC7736l) {
        abstractRunnableC7736l.amazon((C13755l) this);
        AbstractRunnableC7736l[] abstractRunnableC7736lArr = this.yandex;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = loadAd;
        if (abstractRunnableC7736lArr == null) {
            abstractRunnableC7736lArr = new AbstractRunnableC7736l[4];
            this.yandex = abstractRunnableC7736lArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC7736lArr.length) {
            abstractRunnableC7736lArr = (AbstractRunnableC7736l[]) Arrays.copyOf(abstractRunnableC7736lArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.yandex = abstractRunnableC7736lArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC7736lArr[i] = abstractRunnableC7736l;
        abstractRunnableC7736l.f16232l = i;
        while (i > 0) {
            AbstractRunnableC7736l[] abstractRunnableC7736lArr2 = this.yandex;
            int i2 = (i - 1) / 2;
            if (abstractRunnableC7736lArr2[i2].compareTo(abstractRunnableC7736lArr2[i]) <= 0) {
                return;
            }
            amazon(i, i2);
            i = i2;
        }
    }
}
