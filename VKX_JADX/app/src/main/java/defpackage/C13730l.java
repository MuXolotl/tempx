package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: renamed from: lْْۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13730l implements InterfaceC16100l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13730l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC16100l
    public final void yandex(String str, String str2, Bundle bundle, long j) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C0848l c0848l = (C0848l) obj;
                if (((HashSet) c0848l.f2499l).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    AbstractC8481l abstractC8481l = AbstractC7561l.yandex;
                    String strMetrica = AbstractC2632l.metrica(str2, AbstractC7572l.mopub, AbstractC7572l.loadAd);
                    if (strMetrica != null) {
                        str2 = strMetrica;
                    }
                    bundle2.putString("events", str2);
                    ((C3797l) c0848l.f2498l).inmobi(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !AbstractC7561l.yandex.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((C3797l) ((C10866l) obj).f21968l).inmobi(3, bundle3);
                    break;
                }
                break;
        }
    }
}
