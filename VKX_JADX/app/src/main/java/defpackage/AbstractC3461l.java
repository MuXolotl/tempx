package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕٙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3461l {
    public static final int[] yandex = {-1, -1, -1, 0, 0, 0, 1, -1};
    public static final int[] loadAd = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static final void admob(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    public static final int amazon(long j, int[] iArr) {
        int i = (int) (j & 4294967295L);
        int iMax = RecyclerView.UNDEFINED_DURATION;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    public static final boolean billing(int[] iArr, C9568l c9568l, int[] iArr2, int i) {
        C13698l c13698l = c9568l.ads;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c13698l.pro(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (c13698l.pro(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int iInmobi = c13698l.inmobi(0);
        return (iInmobi == 0 || iInmobi == -1 || iInmobi == -2) ? false : true;
    }

    public static int crashlytics(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static void firebase(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC5998l.pro(iArr, iArr3);
        while (true) {
            subs(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC5998l.pro(iArr2, iArr3);
            }
        }
    }

    public static void isPro(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = ((((long) iArr[3]) & 4294967295L) - j2) + j4;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = ((((long) iArr[6]) & 4294967295L) - j2) + j8;
            iArr[6] = (int) j11;
            long j12 = (4294967295L & ((long) iArr[7])) + j2 + (j11 >> 32);
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && AbstractC5998l.metrica(iArr, yandex))) {
            yandex(iArr);
        }
    }

    public static final int loadAd(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static String metrica(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strAds;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strAds = "null";
            } else {
                try {
                    strAds = obj.toString();
                } catch (Exception e) {
                    String strPro = AbstractC9361l.pro(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strPro), (Throwable) e);
                    strAds = AbstractC14814l.ads("<", strPro, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strAds;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void mopub(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        AbstractC5998l.tapsense(iArr, iArr2, iArr4);
        subs(iArr4, iArr3);
    }

    /* JADX WARN: Code duplicated, block: B:270:0x052c  */
    /* JADX WARN: Code duplicated, block: B:279:0x0548 A[LOOP:23: B:278:0x0546->B:279:0x0548, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x0556  */
    /* JADX WARN: Code duplicated, block: B:284:0x0559  */
    /* JADX WARN: Code duplicated, block: B:286:0x0564  */
    /* JADX WARN: Code duplicated, block: B:288:0x057c  */
    /* JADX WARN: Code duplicated, block: B:289:0x057e  */
    /* JADX WARN: Code duplicated, block: B:300:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:302:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:304:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:306:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:308:0x05de  */
    /* JADX WARN: Code duplicated, block: B:310:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:314:0x060a  */
    /* JADX WARN: Code duplicated, block: B:325:0x062e  */
    /* JADX WARN: Code duplicated, block: B:327:0x0631  */
    /* JADX WARN: Code duplicated, block: B:329:0x063b  */
    /* JADX WARN: Code duplicated, block: B:330:0x063e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0641  */
    /* JADX WARN: Code duplicated, block: B:333:0x0643  */
    /* JADX WARN: Code duplicated, block: B:336:0x0647 A[LOOP:27: B:326:0x062f->B:336:0x0647, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:339:0x064e  */
    /* JADX WARN: Code duplicated, block: B:341:0x0657  */
    /* JADX WARN: Code duplicated, block: B:343:0x0675  */
    /* JADX WARN: Code duplicated, block: B:347:0x0689  */
    /* JADX WARN: Code duplicated, block: B:348:0x068c  */
    /* JADX WARN: Code duplicated, block: B:351:0x0692 A[LOOP:28: B:350:0x0690->B:351:0x0692, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:355:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:359:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:361:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:362:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:364:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:371:0x0701  */
    /* JADX WARN: Code duplicated, block: B:373:0x0705  */
    /* JADX WARN: Code duplicated, block: B:377:0x0717 A[LOOP:32: B:376:0x0715->B:377:0x0717, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:379:0x072d A[LOOP:30: B:354:0x06a0->B:379:0x072d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:382:0x0753  */
    /* JADX WARN: Code duplicated, block: B:383:0x0757  */
    /* JADX WARN: Code duplicated, block: B:422:0x07e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:423:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:426:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:428:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:429:0x0801  */
    /* JADX WARN: Code duplicated, block: B:432:0x0805 A[LOOP:36: B:425:0x07ef->B:432:0x0805, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:436:0x0814  */
    /* JADX WARN: Code duplicated, block: B:438:0x0819  */
    /* JADX WARN: Code duplicated, block: B:441:0x082b  */
    /* JADX WARN: Code duplicated, block: B:442:0x082e  */
    /* JADX WARN: Code duplicated, block: B:444:0x0839  */
    /* JADX WARN: Code duplicated, block: B:446:0x083f A[LOOP:34: B:405:0x07b1->B:446:0x083f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:447:0x0849  */
    /* JADX WARN: Code duplicated, block: B:450:0x0858  */
    /* JADX WARN: Code duplicated, block: B:452:0x085e  */
    /* JADX WARN: Code duplicated, block: B:454:0x0863 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:455:0x0865  */
    /* JADX WARN: Code duplicated, block: B:457:0x086c  */
    /* JADX WARN: Code duplicated, block: B:459:0x087a  */
    /* JADX WARN: Code duplicated, block: B:460:0x087c  */
    /* JADX WARN: Code duplicated, block: B:464:0x0882 A[LOOP:38: B:456:0x086a->B:464:0x0882, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:467:0x088d  */
    /* JADX WARN: Code duplicated, block: B:469:0x0891  */
    /* JADX WARN: Code duplicated, block: B:472:0x0897  */
    /* JADX WARN: Code duplicated, block: B:474:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:480:0x08ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:483:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:485:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:486:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:489:0x08bf A[LOOP:39: B:482:0x08b1->B:489:0x08bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:492:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:494:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:499:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:502:0x0902  */
    /* JADX WARN: Code duplicated, block: B:505:0x0926  */
    /* JADX WARN: Code duplicated, block: B:507:0x0936  */
    /* JADX WARN: Code duplicated, block: B:510:0x0941  */
    /* JADX WARN: Code duplicated, block: B:512:0x0944 A[LOOP:40: B:508:0x093d->B:512:0x0944, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:514:0x094a  */
    /* JADX WARN: Code duplicated, block: B:517:0x0977  */
    /* JADX WARN: Code duplicated, block: B:519:0x0985 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:520:0x0987  */
    /* JADX WARN: Code duplicated, block: B:521:0x0989  */
    /* JADX WARN: Code duplicated, block: B:524:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:525:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:527:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:529:0x09b2 A[LOOP:41: B:528:0x09b0->B:529:0x09b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:531:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:534:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:536:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:537:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:540:0x09db A[LOOP:42: B:533:0x09cc->B:540:0x09db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:543:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:545:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:547:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:548:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:551:0x09f4 A[LOOP:43: B:544:0x09e5->B:551:0x09f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:555:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:666:0x05a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x062a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x062c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x073d A[EDGE_INSN: B:673:0x073d->B:380:0x073d BREAK  A[LOOP:29: B:353:0x069f->B:676:0x069f, LOOP_LABEL: LOOP:29: B:353:0x069f->B:676:0x069f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x06dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x06d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x084f A[EDGE_INSN: B:689:0x084f->B:448:0x084f BREAK  A[LOOP:34: B:405:0x07b1->B:446:0x083f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x080a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x080e A[EDGE_INSN: B:693:0x080e->B:434:0x080e BREAK  A[LOOP:36: B:425:0x07ef->B:432:0x0805], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x08e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0887 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x087f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x08a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x0860 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x0947 A[EDGE_INSN: B:701:0x0947->B:513:0x0947 BREAK  A[LOOP:40: B:508:0x093d->B:512:0x0944], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x09e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x09d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x09f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x09f2 A[SYNTHETIC] */
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
    public static final C16122l purchase(C9568l c9568l, int i, int[] iArr, int[] iArr2, boolean z) {
        C14054l c14054l;
        C11315l[] c11315lArr;
        boolean z2;
        int iLoadAd;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr3;
        int i8;
        int i9;
        boolean z3;
        int[] iArr4;
        int i10;
        int i11;
        C7583l c7583l;
        float fFloatValue;
        float f;
        float f2;
        float f3;
        int[] iArrCopyOf;
        int length;
        int i12;
        int i13;
        int[] iArr5;
        float f4;
        int i14;
        long j;
        int iMopub;
        int i15;
        int iMopub2;
        int i16;
        int i17;
        int i18;
        int iMin;
        int[] iArr6;
        int i19;
        int i20;
        int[] iArr7;
        List arrayList;
        int i21;
        long j2;
        C11862l c11862l;
        List list;
        int i22;
        int i23;
        ArrayList arrayList2;
        int i24;
        C7583l c7583l2;
        int[] iArr8;
        int iCrashlytics;
        C15724l c15724l;
        int i25;
        float f5;
        ArrayList arrayList3;
        int[] iArr9;
        int i26;
        List arrayList4;
        int i27;
        int i28;
        ArrayList arrayList5;
        C12660l c12660l;
        float f6;
        int i29;
        C2197l c2197l;
        C13698l c13698l;
        boolean z4;
        int i30;
        boolean zMo992import;
        boolean z5;
        int i31;
        int length2;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z6;
        boolean z7;
        int length3;
        int i37;
        boolean z8;
        boolean z9;
        int i38;
        boolean z10;
        long jLoadAd;
        int i39;
        int iMopub3;
        int iBilling;
        int i40;
        int size;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int[] iArr10;
        boolean z11;
        C13698l c13698l2;
        int iInmobi;
        int length4;
        int i47;
        boolean z12;
        boolean z13;
        int size2;
        int i48;
        boolean z14;
        boolean z15;
        List list2;
        C15724l c15724l2;
        int i49;
        int iMin2;
        boolean z16;
        List list3;
        int size3;
        int i50;
        Object obj;
        C15724l c15724l3;
        int i51;
        int[] iArr11;
        int i52;
        boolean z17;
        boolean z18;
        int i53;
        int i54;
        int i55;
        C15724l c15724l4;
        int i56;
        int iAmazon;
        int[] iArr12;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        C15724l c15724l5;
        int i63;
        int i64;
        int iInmobi2;
        int i65;
        C15724l c15724l6;
        int i66;
        boolean z19;
        boolean z20;
        C11862l c11862l2;
        int i67;
        C11315l c11315l;
        int iPro;
        int[] iArr13;
        int i68;
        int i69;
        float f7;
        int[] iArrSignatures;
        int i70;
        int i71;
        int i72;
        int[] iArrSignatures2;
        C12507l c12507l = c9568l.amazon;
        C16761l c16761l = c9568l.loadAd;
        int i73 = c9568l.firebase;
        List list4 = c9568l.metrica;
        int i74 = c9568l.smaato;
        boolean z21 = c9568l.billing;
        C7583l c7583l3 = c9568l.yandex;
        int i75 = c9568l.subscription;
        int i76 = c9568l.admob;
        C2197l c2197l2 = c9568l.adcel;
        int i77 = c9568l.isPro;
        List list5 = list4;
        long j3 = c9568l.purchase;
        C13698l c13698l3 = c9568l.ads;
        C17385l c17385l = c9568l.mopub;
        C12507l c12507l2 = c12507l;
        InterfaceC15847l interfaceC15847l = c17385l.f33850l;
        C17385l c17385l2 = c17385l;
        C11862l c11862l3 = c9568l.crashlytics;
        int iYandex = c11862l3.yandex();
        long j4 = j3;
        C14054l c14054l2 = C14054l.f27396l;
        List list6 = C2580l.f5619l;
        if (iYandex <= 0 || i75 == 0) {
            int iIsPro = C15519l.isPro(j4);
            int iSubs = C15519l.subs(j4);
            C12660l c12660l2 = c7583l3.tapsense;
            ArrayList arrayList6 = new ArrayList();
            C2197l c2197l3 = c9568l.adcel;
            c12660l2.amazon(0, iIsPro, iSubs, arrayList6, c2197l3.f4849l.crashlytics, c2197l3, c9568l.billing, interfaceC15847l.mo992import(), c9568l.subscription, c9568l.vip, 0, 0, c9568l.remoteconfig, c9568l.startapp);
            if (!interfaceC15847l.mo992import()) {
                long jLoadAd2 = c7583l3.tapsense.loadAd();
                if (!C4999l.loadAd(jLoadAd2, 0L)) {
                    iIsPro = AbstractC7563l.mopub((int) (jLoadAd2 >> 32), j4);
                    iSubs = AbstractC7563l.billing((int) (jLoadAd2 & 4294967295L), j4);
                }
            }
            InterfaceC17792l interfaceC17792lIsVip = c17385l2.isVip(iIsPro, iSubs, c14054l2, new C2613l(26));
            boolean z22 = c9568l.billing;
            long jIsPro = (((long) C15519l.isPro(j4)) << 32) | (((long) C15519l.subs(j4)) & 4294967295L);
            int i78 = c9568l.isPro;
            int i79 = c9568l.firebase;
            return new C16122l(iArr, iArr2, 0.0f, interfaceC17792lIsVip, 0.0f, false, z22, false, c9568l.amazon, c11862l3.loadAd.amazon, c17385l2, iYandex, list6, jIsPro, -i78, i79 + i76, i78, i79, c9568l.smaato, c9568l.remoteconfig, false);
        }
        int[] iArrCopyOf2 = Arrays.copyOf(iArr, iArr.length);
        int[] iArrCopyOf3 = Arrays.copyOf(iArr2, iArr2.length);
        int length5 = iArrCopyOf2.length - 1;
        if (length5 >= 0) {
            while (true) {
                int i80 = length5 - 1;
                while (true) {
                    int i81 = iArrCopyOf2[length5];
                    if (i81 < iYandex && c13698l3.remoteconfig(i81, length5)) {
                        break;
                    }
                    C14054l c14054l3 = c14054l2;
                    C7583l c7583l4 = c7583l3;
                    iArrCopyOf2[length5] = c13698l3.pro(iArrCopyOf2[length5], length5);
                    c14054l2 = c14054l3;
                    c7583l3 = c7583l4;
                }
                int i82 = iArrCopyOf2[length5];
                c14054l = c14054l2;
                if (i82 >= 0 && !c11862l3.loadAd.amazon.inmobi(i82)) {
                    if (c13698l3.inmobi(i82) == -2) {
                        int length6 = iArrCopyOf2.length;
                        int i83 = 0;
                        while (true) {
                            if (i83 >= length6) {
                                i83 = -1;
                                break;
                            }
                            int i84 = length6;
                            if (iArrCopyOf2[i83] == i82) {
                                break;
                            }
                            i83++;
                            length6 = i84;
                        }
                        int i85 = i83 + 1;
                        int i86 = i83;
                        if (i85 <= length5) {
                            while (true) {
                                if (iArrCopyOf2[i85] == i82) {
                                    iArrCopyOf2[i85] = c13698l3.pro(i82, i85);
                                }
                                if (i85 == length5) {
                                    break;
                                }
                                i85++;
                            }
                        }
                        length5 = i86;
                    }
                    c13698l3.m3676interface(i82, length5);
                }
                if (i80 < 0) {
                    break;
                }
                length5 = i80;
                c14054l2 = c14054l;
                c7583l3 = c7583l3;
            }
        } else {
            c14054l = c14054l2;
            c7583l3 = c7583l3;
        }
        admob(iArrCopyOf3, -i);
        C11315l[] c11315lArr2 = new C11315l[i75];
        for (int i87 = 0; i87 < i75; i87++) {
            c11315lArr2[i87] = new C11315l(0);
        }
        admob(iArrCopyOf3, -i77);
        boolean z23 = false;
        loop5: while (true) {
            int length7 = iArrCopyOf2.length;
            int i88 = 0;
            while (true) {
                if (i88 >= length7) {
                    c11315lArr = c11315lArr2;
                    z2 = z23;
                    iLoadAd = -1;
                    break loop5;
                }
                int i89 = iArrCopyOf2[i88];
                c11315lArr = c11315lArr2;
                z2 = z23;
                if (iArrCopyOf3[i88] >= Math.max(-i74, 0) || i89 <= 0) {
                    i88++;
                    z23 = z2;
                    i75 = i75;
                    i76 = i76;
                    c11315lArr2 = c11315lArr;
                }
            }
            iLoadAd = loadAd(iArrCopyOf2);
            int i90 = iArrCopyOf2[iLoadAd];
            int length8 = iArrCopyOf3.length;
            int i91 = 0;
            while (i91 < length8) {
                int i92 = length8;
                if (iArrCopyOf2[i91] != iArrCopyOf2[iLoadAd]) {
                    int i93 = iArrCopyOf3[i91];
                    int i94 = iArrCopyOf3[iLoadAd];
                    if (i93 < i94) {
                        iArrCopyOf3[i91] = i94;
                    }
                }
                i91++;
                length8 = i92;
            }
            int iPro2 = c13698l3.pro(i90, iLoadAd);
            if (iPro2 < 0) {
                break;
            }
            long jYandex = c9568l.yandex(c11862l3, iPro2, iLoadAd);
            int i95 = i75;
            int i96 = (int) (jYandex & 4294967295L);
            int i97 = i76;
            int i98 = (int) (jYandex >> 32);
            int i99 = i96 - i98;
            c13698l3.m3676interface(iPro2, i99 != 1 ? -2 : i98);
            C15724l c15724lM1117l = c2197l2.m1117l(iPro2, jYandex);
            int iAmazon2 = amazon(jYandex, iArrCopyOf3);
            int[] iArrSignatures3 = i99 != 1 ? c13698l3.signatures(iPro2) : null;
            boolean z24 = z2;
            while (i98 < i96) {
                iArrCopyOf2[i98] = iPro2;
                int iCrashlytics2 = c15724lM1117l.crashlytics() + iAmazon2 + (iArrSignatures3 == null ? 0 : iArrSignatures3[i98]);
                iArrCopyOf3[i98] = iCrashlytics2;
                if (i97 + iCrashlytics2 <= 0) {
                    z24 = true;
                }
                i98++;
            }
            i75 = i95;
            z23 = z24;
            i76 = i97;
            c11315lArr2 = c11315lArr;
        }
        int i100 = i75;
        int i101 = i76;
        int i102 = -i77;
        int i103 = iArrCopyOf3[0];
        if (i103 < i102) {
            int i104 = i102 - i103;
            admob(iArrCopyOf3, i104);
            i2 = i - i104;
        } else {
            i2 = i;
        }
        admob(iArrCopyOf3, i77);
        int i105 = -1;
        if (iLoadAd == -1) {
            int length9 = iArrCopyOf2.length;
            int i106 = 0;
            while (true) {
                if (i106 >= length9) {
                    i106 = -1;
                    break;
                }
                if (iArrCopyOf2[i106] == 0) {
                    break;
                }
                i106++;
            }
            iLoadAd = i106;
            i105 = -1;
        }
        if (iLoadAd != i105 && billing(iArrCopyOf2, c9568l, iArrCopyOf3, iLoadAd) && z) {
            c13698l3.m3669continue();
            int length10 = iArrCopyOf2.length;
            int[] iArr14 = new int[length10];
            int i107 = 0;
            while (i107 < length10) {
                iArr14[i107] = i105;
                i107++;
                i105 = -1;
            }
            int length11 = iArrCopyOf3.length;
            int[] iArr15 = new int[length11];
            for (int i108 = 0; i108 < length11; i108++) {
                iArr15[i108] = iArrCopyOf3[iLoadAd];
            }
            return purchase(c9568l, i2, iArr14, iArr15, false);
        }
        int[] iArrCopyOf4 = Arrays.copyOf(iArrCopyOf2, iArrCopyOf2.length);
        int length12 = iArrCopyOf3.length;
        int[] iArr16 = new int[length12];
        for (int i109 = 0; i109 < length12; i109++) {
            iArr16[i109] = -iArrCopyOf3[i109];
        }
        int i110 = i74 + i102;
        int i111 = i73 + i101;
        if (i111 < 0) {
            i111 = 0;
        }
        int i112 = i2;
        int iCrashlytics3 = crashlytics(iArrCopyOf4);
        boolean z25 = z2;
        int i113 = i102;
        int i114 = 0;
        while (true) {
            iArrCopyOf2 = iArrCopyOf2;
            if (iCrashlytics3 == -1) {
                i3 = i100;
                break;
            }
            i3 = i100;
            if (i114 >= i3) {
                break;
            }
            int i115 = i114;
            int i116 = iArrCopyOf4[iCrashlytics3];
            i77 = i77;
            int length13 = iArrCopyOf4.length;
            iArrCopyOf3 = iArrCopyOf3;
            i74 = i74;
            int i117 = Integer.MAX_VALUE;
            int i118 = 0;
            iCrashlytics3 = -1;
            while (i118 < length13) {
                int i119 = i118;
                int i120 = i116 + 1;
                int i121 = length13;
                int i122 = iArrCopyOf4[i119];
                if (i120 <= i122 && i122 < i117) {
                    i117 = i122;
                    iCrashlytics3 = i119;
                }
                i118 = i119 + 1;
                length13 = i121;
            }
            int i123 = i115 + 1;
            if (i116 >= 0) {
                int i124 = iYandex;
                long jYandex2 = c9568l.yandex(c11862l3, i116, iCrashlytics3);
                C15724l c15724lM1117l2 = c2197l2.m1117l(i116, jYandex2);
                C2197l c2197l4 = c2197l2;
                int i125 = (int) (jYandex2 & 4294967295L);
                C11862l c11862l4 = c11862l3;
                int i126 = (int) (jYandex2 >> 32);
                int i127 = i125 - i126;
                c13698l3.m3676interface(i116, i127 != 1 ? -2 : i126);
                int iAmazon3 = amazon(jYandex2, iArr16);
                for (int i128 = i126; i128 < i125; i128++) {
                    iArr16[i128] = c15724lM1117l2.crashlytics() + iAmazon3;
                    iArrCopyOf4[i128] = i116;
                    c11315lArr[i128].addLast(c15724lM1117l2);
                }
                if (iAmazon3 < i110 && iArr16[i126] <= i110) {
                    c15724lM1117l2.smaato = false;
                    z25 = true;
                }
                if (i127 != 1) {
                    i100 = i3;
                    i114 = i100;
                } else {
                    i114 = i123;
                    i100 = i3;
                }
                c2197l2 = c2197l4;
                c11862l3 = c11862l4;
                iYandex = i124;
            } else {
                i114 = i123;
                i100 = i3;
            }
        }
        int[] iArr17 = iArrCopyOf3;
        int i129 = iYandex;
        int i130 = i74;
        C2197l c2197l5 = c2197l2;
        int i131 = i77;
        C11862l c11862l5 = c11862l3;
        loop16: while (true) {
            int i132 = 0;
            while (true) {
                if (i132 >= length12) {
                    for (int i133 = 0; i133 < i3; i133++) {
                        if (!c11315lArr[i133].isEmpty()) {
                            i4 = i129;
                            i5 = 1;
                            break loop16;
                        }
                    }
                    break;
                }
                int i134 = iArr16[i132];
                if (i134 < i111 || i134 <= 0) {
                    break;
                }
                i132++;
            }
            int iCrashlytics4 = crashlytics(iArr16);
            i5 = 1;
            int iM2408interface = AbstractC8669l.m2408interface(iArrCopyOf4) + 1;
            i4 = i129;
            if (iM2408interface >= i4) {
                break;
            }
            int[] iArr18 = iArrCopyOf2;
            int i135 = length12;
            C7583l c7583l5 = c7583l3;
            i129 = i4;
            long j5 = j4;
            int[] iArr19 = iArr17;
            C2197l c2197l6 = c2197l5;
            int i136 = i112;
            int[] iArr20 = iArrCopyOf4;
            C14054l c14054l4 = c14054l;
            int i137 = i101;
            int[] iArr21 = iArr16;
            int i138 = i111;
            C17385l c17385l3 = c17385l2;
            C12507l c12507l3 = c12507l2;
            List list7 = list5;
            int i139 = i113;
            long jYandex3 = c9568l.yandex(c11862l5, iM2408interface, iCrashlytics4);
            int i140 = (int) (jYandex3 & 4294967295L);
            int i141 = (int) (jYandex3 >> 32);
            int i142 = i140 - i141;
            c13698l3.m3676interface(iM2408interface, i142 != 1 ? -2 : i141);
            C15724l c15724lM1117l3 = c2197l6.m1117l(iM2408interface, jYandex3);
            int iAmazon4 = amazon(jYandex3, iArr21);
            if (i142 != 1) {
                iArrSignatures2 = c13698l3.signatures(iM2408interface);
                if (iArrSignatures2 == null) {
                    iArrSignatures2 = new int[i3];
                }
            } else {
                iArrSignatures2 = null;
            }
            int i143 = i141;
            while (i143 < i140) {
                if (iArrSignatures2 != null) {
                    iArrSignatures2[i143] = iAmazon4 - iArr21[i143];
                }
                iArr20[i143] = iM2408interface;
                iArr21[i143] = c15724lM1117l3.crashlytics() + iAmazon4;
                c11315lArr[i143].addLast(c15724lM1117l3);
                i143++;
                i3 = i3;
            }
            int i144 = i3;
            C11315l c11315l2 = (C11315l) c13698l3.f26746l;
            int iM3664class = C13698l.m3664class(iM2408interface, c11315l2);
            if (iM3664class < 0) {
                if (iArrSignatures2 != null) {
                    c11315l2.add(-(iM3664class + 1), new C1249l(iArrSignatures2, iM2408interface));
                }
            } else if (iArrSignatures2 == null) {
                c11315l2.ad(iM3664class);
            } else {
                ((C1249l) c11315l2.get(iM3664class)).loadAd = iArrSignatures2;
            }
            if (iAmazon4 < i110 && iArr21[i141] <= i110) {
                c15724lM1117l3.smaato = false;
            }
            c7583l3 = c7583l5;
            length12 = i135;
            iArrCopyOf2 = iArr18;
            i3 = i144;
            i113 = i139;
            list5 = list7;
            c12507l2 = c12507l3;
            i111 = i138;
            i101 = i137;
            c2197l5 = c2197l6;
            c14054l = c14054l4;
            c17385l2 = c17385l3;
            iArr17 = iArr19;
            iArrCopyOf4 = iArr20;
            iArr16 = iArr21;
            i112 = i136;
            j4 = j5;
        }
        int i145 = 0;
        while (i145 < i3) {
            C11315l c11315l3 = c11315lArr[i145];
            while (c11315l3.pro() > i5 && !((C15724l) c11315l3.first()).smaato) {
                C15724l c15724l7 = (C15724l) c11315l3.removeFirst();
                int[] iArrSignatures4 = c15724l7.billing != i5 ? c13698l3.signatures(c15724l7.yandex) : null;
                iArr17[i145] = iArr17[i145] - (c15724l7.crashlytics() + (iArrSignatures4 == null ? 0 : iArrSignatures4[i145]));
                i5 = 1;
            }
            C15724l c15724l8 = (C15724l) c11315l3.signatures();
            iArrCopyOf2[i145] = c15724l8 != null ? c15724l8.yandex : -1;
            i145++;
            i5 = 1;
        }
        int length14 = iArrCopyOf4.length;
        int i146 = 0;
        while (true) {
            if (i146 >= length14) {
                i6 = i130;
                break;
            }
            if (iArrCopyOf4[i146] == i4 - 1) {
                i6 = i130;
                admob(iArr16, -i6);
                break;
            }
            i146++;
        }
        int i147 = 0;
        while (true) {
            if (i147 >= length12) {
                i7 = i101;
                int i148 = i7 - iArr16[loadAd(iArr16)];
                iArr3 = iArr17;
                admob(iArr3, -i148);
                admob(iArr16, i148);
                boolean z26 = false;
                loop44: while (true) {
                    int length15 = iArr3.length;
                    int i149 = 0;
                    while (true) {
                        if (i149 >= length15) {
                            i8 = i148;
                            i9 = i131;
                            z3 = z26;
                            iArr4 = iArrCopyOf2;
                            break loop44;
                        }
                        int i150 = length15;
                        i11 = i131;
                        if (iArr3[i149] < i11) {
                            break;
                        }
                        i149++;
                        i112 = i112;
                        length15 = i150;
                        iArrCopyOf2 = iArrCopyOf2;
                        z26 = z26;
                        i131 = i11;
                        c2197l5 = c2197l5;
                        i6 = i6;
                    }
                    int iCrashlytics5 = crashlytics(iArr3);
                    int iLoadAd2 = loadAd(iArrCopyOf2);
                    i8 = i148;
                    if (iCrashlytics5 != iLoadAd2) {
                        z3 = z26;
                        if (iArr3[iCrashlytics5] == iArr3[iLoadAd2]) {
                            iCrashlytics5 = iLoadAd2;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = z26;
                    }
                    int i151 = iArrCopyOf2[iCrashlytics5];
                    if (i151 == -1) {
                        i151 = i4;
                    }
                    int iPro3 = c13698l3.pro(i151, iCrashlytics5);
                    if (iPro3 < 0) {
                        iArr4 = iArrCopyOf2;
                        if ((!z3 && !billing(iArr4, c9568l, iArr3, iCrashlytics5)) || !z) {
                            i9 = i11;
                            break;
                        }
                        c13698l3.m3669continue();
                        int length16 = iArr4.length;
                        int[] iArr22 = new int[length16];
                        for (int i152 = 0; i152 < length16; i152++) {
                            iArr22[i152] = -1;
                        }
                        int length17 = iArr3.length;
                        int[] iArr23 = new int[length17];
                        for (int i153 = 0; i153 < length17; i153++) {
                            iArr23[i153] = iArr3[iCrashlytics5];
                        }
                        return purchase(c9568l, i112, iArr22, iArr23, false);
                    }
                    int i154 = i112;
                    int i155 = i7;
                    int i156 = i4;
                    int[] iArr24 = iArrCopyOf2;
                    int i157 = length12;
                    long jYandex4 = c9568l.yandex(c11862l5, iPro3, iCrashlytics5);
                    int i158 = i6;
                    int i159 = (int) (jYandex4 & 4294967295L);
                    int i160 = i111;
                    int i161 = (int) (jYandex4 >> 32);
                    int i162 = i159 - i161;
                    c13698l3.m3676interface(iPro3, i162 != 1 ? -2 : i161);
                    C2197l c2197l7 = c2197l5;
                    C15724l c15724lM1117l4 = c2197l7.m1117l(iPro3, jYandex4);
                    int iAmazon5 = amazon(jYandex4, iArr3);
                    int[] iArrSignatures5 = i162 != 1 ? c13698l3.signatures(iPro3) : null;
                    while (i161 < i159) {
                        if (iArr3[i161] != iAmazon5) {
                            z3 = true;
                        }
                        c11315lArr[i161].addFirst(c15724lM1117l4);
                        iArr24[i161] = iPro3;
                        iArr3[i161] = c15724lM1117l4.crashlytics() + iAmazon5 + (iArrSignatures5 == null ? 0 : iArrSignatures5[i161]);
                        i161++;
                    }
                    i111 = i160;
                    i148 = i8;
                    i112 = i154;
                    length12 = i157;
                    i7 = i155;
                    i6 = i158;
                    i4 = i156;
                    iArrCopyOf2 = iArr24;
                    z26 = z3;
                    i131 = i11;
                    c2197l5 = c2197l7;
                }
                if (!z3 || !z) {
                    i10 = i112 + i8;
                    int i163 = iArr3[crashlytics(iArr3)];
                    if (i163 >= 0) {
                        break;
                    }
                    i10 += i163;
                    admob(iArr16, i163);
                    admob(iArr3, -i163);
                    break;
                }
                c13698l3.m3669continue();
                return purchase(c9568l, i112, iArr4, iArr3, false);
            }
            int i164 = i101;
            if (iArr16[i147] >= i164) {
                i10 = i112;
                i112 = i10;
                i6 = i6;
                i4 = i4;
                i111 = i111;
                iArr4 = iArrCopyOf2;
                iArr3 = iArr17;
                c2197l5 = c2197l5;
                length12 = length12;
                i7 = i164;
                i9 = i131;
                break;
            }
            i147++;
            i101 = i164;
        }
        if (!interfaceC15847l.mo992import()) {
            c7583l = c7583l3;
            if (c7583l.yandex) {
                fFloatValue = ((Number) ((C6570l) c7583l.pro.f26580l).f13720l.getValue()).floatValue();
            }
            if (Integer.signum(Math.round(fFloatValue)) == Integer.signum(i10) || Math.abs(Math.round(fFloatValue)) < Math.abs(i10)) {
                f = fFloatValue;
            } else {
                f = i10;
            }
            f2 = fFloatValue - f;
            f3 = 0.0f;
            if (interfaceC15847l.mo992import() && i10 > i112 && f2 <= 0.0f) {
                f3 = (i10 - i112) + f2;
            }
            iArrCopyOf = Arrays.copyOf(iArr3, iArr3.length);
            length = iArrCopyOf.length;
            for (i12 = 0; i12 < length; i12++) {
                iArrCopyOf[i12] = -iArrCopyOf[i12];
            }
            i13 = i9;
            if (i13 > i6) {
                i67 = 0;
                while (i67 < i3) {
                    c11315l = c11315lArr[i67];
                    iPro = c11315l.pro();
                    iArr13 = iArr4;
                    i68 = 0;
                    while (true) {
                        if (i68 < iPro) {
                            i69 = i67;
                            f7 = f3;
                            break;
                        }
                        i69 = i67;
                        C15724l c15724l9 = (C15724l) c11315l.get(i68);
                        f7 = f3;
                        iArrSignatures = c13698l3.signatures(c15724l9.yandex);
                        int iCrashlytics6 = c15724l9.crashlytics();
                        if (iArrSignatures == null) {
                            i70 = 0;
                        } else {
                            i70 = iArrSignatures[i69];
                        }
                        i71 = iCrashlytics6 + i70;
                        if (i68 == AbstractC14055l.smaato(c11315l) || (i72 = iArr3[i69]) == 0 || i72 < i71) {
                            break;
                        }
                        iArr3[i69] = i72 - i71;
                        i68++;
                        iArr13[i69] = ((C15724l) c11315l.get(i68)).yandex;
                        f3 = f7;
                        i67 = i69;
                    }
                    i67 = i69 + 1;
                    f3 = f7;
                    iArr4 = iArr13;
                }
            }
            iArr5 = iArr4;
            f4 = f3;
            i14 = i73 + i13;
            if (z21) {
                iMopub = C15519l.admob(j4);
                j = j4;
            } else {
                j = j4;
                iMopub = AbstractC7563l.mopub(AbstractC8669l.m2408interface(iArr16) + i14, j);
            }
            i15 = iMopub;
            if (z21) {
                iMopub2 = AbstractC7563l.billing(AbstractC8669l.m2408interface(iArr16) + i14, j);
            } else {
                iMopub2 = C15519l.mopub(j);
            }
            i16 = iMopub2;
            if (z21) {
                i17 = i16;
            } else {
                i17 = i15;
            }
            i18 = i7;
            iMin = i73 + (Math.min(i17, i18) - i13);
            int i165 = iArrCopyOf[0];
            iArr6 = c16761l.yandex;
            i19 = c16761l.loadAd - 1;
            i20 = i165;
            iArr7 = iArr16;
            arrayList = null;
            while (-1 < i19) {
                i64 = iArr6[i19];
                int i166 = i19;
                iInmobi2 = c13698l3.inmobi(i64);
                int i167 = i18;
                if (iInmobi2 != -2 || iInmobi2 == -1) {
                    i65 = 0;
                    while (true) {
                        if (i65 < i3) {
                            c15724l6 = (C15724l) c11315lArr[i65].signatures();
                            if (c15724l6 != null) {
                                i66 = c15724l6.yandex;
                            } else {
                                i66 = -1;
                            }
                            if (i66 > i64) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                i65++;
                            }
                        }
                    }
                } else {
                    C15724l c15724l10 = (C15724l) c11315lArr[iInmobi2].signatures();
                    z20 = (c15724l10 != null ? c15724l10.yandex : -1) > i64;
                }
                long j6 = j;
                if (z20) {
                    c11862l2 = c11862l5;
                    long jYandex5 = c9568l.yandex(c11862l2, i64, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List list8 = arrayList;
                    C15724l c15724lM1117l5 = c2197l5.m1117l(i64, jYandex5);
                    int iCrashlytics7 = i20 - c15724lM1117l5.crashlytics();
                    c15724lM1117l5.amazon(iCrashlytics7, 0, iMin);
                    list8.add(c15724lM1117l5);
                    arrayList = list8;
                    i20 = iCrashlytics7;
                } else {
                    c11862l2 = c11862l5;
                }
                c11862l5 = c11862l2;
                i19 = i166 - 1;
                i18 = i167;
                j = j6;
            }
            i21 = i18;
            j2 = j;
            c11862l = c11862l5;
            if (arrayList == null) {
                list = list6;
            } else {
                list = arrayList;
            }
            i23 = 0;
            for (i22 = 0; i22 < i3; i22++) {
                i23 += c11315lArr[i22].f22809l;
            }
            arrayList2 = new ArrayList(i23);
            loop29: while (true) {
                i24 = 0;
                while (true) {
                    if (i24 < i3) {
                        break loop29;
                    }
                    if (!c11315lArr[i24].isEmpty()) {
                        break;
                    }
                    i24++;
                    c12507l2 = c12507l2;
                }
                iArr3 = iArr3;
                i53 = Integer.MAX_VALUE;
                i54 = -1;
                i55 = 0;
                while (i55 < i3) {
                    i62 = i55;
                    c15724l5 = (C15724l) c11315lArr[i55].signatures();
                    if (c15724l5 != null) {
                        i63 = c15724l5.yandex;
                    } else {
                        i63 = Integer.MAX_VALUE;
                    }
                    if (i53 > i63) {
                        i53 = i63;
                        i54 = i62;
                    }
                    i55 = i62 + 1;
                }
                c15724l4 = (C15724l) c11315lArr[i54].removeFirst();
                i56 = c15724l4.purchase;
                if (i56 != i54) {
                    int i168 = i54;
                    C7583l c7583l6 = c7583l;
                    List list9 = list;
                    long j7 = (((long) i56) << 32) | (((long) (c15724l4.billing + i56)) & 4294967295L);
                    iAmazon = amazon(j7, iArrCopyOf);
                    C12507l c12507l4 = c12507l2;
                    iArr12 = iArrCopyOf;
                    i57 = c12507l4.f24647l[i168];
                    i58 = i113;
                    if (c15724l4.remoteconfig + iAmazon >= i58) {
                        i61 = i111;
                        if (iAmazon <= i61) {
                            c15724l4.amazon(iAmazon, i57, iMin);
                            arrayList2.add(c15724l4);
                        }
                        i111 = i61;
                    }
                    i113 = i58;
                    i60 = (int) (j7 & 4294967295L);
                    for (i59 = (int) (j7 >> 32); i59 < i60; i59++) {
                        iArr12[i59] = c15724l4.crashlytics() + iAmazon;
                    }
                    list = list9;
                    iArrCopyOf = iArr12;
                    c7583l = c7583l6;
                    c12507l2 = c12507l4;
                }
            }
            c7583l2 = c7583l;
            List list10 = list;
            iArr8 = iArr3;
            C12507l c12507l5 = c12507l2;
            iCrashlytics = iArrCopyOf[0];
            c15724l = (C15724l) AbstractC16901l.m4212class(arrayList2);
            if (c15724l != null) {
                i25 = c15724l.yandex;
            } else {
                i25 = -1;
            }
            if (interfaceC15847l.mo992import() || list5 == null || list5.isEmpty()) {
                f5 = f;
                c13698l3 = c13698l3;
                arrayList3 = null;
            } else {
                int size4 = list5.size() - 1;
                while (true) {
                    if (-1 >= size4) {
                        list2 = list5;
                        c15724l2 = null;
                        break;
                    }
                    list2 = list5;
                    if (((C15724l) list2.get(size4)).yandex > i25 && (size4 == 0 || ((C15724l) list2.get(size4 - 1)).yandex <= i25)) {
                        c15724l2 = (C15724l) list2.get(size4);
                        break;
                    }
                    size4--;
                    list5 = list2;
                }
                C15724l c15724l11 = (C15724l) AbstractC16901l.m4214continue(list2);
                if (c15724l2 != null && (i49 = c15724l2.yandex) <= (iMin2 = Math.min(c15724l11.yandex, i4 - 1))) {
                    arrayList3 = null;
                    while (true) {
                        if (arrayList3 != null) {
                            int size5 = arrayList3.size();
                            f5 = f;
                            int i169 = 0;
                            while (true) {
                                if (i169 >= size5) {
                                    z18 = false;
                                    break;
                                }
                                int i170 = i169;
                                if (((C15724l) arrayList3.get(i169)).yandex == i49) {
                                    z18 = true;
                                    break;
                                }
                                i169 = i170 + 1;
                            }
                            z16 = z18;
                            if (z16) {
                                list3 = list2;
                            } else {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                size3 = list2.size();
                                i50 = 0;
                                while (true) {
                                    if (i50 < size3) {
                                        list3 = list2;
                                        obj = null;
                                        break;
                                    }
                                    obj = list2.get(i50);
                                    list3 = list2;
                                    if (((C15724l) obj).yandex == i49) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        break;
                                    }
                                    i50++;
                                    list2 = list3;
                                }
                                c15724l3 = (C15724l) obj;
                                if (c15724l3 != null) {
                                    i51 = c15724l3.purchase;
                                } else {
                                    i51 = 0;
                                }
                                C15724l c15724lM1117l6 = c2197l5.m1117l(i49, c9568l.yandex(c11862l, i49, i51));
                                arrayList3.add(c15724lM1117l6);
                                iArr11 = c12507l5.f24647l;
                                if (iArr11.length > i51) {
                                    i52 = iArr11[i51];
                                } else {
                                    i52 = 0;
                                }
                                c15724lM1117l6.amazon(iCrashlytics, i52, iMin);
                                iCrashlytics = c15724lM1117l6.crashlytics() + iCrashlytics;
                            }
                            if (i49 != iMin2) {
                                break;
                            }
                            i49++;
                            f = f5;
                            c13698l3 = c13698l3;
                            list2 = list3;
                        } else {
                            f5 = f;
                        }
                        if (z16) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            size3 = list2.size();
                            i50 = 0;
                            while (true) {
                                if (i50 < size3) {
                                    list3 = list2;
                                    obj = null;
                                    break;
                                }
                                obj = list2.get(i50);
                                list3 = list2;
                                if (((C15724l) obj).yandex == i49) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    break;
                                    break;
                                }
                                i50++;
                                list2 = list3;
                            }
                            c15724l3 = (C15724l) obj;
                            if (c15724l3 != null) {
                                i51 = c15724l3.purchase;
                            } else {
                                i51 = 0;
                            }
                            C15724l c15724lM1117l7 = c2197l5.m1117l(i49, c9568l.yandex(c11862l, i49, i51));
                            arrayList3.add(c15724lM1117l7);
                            iArr11 = c12507l5.f24647l;
                            if (iArr11.length > i51) {
                                i52 = iArr11[i51];
                            } else {
                                i52 = 0;
                            }
                            c15724lM1117l7.amazon(iCrashlytics, i52, iMin);
                            iCrashlytics = c15724lM1117l7.crashlytics() + iCrashlytics;
                        } else {
                            list3 = list2;
                        }
                        if (i49 != iMin2) {
                            break;
                            break;
                        }
                        i49++;
                        f = f5;
                        c13698l3 = c13698l3;
                        list2 = list3;
                    }
                } else {
                    f5 = f;
                    c13698l3 = c13698l3;
                    arrayList3 = null;
                }
            }
            iArr9 = c16761l.yandex;
            i26 = c16761l.loadAd;
            arrayList4 = null;
            i27 = 0;
            while (i27 < i26) {
                i45 = iArr9[i27];
                i46 = i4;
                if (i45 >= i46) {
                    iArr10 = iArr9;
                } else {
                    if (arrayList3 != null) {
                        size2 = arrayList3.size();
                        i48 = 0;
                        while (true) {
                            if (i48 < size2) {
                                iArr10 = iArr9;
                                z14 = false;
                                break;
                            }
                            iArr10 = iArr9;
                            if (((C15724l) arrayList3.get(i48)).yandex == i45) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                z14 = true;
                                break;
                            }
                            i48++;
                            iArr9 = iArr10;
                        }
                        z11 = z14;
                        if (!z11) {
                            c13698l2 = c13698l3;
                            iInmobi = c13698l2.inmobi(i45);
                            if (iInmobi != -2 || iInmobi == -1) {
                                length4 = iArrCopyOf4.length;
                                i47 = 0;
                                while (true) {
                                    if (i47 < length4) {
                                        c13698l3 = c13698l2;
                                        if (iArrCopyOf4[i47] < i45) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            i47++;
                                            c13698l2 = c13698l3;
                                        }
                                    } else {
                                        c13698l3 = c13698l2;
                                        z13 = true;
                                    }
                                }
                            } else if (iArrCopyOf4[iInmobi] < i45) {
                                c13698l3 = c13698l2;
                                z13 = true;
                            } else {
                                c13698l3 = c13698l2;
                            }
                        }
                        int i171 = i26;
                        int i172 = i27;
                        if (z13) {
                            long jYandex6 = c9568l.yandex(c11862l, i45, 0);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            C15724l c15724lM1117l8 = c2197l5.m1117l(i45, jYandex6);
                            c15724lM1117l8.amazon(iCrashlytics, 0, iMin);
                            int iCrashlytics8 = c15724lM1117l8.crashlytics() + iCrashlytics;
                            arrayList4.add(c15724lM1117l8);
                            iCrashlytics = iCrashlytics8;
                        }
                        i27 = i172 + 1;
                        i4 = i46;
                        i26 = i171;
                        iArr9 = iArr10;
                    } else {
                        iArr10 = iArr9;
                    }
                    if (!z11) {
                        c13698l2 = c13698l3;
                        iInmobi = c13698l2.inmobi(i45);
                        if (iInmobi != -2) {
                        }
                        length4 = iArrCopyOf4.length;
                        i47 = 0;
                        while (true) {
                            if (i47 < length4) {
                                c13698l3 = c13698l2;
                                if (iArrCopyOf4[i47] < i45) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    i47++;
                                    c13698l2 = c13698l3;
                                }
                            } else {
                                c13698l3 = c13698l2;
                                z13 = true;
                            }
                        }
                    }
                    int i173 = i26;
                    int i174 = i27;
                    if (z13) {
                        long jYandex7 = c9568l.yandex(c11862l, i45, 0);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        C15724l c15724lM1117l9 = c2197l5.m1117l(i45, jYandex7);
                        c15724lM1117l9.amazon(iCrashlytics, 0, iMin);
                        int iCrashlytics9 = c15724lM1117l9.crashlytics() + iCrashlytics;
                        arrayList4.add(c15724lM1117l9);
                        iCrashlytics = iCrashlytics9;
                    }
                    i27 = i174 + 1;
                    i4 = i46;
                    i26 = i173;
                    iArr9 = iArr10;
                }
                z13 = false;
                int i175 = i26;
                int i176 = i27;
                if (z13) {
                    long jYandex8 = c9568l.yandex(c11862l, i45, 0);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    C15724l c15724lM1117l10 = c2197l5.m1117l(i45, jYandex8);
                    c15724lM1117l10.amazon(iCrashlytics, 0, iMin);
                    int iCrashlytics10 = c15724lM1117l10.crashlytics() + iCrashlytics;
                    arrayList4.add(c15724lM1117l10);
                    iCrashlytics = iCrashlytics10;
                }
                i27 = i176 + 1;
                i4 = i46;
                i26 = i175;
                iArr9 = iArr10;
            }
            i28 = i4;
            if (arrayList4 == null) {
                arrayList4 = list6;
            }
            arrayList5 = new ArrayList();
            arrayList5.addAll(list10);
            arrayList5.addAll(arrayList2);
            if (arrayList3 != null) {
                arrayList5.addAll(arrayList3);
            }
            arrayList5.addAll(arrayList4);
            c12660l = c7583l2.tapsense;
            f6 = f5;
            i29 = (int) f6;
            c2197l = c9568l.adcel;
            c13698l = c2197l.f4849l.crashlytics;
            z4 = c9568l.billing;
            i30 = c9568l.subscription;
            zMo992import = interfaceC15847l.mo992import();
            z5 = c9568l.vip;
            if (iArr8.length != 0) {
                C4875l.firebase();
                return null;
            }
            i31 = iArr8[0];
            length2 = iArr8.length - 1;
            if (1 <= length2) {
                i42 = 1;
                i43 = i31;
                while (true) {
                    i44 = iArr8[i42];
                    if (i43 > i44) {
                        i43 = i44;
                    }
                    if (i42 != length2) {
                        break;
                    }
                    i42++;
                }
                i32 = i43;
            } else {
                i32 = i31;
            }
            c12660l.amazon(i29, i15, i16, arrayList5, c13698l, c2197l, z4, zMo992import, i30, z5, i32, AbstractC8669l.m2408interface(iArr7) + i14, c9568l.remoteconfig, c9568l.startapp);
            if (interfaceC15847l.mo992import()) {
                i33 = i15;
                i34 = i16;
            } else {
                jLoadAd = c7583l2.tapsense.loadAd();
                if (C4999l.loadAd(jLoadAd, 0L)) {
                    i33 = i15;
                    i34 = i16;
                } else {
                    if (z21) {
                        i39 = i16;
                    } else {
                        i39 = i15;
                    }
                    iMopub3 = AbstractC7563l.mopub(Math.max(i15, (int) (jLoadAd >> 32)), j2);
                    iBilling = AbstractC7563l.billing(Math.max(i16, (int) (jLoadAd & 4294967295L)), j2);
                    if (z21) {
                        i40 = iBilling;
                    } else {
                        i40 = iMopub3;
                    }
                    if (i40 != i39) {
                        size = arrayList5.size();
                        for (i41 = 0; i41 < size; i41++) {
                            C15724l c15724l12 = (C15724l) arrayList5.get(i41);
                            c15724l12.ads = i40;
                            c15724l12.tapsense = c15724l12.admob + i40;
                        }
                    }
                    i33 = iMopub3;
                    i34 = iBilling;
                }
            }
            i35 = length12;
            i36 = 0;
            while (true) {
                if (i36 >= i35) {
                    z6 = false;
                    break;
                }
                i38 = i21;
                if (iArr7[i36] > i38) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z6 = true;
                    break;
                }
                i36++;
                i21 = i38;
            }
            if (z6) {
                z7 = true;
            } else {
                length3 = iArrCopyOf4.length;
                i37 = 0;
                while (true) {
                    if (i37 < length3) {
                        z8 = true;
                        break;
                    }
                    if (iArrCopyOf4[i37] < i28 - 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        z8 = false;
                        break;
                    }
                    i37++;
                }
                if (z8) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            C17385l c17385l4 = c17385l2;
            return new C16122l(iArr5, iArr8, f6, c17385l4.isVip(i33, i34, c14054l, new C5410l(c9568l, arrayList5, false, c9568l.subs, c17385l4)), f4, z7, c9568l.billing, z25, c9568l.amazon, c11862l.loadAd.amazon, c17385l2, i28, arrayList2, (((long) i33) << 32) | (((long) i34) & 4294967295L), i113, i111, c9568l.isPro, c9568l.firebase, c9568l.smaato, c9568l.remoteconfig, false);
        }
        c7583l = c7583l3;
        fFloatValue = c7583l.metrica;
        if (Integer.signum(Math.round(fFloatValue)) == Integer.signum(i10)) {
            f = fFloatValue;
        } else {
            f = fFloatValue;
        }
        f2 = fFloatValue - f;
        f3 = 0.0f;
        if (interfaceC15847l.mo992import()) {
            f3 = (i10 - i112) + f2;
        }
        iArrCopyOf = Arrays.copyOf(iArr3, iArr3.length);
        length = iArrCopyOf.length;
        while (i12 < length) {
            iArrCopyOf[i12] = -iArrCopyOf[i12];
        }
        i13 = i9;
        if (i13 > i6) {
            i67 = 0;
            while (i67 < i3) {
                c11315l = c11315lArr[i67];
                iPro = c11315l.pro();
                iArr13 = iArr4;
                i68 = 0;
                while (true) {
                    if (i68 < iPro) {
                        i69 = i67;
                        f7 = f3;
                        break;
                        break;
                    }
                    i69 = i67;
                    C15724l c15724l13 = (C15724l) c11315l.get(i68);
                    f7 = f3;
                    iArrSignatures = c13698l3.signatures(c15724l13.yandex);
                    int iCrashlytics11 = c15724l13.crashlytics();
                    if (iArrSignatures == null) {
                        i70 = 0;
                    } else {
                        i70 = iArrSignatures[i69];
                    }
                    i71 = iCrashlytics11 + i70;
                    if (i68 == AbstractC14055l.smaato(c11315l)) {
                        break;
                    }
                    break;
                    iArr3[i69] = i72 - i71;
                    i68++;
                    iArr13[i69] = ((C15724l) c11315l.get(i68)).yandex;
                    f3 = f7;
                    i67 = i69;
                }
                i67 = i69 + 1;
                f3 = f7;
                iArr4 = iArr13;
            }
        }
        iArr5 = iArr4;
        f4 = f3;
        i14 = i73 + i13;
        if (z21) {
            iMopub = C15519l.admob(j4);
            j = j4;
        } else {
            j = j4;
            iMopub = AbstractC7563l.mopub(AbstractC8669l.m2408interface(iArr16) + i14, j);
        }
        i15 = iMopub;
        if (z21) {
            iMopub2 = AbstractC7563l.billing(AbstractC8669l.m2408interface(iArr16) + i14, j);
        } else {
            iMopub2 = C15519l.mopub(j);
        }
        i16 = iMopub2;
        if (z21) {
            i17 = i16;
        } else {
            i17 = i15;
        }
        i18 = i7;
        iMin = i73 + (Math.min(i17, i18) - i13);
        int i1610 = iArrCopyOf[0];
        iArr6 = c16761l.yandex;
        i19 = c16761l.loadAd - 1;
        i20 = i1610;
        iArr7 = iArr16;
        arrayList = null;
        while (-1 < i19) {
            i64 = iArr6[i19];
            int i1611 = i19;
            iInmobi2 = c13698l3.inmobi(i64);
            int i1612 = i18;
            if (iInmobi2 != -2) {
                i65 = 0;
                while (true) {
                    if (i65 < i3) {
                        c15724l6 = (C15724l) c11315lArr[i65].signatures();
                        if (c15724l6 != null) {
                            i66 = c15724l6.yandex;
                        } else {
                            i66 = -1;
                        }
                        if (i66 > i64) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            i65++;
                        }
                    }
                }
            } else {
                i65 = 0;
                while (true) {
                    if (i65 < i3) {
                        c15724l6 = (C15724l) c11315lArr[i65].signatures();
                        if (c15724l6 != null) {
                            i66 = c15724l6.yandex;
                        } else {
                            i66 = -1;
                        }
                        if (i66 > i64) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            i65++;
                        }
                    }
                }
            }
            long j8 = j;
            if (z20) {
                c11862l2 = c11862l5;
                long jYandex9 = c9568l.yandex(c11862l2, i64, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List list11 = arrayList;
                C15724l c15724lM1117l11 = c2197l5.m1117l(i64, jYandex9);
                int iCrashlytics12 = i20 - c15724lM1117l11.crashlytics();
                c15724lM1117l11.amazon(iCrashlytics12, 0, iMin);
                list11.add(c15724lM1117l11);
                arrayList = list11;
                i20 = iCrashlytics12;
            } else {
                c11862l2 = c11862l5;
            }
            c11862l5 = c11862l2;
            i19 = i1611 - 1;
            i18 = i1612;
            j = j8;
        }
        i21 = i18;
        j2 = j;
        c11862l = c11862l5;
        if (arrayList == null) {
            list = list6;
        } else {
            list = arrayList;
        }
        i23 = 0;
        while (i22 < i3) {
            i23 += c11315lArr[i22].f22809l;
        }
        arrayList2 = new ArrayList(i23);
        loop29: while (true) {
            i24 = 0;
            while (true) {
                if (i24 < i3) {
                    break loop29;
                    break loop29;
                }
                if (!c11315lArr[i24].isEmpty()) {
                    break;
                }
                i24++;
                c12507l2 = c12507l2;
            }
            iArr3 = iArr3;
            i53 = Integer.MAX_VALUE;
            i54 = -1;
            i55 = 0;
            while (i55 < i3) {
                i62 = i55;
                c15724l5 = (C15724l) c11315lArr[i55].signatures();
                if (c15724l5 != null) {
                    i63 = c15724l5.yandex;
                } else {
                    i63 = Integer.MAX_VALUE;
                }
                if (i53 > i63) {
                    i53 = i63;
                    i54 = i62;
                }
                i55 = i62 + 1;
            }
            c15724l4 = (C15724l) c11315lArr[i54].removeFirst();
            i56 = c15724l4.purchase;
            if (i56 != i54) {
                int i1613 = i54;
                C7583l c7583l7 = c7583l;
                List list12 = list;
                long j9 = (((long) i56) << 32) | (((long) (c15724l4.billing + i56)) & 4294967295L);
                iAmazon = amazon(j9, iArrCopyOf);
                C12507l c12507l6 = c12507l2;
                iArr12 = iArrCopyOf;
                i57 = c12507l6.f24647l[i1613];
                i58 = i113;
                if (c15724l4.remoteconfig + iAmazon >= i58) {
                    i61 = i111;
                    if (iAmazon <= i61) {
                        c15724l4.amazon(iAmazon, i57, iMin);
                        arrayList2.add(c15724l4);
                    }
                    i111 = i61;
                }
                i113 = i58;
                i60 = (int) (j9 & 4294967295L);
                while (i59 < i60) {
                    iArr12[i59] = c15724l4.crashlytics() + iAmazon;
                }
                list = list12;
                iArrCopyOf = iArr12;
                c7583l = c7583l7;
                c12507l2 = c12507l6;
            }
        }
        c7583l2 = c7583l;
        List list13 = list;
        iArr8 = iArr3;
        C12507l c12507l7 = c12507l2;
        iCrashlytics = iArrCopyOf[0];
        c15724l = (C15724l) AbstractC16901l.m4212class(arrayList2);
        if (c15724l != null) {
            i25 = c15724l.yandex;
        } else {
            i25 = -1;
        }
        if (interfaceC15847l.mo992import()) {
            f5 = f;
            c13698l3 = c13698l3;
            arrayList3 = null;
        } else {
            f5 = f;
            c13698l3 = c13698l3;
            arrayList3 = null;
        }
        iArr9 = c16761l.yandex;
        i26 = c16761l.loadAd;
        arrayList4 = null;
        i27 = 0;
        while (i27 < i26) {
            i45 = iArr9[i27];
            i46 = i4;
            if (i45 >= i46) {
                iArr10 = iArr9;
            } else {
                if (arrayList3 != null) {
                    size2 = arrayList3.size();
                    i48 = 0;
                    while (true) {
                        if (i48 < size2) {
                            iArr10 = iArr9;
                            z14 = false;
                            break;
                        }
                        iArr10 = iArr9;
                        if (((C15724l) arrayList3.get(i48)).yandex == i45) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            z14 = true;
                            break;
                        }
                        i48++;
                        iArr9 = iArr10;
                    }
                    if (z14) {
                    }
                    if (!z11) {
                        c13698l2 = c13698l3;
                        iInmobi = c13698l2.inmobi(i45);
                        if (iInmobi != -2) {
                        }
                        length4 = iArrCopyOf4.length;
                        i47 = 0;
                        while (true) {
                            if (i47 < length4) {
                                c13698l3 = c13698l2;
                                if (iArrCopyOf4[i47] < i45) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    i47++;
                                    c13698l2 = c13698l3;
                                }
                            } else {
                                c13698l3 = c13698l2;
                                z13 = true;
                            }
                        }
                    }
                    int i177 = i26;
                    int i178 = i27;
                    if (z13) {
                        long jYandex10 = c9568l.yandex(c11862l, i45, 0);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        C15724l c15724lM1117l12 = c2197l5.m1117l(i45, jYandex10);
                        c15724lM1117l12.amazon(iCrashlytics, 0, iMin);
                        int iCrashlytics13 = c15724lM1117l12.crashlytics() + iCrashlytics;
                        arrayList4.add(c15724lM1117l12);
                        iCrashlytics = iCrashlytics13;
                    }
                    i27 = i178 + 1;
                    i4 = i46;
                    i26 = i177;
                    iArr9 = iArr10;
                } else {
                    iArr10 = iArr9;
                }
                if (!z11) {
                    c13698l2 = c13698l3;
                    iInmobi = c13698l2.inmobi(i45);
                    if (iInmobi != -2) {
                    }
                    length4 = iArrCopyOf4.length;
                    i47 = 0;
                    while (true) {
                        if (i47 < length4) {
                            c13698l3 = c13698l2;
                            if (iArrCopyOf4[i47] < i45) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                i47++;
                                c13698l2 = c13698l3;
                            }
                        } else {
                            c13698l3 = c13698l2;
                            z13 = true;
                        }
                    }
                }
                int i179 = i26;
                int i1710 = i27;
                if (z13) {
                    long jYandex11 = c9568l.yandex(c11862l, i45, 0);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    C15724l c15724lM1117l13 = c2197l5.m1117l(i45, jYandex11);
                    c15724lM1117l13.amazon(iCrashlytics, 0, iMin);
                    int iCrashlytics14 = c15724lM1117l13.crashlytics() + iCrashlytics;
                    arrayList4.add(c15724lM1117l13);
                    iCrashlytics = iCrashlytics14;
                }
                i27 = i1710 + 1;
                i4 = i46;
                i26 = i179;
                iArr9 = iArr10;
            }
            z13 = false;
            int i1711 = i26;
            int i1712 = i27;
            if (z13) {
                long jYandex12 = c9568l.yandex(c11862l, i45, 0);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                C15724l c15724lM1117l14 = c2197l5.m1117l(i45, jYandex12);
                c15724lM1117l14.amazon(iCrashlytics, 0, iMin);
                int iCrashlytics15 = c15724lM1117l14.crashlytics() + iCrashlytics;
                arrayList4.add(c15724lM1117l14);
                iCrashlytics = iCrashlytics15;
            }
            i27 = i1712 + 1;
            i4 = i46;
            i26 = i1711;
            iArr9 = iArr10;
        }
        i28 = i4;
        if (arrayList4 == null) {
            arrayList4 = list6;
        }
        arrayList5 = new ArrayList();
        arrayList5.addAll(list13);
        arrayList5.addAll(arrayList2);
        if (arrayList3 != null) {
            arrayList5.addAll(arrayList3);
        }
        arrayList5.addAll(arrayList4);
        c12660l = c7583l2.tapsense;
        f6 = f5;
        i29 = (int) f6;
        c2197l = c9568l.adcel;
        c13698l = c2197l.f4849l.crashlytics;
        z4 = c9568l.billing;
        i30 = c9568l.subscription;
        zMo992import = interfaceC15847l.mo992import();
        z5 = c9568l.vip;
        if (iArr8.length != 0) {
            C4875l.firebase();
            return null;
        }
        i31 = iArr8[0];
        length2 = iArr8.length - 1;
        if (1 <= length2) {
            i42 = 1;
            i43 = i31;
            while (true) {
                i44 = iArr8[i42];
                if (i43 > i44) {
                    i43 = i44;
                }
                if (i42 != length2) {
                    break;
                    break;
                }
                i42++;
            }
            i32 = i43;
        } else {
            i32 = i31;
        }
        c12660l.amazon(i29, i15, i16, arrayList5, c13698l, c2197l, z4, zMo992import, i30, z5, i32, AbstractC8669l.m2408interface(iArr7) + i14, c9568l.remoteconfig, c9568l.startapp);
        if (interfaceC15847l.mo992import()) {
            jLoadAd = c7583l2.tapsense.loadAd();
            if (C4999l.loadAd(jLoadAd, 0L)) {
                if (z21) {
                    i39 = i16;
                } else {
                    i39 = i15;
                }
                iMopub3 = AbstractC7563l.mopub(Math.max(i15, (int) (jLoadAd >> 32)), j2);
                iBilling = AbstractC7563l.billing(Math.max(i16, (int) (jLoadAd & 4294967295L)), j2);
                if (z21) {
                    i40 = iBilling;
                } else {
                    i40 = iMopub3;
                }
                if (i40 != i39) {
                    size = arrayList5.size();
                    while (i41 < size) {
                        C15724l c15724l14 = (C15724l) arrayList5.get(i41);
                        c15724l14.ads = i40;
                        c15724l14.tapsense = c15724l14.admob + i40;
                    }
                }
                i33 = iMopub3;
                i34 = iBilling;
            } else {
                i33 = i15;
                i34 = i16;
            }
        } else {
            i33 = i15;
            i34 = i16;
        }
        i35 = length12;
        i36 = 0;
        while (true) {
            if (i36 >= i35) {
                z6 = false;
                break;
            }
            i38 = i21;
            if (iArr7[i36] > i38) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z6 = true;
                break;
            }
            i36++;
            i21 = i38;
        }
        if (z6) {
            length3 = iArrCopyOf4.length;
            i37 = 0;
            while (true) {
                if (i37 < length3) {
                    z8 = true;
                    break;
                }
                if (iArrCopyOf4[i37] < i28 - 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    z8 = false;
                    break;
                }
                i37++;
            }
            if (z8) {
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            z7 = true;
        }
        C17385l c17385l5 = c17385l2;
        return new C16122l(iArr5, iArr8, f6, c17385l5.isVip(i33, i34, c14054l, new C5410l(c9568l, arrayList5, false, c9568l.subs, c17385l5)), f4, z7, c9568l.billing, z25, c9568l.amazon, c11862l.loadAd.amazon, c17385l2, i28, arrayList2, (((long) i33) << 32) | (((long) i34) & 4294967295L), i113, i111, c9568l.isPro, c9568l.firebase, c9568l.smaato, c9568l.remoteconfig, false);
    }

    public static int remoteconfig(short s) {
        if (s == 0) {
            return 1;
        }
        if (s == 1) {
            return 2;
        }
        if (s == 2) {
            return 3;
        }
        if (s == 3) {
            return 4;
        }
        if (s == 4) {
            return 5;
        }
        if (s == 5) {
            return 6;
        }
        if (s == 6) {
            return 7;
        }
        if (s == 7) {
            return 8;
        }
        if (s == 8) {
            return 9;
        }
        C8339l.metrica(AbstractC0653l.vip(s, "Invalid log level: "));
        return 0;
    }

    public static void smaato(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC5998l.ad(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = (((long) iArr3[3]) & 4294967295L) + 1 + j2;
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j8;
                j6 = j8 >> 32;
            }
            long j9 = (((long) iArr3[6]) & 4294967295L) + 1 + j6;
            iArr3[6] = (int) j9;
            iArr3[7] = (int) (((4294967295L & ((long) iArr3[7])) - 1) + (j9 >> 32));
        }
    }

    public static void subs(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j - 6;
        long j10 = j9 + j2;
        long j11 = j2 + j3;
        long j12 = (j3 + j4) - j8;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = j15 - j10;
        long j18 = ((((long) iArr[0]) & 4294967295L) - j13) - j17;
        iArr2[0] = (int) j18;
        long j19 = ((((((long) iArr[1]) & 4294967295L) + j11) - j14) - j16) + (j18 >> 32);
        iArr2[1] = (int) j19;
        long j20 = (((((long) iArr[2]) & 4294967295L) + j12) - j15) + (j19 >> 32);
        iArr2[2] = (int) j20;
        long j21 = ((((((long) iArr[3]) & 4294967295L) + (j13 << 1)) + j17) - j16) + (j20 >> 32);
        iArr2[3] = (int) j21;
        long j22 = ((((((long) iArr[4]) & 4294967295L) + (j14 << 1)) + j7) - j11) + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = (((((long) iArr[5]) & 4294967295L) + (j15 << 1)) - j12) + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = (((long) iArr[6]) & 4294967295L) + (j16 << 1) + j17 + (j23 >> 32);
        iArr2[6] = (int) j24;
        long j25 = (((((((long) iArr[7]) & 4294967295L) + (j8 << 1)) + j9) - j12) - j14) + (j24 >> 32);
        iArr2[7] = (int) j25;
        isPro(iArr2, (int) ((j25 >> 32) + 6));
    }

    public static final void vip(C18666l c18666l, int i, C0382l c0382l) {
        C17893l c17893l = new C17893l(0, new C18666l[16]);
        List listSubs = c18666l.subs(false, false);
        while (true) {
            c17893l.billing(c17893l.f34846l, listSubs);
            while (true) {
                int i2 = c17893l.f34846l;
                if (i2 == 0) {
                    return;
                }
                C18666l c18666l2 = (C18666l) c17893l.vip(i2 - 1);
                boolean zIsPro = AbstractC14425l.isPro(c18666l2);
                C6264l c6264l = c18666l2.amazon;
                C13660l c13660l = c6264l.f13225l;
                if (!zIsPro && !c13660l.crashlytics(AbstractC0424l.isPro)) {
                    AbstractC18026l abstractC18026lAmazon = c18666l2.amazon();
                    if (abstractC18026lAmazon == null) {
                        throw AbstractC5020l.metrica("Expected semantics node to have a coordinator.");
                    }
                    C16918l c16918lSubs = AbstractC14231l.subs(AbstractC9690l.loadAd(abstractC18026lAmazon, true));
                    if (c16918lSubs.yandex < c16918lSubs.crashlytics && c16918lSubs.loadAd < c16918lSubs.amazon) {
                        Object objMopub = c6264l.f13225l.mopub(AbstractC16601l.purchase);
                        if (objMopub == null) {
                            objMopub = null;
                        }
                        Function2 function2 = (Function2) objMopub;
                        Object objMopub2 = c13660l.mopub(AbstractC0424l.pro);
                        C11601l c11601l = (C11601l) (objMopub2 != null ? objMopub2 : null);
                        if (function2 == null || c11601l == null || ((Number) c11601l.loadAd.invoke()).floatValue() <= 0.0f) {
                            listSubs = c18666l2.subs(false, false);
                        } else {
                            int i3 = 1 + i;
                            c0382l.invoke(new C0198l(c18666l2, i3, c16918lSubs, abstractC18026lAmazon));
                            vip(c18666l2, i3, c0382l);
                        }
                    }
                }
            }
        }
    }

    public static void yandex(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = ((((long) iArr[3]) & 4294967295L) - 1) + j2;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = ((((long) iArr[6]) & 4294967295L) - 1) + j6;
        iArr[6] = (int) j9;
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + (j9 >> 32));
    }
}
