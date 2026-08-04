package defpackage;

import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9498l {
    public static final long amazon(float[] fArr) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        return C9699l.yandex(f / (fArr.length / 2), f2 / (fArr.length / 2));
    }

    public static boolean billing(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void crashlytics(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
        } else {
            if (cls.equals(Double.TYPE)) {
                sb.append("D");
                return;
            }
            sb.append("L");
            sb.append((CharSequence) cls.getName().replace('.', '/'));
            sb.append(";");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [lَٓۡ] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable, lَٓۡ] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v17 */
    public static final C10282l loadAd(float[] fArr, C2428l c2428l, AbstractList abstractList, float f, float f2) {
        float f3;
        List listSingletonList;
        C17841l c17841lYandex;
        C2428l c2428l2;
        float f4 = 1.0f;
        Float fValueOf = Float.valueOf(1.0f);
        ?? r6 = 0;
        if (fArr.length < 6) {
            C8339l.metrica("Polygons must have at least 3 vertices");
            return null;
        }
        int i = 2;
        int i2 = 1;
        if (fArr.length % 2 == 1) {
            C8339l.metrica("The vertices array should have even size");
            return null;
        }
        if (abstractList != null && abstractList.size() * 2 != fArr.length) {
            C8339l.metrica("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            C2428l c2428l3 = (abstractList == null || (c2428l2 = (C2428l) abstractList.get(i4)) == null) ? c2428l : c2428l2;
            int i5 = (((i4 + length) - 1) % length) * 2;
            int i6 = i4 + 1;
            int i7 = (i6 % length) * 2;
            int i8 = i4 * 2;
            arrayList2.add(new C2666l(C9699l.yandex(fArr[i5], fArr[i5 + 1]), C9699l.yandex(fArr[i8], fArr[i8 + 1]), C9699l.yandex(fArr[i7], fArr[i7 + 1]), c2428l3));
            i4 = i6;
            f4 = f4;
        }
        float f5 = f4;
        C8934l c8934lAdcel = AbstractC8576l.adcel(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(c8934lAdcel, 10));
        Iterator it = c8934lAdcel.iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            f3 = 0.0f;
            if (!c16991l.f33123l) {
                break;
            }
            int iNextInt = c16991l.nextInt();
            int i9 = (iNextInt + 1) % length;
            float f6 = ((C2666l) arrayList2.get(iNextInt)).admob + ((C2666l) arrayList2.get(i9)).admob;
            float fCrashlytics = ((C2666l) arrayList2.get(i9)).crashlytics() + ((C2666l) arrayList2.get(iNextInt)).crashlytics();
            int i10 = iNextInt * 2;
            float f7 = fArr[i10];
            float f8 = fArr[i10 + 1];
            int i11 = i9 * 2;
            float f9 = f7 - fArr[i11];
            float f10 = f8 - fArr[i11 + 1];
            float f11 = AbstractC12481l.loadAd;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            arrayList3.add(f6 > fSqrt ? new C8195l(Float.valueOf(fSqrt / f6), Float.valueOf(0.0f)) : fCrashlytics > fSqrt ? new C8195l(fValueOf, Float.valueOf((fSqrt - f6) / (fCrashlytics - f6))) : new C8195l(fValueOf, fValueOf));
        }
        for (int i12 = 0; i12 < length; i12++) {
            float[] fArrCopyOf = new float[i];
            ?? r16 = r6;
            int i13 = i3;
            int i14 = i13;
            while (i13 < i) {
                int i15 = i3;
                C8195l c8195l = (C8195l) arrayList3.get((((i12 + length) - 1) + i13) % length);
                float f12 = f3;
                int i16 = i;
                float fSignature = AbstractC4338l.Signature(((C2666l) arrayList2.get(i12)).crashlytics(), ((C2666l) arrayList2.get(i12)).admob, ((Number) c8195l.f17097l).floatValue(), ((C2666l) arrayList2.get(i12)).admob * ((Number) c8195l.f17098l).floatValue());
                int i17 = i14 + 1;
                if (fArrCopyOf.length < i17) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i17, (fArrCopyOf.length * 3) / 2));
                }
                fArrCopyOf[i14] = fSignature;
                i13++;
                f3 = f12;
                i14 = i17;
                i3 = i15;
                i = i16;
            }
            int i18 = i;
            int i19 = i3;
            float f13 = f3;
            C2666l c2666l = (C2666l) arrayList2.get(i12);
            if (i14 <= 0) {
                AbstractC13082l.amazon("Index must be between 0 and size");
                throw r16;
            }
            float f14 = fArrCopyOf[i19];
            if (i2 >= i14) {
                AbstractC13082l.amazon("Index must be between 0 and size");
                throw r16;
            }
            float f15 = fArrCopyOf[i2];
            long j = c2666l.purchase;
            long j2 = c2666l.amazon;
            int i20 = i2;
            float f16 = c2666l.billing;
            ArrayList arrayList4 = arrayList;
            long j3 = c2666l.loadAd;
            float fMin = Math.min(f14, f15);
            float f17 = c2666l.admob;
            if (f17 < 1.0E-4f || fMin < 1.0E-4f || f16 < 1.0E-4f) {
                c2666l.subs = j3;
                float fMopub = AbstractC10433l.mopub(j3);
                float fAdmob = AbstractC10433l.admob(j3);
                float fMopub2 = AbstractC10433l.mopub(j3);
                float fAdmob2 = AbstractC10433l.admob(j3);
                listSingletonList = Collections.singletonList(AbstractC4603l.yandex(fMopub, fAdmob, AbstractC12481l.loadAd(fMopub, fMopub2, 0.33333334f), AbstractC12481l.loadAd(fAdmob, fAdmob2, 0.33333334f), AbstractC12481l.loadAd(fMopub, fMopub2, 0.6666667f), AbstractC12481l.loadAd(fAdmob, fAdmob2, 0.6666667f), fMopub2, fAdmob2));
            } else {
                float fMin2 = Math.min(fMin, f17);
                float fYandex = c2666l.yandex(f14);
                float fYandex2 = c2666l.yandex(f15);
                float f18 = (f16 * fMin2) / f17;
                float f19 = AbstractC12481l.loadAd;
                float fSqrt2 = (float) Math.sqrt((fMin2 * fMin2) + (f18 * f18));
                long jCrashlytics = AbstractC10433l.crashlytics(2.0f, AbstractC10433l.firebase(j2, j));
                float fBilling = AbstractC10433l.billing(jCrashlytics);
                if (fBilling <= f13) {
                    C8339l.metrica("Can't get the direction of a 0-length vector");
                    return r16;
                }
                c2666l.subs = AbstractC10433l.firebase(j3, AbstractC10433l.remoteconfig(fSqrt2, AbstractC10433l.crashlytics(fBilling, jCrashlytics)));
                long jFirebase = AbstractC10433l.firebase(j3, AbstractC10433l.remoteconfig(fMin2, j2));
                long jFirebase2 = AbstractC10433l.firebase(j3, AbstractC10433l.remoteconfig(fMin2, j));
                C17841l c17841lLoadAd = C2666l.loadAd(fMin2, fYandex, c2666l.loadAd, c2666l.yandex, jFirebase, jFirebase2, c2666l.subs, f18);
                C17841l c17841lLoadAd2 = C2666l.loadAd(fMin2, fYandex2, c2666l.loadAd, c2666l.crashlytics, jFirebase2, jFirebase, c2666l.subs, f18);
                float fYandex3 = c17841lLoadAd2.yandex();
                float fLoadAd = c17841lLoadAd2.loadAd();
                float[] fArr2 = c17841lLoadAd2.yandex;
                C17841l c17841lYandex2 = AbstractC4603l.yandex(fYandex3, fLoadAd, fArr2[4], fArr2[5], fArr2[i18], fArr2[3], fArr2[i19], fArr2[i20]);
                float fMopub3 = AbstractC10433l.mopub(c2666l.subs);
                float fAdmob3 = AbstractC10433l.admob(c2666l.subs);
                float fYandex4 = c17841lLoadAd.yandex();
                float fLoadAd2 = c17841lLoadAd.loadAd();
                float[] fArr3 = c17841lYandex2.yandex;
                float f20 = fArr3[i19];
                float f21 = fArr3[i20];
                float f22 = fYandex4 - fMopub3;
                float f23 = fLoadAd2 - fAdmob3;
                long jYandex = AbstractC12481l.yandex(f22, f23);
                float f24 = f20 - fMopub3;
                float f25 = f21 - fAdmob3;
                long jYandex2 = AbstractC12481l.yandex(f24, f25);
                long jYandex3 = C9699l.yandex(-AbstractC10433l.admob(jYandex), AbstractC10433l.mopub(jYandex));
                long jYandex4 = C9699l.yandex(-AbstractC10433l.admob(jYandex2), AbstractC10433l.mopub(jYandex2));
                int i21 = (AbstractC10433l.admob(jYandex3) * f25) + (AbstractC10433l.mopub(jYandex3) * f24) >= f13 ? i20 : i19;
                float fAmazon = AbstractC10433l.amazon(jYandex, jYandex2);
                if (fAmazon > 0.999f) {
                    c17841lYandex = AbstractC4603l.yandex(fYandex4, fLoadAd2, AbstractC12481l.loadAd(fYandex4, f20, 0.33333334f), AbstractC12481l.loadAd(fLoadAd2, f21, 0.33333334f), AbstractC12481l.loadAd(fYandex4, f20, 0.6666667f), AbstractC12481l.loadAd(fLoadAd2, f21, 0.6666667f), f20, f21);
                } else {
                    float f26 = f5 - fAmazon;
                    float fSqrt3 = (((((float) Math.sqrt(2.0f * f26)) - ((float) Math.sqrt(f5 - (fAmazon * fAmazon)))) * ((((float) Math.sqrt((f23 * f23) + (f22 * f22))) * 4.0f) / 3.0f)) / f26) * (i21 != 0 ? f5 : -1.0f);
                    c17841lYandex = AbstractC4603l.yandex(fYandex4, fLoadAd2, (AbstractC10433l.mopub(jYandex3) * fSqrt3) + fYandex4, (AbstractC10433l.admob(jYandex3) * fSqrt3) + fLoadAd2, f20 - (AbstractC10433l.mopub(jYandex4) * fSqrt3), f21 - (AbstractC10433l.admob(jYandex4) * fSqrt3), f20, f21);
                }
                C17841l[] c17841lArr = new C17841l[3];
                c17841lArr[i19] = c17841lLoadAd;
                c17841lArr[i20] = c17841lYandex;
                c17841lArr[i18] = c17841lYandex2;
                listSingletonList = AbstractC14055l.remoteconfig(c17841lArr);
            }
            arrayList4.add(listSingletonList);
            f3 = f13;
            arrayList = arrayList4;
            arrayList3 = arrayList3;
            r6 = r16;
            i2 = i20;
            i3 = i19;
            i = i18;
        }
        ArrayList arrayList5 = arrayList;
        int i22 = i;
        ?? r17 = r6;
        int i23 = i2;
        int i24 = i3;
        float f27 = f3;
        ArrayList arrayList6 = new ArrayList();
        int i25 = i24;
        while (i25 < length) {
            int i26 = i25 + 1;
            int i27 = i26 % length;
            int i28 = i25 * 2;
            long jYandex5 = C9699l.yandex(fArr[i28], fArr[i28 + 1]);
            int i29 = (((i25 + length) - 1) % length) * 2;
            long jYandex6 = C9699l.yandex(fArr[i29], fArr[i29 + 1]);
            int i30 = i27 * 2;
            long jYandex7 = C9699l.yandex(fArr[i30], fArr[i30 + 1]);
            float f28 = AbstractC12481l.loadAd;
            long jSubs = AbstractC10433l.subs(jYandex5, jYandex6);
            long jSubs2 = AbstractC10433l.subs(jYandex7, jYandex5);
            arrayList6.add(new C3524l((List) arrayList5.get(i25), (AbstractC10433l.admob(jSubs2) * AbstractC10433l.mopub(jSubs)) - (AbstractC10433l.mopub(jSubs2) * AbstractC10433l.admob(jSubs)) > f27 ? i23 : i24));
            float fYandex5 = ((C17841l) AbstractC16901l.m4214continue((List) arrayList5.get(i25))).yandex();
            float fLoadAd3 = ((C17841l) AbstractC16901l.m4214continue((List) arrayList5.get(i25))).loadAd();
            float f29 = ((C17841l) AbstractC16901l.m4231native((List) arrayList5.get(i27))).yandex[i24];
            float f30 = ((C17841l) AbstractC16901l.m4231native((List) arrayList5.get(i27))).yandex[i23];
            arrayList6.add(new C11038l(Collections.singletonList(AbstractC4603l.yandex(fYandex5, fLoadAd3, AbstractC12481l.loadAd(fYandex5, f29, 0.33333334f), AbstractC12481l.loadAd(fLoadAd3, f30, 0.33333334f), AbstractC12481l.loadAd(fYandex5, f29, 0.6666667f), AbstractC12481l.loadAd(fLoadAd3, f30, 0.6666667f), f29, f30))));
            i25 = i26;
        }
        long jAmazon = (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) ? amazon(fArr) : C9699l.yandex(f, f2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jAmazon >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jAmazon & 4294967295L));
        if (arrayList6.size() < i22) {
            C8339l.metrica("Polygons must have at least 2 features");
            return r17;
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            for (C17841l c17841l : ((AbstractC9278l) it2.next()).yandex) {
                c10227lAdmob.add(Float.valueOf(c17841l.yandex[i24]));
                c10227lAdmob.add(Float.valueOf(c17841l.yandex[i23]));
            }
        }
        float[] fArrM4249while = AbstractC16901l.m4249while(AbstractC14055l.purchase(c10227lAdmob));
        if (Float.isNaN(fIntBitsToFloat)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (amazon(fArrM4249while) >> 32));
        }
        if (Float.isNaN(fIntBitsToFloat2)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (amazon(fArrM4249while) & 4294967295L));
        }
        return new C10282l(arrayList6, C9699l.yandex(fIntBitsToFloat, fIntBitsToFloat2));
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
    public static final C6606l mopub(AbstractC14971l abstractC14971l, long j, long j2, Function1 function1) {
        C3654l c3654lMetrica = AbstractC5573l.metrica(abstractC14971l);
        int i = c3654lMetrica.f7685l;
        C0151l rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654lMetrica)).getRectManager();
        C6709l c6709l = rectManager.amazon;
        c6709l.getClass();
        long j3 = j2 == 0 ? j : j2;
        C16977l c16977l = c6709l.yandex;
        C6606l c6606l = new C6606l(c6709l, i, j, j3, abstractC14971l, function1);
        Object objLoadAd = c16977l.loadAd(i);
        if (objLoadAd == null) {
            c16977l.subs(i, c6606l);
            objLoadAd = c6606l;
        }
        C6606l c6606l2 = (C6606l) objLoadAd;
        if (c6606l2 != c6606l) {
            while (true) {
                C6606l c6606l3 = c6606l2.billing;
                if (c6606l3 == null) {
                    break;
                }
                c6606l2 = c6606l3;
            }
            c6606l2.billing = c6606l;
        }
        C3654l c3654lMetrica2 = AbstractC5573l.metrica(abstractC14971l.f29454l);
        if (C0151l.amazon(c3654lMetrica2)) {
            C13698l c13698l = rectManager.crashlytics;
            int iPurchase = rectManager.purchase(c3654lMetrica2);
            long[] jArr = (long[]) c13698l.f26743l;
            int i2 = iPurchase + 2;
            jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
        }
        rectManager.billing = true;
        rectManager.firebase();
        return c6606l;
    }

    public static final Method purchase(InterfaceC9191l interfaceC9191l, String str) {
        if (!(interfaceC9191l instanceof InterfaceC13937l)) {
            return null;
        }
        String strM3351while = AbstractC12024l.m3351while(str, '(');
        if (strM3351while.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + interfaceC9191l + '/' + str);
        }
        for (Method method : ((InterfaceC13937l) interfaceC9191l).mo1730private().getDeclaredMethods()) {
            if (AbstractC8576l.yandex(method.getName(), strM3351while)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                for (Class<?> cls : method.getParameterTypes()) {
                    crashlytics(sb, cls);
                }
                sb.append(")");
                crashlytics(sb, method.getReturnType());
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static final void yandex(final boolean z, final InterfaceC17242l interfaceC17242l, long j, int i, float f, float f2, float f3, float f4, C6956l c6956l, final int i2, final int i3) {
        long j2;
        int i4;
        final int i5;
        final float f5;
        final float f6;
        final float f7;
        final float f8;
        final long j3;
        float[] fArr;
        C10703l c10703l;
        Object c4555l;
        InterfaceC8714l interfaceC8714l;
        float[] fArr2;
        Object obj;
        Boolean bool;
        InterfaceC14029l interfaceC14029l;
        boolean z2;
        int i6;
        final long j4;
        c6956l.m2133new(-2007679889);
        int i7 = i2 | (c6956l.mopub(z) ? 4 : 2);
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 = i7 | 384;
            j2 = j;
        } else {
            j2 = j;
            i4 = i7 | (c6956l.purchase(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i9 = i4 | 14380032;
        if (c6956l.m2127for(i9 & 1, (4793491 & i9) != 4793490)) {
            if (i8 != 0) {
                j2 = C9735l.purchase;
            }
            long j5 = j2;
            Object objM2132native = c6956l.m2132native();
            Object obj2 = C1867l.yandex;
            Object obj3 = objM2132native;
            if (objM2132native == obj2) {
                float[] fArr3 = new float[4];
                for (int i10 = 0; i10 < 4; i10++) {
                    fArr3[i10] = 0.0f;
                }
                c6956l.m2147try(fArr3);
                obj3 = fArr3;
            }
            float[] fArr4 = (float[]) obj3;
            Object objM2132native2 = c6956l.m2132native();
            Object obj4 = objM2132native2;
            if (objM2132native2 == obj2) {
                float[] fArr5 = new float[4];
                for (int i11 = 0; i11 < 4; i11++) {
                    fArr5[i11] = 0.0f;
                }
                c6956l.m2147try(fArr5);
                obj4 = fArr5;
            }
            float[] fArr6 = (float[]) obj4;
            Object objM2132native3 = c6956l.m2132native();
            Object obj5 = objM2132native3;
            if (objM2132native3 == obj2) {
                InterfaceC8097l[] interfaceC8097lArr = new InterfaceC8097l[4];
                for (int i12 = 0; i12 < 4; i12++) {
                    interfaceC8097lArr[i12] = AbstractC5355l.loadAd;
                }
                c6956l.m2147try(interfaceC8097lArr);
                obj5 = interfaceC8097lArr;
            }
            final InterfaceC8097l[] interfaceC8097lArr2 = (InterfaceC8097l[]) obj5;
            Object objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == obj2) {
                objM2132native4 = new C5810l(AbstractC0532l.subs(150, 6, null), AbstractC3483l.purchase, Float.valueOf(0.0f), Float.valueOf(1.0f), null);
                c6956l.m2147try(objM2132native4);
            }
            Object obj6 = (C5810l) objM2132native4;
            Object objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == obj2) {
                objM2132native5 = new C10703l(0L);
                c6956l.m2147try(objM2132native5);
            }
            C10703l c10703l2 = (C10703l) objM2132native5;
            Object objM2132native6 = c6956l.m2132native();
            if (objM2132native6 == obj2) {
                objM2132native6 = new C13765l(0.0f);
                c6956l.m2147try(objM2132native6);
            }
            C13765l c13765l = (C13765l) objM2132native6;
            Object objM2132native7 = c6956l.m2132native();
            if (objM2132native7 == obj2) {
                objM2132native7 = AbstractC8020l.smaato(Boolean.TRUE);
                c6956l.m2147try(objM2132native7);
            }
            InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native7;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i13 = i9 & 14;
            boolean zAdmob = (i13 == 4) | c6956l.admob(fArr4) | c6956l.admob(fArr6) | c6956l.admob(interfaceC8097lArr2);
            Object objM2132native8 = c6956l.m2132native();
            if (zAdmob || objM2132native8 == obj2) {
                fArr = fArr6;
                c10703l = c10703l2;
                interfaceC8714l = interfaceC8714l2;
                fArr2 = fArr4;
                obj = obj2;
                bool = boolValueOf;
                interfaceC14029l = null;
                c4555l = new C4555l(z, fArr2, fArr, interfaceC8097lArr2, interfaceC8714l, c10703l, null);
                c6956l.m2147try(c4555l);
            } else {
                interfaceC8714l = interfaceC8714l2;
                fArr2 = fArr4;
                interfaceC14029l = null;
                obj = obj2;
                fArr = fArr6;
                c10703l = c10703l2;
                c4555l = objM2132native8;
                bool = boolValueOf;
            }
            AbstractC12311l.amazon(c6956l, bool, (Function2) c4555l);
            if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                c6956l.m2123default(924558011);
                boolean zAdmob2 = c6956l.admob(obj6);
                Object objM2132native9 = c6956l.m2132native();
                if (zAdmob2 || objM2132native9 == obj) {
                    objM2132native9 = new C0384l(obj6, c10703l, c13765l, interfaceC14029l, 9);
                    c6956l.m2147try(objM2132native9);
                }
                AbstractC12311l.amazon(c6956l, fArr2, (Function2) objM2132native9);
                z2 = false;
            } else {
                c13765l = c13765l;
                z2 = false;
                c6956l.m2123default(921212243);
            }
            c6956l.startapp(z2);
            boolean zAdmob3 = ((i9 & 896) == 256 ? true : z2) | c6956l.admob(fArr2) | c6956l.admob(fArr) | c6956l.admob(interfaceC8097lArr2) | (i13 == 4 ? true : z2);
            Object objM2132native10 = c6956l.m2132native();
            final float f9 = 3.0f;
            final C13765l c13765l2 = c13765l;
            final float f10 = 2.0f;
            final float[] fArr7 = fArr;
            final float f11 = 16.0f;
            final InterfaceC8714l interfaceC8714l3 = interfaceC8714l;
            final float[] fArr8 = fArr2;
            final float f12 = 1.0f;
            if (zAdmob3 || objM2132native10 == obj) {
                i6 = 6;
                j4 = j5;
                objM2132native10 = new Function1() { // from class: lًؘٗ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) throws Throwable {
                        InterfaceC13349l interfaceC13349l;
                        float f13;
                        float f14;
                        Throwable th;
                        float[] fArr9 = fArr8;
                        float[] fArr10 = fArr7;
                        InterfaceC8097l[] interfaceC8097lArr3 = interfaceC8097lArr2;
                        long j6 = j4;
                        C13765l c13765l3 = c13765l2;
                        InterfaceC8714l interfaceC8714l4 = interfaceC8714l3;
                        InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj7;
                        float fMo868instanceof = interfaceC13349l2.mo868instanceof(f9);
                        float fMo868instanceof2 = interfaceC13349l2.mo868instanceof(f12);
                        float fMo868instanceof3 = interfaceC13349l2.mo868instanceof(f11);
                        float fMo868instanceof4 = interfaceC13349l2.mo868instanceof(f10);
                        float f15 = fMo868instanceof + fMo868instanceof2;
                        float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC13349l2.admob() >> 32)) - ((4.0f * f15) - fMo868instanceof2)) / 2.0f;
                        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (interfaceC13349l2.admob() & 4294967295L)) - fMo868instanceof3) / 2.0f;
                        ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(fIntBitsToFloat, fIntBitsToFloat2);
                        int i14 = 0;
                        float f16 = 0.0f;
                        while (i14 < 4) {
                            try {
                                float[] fArr11 = fArr9;
                                float[] fArr12 = fArr10;
                                float fFirebase = AbstractC7572l.firebase(fArr9[i14], fArr10[i14], interfaceC8097lArr3[i14].yandex(c13765l3.admob()));
                                float fMax = fMo868instanceof3 - Math.max(fFirebase * fMo868instanceof3, fMo868instanceof4);
                                float f17 = fFirebase + f16;
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (Float.floatToRawIntBits(i14 * f15) << 32);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo868instanceof3 - fMax)) & 4294967295L) | (Float.floatToRawIntBits(fMo868instanceof) << 32);
                                int i15 = i14;
                                C13765l c13765l4 = c13765l3;
                                interfaceC13349l = interfaceC13349l2;
                                InterfaceC8097l[] interfaceC8097lArr4 = interfaceC8097lArr3;
                                float f18 = fMo868instanceof4;
                                f14 = fIntBitsToFloat2;
                                InterfaceC8714l interfaceC8714l5 = interfaceC8714l4;
                                f13 = fIntBitsToFloat;
                                try {
                                    AbstractC9361l.metrica(interfaceC13349l, j6, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, null, null, 0, 120);
                                    i14 = i15 + 1;
                                    fIntBitsToFloat = f13;
                                    interfaceC8714l4 = interfaceC8714l5;
                                    fIntBitsToFloat2 = f14;
                                    interfaceC13349l2 = interfaceC13349l;
                                    fArr9 = fArr11;
                                    fArr10 = fArr12;
                                    f16 = f17;
                                    fMo868instanceof4 = f18;
                                    interfaceC8097lArr3 = interfaceC8097lArr4;
                                    c13765l3 = c13765l4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f13, -f14);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                interfaceC13349l = interfaceC13349l2;
                                f13 = fIntBitsToFloat;
                                f14 = fIntBitsToFloat2;
                                ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f13, -f14);
                                throw th;
                            }
                        }
                        InterfaceC8714l interfaceC8714l6 = interfaceC8714l4;
                        interfaceC13349l = interfaceC13349l2;
                        f13 = fIntBitsToFloat;
                        f14 = fIntBitsToFloat2;
                        if (!z && f16 == 0.0f) {
                            interfaceC8714l6.setValue(Boolean.FALSE);
                        }
                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f13, -f14);
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(objM2132native10);
            } else {
                j4 = j5;
                i6 = 6;
            }
            AbstractC12155l.yandex(interfaceC17242l, (Function1) objM2132native10, c6956l, i6);
            f5 = 3.0f;
            f6 = 2.0f;
            i5 = 4;
            long j6 = j4;
            f8 = 1.0f;
            f7 = 16.0f;
            j3 = j6;
        } else {
            c6956l.m2124else();
            i5 = i;
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
            j3 = j2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(z, interfaceC17242l, j3, i5, f5, f6, f7, f8, i2, i3) { // from class: lٍؚٜ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ long f15289l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ float f15290l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ float f15291l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f15292l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f15293l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ float f15294l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ int f15295l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ int f15296l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ float f15297l;

                {
                    this.f15296l = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int iPurchase = AbstractC0545l.purchase(49);
                    AbstractC9498l.yandex(this.f15293l, this.f15292l, this.f15289l, this.f15295l, this.f15294l, this.f15297l, this.f15290l, this.f15291l, (C6956l) obj7, iPurchase, this.f15296l);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
