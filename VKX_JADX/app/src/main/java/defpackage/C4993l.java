package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4993l implements InterfaceC9354l, InterfaceC8639l {
    private volatile int flushBufferSize;
    public final boolean loadAd;
    public static final /* synthetic */ AtomicReferenceFieldUpdater mopub = AtomicReferenceFieldUpdater.newUpdater(C4993l.class, Object.class, "suspensionSlot");
    public static final /* synthetic */ AtomicReferenceFieldUpdater admob = AtomicReferenceFieldUpdater.newUpdater(C4993l.class, Object.class, "_closedCause");
    public static final /* synthetic */ AtomicReferenceFieldUpdater subs = AtomicReferenceFieldUpdater.newUpdater(C4993l.class, Object.class, "closeHandler");
    public final C18476l crashlytics = new C18476l();
    public final Object amazon = new Object();
    volatile /* synthetic */ Object suspensionSlot = C3229l.loadAd;
    public final C18476l purchase = new C18476l();
    public final C18476l billing = new C18476l();
    volatile /* synthetic */ Object _closedCause = null;
    private volatile /* synthetic */ Object closeHandler = null;

    public C4993l(boolean z) {
        this.loadAd = z;
    }

    @Override // defpackage.InterfaceC9354l
    public final boolean admob() {
        if (loadAd() == null) {
            return remoteconfig() && this.flushBufferSize == 0 && this.purchase.subs();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf A[EDGE_INSN: B:41:0x00bf->B:57:0x00fa BREAK  A[LOOP:1: B:52:0x00e8->B:78:?]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[LOOP:0: B:28:0x008d->B:75:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00fe -> B:60:0x0101). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x008d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.InterfaceC9354l
    public final java.lang.Object amazon(int r18, defpackage.AbstractC0283l r19) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4993l.amazon(int, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC8639l
    public final Object billing(InterfaceC14029l interfaceC14029l) {
        C7961l c7961l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (interfaceC14029l instanceof C7961l) {
            c7961l = (C7961l) interfaceC14029l;
            int i = c7961l.f16585l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7961l.f16585l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7961l = new C7961l(this, interfaceC14029l);
            }
        } else {
            c7961l = new C7961l(this, interfaceC14029l);
        }
        Object obj = c7961l.f16584l;
        int i2 = c7961l.f16585l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                c7961l.f16585l = 1;
                Object objCrashlytics = crashlytics(c7961l);
                Object obj2 = EnumC9342l.f19165l;
                if (objCrashlytics == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
        C15957l c15957l = AbstractC11020l.yandex;
        do {
            atomicReferenceFieldUpdater = admob;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c15957l)) {
                firebase(null);
                return Unit.INSTANCE;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.InterfaceC8639l
    public final Object crashlytics(AbstractC0283l abstractC0283l) throws Throwable {
        C16095l c16095l;
        C4993l c4993l;
        int i;
        InterfaceC6950l interfaceC6950l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3229l c3229l = C3229l.loadAd;
        if (abstractC0283l instanceof C16095l) {
            c16095l = (C16095l) abstractC0283l;
            int i2 = c16095l.f31548l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16095l.f31548l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16095l = new C16095l(this, abstractC0283l);
            }
        } else {
            c16095l = new C16095l(this, abstractC0283l);
        }
        Object obj = c16095l.f31551l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i3 = c16095l.f31548l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            Throwable thLoadAd = loadAd();
            if (thLoadAd != null) {
                throw thLoadAd;
            }
            smaato();
            if (this.flushBufferSize < 1048576) {
                return Unit.INSTANCE;
            }
            c4993l = this;
            i = 0;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c16095l.f31549l;
            c4993l = c16095l.f31550l;
            AbstractC2829l.crashlytics(obj);
        }
        while (this.flushBufferSize >= 1048576 && this._closedCause == null) {
            c16095l.f31550l = c4993l;
            c16095l.f31549l = i;
            c16095l.f31548l = 1;
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c16095l));
            c2397l.license();
            C11231l c11231l = new C11231l(c2397l);
            InterfaceC6950l interfaceC6950l2 = (InterfaceC6950l) c4993l.suspensionSlot;
            boolean z = interfaceC6950l2 instanceof C7696l;
            if (z) {
                if (interfaceC6950l2 instanceof C11231l) {
                    InterfaceC1202l interfaceC1202l = (InterfaceC1202l) interfaceC6950l2;
                    interfaceC1202l.yandex(new C17072l("write", interfaceC1202l.crashlytics()));
                } else if (interfaceC6950l2 instanceof InterfaceC1202l) {
                    ((InterfaceC1202l) interfaceC6950l2).loadAd();
                } else if (z) {
                    c11231l.yandex(((C7696l) interfaceC6950l2).loadAd);
                } else if (!AbstractC8576l.yandex(interfaceC6950l2, c3229l)) {
                    C18725l.billing();
                    return null;
                }
                if (this.flushBufferSize >= 1048576) {
                    interfaceC6950l = (InterfaceC6950l) c4993l.suspensionSlot;
                    if (interfaceC6950l instanceof C11231l) {
                        atomicReferenceFieldUpdater = mopub;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c4993l, interfaceC6950l, c3229l)) {
                                ((InterfaceC1202l) interfaceC6950l).loadAd();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c4993l) == interfaceC6950l);
                    }
                } else {
                    interfaceC6950l = (InterfaceC6950l) c4993l.suspensionSlot;
                    if (interfaceC6950l instanceof C11231l) {
                        atomicReferenceFieldUpdater = mopub;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c4993l, interfaceC6950l, c3229l)) {
                                ((InterfaceC1202l) interfaceC6950l).loadAd();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c4993l) == interfaceC6950l);
                    }
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mopub;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(c4993l, interfaceC6950l2, c11231l)) {
                        if (interfaceC6950l2 instanceof C11231l) {
                            InterfaceC1202l interfaceC1202l2 = (InterfaceC1202l) interfaceC6950l2;
                            interfaceC1202l2.yandex(new C17072l("write", interfaceC1202l2.crashlytics()));
                        } else if (interfaceC6950l2 instanceof InterfaceC1202l) {
                            ((InterfaceC1202l) interfaceC6950l2).loadAd();
                        } else if (z) {
                            c11231l.yandex(((C7696l) interfaceC6950l2).loadAd);
                        } else if (!AbstractC8576l.yandex(interfaceC6950l2, c3229l)) {
                            C18725l.billing();
                            return null;
                        }
                        if (this.flushBufferSize >= 1048576 || this._closedCause != null) {
                            interfaceC6950l = (InterfaceC6950l) c4993l.suspensionSlot;
                            if (interfaceC6950l instanceof C11231l) {
                                atomicReferenceFieldUpdater = mopub;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(c4993l, interfaceC6950l, c3229l)) {
                                        ((InterfaceC1202l) interfaceC6950l).loadAd();
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c4993l) == interfaceC6950l);
                            }
                        }
                    } else if (atomicReferenceFieldUpdater2.get(c4993l) != interfaceC6950l2) {
                        c11231l.loadAd();
                    }
                }
            }
            if (c2397l.Signature() == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    public final void firebase(Throwable th) {
        C7696l c7696l;
        if (th != null) {
            c7696l = new C7696l(th);
        } else {
            InterfaceC6950l.yandex.getClass();
            c7696l = C7868l.loadAd;
        }
        InterfaceC6950l interfaceC6950l = (InterfaceC6950l) mopub.getAndSet(this, c7696l);
        if (interfaceC6950l instanceof InterfaceC1202l) {
            ((InterfaceC1202l) interfaceC6950l).yandex(th);
        }
        Function1 function1 = (Function1) subs.getAndSet(this, null);
        if (function1 != null) {
            function1.invoke(th);
        }
    }

    public final void isPro() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        smaato();
        C15957l c15957l = AbstractC11020l.yandex;
        do {
            atomicReferenceFieldUpdater = admob;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c15957l)) {
                firebase(null);
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC9354l
    public final Throwable loadAd() {
        Throwable th;
        C15957l c15957l = (C15957l) this._closedCause;
        if (c15957l == null || (th = c15957l.yandex) == 0) {
            return null;
        }
        if (th instanceof InterfaceC14404l) {
            return ((InterfaceC14404l) th).yandex();
        }
        return th instanceof CancellationException ? AbstractC4952l.yandex(((CancellationException) th).getMessage(), c15957l.yandex) : new C8413l(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC9354l
    public final C18476l mopub() throws Throwable {
        Throwable thYandex;
        C15957l c15957l = (C15957l) this._closedCause;
        if (c15957l != null) {
            Throwable th = c15957l.yandex;
            if (th == 0) {
                thYandex = null;
            } else if (th instanceof InterfaceC14404l) {
                thYandex = ((InterfaceC14404l) th).yandex();
            } else {
                thYandex = th instanceof CancellationException ? AbstractC4952l.yandex(((CancellationException) th).getMessage(), c15957l.yandex) : new C1708l(th);
            }
            if (thYandex != null) {
                throw thYandex;
            }
        }
        if (this.purchase.subs()) {
            vip();
        }
        return this.purchase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC8639l
    public final C18476l purchase() throws Throwable {
        Throwable thYandex;
        if (!remoteconfig()) {
            return this.billing;
        }
        C15957l c15957l = (C15957l) this._closedCause;
        if (c15957l != null) {
            Throwable th = c15957l.yandex;
            if (th == 0) {
                thYandex = null;
            } else if (th instanceof InterfaceC14404l) {
                thYandex = ((InterfaceC14404l) th).yandex();
            } else {
                thYandex = th instanceof CancellationException ? AbstractC4952l.yandex(((CancellationException) th).getMessage(), c15957l.yandex) : new C7731l(th);
            }
            if (thYandex != null) {
                throw thYandex;
            }
        }
        throw new C7731l(null, null);
    }

    public final boolean remoteconfig() {
        return this._closedCause != null;
    }

    public final void smaato() {
        if (this.billing.subs()) {
            return;
        }
        synchronized (this.amazon) {
            C18476l c18476l = this.billing;
            int i = (int) c18476l.f36079l;
            this.crashlytics.isVip(c18476l);
            this.flushBufferSize += i;
            Unit unit = Unit.INSTANCE;
        }
        InterfaceC6950l interfaceC6950l = (InterfaceC6950l) this.suspensionSlot;
        if (interfaceC6950l instanceof C18475l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mopub;
            C3229l c3229l = C3229l.loadAd;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC6950l, c3229l)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC6950l) {
                    return;
                }
            }
            ((InterfaceC1202l) interfaceC6950l).loadAd();
        }
    }

    @Override // defpackage.InterfaceC8639l
    public final boolean subs() {
        return this.loadAd;
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    public final void vip() {
        synchronized (this.amazon) {
            this.crashlytics.signatures(this.purchase);
            this.flushBufferSize = 0;
            Unit unit = Unit.INSTANCE;
        }
        InterfaceC6950l interfaceC6950l = (InterfaceC6950l) this.suspensionSlot;
        if (interfaceC6950l instanceof C11231l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mopub;
            C3229l c3229l = C3229l.loadAd;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC6950l, c3229l)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC6950l) {
                    return;
                }
            }
            ((InterfaceC1202l) interfaceC6950l).loadAd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC9354l
    public final void yandex(Throwable th) {
        Throwable thYandex;
        if (this._closedCause != null) {
            return;
        }
        C15957l c15957l = new C15957l(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = admob;
        do {
            thYandex = null;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c15957l)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        Throwable th2 = c15957l.yandex;
        if (th2 != 0) {
            if (th2 instanceof InterfaceC14404l) {
                thYandex = ((InterfaceC14404l) th2).yandex();
            } else {
                thYandex = th2 instanceof CancellationException ? AbstractC4952l.yandex(((CancellationException) th2).getMessage(), c15957l.yandex) : new C8413l(th2);
            }
        }
        firebase(thYandex);
    }
}
