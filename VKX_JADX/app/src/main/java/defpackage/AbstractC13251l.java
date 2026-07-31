package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍّْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13251l {
    public static final C15578l yandex = new C15578l(823213207, false, new C6971l(0));
    public static final C15578l loadAd = new C15578l(779864969, false, new C11891l(4));
    public static final C15578l crashlytics = new C15578l(1646565044, false, new C4076l(21));
    public static final C15578l amazon = new C15578l(-1403050197, false, new C6971l(1));
    public static final C15578l purchase = new C15578l(-1363855322, false, new C6971l(2));

    public static long amazon(long j) {
        return j < 0 ? -amazon(-j) : (500000000 + j) / 1000000000;
    }

    public static ArrayList crashlytics(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final String loadAd(C3346l c3346l, Function1 function1) {
        List list = c3346l.inmobi;
        if (list == null || list.isEmpty()) {
            C4964l c4964l = (C4964l) function1.invoke(new C10877l(c3346l.loadAd));
            String strYandex = c4964l != null ? c4964l.yandex() : null;
            return strYandex == null ? "" : strYandex;
        }
        Iterable iterable = c3346l.f7133package;
        if (iterable == null) {
            iterable = C2580l.f5619l;
        }
        return AbstractC16901l.m4210case(AbstractC16901l.m4232new(list, iterable), null, null, null, C8712l.f17927l, 31);
    }

    public static long purchase(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = ModuleDescriptor.MODULE_VERSION << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : ModuleDescriptor.MODULE_VERSION << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static C3407l yandex(int i, C6886l c6886l) {
        return new C3407l(i, c6886l, new C4166l(new InterfaceC14254l[0]));
    }
}
