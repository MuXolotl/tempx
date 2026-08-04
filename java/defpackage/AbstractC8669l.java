package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٌۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8669l extends AbstractC0622l {
    public static boolean Signature(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!Signature((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof C2189l) && (obj2 instanceof C2189l)) {
                            if (!Arrays.equals(((C2189l) obj).f4838l, ((C2189l) obj2).f4838l)) {
                            }
                        } else if ((obj instanceof C15868l) && (obj2 instanceof C15868l)) {
                            if (!Arrays.equals(((C15868l) obj).f31138l, ((C15868l) obj2).f31138l)) {
                            }
                        } else if ((obj instanceof C4055l) && (obj2 instanceof C4055l)) {
                            if (!Arrays.equals(((C4055l) obj).f8351l, ((C4055l) obj2).f8351l)) {
                            }
                        } else if ((obj instanceof C12339l) && (obj2 instanceof C12339l)) {
                            long[] jArr = ((C12339l) obj).f24434l;
                            long[] jArr2 = ((C12339l) obj2).f24434l;
                            if (jArr == null) {
                                jArr = null;
                            }
                            if (jArr2 == null) {
                                jArr2 = null;
                            }
                            if (!Arrays.equals(jArr, jArr2)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static ArrayList m2396abstract(Object[] objArr, Object[] objArr2) {
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new C8195l(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static void ad(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static InterfaceC11075l ads(Object[] objArr) {
        return objArr.length == 0 ? C8360l.yandex : new C17798l(0, objArr);
    }

    public static void advert(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void applovin(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void appmetrica(float[] fArr, float[] fArr2, int i) {
        System.arraycopy(fArr, 0, fArr2, 0, (i & 8) != 0 ? fArr.length : 6);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static String m2397case(byte[] bArr, String str, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        int i2 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static int m2398catch(Object obj, Object[] objArr) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static int m2399class(Object obj, Object[] objArr) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static Object m2400continue(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        C1759l.firebase("Array is empty.");
        return null;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static Object m2401default(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            C1759l.firebase("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        C8339l.metrica("Array has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static final void m2402else(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC15422l.yandex(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static C8934l m2403extends(int[] iArr) {
        return new C8934l(0, iArr.length - 1, 1);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static List m2404final(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return C2580l.f5619l;
        }
        if (length == 1) {
            return Collections.singletonList(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static Integer m2405for(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static List m2406goto(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return C2580l.f5619l;
        }
        if (length == 1) {
            return Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static Set m2407import(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C5746l.f12138l;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2200l.firebase(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static byte[] inmobi(int i, int i2, byte[] bArr) {
        AbstractC0622l.mopub(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static int m2408interface(int[] iArr) {
        if (iArr.length == 0) {
            C4875l.firebase();
            return 0;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static void isVip(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void license(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static Object m2409native(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        C1759l.firebase("Array is empty.");
        return null;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static List m2410new(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return C2580l.f5619l;
        }
        if (length == 1) {
            return Collections.singletonList(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static void m2411package(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void premium(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static Object m2412private(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static void pro(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void signatures(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static void m2413static(Object[] objArr) {
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = objArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Object obj = objArr[i];
            objArr[i] = objArr[length2];
            objArr[length2] = obj;
            length2--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static void m2414strictfp(Object[] objArr, C9676l c9676l) {
        Arrays.fill(objArr, 0, objArr.length, c9676l);
    }

    public static boolean subscription(Object obj, Object[] objArr) {
        return m2398catch(obj, objArr) >= 0;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static List m2415super(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Arrays.asList(Arrays.copyOf(objArr, objArr.length)) : Collections.singletonList(objArr[0]);
        }
        return C2580l.f5619l;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static String m2416switch(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        m2402else(objArr, sb, str4, str5, str6, "...", function1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static void m2417synchronized(long j, long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean tapsense(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static Object m2418throw(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static Object[] m2419throws(int i, int i2, Object[] objArr) {
        AbstractC0622l.mopub(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static ArrayList m2420volatile(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
