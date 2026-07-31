package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15492l {
    public final Function2 amazon;
    public final AbstractC3031l billing;
    public final C6956l crashlytics;
    public final C15389l firebase;
    public final AbstractC0306l loadAd;
    public final Object mopub;
    public final boolean purchase;
    public final C5991l smaato;
    public final C6931l yandex;
    public final AtomicReference admob = new AtomicReference(EnumC17373l.f33838l);
    public long subs = AbstractC4071l.loadAd();
    public C6295l isPro = AbstractC13087l.yandex;

    public C15492l(C6931l c6931l, AbstractC0306l abstractC0306l, C6956l c6956l, C11686l c11686l, Function2 function2, boolean z, AbstractC3031l abstractC3031l, Object obj) {
        this.yandex = c6931l;
        this.loadAd = abstractC0306l;
        this.crashlytics = c6956l;
        this.amazon = function2;
        this.purchase = z;
        this.billing = abstractC3031l;
        this.mopub = obj;
        C15389l c15389l = new C15389l();
        c15389l.firebase(c11686l, c6956l.advert());
        this.firebase = c15389l;
        this.smaato = new C5991l(abstractC3031l.f6544l);
    }

    public final void amazon() {
        EnumC17373l enumC17373l;
        EnumC17373l enumC17373l2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.admob;
            enumC17373l = EnumC17373l.f33844l;
            enumC17373l2 = EnumC17373l.f33845l;
            if (atomicReference.compareAndSet(enumC17373l, enumC17373l2)) {
                z = true;
                break;
            } else if (atomicReference.get() != enumC17373l) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        AbstractC5363l.loadAd("Unexpected state change from: " + enumC17373l + " to: " + enumC17373l2 + ".");
    }

    public final boolean crashlytics() {
        return ((EnumC17373l) this.admob.get()).compareTo(EnumC17373l.f33845l) >= 0;
    }

    public final void loadAd() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.mopub) {
                try {
                    this.smaato.isVip(this.billing, this.firebase);
                    this.firebase.purchase();
                    this.firebase.billing();
                    this.firebase.amazon();
                    this.yandex.f14535l = null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    this.firebase.amazon();
                    this.yandex.f14535l = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0086 A[Catch: Exception -> 0x0025, TryCatch #2 {Exception -> 0x0025, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0024, B:10:0x0028, B:11:0x002f, B:12:0x0030, B:13:0x0037, B:14:0x0038, B:15:0x0044, B:16:0x0045, B:22:0x006d, B:24:0x007d, B:25:0x007f, B:31:0x00a7, B:33:0x00af, B:28:0x0086, B:30:0x008c, B:35:0x00b5, B:36:0x00b7, B:38:0x00bd, B:41:0x00c4, B:42:0x00df, B:19:0x004c, B:21:0x0052, B:45:0x00e7, B:48:0x00f6, B:50:0x00fa, B:54:0x0104, B:53:0x00ff, B:55:0x0109, B:56:0x010b, B:62:0x0133, B:64:0x013b, B:59:0x0112, B:61:0x0118, B:68:0x0144, B:69:0x0145, B:70:0x014c, B:71:0x014d, B:72:0x0154, B:46:0x00ec, B:23:0x006f), top: B:79:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00af A[Catch: Exception -> 0x0025, TryCatch #2 {Exception -> 0x0025, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0024, B:10:0x0028, B:11:0x002f, B:12:0x0030, B:13:0x0037, B:14:0x0038, B:15:0x0044, B:16:0x0045, B:22:0x006d, B:24:0x007d, B:25:0x007f, B:31:0x00a7, B:33:0x00af, B:28:0x0086, B:30:0x008c, B:35:0x00b5, B:36:0x00b7, B:38:0x00bd, B:41:0x00c4, B:42:0x00df, B:19:0x004c, B:21:0x0052, B:45:0x00e7, B:48:0x00f6, B:50:0x00fa, B:54:0x0104, B:53:0x00ff, B:55:0x0109, B:56:0x010b, B:62:0x0133, B:64:0x013b, B:59:0x0112, B:61:0x0118, B:68:0x0144, B:69:0x0145, B:70:0x014c, B:71:0x014d, B:72:0x0154, B:46:0x00ec, B:23:0x006f), top: B:79:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x013b A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #2 {Exception -> 0x0025, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0024, B:10:0x0028, B:11:0x002f, B:12:0x0030, B:13:0x0037, B:14:0x0038, B:15:0x0044, B:16:0x0045, B:22:0x006d, B:24:0x007d, B:25:0x007f, B:31:0x00a7, B:33:0x00af, B:28:0x0086, B:30:0x008c, B:35:0x00b5, B:36:0x00b7, B:38:0x00bd, B:41:0x00c4, B:42:0x00df, B:19:0x004c, B:21:0x0052, B:45:0x00e7, B:48:0x00f6, B:50:0x00fa, B:54:0x0104, B:53:0x00ff, B:55:0x0109, B:56:0x010b, B:62:0x0133, B:64:0x013b, B:59:0x0112, B:61:0x0118, B:68:0x0144, B:69:0x0145, B:70:0x014c, B:71:0x014d, B:72:0x0154, B:46:0x00ec, B:23:0x006f), top: B:79:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:1: B:25:0x007f->B:85:?, LOOP_END, SYNTHETIC] */
    public final boolean purchase(InterfaceC14382l interfaceC14382l) throws Exception {
        long j;
        EnumC17373l enumC17373l = EnumC17373l.f33843l;
        AtomicReference atomicReference = this.admob;
        try {
            int iOrdinal = ((EnumC17373l) atomicReference.get()).ordinal();
            C6931l c6931l = this.yandex;
            AbstractC0306l abstractC0306l = this.loadAd;
            EnumC17373l enumC17373l2 = EnumC17373l.f33844l;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C6956l c6956l = this.crashlytics;
                    boolean z = this.purchase;
                    if (z) {
                        c6956l.isVip = 0;
                        c6956l.advert = true;
                    }
                    this.isPro = abstractC0306l.loadAd(c6931l, interfaceC14382l, this.amazon);
                    if (z) {
                        if (c6956l.f14606throws || c6956l.isVip != 0) {
                            AbstractC5363l.yandex("Cannot disable reuse from root if it was caused by other groups");
                        }
                        c6956l.isVip = -1;
                        c6956l.advert = false;
                    }
                    EnumC17373l enumC17373l3 = EnumC17373l.f33838l;
                    while (!atomicReference.compareAndSet(enumC17373l3, enumC17373l2)) {
                        if (atomicReference.get() != enumC17373l3) {
                            AbstractC5363l.loadAd("Unexpected state change from: " + enumC17373l3 + " to: " + enumC17373l2 + ".");
                            if (this.isPro.admob()) {
                                amazon();
                            }
                            return crashlytics();
                        }
                    }
                    if (this.isPro.admob()) {
                        amazon();
                    }
                    return crashlytics();
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(enumC17373l2, enumC17373l)) {
                            if (atomicReference.get() != enumC17373l2) {
                                AbstractC5363l.loadAd("Unexpected state change from: " + enumC17373l2 + " to: " + enumC17373l + ".");
                                j = this.subs;
                                this.subs = AbstractC4071l.loadAd();
                                this.isPro = abstractC0306l.vip(c6931l, interfaceC14382l, this.isPro);
                                this.subs = j;
                                while (!atomicReference.compareAndSet(enumC17373l, enumC17373l2)) {
                                    if (atomicReference.get() != enumC17373l) {
                                        AbstractC5363l.loadAd("Unexpected state change from: " + enumC17373l + " to: " + enumC17373l2 + ".");
                                        if (this.isPro.admob()) {
                                            amazon();
                                        }
                                        return crashlytics();
                                    }
                                }
                                if (this.isPro.admob()) {
                                    amazon();
                                }
                                return crashlytics();
                            }
                        }
                        this.subs = AbstractC4071l.loadAd();
                        this.isPro = abstractC0306l.vip(c6931l, interfaceC14382l, this.isPro);
                        this.subs = j;
                        while (!atomicReference.compareAndSet(enumC17373l, enumC17373l2)) {
                            if (atomicReference.get() != enumC17373l) {
                                AbstractC5363l.loadAd("Unexpected state change from: " + enumC17373l + " to: " + enumC17373l2 + ".");
                                if (this.isPro.admob()) {
                                    amazon();
                                }
                                return crashlytics();
                            }
                        }
                        if (this.isPro.admob()) {
                            amazon();
                        }
                        return crashlytics();
                    } catch (Throwable th) {
                        this.subs = j;
                        while (!atomicReference.compareAndSet(enumC17373l, enumC17373l2)) {
                            if (atomicReference.get() != enumC17373l) {
                                AbstractC5363l.loadAd("Unexpected state change from: " + enumC17373l + " to: " + enumC17373l2 + ".");
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.subs;
                case 4:
                    AbstractC2032l.loadAd("Recursive call to resume()");
                    throw new C6451l(10);
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new C6451l(11);
            }
        } catch (Exception e) {
            atomicReference.set(EnumC17373l.f33842l);
            throw e;
        }
    }

    public final void yandex() throws Exception {
        AtomicReference atomicReference = this.admob;
        try {
            switch (((EnumC17373l) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    loadAd();
                    EnumC17373l enumC17373l = EnumC17373l.f33845l;
                    EnumC17373l enumC17373l2 = EnumC17373l.f33839l;
                    while (!atomicReference.compareAndSet(enumC17373l, enumC17373l2)) {
                        if (atomicReference.get() != enumC17373l) {
                            AbstractC5363l.loadAd("Unexpected state change from: " + enumC17373l + " to: " + enumC17373l2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new C6451l(11);
            }
        } catch (Exception e) {
            atomicReference.set(EnumC17373l.f33842l);
            throw e;
        }
    }
}
