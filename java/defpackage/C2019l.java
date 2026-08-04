package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;

/* JADX INFO: renamed from: lٟؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2019l implements InterfaceC11545l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f4543l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16014l f4544l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4545l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ String f4546l;

    public /* synthetic */ C2019l(C16014l c16014l, String str, String str2, int i) {
        this.f4545l = i;
        this.f4544l = c16014l;
        this.f4543l = str;
        this.f4546l = str2;
    }

    @Override // defpackage.InterfaceC11545l
    public final void accept(Object obj, Object obj2) {
        C2350l c2350l = (C2350l) obj2;
        switch (this.f4545l) {
            case 0:
                String str = this.f4543l;
                String str2 = this.f4546l;
                C4184l c4184l = (C4184l) obj;
                C16014l c16014l = this.f4544l;
                HashMap map = c16014l.premium;
                long jIncrementAndGet = c16014l.adcel.incrementAndGet();
                AbstractC1051l.firebase("Not connected to device", c16014l.f31393throws == 3);
                try {
                    map.put(Long.valueOf(jIncrementAndGet), c2350l);
                    Context context = c4184l.crashlytics;
                    C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
                    C10567l c10567l = (C10567l) c4184l.metrica();
                    Parcel parcelM743l = c10567l.m743l();
                    parcelM743l.writeString(str);
                    parcelM743l.writeString(str2);
                    parcelM743l.writeLong(jIncrementAndGet);
                    AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
                    c10567l.m747l(parcelM743l, 9);
                    return;
                } catch (RemoteException e) {
                    map.remove(Long.valueOf(jIncrementAndGet));
                    c2350l.yandex(e);
                    return;
                }
            default:
                C4184l c4184l2 = (C4184l) obj;
                C16014l c16014l2 = this.f4544l;
                String str3 = this.f4543l;
                String str4 = this.f4546l;
                AbstractC1051l.firebase("Not connected to device", c16014l2.f31393throws == 3);
                C10567l c10567l2 = (C10567l) c4184l2.metrica();
                C3448l c3448lRemoteconfig2 = AbstractC11990l.remoteconfig();
                Parcel parcelM743l2 = c10567l2.m743l();
                parcelM743l2.writeString(str3);
                parcelM743l2.writeString(str4);
                int i = AbstractC14627l.yandex;
                parcelM743l2.writeInt(0);
                AbstractC14627l.loadAd(parcelM743l2, c3448lRemoteconfig2);
                c10567l2.m747l(parcelM743l2, 14);
                synchronized (c16014l2.ads) {
                    try {
                        if (c16014l2.metrica != null) {
                            c16014l2.isPro(2477);
                        }
                        c16014l2.metrica = c2350l;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
