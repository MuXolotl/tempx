package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؔۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3048l {
    public static final ArrayList yandex = AbstractC16901l.m4238static(new C13053l('0', '9'), new C13053l('a', 'f'));

    public static final String yandex(int i, int i2, byte[] bArr) {
        char[] cArr = new char[(i2 - i) * 2];
        int i3 = 0;
        while (i < i2) {
            byte b = bArr[i];
            int i4 = i3 + 1;
            ArrayList arrayList = yandex;
            cArr[i3] = ((Character) arrayList.get((b >> 4) & 15)).charValue();
            i3 += 2;
            cArr[i4] = ((Character) arrayList.get(b & 15)).charValue();
            i++;
        }
        return new String(cArr);
    }
}
