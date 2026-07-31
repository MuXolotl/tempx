package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: renamed from: lٟؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4299l implements InterfaceC2405l, InterfaceC14177l {
    public static final String subs = new String();
    public final /* synthetic */ C13161l admob;
    public AbstractC6082l amazon;
    public C5151l billing;
    public C18533l crashlytics;
    public final long loadAd;
    public Object[] mopub;
    public AbstractC4892l purchase;
    public final Level yandex;

    public C4299l(C13161l c13161l, Level level) {
        Objects.requireNonNull(c13161l);
        this.admob = c13161l;
        AbstractC4609l.yandex.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.crashlytics = null;
        this.amazon = null;
        this.purchase = null;
        this.billing = null;
        this.mopub = null;
        AbstractC13841l.billing(level, "level");
        this.yandex = level;
        this.loadAd = nanos;
    }

    public final AbstractC1068l amazon() {
        C18533l c18533l = this.crashlytics;
        return c18533l != null ? c18533l : C15823l.crashlytics;
    }

    @Override // defpackage.InterfaceC14177l
    public final InterfaceC14177l crashlytics(Throwable th) {
        C11421l c11421l = AbstractC13814l.yandex;
        AbstractC13841l.billing(c11421l, "metadata key");
        if (th != null) {
            purchase(c11421l, th);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [lؘٕؗ] */
    /* JADX WARN: Type inference failed for: r10v22, types: [lؙّۛ] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [lٟؖٚ] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [lؘٕؗ] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [lؘٕؗ] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // defpackage.InterfaceC14177l
    public final void loadAd(String str, Object[] objArr) {
        boolean z;
        C18533l c18533l;
        StackTraceElement[] stackTraceElementArr;
        int iSmaato;
        int i;
        C11946l c11946l;
        ?? c11435l;
        ?? r10;
        C10826l c10826l;
        AbstractC6082l abstractC6082l = this.amazon;
        C10485l c10485l = AbstractC6082l.yandex;
        if (abstractC6082l == null) {
            ((C11673l) AbstractC4609l.yandex).getClass();
            C11673l.loadAd.getClass();
            this.amazon = c10485l;
        }
        InterfaceC0330l c7036l = this.amazon;
        if (c7036l != c10485l) {
            C18533l c18533l2 = this.crashlytics;
            if (c18533l2 != null && c18533l2.amazon > 0) {
                AbstractC13841l.billing(c7036l, "logSiteKey");
                int i2 = c18533l2.amazon;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (AbstractC13814l.billing.equals(c18533l2.admob(i3))) {
                        c7036l = new C7036l(c7036l, c18533l2.subs(i3));
                    }
                }
            }
        } else {
            c7036l = null;
        }
        AbstractC1068l abstractC1068lAmazon = amazon();
        int iMopub = abstractC1068lAmazon.mopub();
        for (int i4 = 0; i4 < iMopub; i4++) {
            if (abstractC1068lAmazon.admob(i4).yandex == "eye3tag") {
                if (abstractC1068lAmazon.isPro(AbstractC13814l.yandex) != null) {
                    break;
                }
                C11421l c11421l = AbstractC13814l.subs;
                if (abstractC1068lAmazon.isPro(c11421l) != null) {
                    break;
                }
                purchase(c11421l, EnumC14097l.SMALL);
                break;
            }
        }
        C18533l c18533l3 = this.crashlytics;
        int i5 = -1;
        C10826l c10826l2 = AbstractC4892l.yandex;
        if (c18533l3 != null) {
            if (c7036l != null) {
                int i6 = C13653l.amazon;
                if (c18533l3.isPro(AbstractC13814l.amazon) != null) {
                    C18725l.loadAd();
                    return;
                }
                C18533l c18533l4 = this.crashlytics;
                C7172l c7172l = C11946l.amazon;
                Integer num = (Integer) c18533l4.isPro(AbstractC13814l.loadAd);
                if (num == null) {
                    c11435l = 0;
                } else {
                    c11946l = (C11946l) C11946l.amazon.m218l(c7036l, c18533l4);
                    if (c11946l.crashlytics.incrementAndGet() < num.intValue()) {
                        c11435l = c11946l;
                        c11435l = c10826l2;
                    }
                }
                c11435l = c11946l;
                C18533l c18533l5 = this.crashlytics;
                C7172l c7172l2 = C12438l.amazon;
                Integer num2 = (Integer) c18533l5.isPro(AbstractC13814l.crashlytics);
                if (num2 == null || num2.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (C12438l) C12438l.amazon.m218l(c7036l, c18533l5);
                    int iNextInt = ((Random) C12438l.purchase.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r10.crashlytics;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r10 = c10826l2;
                    }
                }
                if (c11435l == 0) {
                    c11435l = r10;
                } else if (r10 != 0 && c11435l != c10826l2 && r10 != (c10826l = AbstractC4892l.loadAd)) {
                    if (r10 == c10826l2 || c11435l == c10826l) {
                        c11435l = r10;
                    } else {
                        c11435l = new C11435l(c11435l, r10);
                    }
                }
                this.purchase = c11435l;
                z = c11435l != c10826l2;
            }
            C18533l c18533l6 = this.crashlytics;
            C11421l c11421l2 = AbstractC13814l.subs;
            EnumC14097l enumC14097l = (EnumC14097l) c18533l6.isPro(c11421l2);
            if (enumC14097l != null) {
                C18533l c18533l7 = this.crashlytics;
                if (c18533l7 != null && (iSmaato = c18533l7.smaato(c11421l2)) >= 0) {
                    int i7 = iSmaato + iSmaato;
                    int i8 = i7 + 2;
                    while (true) {
                        i = c18533l7.amazon;
                        if (i8 >= i + i) {
                            break;
                        }
                        Object obj = c18533l7.crashlytics[i8];
                        if (!obj.equals(c11421l2)) {
                            Object[] objArr2 = c18533l7.crashlytics;
                            objArr2[i7] = obj;
                            objArr2[i7 + 1] = objArr2[i8 + 1];
                            i7 += 2;
                        }
                        i8 += 2;
                    }
                    c18533l7.amazon = i - ((i8 - i7) >> 1);
                    while (i7 < i8) {
                        c18533l7.crashlytics[i7] = null;
                        i7++;
                    }
                }
                AbstractC1068l abstractC1068lAmazon2 = amazon();
                C11421l c11421l3 = AbstractC13814l.yandex;
                Throwable th = (Throwable) abstractC1068lAmazon2.isPro(c11421l3);
                int i9 = enumC14097l.f27455l;
                String[] strArr = AbstractC7176l.yandex;
                if (i9 <= 0 && i9 != -1) {
                    C8339l.metrica("invalid maximum depth: 0");
                    return;
                }
                AbstractC7176l.loadAd.getClass();
                if (!(i9 == -1 || i9 > 0)) {
                    C8339l.metrica("maxDepth must be > 0 or -1");
                    return;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = C4299l.class.getName();
                int i10 = 3;
                boolean z2 = false;
                while (true) {
                    if (i10 >= stackTrace.length) {
                        i10 = -1;
                        break;
                    }
                    if (!stackTrace[i10].getClassName().equals(name)) {
                        if (z2) {
                            break;
                        }
                    } else {
                        z2 = true;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i10;
                    if (i9 <= 0 || i9 >= length) {
                        i9 = length;
                    }
                    stackTraceElementArr = new StackTraceElement[i9];
                    System.arraycopy(stackTrace, i10, stackTraceElementArr, 0, i9);
                }
                C18359l c18359l = new C18359l(enumC14097l.toString(), th);
                c18359l.setStackTrace(stackTraceElementArr);
                purchase(c11421l3, c18359l);
            }
        }
        AbstractC4892l abstractC4892l = this.purchase;
        if (abstractC4892l != null) {
            C17753l c17753l = (C17753l) C17753l.crashlytics.m218l(c7036l, this.crashlytics);
            AtomicInteger atomicInteger2 = c17753l.loadAd;
            AtomicBoolean atomicBoolean = c17753l.yandex;
            int iIncrementAndGet = atomicInteger2.incrementAndGet();
            if (abstractC4892l != c10826l2 && atomicBoolean.compareAndSet(false, true)) {
                try {
                    abstractC4892l.yandex();
                    atomicBoolean.set(false);
                    atomicInteger2.addAndGet(-iIncrementAndGet);
                    i5 = (-1) + iIncrementAndGet;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
            }
            if (z && i5 > 0 && (c18533l = this.crashlytics) != null) {
                c18533l.firebase(AbstractC13814l.purchase, Integer.valueOf(i5));
            }
            z &= i5 >= 0;
        }
        if (z) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.mopub = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != subs) {
                C15113l c15113l = C15113l.loadAd;
                this.billing = new C5151l(str);
            }
            ((C11673l) AbstractC4609l.yandex).getClass();
            C13059l c13059lLoadAd = C9712l.loadAd.loadAd();
            if (!c13059lLoadAd.yandex.isEmpty()) {
                AbstractC1068l abstractC1068lAmazon3 = amazon();
                C2466l c2466l = AbstractC13814l.admob;
                C13059l c13059l = (C13059l) abstractC1068lAmazon3.isPro(c2466l);
                if (c13059l != null) {
                    C17762l c17762l = c13059l.yandex;
                    if (!c17762l.isEmpty()) {
                        C17762l c17762l2 = c13059lLoadAd.yandex;
                        if (!c17762l2.isEmpty()) {
                            c13059l = new C13059l(new C17762l(c17762l2, c17762l));
                        }
                        c13059lLoadAd = c13059l;
                    }
                }
                purchase(c2466l, c13059lLoadAd);
            }
            AbstractC12990l abstractC12990l = (AbstractC12990l) this.admob.f25776l;
            try {
                C11321l c11321l = (C11321l) C11321l.f22814l.get();
                int i11 = c11321l.f22815l + 1;
                c11321l.f22815l = i11;
                if (i11 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i11 <= 100) {
                        abstractC12990l.loadAd(this);
                    } else {
                        C13161l.m3576static("unbounded recursion in log statement", this);
                    }
                    c11321l.close();
                } catch (Throwable th3) {
                    try {
                        c11321l.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (RuntimeException e) {
                try {
                    abstractC12990l.crashlytics(e, this);
                } catch (RuntimeException e2) {
                    String name2 = e2.getClass().getName();
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
                    sb.append(name2);
                    sb.append(": ");
                    sb.append(message);
                    C13161l.m3576static(sb.toString(), this);
                    try {
                        e2.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public final void purchase(C11421l c11421l, Object obj) {
        if (this.crashlytics == null) {
            C18533l c18533l = new C18533l();
            c18533l.crashlytics = new Object[8];
            c18533l.amazon = 0;
            this.crashlytics = c18533l;
        }
        this.crashlytics.firebase(c11421l, obj);
    }

    @Override // defpackage.InterfaceC14177l
    public final InterfaceC14177l yandex() {
        C5195l c5195l = new C5195l();
        c5195l.loadAd = 0;
        if (this.amazon == null) {
            this.amazon = c5195l;
        }
        return this;
    }
}
