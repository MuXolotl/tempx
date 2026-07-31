package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0504l implements InterfaceC2449l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C13660l f1816l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13660l f1817l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f1818l;

    public C0504l(Map map, Function1 function1) {
        C13660l c13660l;
        this.f1818l = function1;
        if (map == null || map.isEmpty()) {
            c13660l = null;
        } else {
            c13660l = new C13660l(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c13660l.vip(entry.getKey(), entry.getValue());
            }
        }
        this.f1817l = c13660l;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.InterfaceC2449l
    public final Map amazon() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        C13660l c13660l = this.f1817l;
        if (c13660l == null && this.f1816l == null) {
            return C14054l.f27396l;
        }
        int i3 = 0;
        int i4 = c13660l != null ? c13660l.purchase : 0;
        C13660l c13660l2 = this.f1816l;
        HashMap map = new HashMap(i4 + (c13660l2 != null ? c13660l2.purchase : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (c13660l != null) {
            Object[] objArr = c13660l.loadAd;
            Object[] objArr2 = c13660l.crashlytics;
            long[] jArr3 = c13660l.yandex;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        C13660l c13660l3 = this.f1816l;
        if (c13660l3 != null) {
            Object[] objArr3 = c13660l3.loadAd;
            Object[] objArr4 = c13660l3.crashlytics;
            long[] jArr4 = c13660l3.yandex;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!crashlytics(objInvoke)) {
                                            C8936l.subs(AbstractC0825l.amazon(objInvoke));
                                            return null;
                                        }
                                        Object[] objArr5 = new Object[1];
                                        objArr5[i3] = objInvoke;
                                        map.put(str, AbstractC14055l.crashlytics(objArr5));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !crashlytics(objInvoke2)) {
                                            C8936l.subs(AbstractC0825l.amazon(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.InterfaceC2449l
    public final InterfaceC18327l billing(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC8576l.remoteconfig(str.charAt(i))) {
                C13660l c13660l = this.f1816l;
                if (c13660l == null) {
                    long[] jArr = AbstractC12154l.yandex;
                    c13660l = new C13660l();
                    this.f1816l = c13660l;
                }
                Object objMopub = c13660l.mopub(str);
                if (objMopub == null) {
                    objMopub = new ArrayList();
                    c13660l.vip(str, objMopub);
                }
                ((List) objMopub).add(function0);
                return new C5991l(c13660l, str, function0, 4);
            }
        }
        C8339l.metrica("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.InterfaceC2449l
    public final boolean crashlytics(Object obj) {
        return ((Boolean) this.f1818l.invoke(obj)).booleanValue();
    }

    @Override // defpackage.InterfaceC2449l
    public final Object purchase(String str) {
        C13660l c13660l = this.f1817l;
        List list = c13660l != null ? (List) c13660l.smaato(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c13660l != null) {
        }
        return list.get(0);
    }
}
