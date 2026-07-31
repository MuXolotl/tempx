package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.C2580l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UserInfo;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class UserInfo {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final List purchase;
    public final long yandex;

    public /* synthetic */ UserInfo(long j, String str, String str2, String str3, List list, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? C2580l.f5619l : list);
    }

    public UserInfo(long j, String str, String str2, String str3, List list) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = list;
    }
}
