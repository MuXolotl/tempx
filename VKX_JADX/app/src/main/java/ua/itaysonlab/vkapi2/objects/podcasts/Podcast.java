package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/Podcast;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class Podcast implements InterfaceC12360l {
    public final int amazon;
    public final List billing;
    public final int crashlytics;
    public final long loadAd;
    public final String purchase;
    public final String yandex;

    public Podcast(String str, long j, int i, int i2, String str2, List list) {
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = str2;
        this.billing = list;
    }

    @Override // defpackage.InterfaceC12360l
    public final String getItemId() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.loadAd);
        sb.append('_');
        sb.append(this.crashlytics);
        return sb.toString();
    }
}
