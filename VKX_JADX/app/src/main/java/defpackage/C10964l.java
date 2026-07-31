package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَُۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10964l {
    public final C12676l admob;
    public int amazon;
    public final C5203l[] billing;
    public final ReentrantLock crashlytics = new ReentrantLock();
    public final Function0 loadAd;
    public final C16628l mopub;
    public boolean purchase;
    public final int yandex;

    public C10964l(int i, Function0 function0) {
        this.yandex = i;
        this.loadAd = function0;
        this.billing = new C5203l[i];
        int i2 = AbstractC5936l.yandex;
        byte b = 0;
        this.mopub = new C16628l(i, 0);
        C12676l c12676l = new C12676l(b, b);
        if (i < 1) {
            AbstractC13082l.crashlytics("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            AbstractC13082l.crashlytics("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        c12676l.amazon = i - 1;
        c12676l.purchase = new Object[i];
        this.admob = c12676l;
    }

    public final void amazon(C5203l c5203l) {
        ReentrantLock reentrantLock = this.crashlytics;
        reentrantLock.lock();
        try {
            this.admob.crashlytics(c5203l);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.mopub.amazon();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void crashlytics(StringBuilder sb) {
        C12676l c12676l = this.admob;
        ReentrantLock reentrantLock = this.crashlytics;
        reentrantLock.lock();
        try {
            C10227l c10227lAdmob = AbstractC14055l.admob();
            int i = (c12676l.crashlytics - c12676l.loadAd) & c12676l.amazon;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = c12676l.crashlytics;
                    int i4 = c12676l.loadAd;
                    int i5 = c12676l.amazon;
                    if (i2 < ((i3 - i4) & i5)) {
                        c10227lAdmob.add(((Object[]) c12676l.purchase)[(i4 + i2) & i5]);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.yandex + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            C16628l c16628l = this.mopub;
            c16628l.getClass();
            sb2.append(Math.max(C6460l.f13492l.get(c16628l), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + c10227lPurchase.pro() + ")[" + AbstractC16901l.m4210case(c10227lPurchase, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            C5203l[] c5203lArr = this.billing;
            int length = c5203lArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                C5203l c5203l = c5203lArr[i7];
                i6++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i6);
                sb3.append("] - ");
                sb3.append(c5203l != null ? c5203l.f11279l.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (c5203l != null) {
                    c5203l.mopub(sb);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void loadAd() {
        ReentrantLock reentrantLock = this.crashlytics;
        reentrantLock.lock();
        try {
            this.purchase = true;
            for (C5203l c5203l : this.billing) {
                if (c5203l != null) {
                    c5203l.close();
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C17196l c17196l;
        if (abstractC0283l instanceof C17196l) {
            c17196l = (C17196l) abstractC0283l;
            int i = c17196l.f33369l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17196l.f33369l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17196l = new C17196l(this, abstractC0283l);
            }
        } else {
            c17196l = new C17196l(this, abstractC0283l);
        }
        Object obj = c17196l.f33370l;
        int i2 = c17196l.f33369l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c17196l.f33371l = this;
            c17196l.f33369l = 1;
            Object objLoadAd = this.mopub.loadAd(c17196l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c17196l.f33371l;
            AbstractC2829l.crashlytics(obj);
        }
        try {
            ReentrantLock reentrantLock = this.crashlytics;
            C12676l c12676l = this.admob;
            reentrantLock.lock();
            try {
                if (this.purchase) {
                    AbstractC13628l.smaato(21, "Connection pool is closed");
                    throw null;
                }
                if (c12676l.loadAd == c12676l.crashlytics && this.amazon < this.yandex) {
                    C5203l c5203l = new C5203l((InterfaceC0684l) this.loadAd.invoke());
                    C5203l[] c5203lArr = this.billing;
                    int i3 = this.amazon;
                    this.amazon = i3 + 1;
                    c5203lArr[i3] = c5203l;
                    c12676l.crashlytics(c5203l);
                }
                int i4 = c12676l.loadAd;
                if (i4 == c12676l.crashlytics) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) c12676l.purchase;
                Object obj2 = objArr[i4];
                objArr[i4] = null;
                c12676l.loadAd = (i4 + 1) & c12676l.amazon;
                C5203l c5203l2 = (C5203l) obj2;
                reentrantLock.unlock();
                return c5203l2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.mopub.amazon();
            throw th2;
        }
    }
}
