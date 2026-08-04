package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚۡۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7583l implements InterfaceC17955l {
    public static final C13645l ad = AbstractC15212l.purchase(new C2613l(27), new C12513l((byte) 0, 25));
    public final InterfaceC8714l Signature;
    public final C16977l adcel;
    public C3654l admob;
    public final C2403l ads;
    public final C10086l amazon;
    public final C10086l billing;
    public final C7403l crashlytics;
    public final C5138l firebase;
    public final C3877l isPro;
    public final InterfaceC8714l license;
    public C16122l loadAd;
    public float metrica;
    public final C10086l mopub;
    public final C13568l pro;
    public final C13698l purchase;
    public final C14541l remoteconfig;
    public final boolean smaato;
    public int startapp;
    public final C6188l subs;
    public final C16141l subscription;
    public final C12660l tapsense;
    public final C7239l vip;
    public boolean yandex;

    public C7583l(int[] iArr, int[] iArr2) {
        Integer numValueOf;
        C14959l c14959l = new C14959l(2, this, C7583l.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0, 0, 7);
        C7403l c7403l = new C7403l();
        c7403l.f15342l = c14959l;
        c7403l.f15341l = iArr;
        c7403l.f15343l = new C15308l(C7403l.yandex(iArr));
        c7403l.f15340l = iArr2;
        c7403l.f15336l = new C15308l(C7403l.loadAd(iArr, iArr2));
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int length = iArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    int i3 = iArr[i2];
                    i = i > i3 ? i3 : i;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        c7403l.f15338l = new C0536l(numValueOf != null ? numValueOf.intValue() : 0, 90, 200);
        this.crashlytics = c7403l;
        this.amazon = new C10086l(AbstractC15187l.yandex, C18450l.f36015l);
        this.purchase = new C13698l((byte) 0, 12);
        Boolean bool = Boolean.FALSE;
        this.billing = AbstractC8020l.smaato(bool);
        this.mopub = AbstractC8020l.smaato(bool);
        this.subs = new C6188l(this, 2);
        this.isPro = new C3877l();
        this.firebase = new C5138l((byte) 0, 18);
        this.smaato = true;
        this.remoteconfig = new C14541l(null);
        this.vip = new C7239l(new C17015l(24, this));
        this.startapp = -1;
        C16977l c16977l = AbstractC6903l.yandex;
        this.adcel = new C16977l();
        this.ads = new C2403l();
        this.subscription = new C16141l();
        this.tapsense = new C12660l();
        this.Signature = AbstractC11184l.amazon();
        this.license = AbstractC11184l.amazon();
        this.pro = new C13568l(1);
    }

    public final void admob(float f, C16122l c16122l) {
        C16977l c16977l;
        int iPro;
        int i;
        long jAdmob;
        if (!this.smaato || c16122l.remoteconfig.isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        List list = c16122l.remoteconfig;
        int i2 = z ? ((C15724l) AbstractC16901l.m4214continue(list)).yandex : ((C15724l) AbstractC16901l.m4231native(list)).yandex;
        if (i2 == this.startapp) {
            return;
        }
        this.startapp = i2;
        int[] iArr = AbstractC12047l.yandex;
        C4622l c4622l = new C4622l();
        C12507l c12507l = c16122l.subs;
        int[] iArr2 = c12507l.f24646l;
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            c16977l = this.adcel;
            if (i3 >= length) {
                break;
            }
            C13698l c13698l = this.purchase;
            if (z) {
                iPro = i2 + 1;
                int length2 = c13698l.f26744l + ((int[]) c13698l.f26743l).length;
                while (true) {
                    if (iPro >= length2) {
                        iPro = c13698l.f26744l + ((int[]) c13698l.f26743l).length;
                        break;
                    } else if (c13698l.remoteconfig(iPro, i3)) {
                        break;
                    } else {
                        iPro++;
                    }
                }
            } else {
                iPro = c13698l.pro(i2, i3);
            }
            int i4 = iPro;
            if (i4 < 0 || i4 >= c16122l.smaato || c4622l.crashlytics(i4)) {
                break;
            }
            c4622l.loadAd[c4622l.amazon(i4)] = i4;
            if (!c16977l.yandex(i4)) {
                boolean zInmobi = c16122l.isPro.inmobi(i4);
                int i5 = zInmobi ? 0 : i3;
                int i6 = zInmobi ? length : 1;
                if (i6 == 1) {
                    i = iArr2[i5];
                } else {
                    int[] iArr3 = c12507l.f24647l;
                    int i7 = iArr3[i5];
                    int i8 = (i5 + i6) - 1;
                    i = (iArr3[i8] + iArr2[i8]) - i7;
                }
                if (c16122l.license == EnumC7283l.f15126l) {
                    if (i < 0) {
                        AbstractC10280l.yandex("width must be >= 0");
                    }
                    jAdmob = AbstractC7563l.admob(i, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
                } else {
                    if (i < 0) {
                        AbstractC10280l.yandex("height must be >= 0");
                    }
                    jAdmob = AbstractC7563l.admob(0, Alert.DURATION_SHOW_INDEFINITELY, i, i);
                }
                c16977l.subs(i4, this.remoteconfig.yandex(i4, jAdmob, true, null));
            }
            i3++;
            i2 = i4;
        }
        long[] jArr = c16977l.yandex;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j = jArr[i9];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length3)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = c16977l.loadAd[i12];
                        InterfaceC13921l interfaceC13921l = (InterfaceC13921l) c16977l.crashlytics[i12];
                        boolean zCrashlytics = c4622l.crashlytics(i13);
                        if (!zCrashlytics) {
                            interfaceC13921l.cancel();
                        }
                        if (!zCrashlytics) {
                            c16977l.admob(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length3) {
                return;
            } else {
                i9++;
            }
        }
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean amazon() {
        return ((Boolean) this.billing.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x014c A[LOOP:1: B:62:0x0110->B:72:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0150 A[EDGE_INSN: B:95:0x0150->B:73:0x0150 BREAK  A[LOOP:1: B:62:0x0110->B:72:0x014c], SYNTHETIC] */
    public final void billing(C16122l c16122l, boolean z, boolean z2) {
        Object obj;
        Function1 function1Purchase;
        C7403l c7403l = this.crashlytics;
        C13568l c13568l = this.pro;
        if (!z && this.yandex) {
            this.loadAd = c16122l;
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                if (c13568l.metrica() && Arrays.equals(c16122l.yandex, (int[]) c7403l.f15341l) && Arrays.equals(c16122l.loadAd, (int[]) c7403l.f15340l)) {
                    c13568l.Signature();
                }
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            }
        }
        if (z) {
            this.yandex = true;
        }
        float f = this.metrica;
        float f2 = c16122l.crashlytics;
        List list = c16122l.remoteconfig;
        int[] iArr = c16122l.yandex;
        int[] iArr2 = c16122l.loadAd;
        this.metrica = f - f2;
        this.amazon.setValue(c16122l);
        if (z2) {
            c7403l.f15340l = iArr2;
            ((C15308l) c7403l.f15336l).subs(C7403l.loadAd((int[]) c7403l.f15341l, iArr2));
        } else {
            c7403l.getClass();
            int iYandex = C7403l.yandex(iArr);
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i);
                if (((C15724l) obj).yandex == iYandex) {
                    break;
                } else {
                    i++;
                }
            }
            C15724l c15724l = (C15724l) obj;
            c7403l.f15337l = c15724l != null ? c15724l.loadAd : null;
            ((C0536l) c7403l.f15338l).crashlytics(iYandex);
            if (c7403l.f15339l || c16122l.smaato > 0) {
                c7403l.f15339l = true;
                AbstractC18620l abstractC18620lBilling2 = AbstractC7572l.billing();
                function1Purchase = abstractC18620lBilling2 != null ? abstractC18620lBilling2.purchase() : null;
                AbstractC18620l abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                try {
                    c7403l.f15341l = iArr;
                    ((C15308l) c7403l.f15343l).subs(C7403l.yandex(iArr));
                    c7403l.f15340l = iArr2;
                    ((C15308l) c7403l.f15336l).subs(C7403l.loadAd(iArr, iArr2));
                    Unit unit2 = Unit.INSTANCE;
                    AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase);
                } catch (Throwable th) {
                    AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase);
                    throw th;
                }
            }
            if (this.startapp != -1 && !list.isEmpty()) {
                int i2 = ((C15724l) AbstractC16901l.m4231native(list)).yandex;
                int i3 = ((C15724l) AbstractC16901l.m4214continue(list)).yandex;
                int i4 = this.startapp;
                if (i2 > i4 || i4 > i3) {
                    this.startapp = -1;
                    C16977l c16977l = this.adcel;
                    Object[] objArr = c16977l.crashlytics;
                    long[] jArr = c16977l.yandex;
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
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        ((InterfaceC13921l) objArr[(i5 << 3) + i7]).cancel();
                                    }
                                    j >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                } else if (i5 != length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    c16977l.crashlytics();
                }
            }
        }
        this.mopub.setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        this.billing.setValue(Boolean.valueOf(c16122l.billing));
        if (z) {
            c13568l.ad(c16122l.purchase, c16122l.firebase, c16122l.tapsense);
        }
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean crashlytics() {
        return ((Boolean) this.mopub.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.vip.loadAd(r7, r8, r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC17955l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(defpackage.EnumC11011l r7, kotlin.jvm.functions.Function2 r8, defpackage.InterfaceC14029l r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C3175l
            if (r0 == 0) goto L13
            r0 = r9
            lٕؕؕ r0 = (defpackage.C3175l) r0
            int r1 = r0.f6822l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6822l = r1
            goto L18
        L13:
            lٕؕؕ r0 = new lٕؕؕ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f6825l
            int r1 = r0.f6822l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L31:
            lٌؘۦ r7 = r0.f6823l
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            lًُْ r7 = r0.f6824l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L5b
        L3c:
            defpackage.AbstractC2829l.crashlytics(r9)
            lََؖ r9 = r6.amazon
            java.lang.Object r9 = r9.getValue()
            lٖؑٞ r1 = defpackage.AbstractC15187l.yandex
            if (r9 != r1) goto L5b
            r0.f6824l = r7
            r9 = r8
            lٌؘۦ r9 = (defpackage.AbstractC5563l) r9
            r0.f6823l = r9
            r0.f6822l = r4
            lؖؔؖ r9 = r6.isPro
            java.lang.Object r9 = r9.isPro(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.f6824l = r2
            r0.f6823l = r2
            r0.f6822l = r3
            lؚْ۟ r6 = r6.vip
            java.lang.Object r6 = r6.loadAd(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7583l.loadAd(lًُْ, kotlin.jvm.functions.Function2, lٌؚٓ):java.lang.Object");
    }

    public final C16122l mopub() {
        return (C16122l) this.amazon.getValue();
    }

    @Override // defpackage.InterfaceC17955l
    public final float purchase(float f) {
        return this.vip.purchase(f);
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean yandex() {
        return this.vip.yandex();
    }
}
