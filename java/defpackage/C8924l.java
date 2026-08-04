package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٌٜۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8924l {
    public static final C8945l crashlytics = new C8945l();
    public final ArrayList loadAd;
    public final ArrayList yandex;

    public C8924l(long j, InterfaceC0631l interfaceC0631l) {
        float f = j * 0.03f;
        int i = (int) f;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(interfaceC0631l.amazon(Float.valueOf(i2 / f)));
        }
        this.yandex = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            PointF pointF = ((C17270l) this.yandex.get(i3)).yandex;
            arrayList2.add(new C17270l(new PointF(pointF.x, pointF.y)));
        }
        this.loadAd = arrayList2;
    }

    public final void yandex(InterfaceC5796l... interfaceC5796lArr) {
        int i = 0;
        for (C17270l c17270l : this.yandex) {
            int i2 = i + 1;
            C17270l c17270l2 = (C17270l) this.loadAd.get(i);
            PointF pointF = c17270l2.yandex;
            PointF pointF2 = c17270l.yandex;
            pointF.x = pointF2.x;
            pointF.y = pointF2.y;
            for (InterfaceC5796l interfaceC5796l : interfaceC5796lArr) {
                interfaceC5796l.yandex(c17270l2);
            }
            i = i2;
        }
    }
}
