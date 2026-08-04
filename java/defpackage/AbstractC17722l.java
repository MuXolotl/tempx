package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؘ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17722l implements InterfaceC18742l {
    public final int[] admob;
    public final String[] amazon;
    public final int billing;
    public final boolean crashlytics;
    public final int[] mopub;
    public final List[] purchase;

    public AbstractC17722l(Map map, boolean z) {
        this.crashlytics = z;
        if (map.isEmpty()) {
            this.billing = 0;
            this.amazon = new String[0];
            this.purchase = new List[0];
            this.mopub = new int[0];
            this.admob = new int[0];
            return;
        }
        if (!z) {
            int size = map.size();
            this.billing = size;
            this.amazon = new String[size];
            this.purchase = new List[size];
            int iYandex = C9912l.yandex(size);
            int[] iArr = new int[iYandex];
            for (int i = 0; i < iYandex; i++) {
                iArr[i] = -1;
            }
            this.mopub = iArr;
            int i2 = this.billing;
            int[] iArr2 = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr2[i3] = -1;
            }
            this.admob = iArr2;
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                this.amazon[i4] = str;
                List[] listArr = this.purchase;
                int size2 = list.size();
                ArrayList arrayList = new ArrayList(size2);
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.add((String) list.get(i5));
                }
                listArr[i4] = arrayList;
                int iYandex2 = yandex(str) & (iYandex - 1);
                int[] iArr3 = this.admob;
                int[] iArr4 = this.mopub;
                iArr3[i4] = iArr4[iYandex2];
                iArr4[iYandex2] = i4;
                i4++;
            }
            return;
        }
        C11349l c11349l = new C11349l();
        for (Map.Entry entry2 : map.entrySet()) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            List list3 = (List) c11349l.get(str2);
            if (list3 != null) {
                c11349l.put(AbstractC16901l.m4232new(list3, list2), str2);
            } else {
                c11349l.put(list2, str2);
            }
        }
        int i6 = c11349l.f22889l;
        this.billing = i6;
        this.amazon = new String[i6];
        this.purchase = new List[i6];
        int iYandex3 = C9912l.yandex(i6);
        int[] iArr5 = new int[iYandex3];
        for (int i7 = 0; i7 < iYandex3; i7++) {
            iArr5[i7] = -1;
        }
        this.mopub = iArr5;
        int i8 = this.billing;
        int[] iArr6 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr6[i9] = -1;
        }
        this.admob = iArr6;
        int i10 = 0;
        for (Map.Entry entry3 : (C6715l) c11349l.entrySet()) {
            String str3 = (String) entry3.getKey();
            List list4 = (List) entry3.getValue();
            this.amazon[i10] = str3;
            List[] listArr2 = this.purchase;
            int size3 = list4.size();
            ArrayList arrayList2 = new ArrayList(size3);
            for (int i11 = 0; i11 < size3; i11++) {
                arrayList2.add((String) list4.get(i11));
            }
            listArr2[i10] = arrayList2;
            int iYandex4 = yandex(str3) & (iYandex3 - 1);
            int[] iArr7 = this.admob;
            int[] iArr8 = this.mopub;
            iArr7[i10] = iArr8[iYandex4];
            iArr8[iYandex4] = i10;
            i10++;
        }
    }

    @Override // defpackage.InterfaceC18742l
    public final List advert(String str) {
        return loadAd(str);
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean contains(String str) {
        return loadAd(str) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC18742l)) {
            return false;
        }
        InterfaceC18742l interfaceC18742l = (InterfaceC18742l) obj;
        if (this.crashlytics != interfaceC18742l.pro()) {
            return false;
        }
        return mopub().equals(interfaceC18742l.mopub());
    }

    public final int hashCode() {
        return mopub().hashCode() + ((this.crashlytics ? 1231 : 1237) * 961);
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean isEmpty() {
        return this.billing == 0;
    }

    @Override // defpackage.InterfaceC18742l
    public final void isVip(Function2 function2) {
        for (int i = 0; i < this.billing; i++) {
            function2.invoke(this.amazon[i], this.purchase[i]);
        }
    }

    public final List loadAd(String str) {
        if (this.billing == 0) {
            return null;
        }
        int iYandex = yandex(str);
        int[] iArr = this.mopub;
        int i = iArr[iYandex & (iArr.length - 1)];
        while (i >= 0) {
            if (AbstractC16648l.license(this.amazon[i], str, this.crashlytics)) {
                return this.purchase[i];
            }
            i = this.admob[i];
        }
        return null;
    }

    @Override // defpackage.InterfaceC18742l
    public final Set mopub() {
        int i = this.billing;
        if (i == 0) {
            return C5746l.f12138l;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < i; i2++) {
            linkedHashSet.add(new C16276l(this.amazon[i2], this.purchase[i2]));
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC18742l
    public final Set names() {
        int i = this.billing;
        if (i == 0) {
            return C5746l.f12138l;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < i; i2++) {
            linkedHashSet.add(this.amazon[i2]);
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean pro() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC18742l
    public final String signatures(String str) {
        List listLoadAd = loadAd(str);
        if (listLoadAd != null) {
            return (String) AbstractC16901l.m4217extends(listLoadAd);
        }
        return null;
    }

    public final int yandex(String str) {
        if (!this.crashlytics) {
            return str.hashCode();
        }
        int length = str.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
        }
        return lowerCase;
    }
}
