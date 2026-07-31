package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؙّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8610l extends AbstractC6998l implements InterfaceC12244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC6642l f17759l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function0 f17760l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7602l f17761l = new C7602l(AbstractC9620l.isPro().mopub());

    public C8610l(InterfaceC6642l interfaceC6642l, Function0 function0) {
        this.f17760l = function0;
        this.f17759l = interfaceC6642l;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #2 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:87:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x009c A[EDGE_INSN: B:92:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    public final C7602l admob(C7602l c7602l, AbstractC18620l abstractC18620l, boolean z, Function0 function0) {
        C7602l c7602l2;
        InterfaceC6642l interfaceC6642l;
        int i;
        if (c7602l.amazon(this, abstractC18620l)) {
            if (z) {
                C17893l c17893lPurchase = AbstractC8020l.purchase();
                Object[] objArr = c17893lPurchase.f34848l;
                int i2 = c17893lPurchase.f34846l;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((C8957l) objArr[i3]).loadAd();
                }
                try {
                    C7661l c7661l = c7602l.purchase;
                    C4816l c4816l = AbstractC5929l.yandex;
                    C6467l c6467l = (C6467l) c4816l.get();
                    if (c6467l == null) {
                        c6467l = new C6467l();
                        c4816l.firebase(c6467l);
                    }
                    int i4 = c6467l.yandex;
                    Object[] objArr2 = c7661l.loadAd;
                    int[] iArr = c7661l.crashlytics;
                    long[] jArr = c7661l.yandex;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        InterfaceC2763l interfaceC2763l = (InterfaceC2763l) objArr2[i9];
                                        i = i6;
                                        c6467l.yandex = i4 + iArr[i9];
                                        Function1 function1Purchase = abstractC18620l.purchase();
                                        if (function1Purchase != null) {
                                            function1Purchase.invoke(interfaceC2763l);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    c6467l.yandex = i4;
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Object[] objArr3 = c17893lPurchase.f34848l;
                    int i10 = c17893lPurchase.f34846l;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C8957l) objArr3[i11]).yandex();
                    }
                }
            }
            return c7602l;
        }
        C7661l c7661l2 = new C7661l();
        C4816l c4816l2 = AbstractC5929l.yandex;
        C6467l c6467l2 = (C6467l) c4816l2.get();
        if (c6467l2 == null) {
            c6467l2 = new C6467l();
            c4816l2.firebase(c6467l2);
        }
        int i12 = c6467l2.yandex;
        C17893l c17893lPurchase2 = AbstractC8020l.purchase();
        Object[] objArr4 = c17893lPurchase2.f34848l;
        int i13 = c17893lPurchase2.f34846l;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C8957l) objArr4[i14]).loadAd();
        }
        try {
            c6467l2.yandex = i12 + 1;
            Object objVip = AbstractC7572l.vip(new C0237l(this, c6467l2, c7661l2, i12, 0), function0);
            c6467l2.yandex = i12;
            Object[] objArr5 = c17893lPurchase2.f34848l;
            int i15 = c17893lPurchase2.f34846l;
            for (int i16 = 0; i16 < i15; i16++) {
                ((C8957l) objArr5[i16]).yandex();
            }
            Object obj = AbstractC9620l.crashlytics;
            synchronized (obj) {
                try {
                    AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
                    Object obj2 = c7602l.billing;
                    if (obj2 == C7602l.admob || (interfaceC6642l = this.f17759l) == null || !interfaceC6642l.firebase(objVip, obj2)) {
                        c7602l2 = (C7602l) AbstractC9620l.vip(this.f17761l, this, abstractC18620lIsPro);
                        c7602l2.purchase = c7661l2;
                        c7602l2.mopub = c7602l2.purchase(this, abstractC18620lIsPro);
                        c7602l2.billing = objVip;
                    } else {
                        c7602l.purchase = c7661l2;
                        c7602l.mopub = c7602l.purchase(this, abstractC18620lIsPro);
                        c7602l2 = c7602l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C6467l c6467l3 = (C6467l) AbstractC5929l.yandex.get();
            if (c6467l3 == null || c6467l3.yandex != 0) {
                return c7602l2;
            }
            AbstractC9620l.isPro().remoteconfig();
            synchronized (obj) {
                AbstractC18620l abstractC18620lIsPro2 = AbstractC9620l.isPro();
                c7602l2.crashlytics = abstractC18620lIsPro2.mopub();
                c7602l2.amazon = abstractC18620lIsPro2.admob();
                Unit unit2 = Unit.INSTANCE;
            }
            return c7602l2;
        } catch (Throwable th2) {
            Object[] objArr6 = c17893lPurchase2.f34848l;
            int i17 = c17893lPurchase2.f34846l;
            for (int i18 = 0; i18 < i17; i18++) {
                ((C8957l) objArr6[i18]).yandex();
            }
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f17761l;
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        Function1 function1Purchase = AbstractC9620l.isPro().purchase();
        if (function1Purchase != null) {
            function1Purchase.invoke(this);
        }
        AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
        return admob((C7602l) AbstractC9620l.subs(this.f17761l, abstractC18620lIsPro), abstractC18620lIsPro, true, this.f17760l).billing;
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        this.f17761l = (C7602l) abstractC7498l;
    }

    public final C7602l subs() {
        AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
        return admob((C7602l) AbstractC9620l.subs(this.f17761l, abstractC18620lIsPro), abstractC18620lIsPro, false, this.f17760l);
    }

    public final String toString() {
        C7602l c7602l = (C7602l) AbstractC9620l.admob(this.f17761l);
        return "DerivedState(value=" + (c7602l.amazon(this, AbstractC9620l.isPro()) ? String.valueOf(c7602l.billing) : "<Not calculated>") + ")@" + hashCode();
    }
}
