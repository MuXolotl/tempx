package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15786l implements InterfaceC5344l, InterfaceC8077l {
    public final C17974l amazon;
    public final int billing;
    public final float crashlytics;
    public final InterfaceC3501l loadAd;
    public final C6609l mopub;
    public final float purchase;
    public final InterfaceC5404l yandex;

    public C15786l(InterfaceC5404l interfaceC5404l, InterfaceC3501l interfaceC3501l, float f, C17974l c17974l, float f2, int i, C6609l c6609l) {
        this.yandex = interfaceC5404l;
        this.loadAd = interfaceC3501l;
        this.crashlytics = f;
        this.amazon = c17974l;
        this.purchase = f2;
        this.billing = i;
        this.mopub = c6609l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int firebase(List list, int i, int i2, int i3, int i4, C6609l c6609l) {
        long jYandex;
        int i5 = 0;
        if (list.isEmpty()) {
            jYandex = C18142l.yandex(0, 0);
        } else {
            int i6 = Alert.DURATION_SHOW_INDEFINITELY;
            C4095l c4095l = new C4095l(i4, c6609l, AbstractC7563l.yandex(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY), i2, i3);
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) AbstractC16901l.m4220for(0, list);
            int iMo1460for = interfaceC6357l != null ? interfaceC6357l.mo1460for(i) : 0;
            int iRemoteconfig = interfaceC6357l != null ? interfaceC6357l.remoteconfig(iMo1460for) : 0;
            int i7 = 0;
            if (c4095l.loadAd(list.size() > 1, 0, C18142l.yandex(i, Alert.DURATION_SHOW_INDEFINITELY), interfaceC6357l == null ? null : new C18142l(C18142l.yandex(iRemoteconfig, iMo1460for)), 0, 0, 0, false, false).f22717l) {
                C18142l c18142lYandex = c6609l.yandex(0, 0, interfaceC6357l != null);
                jYandex = C18142l.yandex(c18142lYandex != null ? (int) (c18142lYandex.yandex & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i9 < size) {
                    int i14 = i8 - iRemoteconfig;
                    int i15 = i9 + 1;
                    int iMax = Math.max(i13, iMo1460for);
                    InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) AbstractC16901l.m4220for(i15, list);
                    int iMo1460for2 = interfaceC6357l2 != null ? interfaceC6357l2.mo1460for(i) : i5;
                    int iRemoteconfig2 = interfaceC6357l2 != null ? interfaceC6357l2.remoteconfig(iMo1460for2) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z = i9 + 2 < list.size() ? 1 : i5;
                    int i17 = i12;
                    int i18 = iMo1460for2;
                    int i19 = iRemoteconfig2;
                    C11280l c11280lLoadAd = c4095l.loadAd(z, i16, C18142l.yandex(i14, i6), interfaceC6357l2 == null ? null : new C18142l(C18142l.yandex(iRemoteconfig2, iMo1460for2)), i17, i7, iMax, false, false);
                    if (c11280lLoadAd.f22718l) {
                        int i20 = iMax + i3 + i7;
                        C5331l c5331lYandex = c4095l.yandex(c11280lLoadAd, interfaceC6357l2 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (c11280lLoadAd.f22717l) {
                            if (c5331lYandex != null) {
                                long j = c5331lYandex.crashlytics;
                                if (!c5331lYandex.amazon) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                            break;
                        }
                        i11 = i15;
                        i7 = i20;
                        iRemoteconfig = i21;
                        i13 = 0;
                        i8 = i;
                    } else {
                        iRemoteconfig = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = iMax;
                    }
                    i9 = i15;
                    i10 = i9;
                    iMo1460for = i18;
                    i6 = Alert.DURATION_SHOW_INDEFINITELY;
                    i5 = 0;
                }
                jYandex = C18142l.yandex(i7 - i3, i10);
            }
        }
        return (int) (jYandex >> 32);
    }

    @Override // defpackage.InterfaceC8077l
    public final InterfaceC17792l admob(final AbstractC10113l[] abstractC10113lArr, InterfaceC7448l interfaceC7448l, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final EnumC9931l enumC9931l = EnumC9931l.f20223l;
        return interfaceC7448l.isVip(i, i2, C14054l.f27396l, new Function1() { // from class: lِّ۟
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractC13831l abstractC13831l;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    AbstractC10113l abstractC10113l = abstractC10113lArr[i8];
                    Object objSignature = abstractC10113l.Signature();
                    C1809l c1809l = objSignature instanceof C1809l ? (C1809l) objSignature : null;
                    if (c1809l == null || (abstractC13831l = c1809l.crashlytics) == null) {
                        abstractC13831l = this.amazon;
                    }
                    abstractC9601l.mopub(abstractC10113l, iArr[i8 - i7], abstractC13831l.loadAd(i2, abstractC10113l.mo1458catch(), enumC9931l) + i6, 0.0f);
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // defpackage.InterfaceC5344l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        List list2 = (List) AbstractC16901l.m4220for(1, list);
        InterfaceC6357l interfaceC6357l = list2 != null ? (InterfaceC6357l) AbstractC16901l.m4217extends(list2) : null;
        List list3 = (List) AbstractC16901l.m4220for(2, list);
        this.mopub.loadAd(interfaceC6357l, list3 != null ? (InterfaceC6357l) AbstractC16901l.m4217extends(list3) : null, AbstractC7563l.loadAd(0, i, 0, 0, 13));
        List list4 = (List) AbstractC16901l.m4217extends(list);
        if (list4 == null) {
            list4 = C2580l.f5619l;
        }
        return firebase(list4, i, interfaceC12822l.mo870l(this.crashlytics), interfaceC12822l.mo870l(this.purchase), this.billing, this.mopub);
    }

    @Override // defpackage.InterfaceC8077l
    public final void billing(int i, int[] iArr, int[] iArr2, InterfaceC7448l interfaceC7448l) {
        this.yandex.Signature(interfaceC7448l, i, iArr, interfaceC7448l.getLayoutDirection(), iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.InterfaceC5344l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        int i2;
        long jYandex;
        this = this;
        int i3 = 1;
        List list2 = (List) AbstractC16901l.m4220for(1, list);
        InterfaceC6357l interfaceC6357l = list2 != null ? (InterfaceC6357l) AbstractC16901l.m4217extends(list2) : null;
        List list3 = (List) AbstractC16901l.m4220for(2, list);
        int i4 = 0;
        this.mopub.loadAd(interfaceC6357l, list3 != null ? (InterfaceC6357l) AbstractC16901l.m4217extends(list3) : null, AbstractC7563l.loadAd(0, 0, 0, i, 7));
        List list4 = (List) AbstractC16901l.m4217extends(list);
        if (list4 == null) {
            list4 = C2580l.f5619l;
        }
        int iMo870l = interfaceC12822l.mo870l(this.crashlytics);
        int iMo870l2 = interfaceC12822l.mo870l(this.purchase);
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr = new int[size];
        int size2 = list4.size();
        int[] iArr2 = new int[size2];
        int size3 = list4.size();
        for (int i5 = 0; i5 < size3; i5++) {
            InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) list4.get(i5);
            int iRemoteconfig = interfaceC6357l2.remoteconfig(i);
            iArr[i5] = iRemoteconfig;
            iArr2[i5] = interfaceC6357l2.mo1460for(iRemoteconfig);
        }
        int size4 = list4.size();
        C6609l c6609l = this.mopub;
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        if (Integer.MAX_VALUE < size4) {
            c6609l.getClass();
        }
        if (Integer.MAX_VALUE >= list4.size()) {
            c6609l.getClass();
        }
        int iMin = Math.min(Alert.DURATION_SHOW_INDEFINITELY, list4.size());
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += iArr[i8];
        }
        int size5 = ((list4.size() - 1) * iMo870l) + i7;
        if (size2 == 0) {
            C4875l.firebase();
            return 0;
        }
        int i9 = iArr2[0];
        int i10 = size2 - 1;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = iArr2[i11];
                if (i9 < i12) {
                    i9 = i12;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        if (size == 0) {
            C4875l.firebase();
            return 0;
        }
        int i13 = iArr[0];
        int i14 = size - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        int i17 = size5;
        while (i13 <= i17 && i9 != i) {
            size5 = (i13 + i17) / 2;
            if (list4.isEmpty()) {
                jYandex = C18142l.yandex(i4, i4);
                list4 = list4;
                iArr = iArr;
                i4 = i4;
                iMin = iMin;
                i17 = i17;
            } else {
                iMin = iMin;
                C4095l c4095l = new C4095l(this.billing, c6609l, AbstractC7563l.yandex(i4, size5, i4, i6), iMo870l, iMo870l2);
                InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) AbstractC16901l.m4220for(i4, list4);
                int i18 = interfaceC6357l3 != null ? iArr2[i4] : i4;
                int i19 = interfaceC6357l3 != null ? iArr[i4] : i4;
                iArr = iArr;
                int i20 = 0;
                int i21 = 0;
                if (c4095l.loadAd(list4.size() > i3 ? i3 : i4, 0, C18142l.yandex(size5, Alert.DURATION_SHOW_INDEFINITELY), interfaceC6357l3 == null ? null : new C18142l(C18142l.yandex(i19, i18)), 0, 0, 0, false, false).f22717l) {
                    C18142l c18142lYandex = c6609l.yandex(i4, i4, interfaceC6357l3 != null ? 1 : i4);
                    jYandex = C18142l.yandex(c18142lYandex != null ? (int) (c18142lYandex.yandex & 4294967295L) : i4, i4);
                    i17 = i17;
                    list4 = list4;
                    i4 = i4;
                } else {
                    int size6 = list4.size();
                    int i22 = size5;
                    int i23 = i4;
                    int i24 = i23;
                    int i25 = i24;
                    int i26 = 0;
                    while (true) {
                        if (i23 >= size6) {
                            i17 = i17;
                            list4 = list4;
                            i4 = i4;
                            i2 = i24;
                            break;
                        }
                        i22 -= i19;
                        i2 = i23 + 1;
                        int iMax = Math.max(i26, i18);
                        InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) AbstractC16901l.m4220for(i2, list4);
                        i18 = interfaceC6357l4 != null ? iArr2[i2] : i4;
                        if (interfaceC6357l4 != null) {
                            i4 = iArr[i2] + iMo870l;
                        }
                        int i27 = i2 - i25;
                        C11280l c11280lLoadAd = c4095l.loadAd(i23 + 2 < list4.size() ? 1 : i4, i27, C18142l.yandex(i22, Alert.DURATION_SHOW_INDEFINITELY), interfaceC6357l4 == null ? null : new C18142l(C18142l.yandex(i4, i18)), i20, i21, iMax, false, false);
                        if (c11280lLoadAd.f22718l) {
                            int i28 = iMax + iMo870l2 + i21;
                            int i29 = i20;
                            C5331l c5331lYandex = c4095l.yandex(c11280lLoadAd, interfaceC6357l4 != null ? 1 : i4, i29, i28, i22, i27);
                            i4 -= iMo870l;
                            i20 = i29 + 1;
                            if (c11280lLoadAd.f22717l) {
                                if (c5331lYandex != null) {
                                    long j = c5331lYandex.crashlytics;
                                    if (!c5331lYandex.amazon) {
                                        i28 = ((int) (j & 4294967295L)) + iMo870l2 + i28;
                                    }
                                }
                                i21 = i28;
                                break;
                            }
                            i22 = size5;
                            i25 = i2;
                            i21 = i28;
                            i26 = i4;
                        } else {
                            i26 = iMax;
                        }
                        i17 = i17;
                        i23 = i2;
                        i24 = i23;
                        list4 = list4;
                        i19 = i4;
                        i4 = i4;
                    }
                    jYandex = C18142l.yandex(i21 - iMo870l2, i2);
                }
            }
            i9 = (int) (jYandex >> 32);
            int i30 = (int) (jYandex & 4294967295L);
            if (i9 > i || i30 < iMin) {
                i13 = size5 + 1;
                if (i13 > i17) {
                    return i13;
                }
                i17 = i17;
                i3 = 1;
                i6 = Alert.DURATION_SHOW_INDEFINITELY;
            } else {
                if (i9 >= i) {
                    return size5;
                }
                i17 = size5 - 1;
                i3 = 1;
                i6 = Alert.DURATION_SHOW_INDEFINITELY;
            }
        }
        return size5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15786l)) {
            return false;
        }
        C15786l c15786l = (C15786l) obj;
        return this.yandex.equals(c15786l.yandex) && this.loadAd.equals(c15786l.loadAd) && C14467l.loadAd(this.crashlytics, c15786l.crashlytics) && this.amazon.equals(c15786l.amazon) && C14467l.loadAd(this.purchase, c15786l.purchase) && this.billing == c15786l.billing && AbstractC8576l.yandex(this.mopub, c15786l.mopub);
    }

    public final int hashCode() {
        return this.mopub.hashCode() + ((((AbstractC9029l.mopub((this.amazon.hashCode() + AbstractC9029l.mopub((this.loadAd.hashCode() + ((this.yandex.hashCode() + 38161) * 31)) * 31, this.crashlytics, 31)) * 31, this.purchase, 31) + this.billing) * 31) + Alert.DURATION_SHOW_INDEFINITELY) * 31);
    }

    @Override // defpackage.InterfaceC8077l
    public final int isPro(AbstractC10113l abstractC10113l) {
        return abstractC10113l.mo1466switch();
    }

    /* JADX WARN: Failed to calculate best type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: lؖٓؖ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: lؖٓؖ
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r30v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r30v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r30v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r30v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.InterfaceC5344l
    public final defpackage.InterfaceC17792l loadAd(defpackage.InterfaceC7448l r51, java.util.List r52, long r53) {
        /*
            Method dump skipped, instruction units count: 1199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15786l.loadAd(lؚۖۦ, java.util.List, long):lٌٟ٘");
    }

    @Override // defpackage.InterfaceC8077l
    public final long mopub(int i, int i2, int i3, boolean z) {
        C5062l c5062l = AbstractC7001l.yandex;
        return !z ? AbstractC7563l.yandex(i, i2, 0, i3) : AbstractC13628l.billing(i, i2, 0, i3);
    }

    @Override // defpackage.InterfaceC5344l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        List list2 = (List) AbstractC16901l.m4220for(1, list);
        InterfaceC6357l interfaceC6357l = list2 != null ? (InterfaceC6357l) AbstractC16901l.m4217extends(list2) : null;
        List list3 = (List) AbstractC16901l.m4220for(2, list);
        this.mopub.loadAd(interfaceC6357l, list3 != null ? (InterfaceC6357l) AbstractC16901l.m4217extends(list3) : null, AbstractC7563l.loadAd(0, i, 0, 0, 13));
        List list4 = (List) AbstractC16901l.m4217extends(list);
        if (list4 == null) {
            list4 = C2580l.f5619l;
        }
        return firebase(list4, i, interfaceC12822l.mo870l(this.crashlytics), interfaceC12822l.mo870l(this.purchase), this.billing, this.mopub);
    }

    @Override // defpackage.InterfaceC8077l
    public final int subs(AbstractC10113l abstractC10113l) {
        return abstractC10113l.mo1458catch();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.yandex + ", verticalArrangement=" + this.loadAd + ", mainAxisSpacing=" + C14467l.crashlytics(this.crashlytics) + ", crossAxisAlignment=" + this.amazon + ", crossAxisArrangementSpacing=" + C14467l.crashlytics(this.purchase) + ", maxItemsInMainAxis=" + this.billing + ", maxLines=2147483647, overflow=" + this.mopub + ")";
    }

    @Override // defpackage.InterfaceC5344l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        List list2 = (List) AbstractC16901l.m4220for(1, list);
        InterfaceC6357l interfaceC6357l = list2 != null ? (InterfaceC6357l) AbstractC16901l.m4217extends(list2) : null;
        List list3 = (List) AbstractC16901l.m4220for(2, list);
        this.mopub.loadAd(interfaceC6357l, list3 != null ? (InterfaceC6357l) AbstractC16901l.m4217extends(list3) : null, AbstractC7563l.loadAd(0, 0, 0, i, 7));
        List list4 = (List) AbstractC16901l.m4217extends(list);
        if (list4 == null) {
            list4 = C2580l.f5619l;
        }
        int iMo870l = interfaceC12822l.mo870l(this.crashlytics);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iMetrica = ((InterfaceC6357l) list4.get(i2)).metrica(i) + iMo870l;
            int i5 = i2 + 1;
            if (i5 - i3 == this.billing || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iMetrica) - iMo870l);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iMetrica;
            }
            i2 = i5;
        }
        return iMax;
    }
}
