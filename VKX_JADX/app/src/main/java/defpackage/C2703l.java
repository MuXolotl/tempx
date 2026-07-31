package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؔٙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2703l {
    public boolean amazon;
    public boolean crashlytics;
    public boolean loadAd;
    public boolean purchase;
    public final InterfaceC18212l yandex;
    public final C12463l billing = new C12463l();
    public final C2316l mopub = new C2316l();
    public final C18730l admob = new C18730l(10);

    public C2703l(InterfaceC18212l interfaceC18212l) {
        this.yandex = interfaceC18212l;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void amazon(AbstractC14971l abstractC14971l) {
        if (this.loadAd) {
            this.purchase = true;
            this.billing.yandex(abstractC14971l);
            return;
        }
        C2316l c2316l = this.mopub;
        C12463l c12463l = c2316l.loadAd;
        c12463l.billing();
        c12463l.yandex(c2316l);
        while (c12463l.firebase()) {
            C2316l c2316l2 = (C2316l) c12463l.remoteconfig(c12463l.loadAd - 1);
            int i = 0;
            while (true) {
                C17893l c17893l = c2316l2.yandex;
                if (i < c17893l.f34846l) {
                    C14438l c14438l = (C14438l) c17893l.f34848l[i];
                    if (AbstractC8576l.yandex(c14438l.crashlytics, abstractC14971l)) {
                        c2316l2.yandex.remoteconfig(c14438l);
                        c14438l.crashlytics();
                    } else {
                        c12463l.yandex(c14438l);
                        i++;
                    }
                }
            }
        }
    }

    public final void crashlytics() {
        if (this.loadAd) {
            this.crashlytics = true;
            return;
        }
        C2316l c2316l = this.mopub;
        C17893l c17893l = c2316l.yandex;
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            ((C14438l) objArr[i2]).crashlytics();
        }
        if (this.amazon) {
            this.amazon = true;
        } else {
            c2316l.yandex.isPro();
        }
    }

    public final boolean loadAd(C8634l c8634l, boolean z) {
        C3994l c3994l = (C3994l) c8634l.f17792l;
        InterfaceC18212l interfaceC18212l = this.yandex;
        C2316l c2316l = this.mopub;
        boolean zYandex = c2316l.yandex(c3994l, interfaceC18212l, c8634l, z);
        C17893l c17893l = c2316l.yandex;
        if (!zYandex) {
            return false;
        }
        boolean z2 = true;
        this.loadAd = true;
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((C14438l) objArr[i2]).purchase(c8634l, z) || z3;
        }
        Object[] objArr2 = c17893l.f34848l;
        int i3 = c17893l.f34846l;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((C14438l) objArr2[i4]).amazon(c8634l) || z4;
        }
        c2316l.loadAd(c8634l);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.loadAd = false;
        if (this.purchase) {
            this.purchase = false;
            C12463l c12463l = this.billing;
            int i5 = c12463l.loadAd;
            for (int i6 = 0; i6 < i5; i6++) {
                amazon((AbstractC14971l) c12463l.admob(i6));
            }
            c12463l.billing();
        }
        if (this.crashlytics) {
            this.crashlytics = false;
            crashlytics();
        }
        if (this.amazon) {
            this.amazon = false;
            c2316l.yandex.isPro();
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    public final void yandex(long j, List list, boolean z) {
        C18730l c18730l;
        long[] jArr;
        C14438l c14438l;
        Object objPurchase;
        Object obj;
        int size = list.size();
        C2316l c2316l = this.mopub;
        C2316l c2316l2 = c2316l;
        boolean z2 = true;
        int i = 0;
        while (true) {
            c18730l = this.admob;
            if (i >= size) {
                break;
            }
            AbstractC14971l abstractC14971l = (AbstractC14971l) list.get(i);
            if (abstractC14971l.f29462l) {
                abstractC14971l.f29449l = new C4307l(this, abstractC14971l, 6);
                if (z2) {
                    C17893l c17893l = c2316l2.yandex;
                    Object[] objArr = c17893l.f34848l;
                    int i2 = c17893l.f34846l;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (AbstractC8576l.yandex(((C14438l) obj).crashlytics, abstractC14971l)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    c14438l = (C14438l) obj;
                    if (c14438l != null) {
                        c14438l.subs = true;
                        c14438l.amazon.yandex(j);
                        if (z) {
                            Object objPurchase2 = c18730l.purchase(j);
                            if (objPurchase2 == null) {
                                objPurchase2 = new C12463l();
                                c18730l.subs(j, objPurchase2);
                            }
                            ((C12463l) objPurchase2).yandex(c14438l);
                        }
                    } else {
                        z2 = false;
                        c14438l = new C14438l(abstractC14971l);
                        c14438l.amazon.yandex(j);
                        if (z) {
                            objPurchase = c18730l.purchase(j);
                            if (objPurchase == null) {
                                objPurchase = new C12463l();
                                c18730l.subs(j, objPurchase);
                            }
                            ((C12463l) objPurchase).yandex(c14438l);
                        }
                        c2316l2.yandex.crashlytics(c14438l);
                    }
                } else {
                    c14438l = new C14438l(abstractC14971l);
                    c14438l.amazon.yandex(j);
                    if (z) {
                        objPurchase = c18730l.purchase(j);
                        if (objPurchase == null) {
                            objPurchase = new C12463l();
                            c18730l.subs(j, objPurchase);
                        }
                        ((C12463l) objPurchase).yandex(c14438l);
                    }
                    c2316l2.yandex.crashlytics(c14438l);
                }
                c2316l2 = c14438l;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = c18730l.loadAd;
            Object[] objArr2 = c18730l.crashlytics;
            long[] jArr3 = c18730l.yandex;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                C12463l c12463l = (C12463l) objArr2[i8];
                                C17893l c17893l2 = c2316l.yandex;
                                Object[] objArr3 = c17893l2.f34848l;
                                int i9 = c17893l2.f34846l;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((C14438l) objArr3[i10]).billing(j3, c12463l);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        c18730l.yandex();
    }
}
