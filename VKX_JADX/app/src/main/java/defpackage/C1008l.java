package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lّؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1008l extends AbstractC4443l implements InterfaceC6942l, InterfaceC5305l, InterfaceC2478l, InterfaceC5995l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2753l = AtomicReferenceFieldUpdater.newUpdater(C1008l.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2754l;

    public C1008l(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.AbstractC4443l
    public final AbstractC1030l amazon() {
        return new C7590l();
    }

    @Override // defpackage.InterfaceC5995l
    public final void billing() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final boolean firebase(Object obj, Object obj2) {
        C9676l c9676l = AbstractC2878l.yandex;
        if (obj == null) {
            obj = c9676l;
        }
        if (obj2 == null) {
            obj2 = c9676l;
        }
        return remoteconfig(obj, obj2);
    }

    @Override // defpackage.InterfaceC2478l
    public final Object getValue() {
        Object obj = f2753l.get(this);
        if (obj == AbstractC2878l.yandex) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        smaato(obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5305l
    public final InterfaceC6942l loadAd(InterfaceC12932l interfaceC12932l, int i, int i2) {
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? AbstractC3861l.purchase(this, interfaceC12932l, i, i2) : this;
    }

    @Override // defpackage.InterfaceC5995l
    public final boolean mopub(Object obj) {
        smaato(obj);
        return true;
    }

    @Override // defpackage.AbstractC4443l
    public final AbstractC1030l[] purchase() {
        return new C7590l[2];
    }

    public final boolean remoteconfig(Object obj, Object obj2) {
        int i;
        AbstractC1030l[] abstractC1030lArr;
        C9676l c9676l;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2753l;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC8576l.yandex(obj3, obj)) {
                return false;
            }
            if (AbstractC8576l.yandex(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f2754l;
            if ((i2 & 1) != 0) {
                this.f2754l = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f2754l = i3;
            AbstractC1030l[] abstractC1030lArr2 = this.f9044l;
            Unit unit = Unit.INSTANCE;
            while (true) {
                C7590l[] c7590lArr = (C7590l[]) abstractC1030lArr2;
                if (c7590lArr != null) {
                    for (C7590l c7590l : c7590lArr) {
                        if (c7590l != null) {
                            AtomicReference atomicReference = c7590l.yandex;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (c9676l = AbstractC11190l.loadAd)) {
                                    break;
                                }
                                C9676l c9676l2 = AbstractC11190l.yandex;
                                if (obj4 != c9676l2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c9676l2)) {
                                            ((C2397l) obj4).subs(Unit.INSTANCE);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c9676l)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f2754l;
                    if (i == i3) {
                        this.f2754l = i3 + 1;
                        return true;
                    }
                    abstractC1030lArr = this.f9044l;
                    Unit unit2 = Unit.INSTANCE;
                }
                abstractC1030lArr2 = abstractC1030lArr;
                i3 = i;
            }
        }
    }

    public final void smaato(Object obj) {
        if (obj == null) {
            obj = AbstractC2878l.yandex;
        }
        remoteconfig(null, obj);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00cf A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006a, B:30:0x0072, B:33:0x0079, B:34:0x007d, B:36:0x0080, B:46:0x00a1, B:49:0x00ae, B:50:0x00c8, B:56:0x00da, B:59:0x00e1, B:53:0x00cf, B:55:0x00d5, B:38:0x0086, B:42:0x008d, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[LOOP:0: B:50:0x00c8->B:69:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ad -> B:28:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.InterfaceC6942l
    public final java.lang.Object yandex(defpackage.InterfaceC9427l r13, defpackage.InterfaceC14029l r14) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1008l.yandex(lٌٍۜ, lٌؚٓ):java.lang.Object");
    }
}
