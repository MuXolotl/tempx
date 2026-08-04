package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٌْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13240l {
    public int amazon;
    public C4450l crashlytics;
    public ArrayList loadAd;
    public C13161l purchase;
    public int yandex;

    public final C13161l yandex() {
        C2500l c2500lAdcel;
        C2500l c2500l;
        C4450l c4450l = this.crashlytics;
        ArrayList arrayList = this.loadAd;
        if (arrayList.size() > 0) {
            c2500l = (C2500l) arrayList.remove(0);
        } else {
            while (true) {
                c2500lAdcel = c4450l.adcel(c4450l.vip());
                if (c2500lAdcel == null || c2500lAdcel.crashlytics == this.yandex) {
                    break;
                }
                c4450l.yandex(c2500lAdcel);
            }
            c2500l = c2500lAdcel;
        }
        if (c2500l == null) {
            return null;
        }
        ByteBuffer byteBuffer = c2500l.yandex;
        this.amazon++;
        C13161l c13161l = new C13161l();
        c13161l.f25776l = byteBuffer;
        return c13161l;
    }
}
