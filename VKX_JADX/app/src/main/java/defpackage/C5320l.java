package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: lٖؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5320l implements InterfaceC8782l, InterfaceC2417l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final IdentityHashMap f11439l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC2417l f11440l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C8750l f11441l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean[] f11442l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC8782l[] f11443l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C6882l f11444l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C14823l f11446l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public InterfaceC8782l[] f11447l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f11445l = new ArrayList();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final HashMap f11448l = new HashMap();

    public C5320l(C14823l c14823l, long[] jArr, InterfaceC8782l... interfaceC8782lArr) {
        this.f11446l = c14823l;
        this.f11443l = interfaceC8782lArr;
        c14823l.getClass();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        this.f11444l = new C6882l(c13708l, c13708l);
        this.f11439l = new IdentityHashMap();
        this.f11447l = new InterfaceC8782l[0];
        this.f11442l = new boolean[interfaceC8782lArr.length];
        for (int i = 0; i < interfaceC8782lArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f11442l[i] = true;
                this.f11443l[i] = new C12299l(interfaceC8782lArr[i], j);
            }
        }
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        ArrayList arrayList = this.f11445l;
        if (arrayList.isEmpty()) {
            return this.f11444l.adcel(c11495l);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC8782l) arrayList.get(i)).adcel(c11495l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC8782l
    public final void admob() {
        for (InterfaceC8782l interfaceC8782l : this.f11443l) {
            interfaceC8782l.admob();
        }
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        return this.f11444l.ads();
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        return this.f11444l.amazon();
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        return this.f11444l.billing();
    }

    @Override // defpackage.InterfaceC2417l
    public final void crashlytics(InterfaceC8782l interfaceC8782l) {
        ArrayList arrayList = this.f11445l;
        arrayList.remove(interfaceC8782l);
        if (arrayList.isEmpty()) {
            InterfaceC8782l[] interfaceC8782lArr = this.f11443l;
            int i = 0;
            for (InterfaceC8782l interfaceC8782l2 : interfaceC8782lArr) {
                i += interfaceC8782l2.metrica().yandex;
            }
            C11916l[] c11916lArr = new C11916l[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC8782lArr.length; i3++) {
                C8750l c8750lMetrica = interfaceC8782lArr[i3].metrica();
                int i4 = c8750lMetrica.yandex;
                int i5 = 0;
                while (i5 < i4) {
                    C11916l c11916lYandex = c8750lMetrica.yandex(i5);
                    int i6 = c11916lYandex.yandex;
                    C5978l[] c5978lArr = new C5978l[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        C5978l c5978l = c11916lYandex.amazon[i7];
                        C12984l c12984lYandex = c5978l.yandex();
                        String str = c5978l.remoteconfig;
                        InterfaceC8782l[] interfaceC8782lArr2 = interfaceC8782lArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = c5978l.yandex;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        c12984lYandex.yandex = sb.toString();
                        if (str != null) {
                            c12984lYandex.smaato = i3 + ":" + str;
                        }
                        c5978lArr[i7] = new C5978l(c12984lYandex);
                        i7++;
                        interfaceC8782lArr = interfaceC8782lArr2;
                    }
                    InterfaceC8782l[] interfaceC8782lArr3 = interfaceC8782lArr;
                    C11916l c11916l = new C11916l(i3 + ":" + c11916lYandex.loadAd, c5978lArr);
                    this.f11448l.put(c11916l, c11916lYandex);
                    c11916lArr[i2] = c11916l;
                    i5++;
                    i2++;
                    interfaceC8782lArr = interfaceC8782lArr3;
                }
            }
            this.f11441l = new C8750l(c11916lArr);
            InterfaceC2417l interfaceC2417l = this.f11440l;
            interfaceC2417l.getClass();
            interfaceC2417l.crashlytics(this);
        }
    }

    @Override // defpackage.InterfaceC8782l
    public final void isPro(long j) {
        for (InterfaceC8782l interfaceC8782l : this.f11447l) {
            interfaceC8782l.isPro(j);
        }
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
        this.f11444l.license(j);
    }

    @Override // defpackage.InterfaceC8782l
    public final C8750l metrica() {
        C8750l c8750l = this.f11441l;
        c8750l.getClass();
        return c8750l;
    }

    @Override // defpackage.InterfaceC8782l
    public final long mopub(long j, C17654l c17654l) {
        InterfaceC8782l[] interfaceC8782lArr = this.f11447l;
        return (interfaceC8782lArr.length > 0 ? interfaceC8782lArr[0] : this.f11443l[0]).mopub(j, c17654l);
    }

    @Override // defpackage.InterfaceC8782l
    public final long purchase(InterfaceC10376l[] interfaceC10376lArr, boolean[] zArr, InterfaceC11759l[] interfaceC11759lArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[interfaceC10376lArr.length];
        int[] iArr2 = new int[interfaceC10376lArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = interfaceC10376lArr.length;
            identityHashMap = this.f11439l;
            if (i2 >= length) {
                break;
            }
            InterfaceC11759l interfaceC11759l = interfaceC11759lArr[i2];
            Integer num = interfaceC11759l == null ? null : (Integer) identityHashMap.get(interfaceC11759l);
            iArr[i2] = num == null ? -1 : num.intValue();
            InterfaceC10376l interfaceC10376l = interfaceC10376lArr[i2];
            if (interfaceC10376l != null) {
                String str = interfaceC10376l.firebase().loadAd;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = interfaceC10376lArr.length;
        InterfaceC11759l[] interfaceC11759lArr2 = new InterfaceC11759l[length2];
        InterfaceC11759l[] interfaceC11759lArr3 = new InterfaceC11759l[interfaceC10376lArr.length];
        InterfaceC10376l[] interfaceC10376lArr2 = new InterfaceC10376l[interfaceC10376lArr.length];
        InterfaceC8782l[] interfaceC8782lArr = this.f11443l;
        ArrayList arrayList = new ArrayList(interfaceC8782lArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < interfaceC8782lArr.length) {
            int i4 = i;
            while (i4 < interfaceC10376lArr.length) {
                interfaceC11759lArr3[i4] = iArr[i4] == i3 ? interfaceC11759lArr[i4] : null;
                if (iArr2[i4] == i3) {
                    InterfaceC10376l interfaceC10376l2 = interfaceC10376lArr[i4];
                    interfaceC10376l2.getClass();
                    C11916l c11916l = (C11916l) this.f11448l.get(interfaceC10376l2.firebase());
                    c11916l.getClass();
                    interfaceC10376lArr2[i4] = new C9973l(interfaceC10376l2, c11916l);
                } else {
                    interfaceC10376lArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            InterfaceC8782l[] interfaceC8782lArr2 = interfaceC8782lArr;
            int i5 = i3;
            long jPurchase = interfaceC8782lArr2[i3].purchase(interfaceC10376lArr2, zArr, interfaceC11759lArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jPurchase;
            } else if (jPurchase != j2) {
                C8339l.smaato("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < interfaceC10376lArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    InterfaceC11759l interfaceC11759l2 = interfaceC11759lArr3[i6];
                    interfaceC11759l2.getClass();
                    interfaceC11759lArr2[i6] = interfaceC11759lArr3[i6];
                    identityHashMap.put(interfaceC11759l2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    AbstractC12442l.subscription(interfaceC11759lArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(interfaceC8782lArr2[i5]);
            }
            i3 = i5 + 1;
            interfaceC8782lArr = interfaceC8782lArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(interfaceC11759lArr2, i7, interfaceC11759lArr, i7, length2);
        this.f11447l = (InterfaceC8782l[]) arrayList.toArray(new InterfaceC8782l[i7]);
        AbstractList abstractListIsPro = AbstractC7280l.isPro(new C2922l(15), arrayList);
        this.f11446l.getClass();
        this.f11444l = new C6882l(arrayList, abstractListIsPro);
        return j2;
    }

    @Override // defpackage.InterfaceC8782l
    public final long remoteconfig() {
        long j;
        InterfaceC8782l interfaceC8782l;
        InterfaceC8782l[] interfaceC8782lArr = this.f11447l;
        int length = interfaceC8782lArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            InterfaceC8782l interfaceC8782l2 = interfaceC8782lArr[i];
            long jRemoteconfig = interfaceC8782l2.remoteconfig();
            if (jRemoteconfig == j2) {
                j = j2;
                if (j3 != j && interfaceC8782l2.subs(j3) != j3) {
                    C8339l.smaato("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                InterfaceC8782l[] interfaceC8782lArr2 = this.f11447l;
                int length2 = interfaceC8782lArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (interfaceC8782l = interfaceC8782lArr2[i2]) == interfaceC8782l2) {
                        break;
                    }
                    if (interfaceC8782l.subs(jRemoteconfig) != jRemoteconfig) {
                        C8339l.smaato("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jRemoteconfig;
            } else {
                j = j2;
                if (jRemoteconfig != j3) {
                    C8339l.smaato("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.InterfaceC8782l
    public final long subs(long j) {
        long jSubs = this.f11447l[0].subs(j);
        int i = 1;
        while (true) {
            InterfaceC8782l[] interfaceC8782lArr = this.f11447l;
            if (i >= interfaceC8782lArr.length) {
                return jSubs;
            }
            if (interfaceC8782lArr[i].subs(jSubs) != jSubs) {
                C8339l.smaato("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC18266l
    /* JADX INFO: renamed from: throws */
    public final void mo614throws(InterfaceC3128l interfaceC3128l) {
        InterfaceC2417l interfaceC2417l = this.f11440l;
        interfaceC2417l.getClass();
        interfaceC2417l.mo614throws(this);
    }

    @Override // defpackage.InterfaceC8782l
    public final void vip(InterfaceC2417l interfaceC2417l, long j) {
        this.f11440l = interfaceC2417l;
        ArrayList arrayList = this.f11445l;
        InterfaceC8782l[] interfaceC8782lArr = this.f11443l;
        Collections.addAll(arrayList, interfaceC8782lArr);
        for (InterfaceC8782l interfaceC8782l : interfaceC8782lArr) {
            interfaceC8782l.vip(this, j);
        }
    }
}
