package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍِؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9268l implements Closeable, InterfaceC2262l {
    private volatile boolean closed;
    private volatile boolean inSelect;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f19051l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC12932l f19052l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f19053l;
    private volatile Selector selectorRef;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final SelectorProvider f19054l = SelectorProvider.provider();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AtomicLong f19056l = new AtomicLong();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C5501l f19055l = new C5501l(1);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C3741l f19057l = new C3741l();

    public C9268l(InterfaceC12932l interfaceC12932l) {
        this.f19052l = interfaceC12932l.mo246l(new C0499l("selector"));
        AbstractC10999l.mopub(this, null, 0, new C0384l(this, null), 3);
    }

    public static void inmobi(AbstractSelector abstractSelector, Throwable th) {
        if (th == null) {
            th = new C12423l("Closed selector", 2);
        }
        for (SelectionKey selectionKey : abstractSelector.keys()) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object objAttachment = selectionKey.attachment();
            AbstractC4820l abstractC4820l = objAttachment instanceof AbstractC4820l ? (AbstractC4820l) objAttachment : null;
            if (abstractC4820l != null) {
                signatures(abstractC4820l, th);
            }
            selectionKey.cancel();
        }
    }

    public static void signatures(AbstractC4820l abstractC4820l, Throwable th) {
        C12820l c12820l = abstractC4820l.f9869l;
        for (EnumC14535l enumC14535l : EnumC14535l.f28461l) {
            c12820l.getClass();
            InterfaceC4305l interfaceC4305l = (InterfaceC4305l) C12820l.yandex[enumC14535l.ordinal()].getAndSet(c12820l, null);
            if (interfaceC4305l != null) {
                interfaceC4305l.subs(new C18435l(th));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[LOOP:1: B:21:0x0059->B:52:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0061 A[EDGE_INSN: B:65:0x0061->B:23:0x0061 BREAK  A[LOOP:1: B:21:0x0059->B:52:0x00d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007a -> B:19:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008e -> B:19:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009c -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:65:0x0061
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object yandex(defpackage.C9268l r7, defpackage.C3741l r8, java.nio.channels.spi.AbstractSelector r9, defpackage.AbstractC0283l r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9268l.yandex(lٍِؒ, lۣؕۧ, java.nio.channels.spi.AbstractSelector, lّؑۧ):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
        this.f19057l.loadAd();
        C5501l c5501l = this.f19055l;
        Unit unit = Unit.INSTANCE;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) ((AtomicReference) c5501l.f11764l).getAndSet(null);
        if (interfaceC14029l == null) {
            m2625default();
        } else {
            interfaceC14029l.subs(unit);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final Object m2624continue(Selector selector, AbstractC0283l abstractC0283l) throws IOException {
        C17337l c17337l;
        int iSelectNow;
        if (abstractC0283l instanceof C17337l) {
            c17337l = (C17337l) abstractC0283l;
            int i = c17337l.f33666l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17337l.f33666l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17337l = new C17337l(this, abstractC0283l);
            }
        } else {
            c17337l = new C17337l(this, abstractC0283l);
        }
        Object obj = c17337l.f33667l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c17337l.f33666l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            this.inSelect = true;
            c17337l.f33668l = selector;
            c17337l.f33666l = 1;
            if (AbstractC16336l.billing(c17337l) == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            selector = c17337l.f33668l;
            AbstractC2829l.crashlytics(obj);
        }
        if (this.f19056l.get() == 0) {
            iSelectNow = selector.select(500L);
            this.inSelect = false;
        } else {
            this.inSelect = false;
            this.f19056l.set(0L);
            iSelectNow = selector.selectNow();
        }
        return new Integer(iSelectNow);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m2625default() {
        Selector selector;
        if (this.f19056l.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    public final void isVip(Selector selector, AbstractC4820l abstractC4820l) {
        try {
            SelectableChannel selectableChannelMopub = abstractC4820l.mopub();
            SelectionKey selectionKeyKeyFor = selectableChannelMopub.keyFor(selector);
            int iAds = abstractC4820l.ads();
            if (selectionKeyKeyFor == null) {
                if (iAds != 0) {
                    selectableChannelMopub.register(selector, iAds, abstractC4820l);
                }
            } else if (selectionKeyKeyFor.interestOps() != iAds) {
                selectionKeyKeyFor.interestOps(iAds);
            }
            if (iAds != 0) {
                this.f19053l++;
            }
        } catch (Throwable th) {
            SelectionKey selectionKeyKeyFor2 = abstractC4820l.mopub().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            signatures(abstractC4820l, th);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m2626package(Set set, Set set2) {
        int size = set.size();
        this.f19053l = set2.size() - size;
        this.f19051l = 0;
        if (size <= 0) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SelectionKey selectionKey = (SelectionKey) it.next();
            try {
                int i = selectionKey.readyOps();
                int iInterestOps = selectionKey.interestOps();
                Object objAttachment = selectionKey.attachment();
                AbstractC4820l abstractC4820l = objAttachment instanceof AbstractC4820l ? (AbstractC4820l) objAttachment : null;
                if (abstractC4820l == null) {
                    selectionKey.cancel();
                    this.f19051l++;
                } else {
                    C12820l c12820l = abstractC4820l.f9869l;
                    int[] iArr = EnumC14535l.f28459l;
                    int length = iArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if ((iArr[i2] & i) != 0) {
                            c12820l.getClass();
                            InterfaceC4305l interfaceC4305l = (InterfaceC4305l) C12820l.yandex[i2].getAndSet(c12820l, null);
                            if (interfaceC4305l != null) {
                                interfaceC4305l.subs(Unit.INSTANCE);
                            }
                        }
                    }
                    int i3 = (~i) & iInterestOps;
                    if (i3 != iInterestOps) {
                        selectionKey.interestOps(i3);
                    }
                    if (i3 != 0) {
                        this.f19053l++;
                    }
                }
            } catch (Throwable th) {
                selectionKey.cancel();
                this.f19051l++;
                Object objAttachment2 = selectionKey.attachment();
                AbstractC4820l abstractC4820l2 = objAttachment2 instanceof AbstractC4820l ? (AbstractC4820l) objAttachment2 : null;
                if (abstractC4820l2 != null) {
                    signatures(abstractC4820l2, th);
                    selectionKey.attach(null);
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final Object m2627private(C3741l c3741l, AbstractC0283l abstractC0283l) {
        C16332l c16332l;
        Object obj;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (abstractC0283l instanceof C16332l) {
            c16332l = (C16332l) abstractC0283l;
            int i = c16332l.f31936l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16332l.f31936l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16332l = new C16332l(this, abstractC0283l);
            }
        } else {
            c16332l = new C16332l(this, abstractC0283l);
        }
        Object obj2 = c16332l.f31937l;
        int i2 = c16332l.f31936l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3741l = c16332l.f31938l;
        }
        AbstractC2829l.crashlytics(obj2);
        do {
            AbstractC4820l abstractC4820l = (AbstractC4820l) c3741l.amazon();
            if (abstractC4820l != null) {
                return abstractC4820l;
            }
            if (this.closed) {
                return null;
            }
            c16332l.f31938l = c3741l;
            c16332l.f31936l = 1;
            C5501l c5501l = this.f19055l;
            if (!c3741l.crashlytics() || this.closed) {
                obj = null;
            } else {
                AtomicReference atomicReference = (AtomicReference) c5501l.f11764l;
                while (!atomicReference.compareAndSet(null, c16332l)) {
                    if (atomicReference.get() != null) {
                        C8339l.smaato("Continuation is already set");
                        return null;
                    }
                }
                if (!c3741l.crashlytics() || this.closed) {
                    AtomicReference atomicReference2 = (AtomicReference) c5501l.f11764l;
                    while (true) {
                        if (atomicReference2.compareAndSet(c16332l, null)) {
                            obj = null;
                        } else if (atomicReference2.get() != c16332l) {
                        }
                    }
                }
                obj = enumC9342l;
            }
            if (obj == null) {
                obj = Unit.INSTANCE;
            }
        } while (obj != enumC9342l);
        return enumC9342l;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final Object m2628switch(AbstractC4820l abstractC4820l, EnumC14535l enumC14535l, AbstractC0283l abstractC0283l) throws IOException {
        int iAds = abstractC4820l.ads();
        int i = enumC14535l.f28465l;
        if (abstractC4820l.f9870l.get()) {
            C18262l.metrica("Selectable is already closed");
            return null;
        }
        if ((iAds & i) == 0) {
            throw new IllegalStateException(("Selectable is invalid state: " + iAds + ", " + i).toString());
        }
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(abstractC0283l));
        c2397l.license();
        c2397l.ad(C12844l.f25274l);
        C12820l c12820l = abstractC4820l.f9869l;
        c12820l.getClass();
        AtomicReferenceFieldUpdater[] atomicReferenceFieldUpdaterArr = C12820l.yandex;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C12820l.yandex[enumC14535l.ordinal()];
        while (!atomicReferenceFieldUpdater.compareAndSet(c12820l, null, c2397l)) {
            if (atomicReferenceFieldUpdater.get(c12820l) != null) {
                throw new IllegalStateException(("Handler for " + enumC14535l.name() + " is already registered").toString());
            }
        }
        if (!c2397l.signatures()) {
            try {
                if (!this.f19057l.yandex(abstractC4820l)) {
                    if (abstractC4820l.mopub().isOpen()) {
                        throw new ClosedSelectorException();
                    }
                    throw new ClosedChannelException();
                }
                C5501l c5501l = this.f19055l;
                Unit unit = Unit.INSTANCE;
                InterfaceC14029l interfaceC14029l = (InterfaceC14029l) ((AtomicReference) c5501l.f11764l).getAndSet(null);
                if (interfaceC14029l != null) {
                    interfaceC14029l.subs(unit);
                }
                m2625default();
            } catch (Throwable th) {
                signatures(abstractC4820l, th);
            }
        }
        Object objSignature = c2397l.Signature();
        return objSignature == EnumC9342l.f19165l ? objSignature : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m2629synchronized(AbstractC4820l abstractC4820l) {
        SelectionKey selectionKeyKeyFor;
        signatures(abstractC4820l, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = abstractC4820l.mopub().keyFor(selector)) == null) {
            return;
        }
        selectionKeyKeyFor.cancel();
        m2625default();
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f19052l;
    }
}
