package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaTag;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class UmaTag implements InterfaceC12360l {
    public final List amazon;
    public final UmaCover crashlytics;
    public final long loadAd;
    public final String yandex;

    public UmaTag(String str, long j, UmaCover umaCover, List list) {
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = umaCover;
        this.amazon = list;
    }

    @Override // defpackage.InterfaceC12360l
    public final String getItemId() {
        return String.valueOf(this.loadAd);
    }
}
