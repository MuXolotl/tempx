package defpackage;

import android.graphics.Rect;
import android.os.Build;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؙؖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3956l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f8138l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8139l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3956l(int i, Object obj) {
        super(2);
        this.f8139l = i;
        this.f8138l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x03b7 A[PHI: r0 r2
  0x03b7: PHI (r0v24 lِٗۤ) = (r0v23 lِٗۤ), (r0v30 lِٗۤ) binds: [B:212:0x04d1, B:131:0x03b5] A[DONT_GENERATE, DONT_INLINE]
  0x03b7: PHI (r2v14 lؗۘٔ) = (r2v12 lؗۘٔ), (r2v17 lؗۘٔ) binds: [B:212:0x04d1, B:131:0x03b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:149:0x03f9 A[PHI: r0 r12
  0x03f9: PHI (r0v36 lِٗۤ) = (r0v35 lِٗۤ), (r0v42 lِٗۤ), (r0v48 lِٗۤ) binds: [B:148:0x03f7, B:173:0x0449, B:192:0x0487] A[DONT_GENERATE, DONT_INLINE]
  0x03f9: PHI (r12v11 lؗۘٔ) = (r12v9 lؗۘٔ), (r12v16 lؗۘٔ), (r12v19 lؗۘٔ) binds: [B:148:0x03f7, B:173:0x0449, B:192:0x0487] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0416 A[PHI: r3 r12
  0x0416: PHI (r3v24 lؘٕؕ) = (r3v22 lؘٕؕ), (r3v26 lؘٕؕ), (r3v29 lؘٕؕ) binds: [B:157:0x0414, B:179:0x045c, B:198:0x049b] A[DONT_GENERATE, DONT_INLINE]
  0x0416: PHI (r12v10 lؗۘٔ) = (r12v9 lؗۘٔ), (r12v16 lؗۘٔ), (r12v19 lؗۘٔ) binds: [B:157:0x0414, B:179:0x045c, B:198:0x049b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:204:0x04ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x04ae A[LOOP:1: B:117:0x035c->B:205:0x04ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:211:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:216:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:223:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:225:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:230:0x050d  */
    /* JADX WARN: Code duplicated, block: B:235:0x051c  */
    /* JADX WARN: Code duplicated, block: B:236:0x0523  */
    /* JADX WARN: Code duplicated, block: B:238:0x0556 A[LOOP:3: B:224:0x04fa->B:238:0x0556, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0506 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C7404l c7404l;
        C5109l c5109l;
        C5109l[] c5109lArr;
        int length;
        int i;
        int i2;
        C5109l c5109l2;
        int i3;
        C1473l c1473lM2979extends;
        C17518l c17518lAdmob;
        List listAdcel;
        C1473l c1473lM2979extends2;
        C17518l c17518lAdmob2;
        C5109l c5109l3;
        C1473l c1473lM2979extends3;
        C17518l c17518lAdmob3;
        int i4;
        C1473l c1473lM2979extends4;
        C15496l c15496lIsPro;
        C17518l c17518lAdmob4;
        C16958l c16958l;
        long jSubs;
        long jCrashlytics;
        int i5;
        boolean zLoadAd;
        InterfaceC14029l interfaceC14029l;
        int i6 = this.f8139l;
        Object obj3 = this.f8138l;
        switch (i6) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((AbstractC15391l) obj3).yandex(c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C11303l c11303l = (C11303l) obj;
                C3384l c3384l = (C3384l) obj2;
                C4682l c4682l = (C4682l) obj3;
                C5112l c5112l = c4682l.f9519l;
                if (c5112l == null) {
                    c5112l = new C5112l(c4682l.f9520l.getInsetsWatcher());
                    c4682l.f9519l = c5112l;
                }
                RunnableC10804l runnableC10804l = c5112l.yandex;
                C16977l c16977l = C5112l.purchase;
                int[] iArr = c16977l.loadAd;
                Object[] objArr = c16977l.crashlytics;
                long[] jArr = c16977l.yandex;
                int length2 = jArr.length - 2;
                C15496l c15496lYandex = C15496l.purchase;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length2)) >>> 31);
                            long j2 = j;
                            int i10 = 0;
                            while (true) {
                                if (i10 < i9) {
                                    if ((j2 & 255) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        int i12 = iArr[i11];
                                        InterfaceC16067l interfaceC16067l = (InterfaceC16067l) objArr[i11];
                                        i4 = i8;
                                        if (C5112l.yandex(c3384l, ((C7404l) interfaceC16067l).crashlytics)) {
                                            c5109l3 = ((C7404l) interfaceC16067l).crashlytics;
                                            InterfaceC16067l.yandex.getClass();
                                            if (interfaceC16067l == C9624l.isPro) {
                                                C1473l c1473lM2979extends5 = runnableC10804l.m2979extends();
                                                if (c1473lM2979extends5 != null) {
                                                    c17518lAdmob3 = c1473lM2979extends5.yandex.admob();
                                                    if (c17518lAdmob3 != null) {
                                                        c15496lYandex = c17518lAdmob3.yandex();
                                                    }
                                                    C5112l.loadAd(c11303l, c5109l3, c15496lYandex);
                                                }
                                            } else {
                                                C1473l c1473lM2979extends6 = runnableC10804l.m2979extends();
                                                C15496l c15496lSubs = c1473lM2979extends6 != null ? c1473lM2979extends6.yandex.subs(i12) : null;
                                                if (c15496lSubs != null) {
                                                    C5112l.loadAd(c11303l, c5109l3, c15496lSubs);
                                                }
                                            }
                                        } else {
                                            C5109l c5109l4 = ((C7404l) interfaceC16067l).amazon;
                                            if (C5112l.yandex(c3384l, c5109l4)) {
                                                InterfaceC16067l.yandex.getClass();
                                                if (interfaceC16067l == C9624l.isPro) {
                                                    C1473l c1473lM2979extends7 = runnableC10804l.m2979extends();
                                                    if (c1473lM2979extends7 != null) {
                                                        c17518lAdmob4 = c1473lM2979extends7.yandex.admob();
                                                        if (c17518lAdmob4 != null) {
                                                            c15496lYandex = c17518lAdmob4.yandex();
                                                        }
                                                        C5112l.loadAd(c11303l, c5109l4, c15496lYandex);
                                                    }
                                                } else {
                                                    c15496lIsPro = (interfaceC16067l == C9624l.amazon || (c1473lM2979extends4 = runnableC10804l.m2979extends()) == null) ? null : c1473lM2979extends4.yandex.isPro(i12);
                                                    if (c15496lIsPro != null) {
                                                        C5112l.loadAd(c11303l, c5109l4, c15496lIsPro);
                                                    }
                                                }
                                            } else if (i12 != -1 && (c5109l4 = (C5109l) C5112l.crashlytics.loadAd(i12)) != null) {
                                                if (C5112l.yandex(c3384l, c5109l4)) {
                                                    InterfaceC16067l.yandex.getClass();
                                                    if (interfaceC16067l == C9624l.isPro) {
                                                        C1473l c1473lM2979extends8 = runnableC10804l.m2979extends();
                                                        if (c1473lM2979extends8 != null) {
                                                            c17518lAdmob4 = c1473lM2979extends8.yandex.admob();
                                                            if (c17518lAdmob4 != null) {
                                                                c15496lYandex = c17518lAdmob4.yandex();
                                                            }
                                                            C5112l.loadAd(c11303l, c5109l4, c15496lYandex);
                                                        }
                                                    } else {
                                                        C7193l c7193l = (C7193l) runnableC10804l.m2981throw(i12).getValue();
                                                        c15496lIsPro = c7193l != null ? c7193l.yandex : null;
                                                        if (c15496lIsPro != null) {
                                                            C5112l.loadAd(c11303l, c5109l4, c15496lIsPro);
                                                        }
                                                    }
                                                } else {
                                                    c5109l4 = (C5109l) C5112l.amazon.loadAd(i12);
                                                    if (c5109l4 != null && C5112l.yandex(c3384l, c5109l4)) {
                                                        InterfaceC16067l.yandex.getClass();
                                                        if (interfaceC16067l == C9624l.isPro) {
                                                            C1473l c1473lM2979extends9 = runnableC10804l.m2979extends();
                                                            if (c1473lM2979extends9 != null) {
                                                                c17518lAdmob4 = c1473lM2979extends9.yandex.admob();
                                                                if (c17518lAdmob4 != null) {
                                                                    c15496lYandex = c17518lAdmob4.yandex();
                                                                }
                                                                C5112l.loadAd(c11303l, c5109l4, c15496lYandex);
                                                            }
                                                        } else {
                                                            C7193l c7193l2 = (C7193l) runnableC10804l.m2981throw(i12).getValue();
                                                            c15496lIsPro = c7193l2 != null ? c7193l2.loadAd : null;
                                                            if (c15496lIsPro != null) {
                                                                C5112l.loadAd(c11303l, c5109l4, c15496lIsPro);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i4 = i8;
                                    }
                                    j2 >>= i4;
                                    i10++;
                                    i8 = i4;
                                } else {
                                    if (i9 == i8) {
                                        if (i7 != length2) {
                                            i7++;
                                        }
                                    }
                                    InterfaceC16067l.yandex.getClass();
                                    c7404l = C9624l.isPro;
                                    if (C5112l.yandex(c3384l, c7404l.crashlytics)) {
                                        c5109l3 = c7404l.crashlytics;
                                        c1473lM2979extends3 = runnableC10804l.m2979extends();
                                        if (c1473lM2979extends3 != null) {
                                            c17518lAdmob3 = c1473lM2979extends3.yandex.admob();
                                            if (c17518lAdmob3 != null) {
                                                c15496lYandex = c17518lAdmob3.yandex();
                                            }
                                            C5112l.loadAd(c11303l, c5109l3, c15496lYandex);
                                        }
                                    } else {
                                        c5109l = c7404l.amazon;
                                        if (C5112l.yandex(c3384l, c5109l)) {
                                            c1473lM2979extends2 = runnableC10804l.m2979extends();
                                            if (c1473lM2979extends2 != null) {
                                                c17518lAdmob2 = c1473lM2979extends2.yandex.admob();
                                                if (c17518lAdmob2 != null) {
                                                    c15496lYandex = c17518lAdmob2.yandex();
                                                }
                                                C5112l.loadAd(c11303l, c5109l, c15496lYandex);
                                            }
                                        } else {
                                            c5109lArr = C5112l.loadAd;
                                            length = c5109lArr.length;
                                            i = 0;
                                            i2 = 0;
                                            while (i2 < length) {
                                                c5109l2 = c5109lArr[i2];
                                                i3 = i + 1;
                                                if (C5112l.yandex(c3384l, c5109l2)) {
                                                    c1473lM2979extends = runnableC10804l.m2979extends();
                                                    if (c1473lM2979extends != null && (c17518lAdmob = c1473lM2979extends.yandex.admob()) != null) {
                                                        if (Build.VERSION.SDK_INT >= 28) {
                                                            listAdcel = AbstractC13950l.adcel(c17518lAdmob.yandex);
                                                        } else {
                                                            listAdcel = Collections.EMPTY_LIST;
                                                        }
                                                        Rect rect = (Rect) listAdcel.get(i);
                                                        c11303l.crashlytics(c5109l2.loadAd(), rect.left);
                                                        c11303l.crashlytics(c5109l2.amazon(), rect.top);
                                                        c11303l.crashlytics(c5109l2.crashlytics(), rect.right);
                                                        c11303l.crashlytics(c5109l2.yandex(), rect.bottom);
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                } else {
                                                    i2++;
                                                    i = i3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i7 != length2) {
                            i7++;
                        } else {
                            InterfaceC16067l.yandex.getClass();
                            c7404l = C9624l.isPro;
                            if (C5112l.yandex(c3384l, c7404l.crashlytics)) {
                                c5109l3 = c7404l.crashlytics;
                                c1473lM2979extends3 = runnableC10804l.m2979extends();
                                if (c1473lM2979extends3 != null) {
                                    c17518lAdmob3 = c1473lM2979extends3.yandex.admob();
                                    if (c17518lAdmob3 != null) {
                                        c15496lYandex = c17518lAdmob3.yandex();
                                    }
                                    C5112l.loadAd(c11303l, c5109l3, c15496lYandex);
                                }
                            } else {
                                c5109l = c7404l.amazon;
                                if (C5112l.yandex(c3384l, c5109l)) {
                                    c1473lM2979extends2 = runnableC10804l.m2979extends();
                                    if (c1473lM2979extends2 != null) {
                                        c17518lAdmob2 = c1473lM2979extends2.yandex.admob();
                                        if (c17518lAdmob2 != null) {
                                            c15496lYandex = c17518lAdmob2.yandex();
                                        }
                                        C5112l.loadAd(c11303l, c5109l, c15496lYandex);
                                    }
                                } else {
                                    c5109lArr = C5112l.loadAd;
                                    length = c5109lArr.length;
                                    i = 0;
                                    i2 = 0;
                                    while (i2 < length) {
                                        c5109l2 = c5109lArr[i2];
                                        i3 = i + 1;
                                        if (C5112l.yandex(c3384l, c5109l2)) {
                                            c1473lM2979extends = runnableC10804l.m2979extends();
                                            if (c1473lM2979extends != null) {
                                                if (Build.VERSION.SDK_INT >= 28) {
                                                    listAdcel = AbstractC13950l.adcel(c17518lAdmob.yandex);
                                                } else {
                                                    listAdcel = Collections.EMPTY_LIST;
                                                }
                                                Rect rect2 = (Rect) listAdcel.get(i);
                                                c11303l.crashlytics(c5109l2.loadAd(), rect2.left);
                                                c11303l.crashlytics(c5109l2.amazon(), rect2.top);
                                                c11303l.crashlytics(c5109l2.crashlytics(), rect2.right);
                                                c11303l.crashlytics(c5109l2.yandex(), rect2.bottom);
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                        } else {
                                            i2++;
                                            i = i3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    InterfaceC16067l.yandex.getClass();
                    c7404l = C9624l.isPro;
                    if (C5112l.yandex(c3384l, c7404l.crashlytics)) {
                        c5109l3 = c7404l.crashlytics;
                        c1473lM2979extends3 = runnableC10804l.m2979extends();
                        if (c1473lM2979extends3 != null) {
                            c17518lAdmob3 = c1473lM2979extends3.yandex.admob();
                            if (c17518lAdmob3 != null) {
                                c15496lYandex = c17518lAdmob3.yandex();
                            }
                            C5112l.loadAd(c11303l, c5109l3, c15496lYandex);
                        }
                    } else {
                        c5109l = c7404l.amazon;
                        if (C5112l.yandex(c3384l, c5109l)) {
                            c1473lM2979extends2 = runnableC10804l.m2979extends();
                            if (c1473lM2979extends2 != null) {
                                c17518lAdmob2 = c1473lM2979extends2.yandex.admob();
                                if (c17518lAdmob2 != null) {
                                    c15496lYandex = c17518lAdmob2.yandex();
                                }
                                C5112l.loadAd(c11303l, c5109l, c15496lYandex);
                            }
                        } else {
                            c5109lArr = C5112l.loadAd;
                            length = c5109lArr.length;
                            i = 0;
                            i2 = 0;
                            while (i2 < length) {
                                c5109l2 = c5109lArr[i2];
                                i3 = i + 1;
                                if (C5112l.yandex(c3384l, c5109l2)) {
                                    c1473lM2979extends = runnableC10804l.m2979extends();
                                    if (c1473lM2979extends != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            listAdcel = AbstractC13950l.adcel(c17518lAdmob.yandex);
                                        } else {
                                            listAdcel = Collections.EMPTY_LIST;
                                        }
                                        Rect rect3 = (Rect) listAdcel.get(i);
                                        c11303l.crashlytics(c5109l2.loadAd(), rect3.left);
                                        c11303l.crashlytics(c5109l2.amazon(), rect3.top);
                                        c11303l.crashlytics(c5109l2.crashlytics(), rect3.right);
                                        c11303l.crashlytics(c5109l2.yandex(), rect3.bottom);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                } else {
                                    i2++;
                                    i = i3;
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM2132native = c6956l2.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = C11192l.f22519l;
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC0124l.billing(new C15986l((Function1) objM2132native, false), (Function2) ((InterfaceC8714l) obj3).getValue(), c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                EnumC18226l enumC18226l = (EnumC18226l) obj;
                EnumC18226l enumC18226l2 = (EnumC18226l) obj2;
                EnumC18226l enumC18226l3 = EnumC18226l.f35692l;
                return Boolean.valueOf(enumC18226l == enumC18226l3 && enumC18226l2 == enumC18226l3 && !((C0274l) obj3).yandex.purchase);
            case 4:
                ((Number) obj2).intValue();
                ((ComposeView) obj3).yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 5:
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj;
                InterfaceC17242l interfaceC17242lPurchase = (InterfaceC13112l) obj2;
                C6956l c6956l3 = (C6956l) obj3;
                if (interfaceC17242lPurchase instanceof C6085l) {
                    Function3 function3 = ((C6085l) interfaceC17242lPurchase).f12861l;
                    AbstractC9464l.purchase(3, function3);
                    interfaceC17242lPurchase = AbstractC17541l.purchase(c6956l3, (InterfaceC17242l) function3.invoke(C4346l.f8873l, c6956l3, 0));
                }
                return interfaceC17242l.premium(interfaceC17242lPurchase);
            case 6:
                ((Number) obj2).intValue();
                ((C9295l) obj3).yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 7:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Function2 function2 = (Function2) list.get(i13);
                        long j3 = c6956l4.f14595continue;
                        int i14 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC8801l.firebase.getClass();
                        C5617l c5617l = C3438l.crashlytics;
                        c6956l4.m2140super();
                        if (c6956l4.f14603switch) {
                            c6956l4.firebase(c5617l);
                        } else {
                            c6956l4.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l4, Integer.valueOf(i14), C3438l.isPro);
                        function2.invoke(c6956l4, 0);
                        c6956l4.startapp(true);
                    }
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                ((Number) obj2).intValue();
                ((C11941l) obj3).yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            default:
                long j4 = ((C1187l) obj2).yandex;
                ((C15730l) obj).yandex();
                C5056l c5056l = ((C18297l) obj3).yandex;
                C4910l c4910l = c5056l.isPro;
                C1316l c1316l = c5056l.billing;
                C5138l c5138l = c5056l.yandex;
                C10086l c10086l = c5056l.remoteconfig;
                c10086l.setValue(new C1187l(C1187l.subs(((C1187l) c10086l.getValue()).yandex, j4)));
                C5371l c5371lAmazon = c5056l.amazon();
                if (c5371lAmazon != null) {
                    long jAdmob = c5056l.admob(c5056l.purchase());
                    c5056l.subs(jAdmob);
                    long jLoadAd = c5371lAmazon.loadAd();
                    long jSubs2 = C1187l.subs(AbstractC2296l.yandex((int) (jLoadAd >> 32), (int) (jLoadAd & 4294967295L)), jAdmob);
                    long jMopub = AbstractC14707l.mopub(c5371lAmazon.crashlytics());
                    long jYandex = AbstractC2296l.yandex(C14174l.billing(jMopub) + C1187l.purchase(jSubs2), C14174l.crashlytics(jMopub) + C1187l.billing(jSubs2));
                    C13161l c13161lM1707abstract = c5138l.m1707abstract();
                    C13352l c13352l = c5056l.purchase;
                    EnumC7283l enumC7283lVip = c13161lM1707abstract.vip();
                    ((C1644l) c13161lM1707abstract.f25776l).getClass();
                    int iOrdinal = enumC7283lVip.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            c16958l = new C16958l(c13352l.yandex, c13352l.loadAd);
                        } else {
                            C18725l.billing();
                        }
                        return null;
                    }
                    c16958l = new C16958l(c13352l.crashlytics, c13352l.amazon);
                    C14256l c14256lStartapp = c13161lM1707abstract.startapp(c16958l);
                    float f = c14256lStartapp.yandex;
                    float f2 = c14256lStartapp.loadAd;
                    ((C1644l) c5138l.m1707abstract().f25776l).getClass();
                    boolean z = c5056l.admob == EnumC9931l.f20222l && c5056l.billing() == EnumC7283l.f15125l;
                    if (!z) {
                        if (z) {
                            C18725l.billing();
                        } else {
                            jSubs = C1187l.subs(jSubs2, c5056l.adcel);
                        }
                        return null;
                    }
                    jSubs = C1187l.admob(jYandex, c5056l.adcel);
                    EnumC7283l enumC7283lBilling = c5056l.billing();
                    int i15 = -((C1644l) c5138l.m1707abstract().f25776l).smaato;
                    int iOrdinal2 = enumC7283lBilling.ordinal();
                    if (iOrdinal2 == 0) {
                        jCrashlytics = AbstractC3383l.crashlytics(0, i15);
                    } else {
                        if (iOrdinal2 != 1) {
                            C18725l.billing();
                            return null;
                        }
                        jCrashlytics = AbstractC3383l.crashlytics(i15, 0);
                    }
                    long jSubs3 = C1187l.subs(jSubs, AbstractC2296l.yandex((int) (jCrashlytics >> 32), (int) (jCrashlytics & 4294967295L)));
                    float fCrashlytics = AbstractC12272l.crashlytics(jSubs3, c5056l.billing()) - f;
                    if (fCrashlytics < 0.0f) {
                        fCrashlytics = 0.0f;
                    }
                    float fCrashlytics2 = f2 - AbstractC12272l.crashlytics(jSubs3, c5056l.billing());
                    if (fCrashlytics2 < 0.0f) {
                        fCrashlytics2 = 0.0f;
                    }
                    float f3 = c5056l.amazon;
                    InterfaceC14029l interfaceC14029l2 = null;
                    if (fCrashlytics < f3) {
                        zLoadAd = c1316l.loadAd(EnumC18610l.f36364l, (1.0f - AbstractC8576l.amazon((fCrashlytics + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f, new C17921l(c5056l, 2), new C1596l(c5056l, interfaceC14029l2, 0));
                        i5 = 1;
                    } else if (fCrashlytics2 < f3) {
                        i5 = 1;
                        zLoadAd = c1316l.loadAd(EnumC18610l.f36363l, (1.0f - AbstractC8576l.amazon((fCrashlytics2 + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f, new C17921l(c5056l, 3), new C1596l(c5056l, interfaceC14029l2, i5));
                    } else {
                        i5 = 1;
                        AbstractC10999l.mopub(c1316l.loadAd, null, 0, new C5629l(c1316l, interfaceC14029l2, i5), 3);
                        zLoadAd = false;
                    }
                    if (c4910l.mopub()) {
                        C7504l c7504l = c1316l.amazon;
                        if ((c7504l == null || c7504l.mopub() != i5) && !zLoadAd) {
                            interfaceC14029l = null;
                            C5371l c5371lCrashlytics = C5056l.crashlytics(c5056l, AbstractC7470l.admob(jSubs2, jYandex), c5138l.m1707abstract().subscription(), null, new C3006l(27, c5371lAmazon), 4);
                            if (c5371lCrashlytics != null) {
                                AbstractC10999l.mopub(c5056l.loadAd, null, 0, new C9180l(c5056l, c5371lAmazon, c5371lCrashlytics, interfaceC14029l, 1), 3);
                            }
                        } else {
                            interfaceC14029l = null;
                        }
                        c4910l.billing(interfaceC14029l);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3956l(AbstractC15391l abstractC15391l, int i, int i2) {
        super(2);
        this.f8139l = i2;
        this.f8138l = abstractC15391l;
    }
}
